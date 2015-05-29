package com.company;

/**
 * Created by priyankachavan on 4/14/15.
 */
public class ConcreteMoveCommand implements Command {
    InterpreterContext ic;
    ConcreteMoveCommand(InterpreterContext ic)
    {
        this.ic = ic;
    }
    @Override
    public void execute() {
        Method m = new MoveMethod(ic.getDistance());
        m.interpret(ic);
        ic.undoTheseCommands.add(this);
    }

    @Override
    public void undo() {
        ic.setDistance(-ic.getDistance());
        execute();
    }
}
