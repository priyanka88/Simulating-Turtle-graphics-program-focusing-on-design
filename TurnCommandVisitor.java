package com.company;

/**
 * Created by priyankachavan on 4/15/15.
 */
public class TurnCommandVisitor {
    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }
}
