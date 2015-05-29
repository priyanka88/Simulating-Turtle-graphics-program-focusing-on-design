package com.company;
import java.io.*;
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Client p = new Client(new InterpreterContext("/Users/priyankachavan/Desktop/input.txt"));
        p.parseFile("/Users/priyankachavan/Desktop/input.txt");

    }
}
