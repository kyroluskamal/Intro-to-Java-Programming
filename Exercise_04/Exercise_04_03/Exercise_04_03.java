/*
(Geography: estimate areas) Find the GPS locations for Atlanta, Georgia;
Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina from
www.gps-data-team.com/map/ and compute the estimated area enclosed by these
four cities. (Hint: Use the formula in Programming Exercise 4.2 to compute the
distance between two cities. Divide the polygon into two triangles and use the
formula in Programming Exercise 2.19 to compute the area of a triangle.)
*/
import java.util.*;
public class E4_3 {
    public static void main(String[] args){
        //Charlotte (35.2270869, –80.8431267) converted to radians
        double x_Ch = Math.toRadians(35.2270869);
        double y_Ch = Math.toRadians(-80.8431267);
        //Savannah (32.0835407, –81.0998342) converted to radians
        double x_Sa = Math.toRadians(32.0835407);
        double y_Sa = Math.toRadians(-81.0998342);
        //Orlando (28.5383355, –81.3792365) converted to radians
        double x_Or = Math.toRadians(28.5383355);
        double y_Or = Math.toRadians(-81.3792365);
        //Atlanta(33.7489954, –84.3879824) converted to radians
        double x_At = Math.toRadians(33.7489954);
        double y_At = Math.toRadians(-84.3879824);
        
        //Distance between Charlotte and Savannah
        double d_ChSa = 6371.01 * Math.acos(Math.sin(x_Ch) * Math.sin(x_Sa) + Math.cos(x_Ch) * Math.cos(x_Sa) * Math.cos(y_Ch - y_Sa));
        
         //Distance between Charlotte and Atlanta
        double d_ChAt = 6371.01 * Math.acos(Math.sin(x_Ch) * Math.sin(x_At) + Math.cos(x_Ch) * Math.cos(x_At) * Math.cos(y_Ch - y_At));
        
         //Distance between Orlando and Savannah
        double d_OrSa = 6371.01 * Math.acos(Math.sin(x_Or) * Math.sin(x_Sa) + Math.cos(x_Or) * Math.cos(x_Sa) * Math.cos(y_Or - y_Sa));
        
         //Distance between Orlando and Atlanta
        double d_OrAt = 6371.01 * Math.acos(Math.sin(x_Or) * Math.sin(x_At) + Math.cos(x_Or) * Math.cos(x_At) * Math.cos(y_Or - y_At));
              
        //From Ex 2.19 we need to find Side1, Side2 and Side3
        //So, We need to find the side3 which is common between the 2 triangles in this Ex.
        //Side3 between Charlotte and Orlando
        double Side3 = 6371.01 * Math.acos(Math.sin(x_Ch) * Math.sin(x_Or) + Math.cos(x_Ch) * Math.cos(x_Or) * Math.cos(y_Ch - y_Or));
      
        //Triangle one (Charlotte, Savannaha and Orlando)
        double S_T1 = (d_ChSa + d_OrSa + Side3)/2;
        double area_T1 = Math.sqrt(S_T1*(S_T1-d_ChSa)*(S_T1-d_OrSa)*(S_T1-Side3));
        
         //Triangle two (Charlotte, Atlanta and Orlando)
        double S_T2 = (d_ChAt + d_OrAt + Side3)/2;
        double area_T2 = Math.sqrt(S_T2*(S_T2-d_ChAt)*(S_T2-d_OrAt)*(S_T2-Side3));
        
        //The area between the 4 cites = area_T1 + area_T2
        double TotalArea = area_T1 + area_T2;
        System.out.printf("The area between the 4 cites = " + TotalArea);
    }
}
