package com.itcat.uzdealregister.service.impl;

import com.baomidou.mybatisplus.mapper.Condition;
import com.itcat.uzdealregister.entity.MiaoshaUser;
import com.itcat.uzdealregister.exception.GlobaException;
import com.itcat.uzdealregister.mapper.MiaoshaUserMapper;
import com.itcat.uzdealregister.result.CodeMsg;
import com.itcat.uzdealregister.service.MiaoshaUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.itcat.uzdealregister.utils.MD5Util;
import com.itcat.uzdealregister.vo.MiaoshaUserVo;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lingbinli
 * @since 2018-06-26
 */
@Service
public class MiaoshaUserServiceImpl extends ServiceImpl<MiaoshaUserMapper, MiaoshaUser> implements MiaoshaUserService {


    /**
     * 登录
     * @param response
     * @param userVo
     * @return
     */
    @Override
    public String login(HttpServletResponse response, MiaoshaUserVo userVo) {

        if(userVo == null){
            throw new GlobaException(CodeMsg.SERVER_ERROR);
        }
        String mobile = userVo.getMobile();
        String formPass = userVo.getPassword();
        //判断手机号是否存在
        MiaoshaUser user = selectOne(Condition.create().eq("mobile",mobile));
        if(user == null){
            throw new GlobaException(CodeMsg.MOBILE_NOT_EXIST);
        }
        //验证密码
        String dbPass = user.getPassword();
        String saltDB = user.getSalt();
        //String calcPass = MD5Util.formPassToDBPass();

       /* if(!calcPass.equals(dbPass)){

        }*/

        return null;
    }
}
