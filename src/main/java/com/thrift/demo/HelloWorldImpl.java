package com.thrift.demo;

import org.apache.thrift.TException;

/**
 * Created by xukai on 2017/4/12.
 */
public class HelloWorldImpl implements HelloWorldService.Iface{
    @Override
    public String sayHello(String username) throws TException {
        return "Hi,"+username+"Welcome to my blog http://www.cnblogs.com/zfygiser";
    }

}
