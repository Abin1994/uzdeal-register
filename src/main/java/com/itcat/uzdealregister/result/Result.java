package com.itcat.uzdealregister.result;

import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author:lingbinli
 * @Date:2018/7/1
 */
@Data
public class Result<T> {
    private int code;
    private String msg;
    private T data;

    private Result(T data) {
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }

    private Result(CodeMsg codeMsg){
        if(codeMsg != null){
            this.code = codeMsg.getCode();
            this.msg = codeMsg.getMsg();
        }
    }

    /**
     * 成功时候的调用
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data){

        return new Result<T>(data);
    }

    public static <T> Result<T> error(CodeMsg codeMsg){

        return new Result<T>(codeMsg);
    }

}
