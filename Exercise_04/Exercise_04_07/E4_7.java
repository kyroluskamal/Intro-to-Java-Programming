/*
(Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point
at the 0 o’clock position, as shown in Figure 4.4c. Write a program that prompts
the user to enter the radius of the bounding circle of a pentagon and displays the
coordinates of the five corner points on the pentagon from p1 to p5 in this order.
Programming Exercises 175
Sections 4.3–4.6
*4.8 (Find the character of an ASCII code) Write a program that receives a character
and displays its ASCII code (an integer between 0 and 127). Here is a sample run:
Enter the radius of the bounding circle: 100.52
The coordinates of five points on the pentagon are
(95.60, 31.06)
(0.00, 100.52)
(−95.60, 31.06)
(−58.08, −81.32)
(59.08, −81.32)
Use console format to display two digits after the decimal point. Here is a sample
run:
 * @author kyrolus
 */
import java.util.*;
public class E4_7 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double angle_1 = Math.toRadians(360/5);
        double angle_2 = 2*angle_1;
        double angle_3 = 3*angle_1;
        double angle_4 = 4*angle_1;
        double angle_5 = 5*angle_1;
           
        System.out.print("Enter the radius of the bounding circle: ");   
        double R = input.nextDouble();
        
        double x1 = R * Math.cos(angle_1);
        double y1 = R * Math.sin(angle_1);
        double x2 = R * Math.cos(angle_2);
        double y2 = R * Math.sin(angle_2);
        double x3 = R * Math.cos(angle_3);
        double y3 = R * Math.sin(angle_3);
        double x4 = R * Math.cos(angle_4);
        double y4 = R * Math.sin(angle_4);
        double x5 = R * Math.cos(angle_5);
        double y5 = R * Math.sin(angle_5);
        
        
        System.out.printf("the points are: \n(%4.2f,%4.2f)\n(%4.2f,%4.2f)\n(%4.2f,%4.2f)\n(%4.2f,%4.2f)\n(%4.2f,%4.2f)\n",
                x1,y1,x2,y2,x3,y3,x4,y4,x5,y5);
        
    }
}
