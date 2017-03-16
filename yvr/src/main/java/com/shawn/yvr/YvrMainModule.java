package com.shawn.yvr;

import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;

/**
 * Created by Administrator on 2017/3/9.
 */
public class YvrMainModule {
    @Ok("http:200")
    @At
    public void test(){}
}
