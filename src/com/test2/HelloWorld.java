package com.test2;


public class HelloWorld {
    private IntrduceDemo intrduceDemo;

    public void setIntrduceDemo(IntrduceDemo intrduceDemo) {
        this.intrduceDemo = intrduceDemo;
    }

    public IntrduceDemo getIntrduceDemo() {
        return intrduceDemo;
    }

    public String toString(){
        return "IntrduceDemo:"+intrduceDemo;
    }
}
