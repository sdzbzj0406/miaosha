package com.zhangjie.miaosha.enums;

import lombok.Getter;

/**
 * 结果枚举类
 *
 * @author Jason
 * @date 2019-01-03
 */
@Getter
public enum ResultEnum {

    /**
     * 运行成功
     */
    SUCCESS(0, "成功"),
    /**
     * 参数异常
     */
    PARAM_EXCEPTION(500,"参数异常"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
