package com.company;

/**
 * Created by priyankachavan on 4/11/15.
 */
public interface Method {
    void interpret(InterpreterContext ic);
    void accept(Visitor aVisitor);
}
