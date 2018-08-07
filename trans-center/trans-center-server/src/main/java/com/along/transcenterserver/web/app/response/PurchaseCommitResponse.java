package com.along.transcenterserver.web.app.response;

import com.along.common.model.BaseResponse;

/**
 * 提交响应
 *
 * @author: zhengjianglong
 * @create: 2018-08-07 12:32
 */
public class PurchaseCommitResponse extends BaseResponse {
    private String transId;

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }
}
