/**
 * @(#)NameChecker.java
 *
 *
 * @author 
 * @version 1.00 2022/10/13
 */
import java.util.*;

public class NameChecker {

    public static boolean validName(String name){
    	for (int i = 0; i<name.length(); i++) {
    		char c= name.charAt(i);
    		if(!Character.isLetter(c) && !Character.isSpace(c))
    			return false;
		}
		return true;
    }
    public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
    	try {
    		System.out.print("Enter your Name = ");
    		String name = sc.nextLine();
    			if(!validName(name))
    				throw new InputMismatchException();
   
    			System.out.println ("Your name is : "+name);
			}
		catch (InputMismatchException ex) {
		
			System.out.println (ex);
		}
    }
}