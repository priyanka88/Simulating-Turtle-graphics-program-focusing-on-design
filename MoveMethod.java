package com.company;

/**
 * Created by priyankachavan on 4/11/15.
 */
public class MoveMethod implements Method {
    private int distance;
    public MoveMethod(int d){
        this.distance = d;

    }
    public void interpret(InterpreterContext ic) {
        ic.getTurtleObject().move(ic.getDistance());
    }
}
