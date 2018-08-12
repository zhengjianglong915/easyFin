package com.along.mallcenter.services;

import com.along.mallcenter.model.GoodInfo;

/**
 * @author: zhengjianglong
 * @create: 2018-08-07 20:16
 */
public interface GoodsInfoService {

    /**
     * 获取goodsId
     *
     * @param goodsId
     *
     * @return
     */
    GoodInfo queryGoodsInfo(Long goodsId);
}
