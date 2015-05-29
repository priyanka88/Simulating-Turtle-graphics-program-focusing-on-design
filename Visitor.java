package com.company;

/**
 * Created by priyankachavan on 4/13/15.
 */
public interface Visitor {
    abstract void visit(MoveCommandVisitor aMove);
    abstract void visit(TurnCommandVisitor aTurn);
    abstract void visit(PenUpCommandVisitor aPenUp);
    abstract void visit(PenDownCommandVisitor aPenDown);
    abstract void visit(RepeatCommandVisitor aRepeat);
}
