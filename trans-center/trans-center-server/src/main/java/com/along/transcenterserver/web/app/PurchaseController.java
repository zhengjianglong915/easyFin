package com.along.transcenterserver.web.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.along.transcenterserver.web.app.request.PurchaseCommitRequest;
import com.along.transcenterserver.web.app.response.PurchaseCommitResponse;

/**
 * 申购控制器
 *
 * @author: zhengjianglong
 * @create: 2018-08-07 12:30
 */
@Controller
@RequestMapping("/app")
public class PurchaseController {

    @RequestMapping("/purchase/commit")
    public PurchaseCommitResponse purchaseCommit(@RequestBody PurchaseCommitRequest request) {
        PurchaseCommitResponse response = new PurchaseCommitResponse();
        

        return response;
    }
}
