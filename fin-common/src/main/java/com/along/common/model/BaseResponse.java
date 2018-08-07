package com.along.common.model;

import java.io.Serializable;

/**
 * 公共的 response
 *
 * @author: zhengjianglong
 * @create: 2018-08-07 12:41
 */
public class BaseResponse implements Serializable {
    // 错误码
    private String resultCode = "0";
    // 错误码描述
    private String resultMsg = "SUCCESS";

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
}
