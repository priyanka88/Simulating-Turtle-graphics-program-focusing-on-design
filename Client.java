package com.company;
import java.io.*;
import java.util.*;
/**
 * Created by priyankachavan on 4/11/15.
 */
public class Client {
    private InterpreterContext ic;
    public Client(InterpreterContext context)
    {
        this.ic = context;
    }
    public void parseFile(String thisFile) throws FileNotFoundException {
        Scanner s = new Scanner(new FileReader(thisFile));
        Method m = null;
            while(s.hasNext())
            {
                String methodName = s.next();
                String value = s.next();
                if(methodName.compareTo("move") == 0)
                {
                    m = new MoveMethod(Integer.valueOf(value));
                }
                else if(methodName.compareTo("turn") == 0)
                {
                    m = new TurnMethod(Integer.valueOf(value));
                }
                else if(methodName.compareTo("repeat") == 0)
                {
                    m = new RepeatMethod(Integer.valueOf(value));
                }
                else if(methodName.compareTo("penUp") == 0)
                {

                }
                else if(methodName.compareTo("penDown") == 0)
                {

                }
                if(m!= null)
                    m.interpret(ic);

            }


    }
}
