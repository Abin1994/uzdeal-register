package com.itcat.uzdealregister.service.impl;

import com.baomidou.mybatisplus.mapper.Condition;
import com.itcat.uzdealregister.entity.MiaoshaUser;
import com.itcat.uzdealregister.exception.GlobaException;
import com.itcat.uzdealregister.mapper.MiaoshaUserMapper;
import com.itcat.uzdealregister.result.CodeMsg;
import com.itcat.uzdealregister.service.MiaoshaUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.itcat.uzdealregister.utils.MD5Util;
import com.itcat.uzdealregister.utils.UUIDUtil;
import com.itcat.uzdealregister.vo.LoginVO;
import org.springframework.stereotype.Service;
import sun.plugin.util.UIUtil;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lingbinli
 * @since 2018-07-15
 */
@Service
public class MiaoshaUserServiceImpl extends ServiceImpl<MiaoshaUserMapper, MiaoshaUser> implements MiaoshaUserService {

    @Override
    public CodeMsg login(LoginVO loginVO) {
        if(loginVO == null){
            return CodeMsg.SERVER_ERROR;
        }
        String mobile = loginVO.getMobile();
        String formPass = loginVO.getPassword();

        //判断手机号是否存在
        MiaoshaUser user = selectOne(Condition.create().eq("mobile",mobile));
        if(user == null){
            //throw new GlobaException()
        }
        //验证密码
        String dbPass = user.getPassword();
        String saltDB = user.getSalt();
        String calcPass = MD5Util.formPassToDBPass(formPass,saltDB);
        if(!calcPass.equals(dbPass)){
            //throw
        }
        //生成cookie
        String token = UUIDUtil.uuid();
        //addCookie(){

        }

        //return null;
    }
}
