package fracCalc;

import java.util.Scanner;

public class Fraction {
	private  int whole;
	private int numerator;
	private int denominator;
	private String sign;
	private String Fractionstr;
	public Fraction (String input[]) {
		whole=0;
		numerator=0;
		denominator=1;
		String[] split=Fractionstr.split("_");
		if(split.length==2) {
			whole=Integer.parseInt(split[0]);
			Fractionstr=split[1];
		}
		String[] split2=Fractionstr.split("/");
		if (split2.length==2) {
			numerator=Integer.parseInt(split2[0]);
			denominator=Integer.parseInt(split2[1]);
		}
		else
			whole = Integer.parseInt(split2[0]);
	}
	public Fraction ImproperFrac( int whole, int numerator, int denominator) {
		if(whole==0)
		//parse string to int
		/*if(numerator!=0) {
		 whole*denominator+numerator+ "/"+ denominator
		}
		return answer;*/
	}
	public Fraction doMath(Fraction op, String operator) {
		Fraction answer =  new Fraction();
		if(operator.equals("+")) {
			
		}else if (operator.equals("-")) {
			//subtract
		}else if (operator.equals("*")) {
			//multiply
		}else if (operator.equals("/")){
			//divide
		}
		return answer;
	}
	public toMixedNum ()
	public Fraction(Fraction op2) {
	/*	//do the math t add the functions
		Fraction answer = new Fraction();
		
		//get common denominators
		//add the numerators
		
		//set answer's values
		*/
		return answer;
	}
	
}
