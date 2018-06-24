package com.itcat.uzdealregister.common;

import com.baomidou.mybatisplus.plugins.Page;
import lombok.Data;

/**
 * <p>
 * 分页查询实体
 * </p>
 * @author:lingbinli
 * @Date:2018/6/25
 */
@Data
public class QueryPage<T> {

    /**
     * 每页显示的数量
     */
    private Integer size = 10;
    /**
     * 当前页数
     */
    private Integer current;
    /**
     * 要查询的实体对象
     */
    private T entity;

    public Page getPage(){
        return new Page<>(current,size);
    }
}
