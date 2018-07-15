package com.itcat.uzdealregister.service;

import com.itcat.uzdealregister.entity.MiaoshaUser;
import com.baomidou.mybatisplus.service.IService;
import com.itcat.uzdealregister.result.CodeMsg;
import com.itcat.uzdealregister.vo.LoginVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lingbinli
 * @since 2018-07-15
 */
public interface MiaoshaUserService extends IService<MiaoshaUser> {

    CodeMsg login(LoginVO loginVO);
}
