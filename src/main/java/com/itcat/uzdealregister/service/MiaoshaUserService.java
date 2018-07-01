package com.itcat.uzdealregister.service;

import com.itcat.uzdealregister.entity.MiaoshaUser;
import com.baomidou.mybatisplus.service.IService;
import com.itcat.uzdealregister.vo.MiaoshaUserVo;

import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lingbinli
 * @since 2018-06-26
 */
public interface MiaoshaUserService extends IService<MiaoshaUser> {

    public String login(HttpServletResponse response, MiaoshaUserVo userVo);
}
