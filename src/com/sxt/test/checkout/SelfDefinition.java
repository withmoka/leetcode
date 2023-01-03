package com.sxt.test.checkout;

public class SelfDefinition extends Exception {
    public SelfDefinition(){

    }
    public SelfDefinition(String message){
        super(message);
    }
}
