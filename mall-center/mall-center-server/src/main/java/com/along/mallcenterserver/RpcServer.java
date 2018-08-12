package com.along.mallcenterserver;

import com.alipay.sofa.rpc.config.ProviderConfig;
import com.alipay.sofa.rpc.config.ServerConfig;
import com.along.mallcenter.services.GoodsInfoService;
import com.along.mallcenterserver.service.GoodInfoServiceImpl;

/**
 * @author: zhengjianglong
 * @create: 2018-08-07 20:11
 */
public class RpcServer {

    public static void main(String[] args) {
        ServerConfig serverConfig = new ServerConfig()
                .setProtocol("bolt") // 设置一个协议，默认bolt
                .setPort(12800) // 设置一个端口，默认12200
                .setDaemon(false); // 非守护线程

        ProviderConfig<GoodsInfoService> providerConfig = new ProviderConfig<GoodsInfoService>()
                .setInterfaceId(GoodsInfoService.class.getName()) // 指定接口
                .setRef(new GoodInfoServiceImpl()) // 指定实现
                .setServer(serverConfig); // 指定服务端

        providerConfig.export(); // 发布服务
    }
}
