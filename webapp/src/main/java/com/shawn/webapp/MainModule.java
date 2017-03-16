package com.shawn.webapp;

import org.nutz.mvc.annotation.*;
import org.nutz.plugins.hotplug.Hotplug;

/**
 * Created by Administrator on 2017/3/9.
 */
@LoadingBy(Hotplug.class)
@Modules(scanPackage = false)
@IocBy(args = {"*async", "*tx"})
@SetupBy(MainSetup.class)
public class MainModule {
    @Ok("http:200")
    @At
    public void test(){}
}
