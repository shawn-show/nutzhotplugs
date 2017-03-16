package com.shawn.webapp;

import org.nutz.mvc.NutConfig;
import org.nutz.mvc.Setup;
import org.nutz.plugins.hotplug.Hotplug;

/**
 * Created by Administrator on 2017/3/9.
 */
public class MainSetup implements Setup {
    @Override
    public void init(NutConfig nc) {
        nc.getIoc().get(Hotplug.class).setupInit();
    }

    @Override
    public void destroy(NutConfig nc) {
        nc.getIoc().get(Hotplug.class).setupDestroy();
    }
}
