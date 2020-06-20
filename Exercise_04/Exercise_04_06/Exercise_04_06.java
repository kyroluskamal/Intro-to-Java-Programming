/*
(Random points on a circle) Write a program that generates three random points
on a circle centered at (0, 0) with radius 40 and display three angles in a triangle
formed by these three points, as shown in Figure 4.7a. (Hint: Generate a random
angle a in radians between 0 and 2PI, as shown in Figure 4.7b and the point determined
by this angle is (r*cos(a), r*sin(a)).)
*/
import java.util.*;
public class E4_6 {
    public static void main(String[] args){
        double angle_1 = Math.random()*(2*Math.PI);
        double angle_2 = Math.random()*(2*Math.PI);
        double angle_3 = Math.random()*(2*Math.PI);
    
        final double RADIUS = 40.0;
        
        double x1 = RADIUS * Math.cos(angle_1);
        double y1 = RADIUS * Math.sin(angle_1);
        double x2 = RADIUS * Math.cos(angle_2);
        double y2 = RADIUS * Math.sin(angle_2);
        double x3 = RADIUS * Math.cos(angle_3);
        double y3 = RADIUS * Math.sin(angle_3);
        
        System.out.print("the points are: (" + x1 + ", " + y1 +") (" +
               x2 + ", " + y2 +") (" + x3 + ", " + y3 +")");
        
        
    }
}