package com.zhangjie.miaosha.utils;

import com.zhangjie.miaosha.VO.ResultVO;

/**
 * @author jason
 */
public class ResultVOUtil {

    public static <T> ResultVO<T> success(T data){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(data);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO error(Integer code, String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
