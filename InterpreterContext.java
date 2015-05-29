package com.company;
import java.util.*;
/**
 * Created by priyankachavan on 4/11/15.
 */
public class InterpreterContext {
    private String thisFile;
    Turtle aTurtle;
    int angle;
    int distance;
    Stack<Command> undoTheseCommands;
    LinkedList<Command> commands;
    public InterpreterContext(String file)
    {
        aTurtle  = new Turtle();
        undoTheseCommands = new Stack<Command>();
        commands = new LinkedList<Command>();
        this.thisFile = file;
    }
    public Turtle getTurtleObject()
    {
        return aTurtle;
    }
    public LinkedList<Command> getCommands()
    {
        return commands;
    }
    public void setDistance(int i){
        this.distance = i;
    }
    public int getDistance(){return this.distance;}
    public double getAngle(){
        return angle;
    }
    public void setAngle(double angle){
        this.angle = angle;
    }
}
