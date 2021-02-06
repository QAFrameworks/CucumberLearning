package com.Automation.Cucumber.Hooks;

import com.Automation.Cucumber.Context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksUI {

    @Before
    public void method() {
        System.out.println("this wil be executed prior to scenario");
    }

    @After
    public void aftermethod() {
        TestContext.CONTEXT.reset();
    }

    @Before("@taggedHooks")
    public void beforemethodTaggedHooks() {
        System.out.println("this will executed prior to tag taggedHooks");
    }

    @After("@taggedHooks")
    public void aftermethodTaggedHooks() {
        System.out.println("this will executed after tag taggedHooks");
    }
/**
    @After("@taggedHooks,@sharingstate")
    public void aftermethodTaggedHooksMultiple() {
        System.out.println("this will executed after tag taggedHooks or sharingstate");
    }
    */

}
