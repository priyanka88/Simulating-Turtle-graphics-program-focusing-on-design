package com.company;

/**
 * Created by priyankachavan on 4/11/15.
 */
public class TurnMethod implements Method {
    private int degrees;
    public TurnMethod(double d){
        this.degrees = d;

    }
    public void interpret(InterpreterContext ic) {
        ic.getTurtleObject().direction(ic.getDistance());    }
}
