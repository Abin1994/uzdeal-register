package com.itcat.uzdealregister.exception;

import com.itcat.uzdealregister.result.CodeMsg;

/**
 * <p>
 *
 * </p>
 *
 * @author:lingbinli
 * @Date:2018/7/1
 */
public class GlobaException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private CodeMsg cm;

    public GlobaException(CodeMsg cm){
        super(cm.toString());
        this.cm = cm;
    }

    public CodeMsg getCm(){
        return cm;
    }
}
