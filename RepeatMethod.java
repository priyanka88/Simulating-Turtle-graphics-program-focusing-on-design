package com.company;

/**
 * Created by priyankachavan on 4/11/15.
 */
public class RepeatMethod implements Method {
    private int times ;
    public RepeatMethod(int value) {
        this.times = value;
    }

    @Override
    public void interpret(InterpreterContext ic) {
        ic.getTurtleObject().repeat();
    }
}
