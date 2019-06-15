package com.zhangjie.miaosha.VO;

import lombok.Data;

/**
 * 最外层显示对象
 * @param <T>
 * @author jason
 */
@Data
public class ResultVO<T> {
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 具体内容
     */
    private T data;
}
