package com.shawn.yvr.module;

import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;

/**
 * Created by Administrator on 2017/3/9.
 */
@IocBean
@At("/test")
public class TestModule {
    @At
    public String test(){
        return "test";
    }
}
