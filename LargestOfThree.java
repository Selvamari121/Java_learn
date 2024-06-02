package patternjava;
import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args){
    	Scanner s= new Scanner(System.in);
    	System.out.println("Enter three number:");
    	double num1 = s.nextDouble();
    	double num2 = s.nextDouble();
    	double num3 = s.nextDouble();
    	s.close();
    	double largest = num1;
    	if(num2>largest) {
    		largest = num2;
    	}
    	if(num3>=largest) {
    		largest =num3;
    	}
    	System.out.println("the largest number is:" + largest);
    }
}
