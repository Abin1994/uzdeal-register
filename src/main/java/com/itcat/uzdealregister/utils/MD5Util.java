package com.itcat.uzdealregister.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * <p>
 *
 * </p>
 *
 * @author:lingbinli
 * @Date:2018/6/28
 */
public class MD5Util {

    public static String md5(String src){
        return DigestUtils.md5Hex(src);
    }

    private  static final String SALT = "1A2B3C4D";

    public static String inputPassToFormPass(String inputPass){
        String str = ""+SALT.charAt(0)+SALT.charAt(2) + inputPass +SALT.charAt(5) + SALT.charAt(4);
        return md5(str);
    }

    public static String formPassToDBPass(String formPass, String salt) {
        String str = ""+salt.charAt(0)+salt.charAt(2) + formPass +salt.charAt(5) + salt.charAt(4);
        return md5(str);
    }

    public static String inputPassToDbPass(String inputPass, String saltDB) {
        String formPass = inputPassToFormPass(inputPass);
        String dbPass = formPassToDBPass(formPass, saltDB);
        return dbPass;
    }

}

