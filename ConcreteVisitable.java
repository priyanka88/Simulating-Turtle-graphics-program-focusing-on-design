package com.company;

/**
 * Created by priyankachavan on 4/14/15.
 */
class ConcreteVisitable implements Visitable{
    InterpreterContext interpreterContext;
    ConcreteVisitable(InterpreterContext interpreterContext)
    {
        this.interpreterContext = interpreterContext;
    }
    @Override
    public void visit(MoveCommandVisitor aMove) {
        Command aCommand = new ConcreteMoveCommand(interpreterContext);
        interpreterContext.commands.add(aCommand);

    }

    @Override
    public void visit(TurnCommandVisitor aTurn) {
        Command aCommand = new ConcreteTurnCommand(interpreterContext);
        interpreterContext.commands.add(aCommand);

    }

    @Override
    public void visit(PenUpCommandVisitor aPenUp) {
        Command aCommand = new ConcretePenUpCommand(interpreterContext);
        interpreterContext.commands.add(aCommand);

    }

    @Override
    public void visit(PenDownCommandVisitor aPenDown) {
        Command aCommand = new ConcretePenDownCommand(interpreterContext);
        interpreterContext.commands.add(aCommand);

    }

    @Override
    public void visit(RepeatCommandVisitor aRepeat) {
    /*    Command aCommand = new ConcreteMoveCommand(interpreterContext);
        interpreterContext.commands.add(aCommand); */

    }
}
