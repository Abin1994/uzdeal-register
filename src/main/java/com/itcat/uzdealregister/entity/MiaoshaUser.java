package com.itcat.uzdealregister.entity;

import java.util.Date;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lingbinli
 * @since 2018-06-26
 */
@Data
@Accessors(chain = true)
public class MiaoshaUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID，手机号码
     */
    private Long id;
    private String nickname;
    /**
     * MD5(MD5(pass明文+固定salt) + salt)
     */
    private String password;
    private String salt;
    /**
     * 头像，云存储的ID
     */
    private String head;
    /**
     * 注册时间
     */
    private Date registerDate;
    /**
     * 上蔟登录时间
     */
    private Date lastLoginDate;
    /**
     * 登录次数
     */
    private Integer loginCount;


}