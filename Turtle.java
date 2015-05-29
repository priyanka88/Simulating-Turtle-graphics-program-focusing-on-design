package com.company;

import java.awt.*;
import java.awt.geom.Point2D;

/**
 * Created by priyankachavan on 3/28/15.
 */
public class Turtle {
    Point2D aLocation;
    double angle;
    int theDirection;
    boolean thePen;
    public Turtle()
    {
        aLocation = new Point2D.Double();
    }
    public void move(int distance)
    {
        angle = (angle * Math.PI ) /180;
        double deltaX = Math.cos(angle)*distance;
        double deltaY = Math.sin(angle)*distance;
        double newX = aLocation.getX() + deltaX;
        double newY = aLocation.getY() + deltaY;
    }

    void turn(int degrees)
    {
        angle = (degrees * Math.PI) / 180;
    }
    void penUp(){
        thePen = false;

    } //Lift the pen up.
    void penDown(){
        thePen = true;
    }
        //Put the pen down.
    boolean isPenUp(){
        return false;
    }
    //Return true if pen is up, false if the pen is down.
    int direction(int distance){
        return 0;
    }

    public void repeat() {

    }
    //Returns the current direction of the turtle.

   /* Point location()
    {

    } */
}
