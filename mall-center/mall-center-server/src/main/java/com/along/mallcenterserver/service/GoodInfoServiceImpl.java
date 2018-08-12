package com.along.mallcenterserver.service;

import com.along.mallcenter.model.GoodInfo;
import com.along.mallcenter.services.GoodsInfoService;

/**
 * @author: zhengjianglong
 * @create: 2018-08-07 20:18
 */
public class GoodInfoServiceImpl implements GoodsInfoService {

    @Override
    public GoodInfo queryGoodsInfo(Long goodsId) {
        GoodInfo goodInfo = new GoodInfo();
        goodInfo.setGoodsId(goodsId);
        goodInfo.setGoodsName("test");
        return goodInfo;
    }
}
