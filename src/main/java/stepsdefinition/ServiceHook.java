package stepsdefinition;

import core.AppiumBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ServiceHook {
    AppiumBase appiumBase = new AppiumBase();
    @Before
    public void beforeHooks(){
        System.out.println("This is steps : beforeHooks");
    }
    @After
    public void afterHooks() {
        System.out.println("This is steps : afterHooks");
        appiumBase.tearDown();
    }
}
