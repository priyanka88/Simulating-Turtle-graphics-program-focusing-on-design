package com.company;

/**
 * Created by priyankachavan on 4/15/15.
 */
public class DistanceTravelledVisitor implements Visitable {

        InterpreterContext aContext;
        int distance;
        DistanceTravelledVisitor(InterpreterContext aContext)
        {
            distance = 0;
            this.aContext = aContext;
        }

    public void visit(MoveCommandVisitor aMove) {
        distance = distance + aContext.getDistance();

    }


    public void visit(TurnCommandVisitor aTurn) {

    }

    public void visit(PenUpCommandVisitor aPenUp) {

    }

    public void visit(PenDownCommandVisitor aPenDown) {

    }

    public void visit(RepeatCommandVisitor aRepeat) {

    }
}
