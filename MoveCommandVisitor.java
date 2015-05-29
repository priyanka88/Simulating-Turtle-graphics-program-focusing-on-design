package com.company;

/**
 * Created by priyankachavan on 4/15/15.
 */
public class MoveCommandVisitor {
    public void accept(Visitor aVisitor) {
        aVisitor.visit(this);
    }
}
