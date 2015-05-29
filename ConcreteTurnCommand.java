package com.company;

/**
 * Created by priyankachavan on 4/14/15.
 */
public class ConcreteTurnCommand implements Command {
    InterpreterContext ic;
    ConcreteTurnCommand(InterpreterContext ic)
    {
        this.ic = ic;
    }

    @Override
    public void execute() {
        Method m = new TurnMethod(ic.getAngle());
        m.interpret(ic);
        ic.undoTheseCommands.add(this);
    }

    @Override
    public void undo() {
        ic.setAngle(-ic.getAngle());
        execute();


    }
}
