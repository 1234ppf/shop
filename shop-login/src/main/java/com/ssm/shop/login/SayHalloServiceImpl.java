package com.ssm.shop.login;

import com.alibaba.dubbo.rpc.RpcContext;
import com.ssm.api.service.SayHelloService;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SayHalloServiceImpl implements SayHelloService {
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }
}
