package com.along.transcenterserver.web.app.request;

import com.sun.istack.internal.NotNull;

/**
 * 申购提交
 *
 * @author: zhengjianglong
 * @create: 2018-08-07 12:34
 */
public class PurchaseCommitRequest {
    // 用户 id
    @NotNull
    private Long userId;
    // 申购金额 单位分
    @NotNull
    private Long cashAmount;
    // 支付密码
    @NotNull
    private String password;
    // 产品Id
    @NotNull
    private Long goodsId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(Long cashAmount) {
        this.cashAmount = cashAmount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }
}
