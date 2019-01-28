//finforgood
package fracCalc;
import java.util.*;
public class FracCalc {

	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("input?");
	    String input=sc.nextLine();
	    while (!input.equals("quit")) {
	    	System.out.println(produceAnswer(input));
	    	System.out.print("input?");
	    	input=sc.nextLine();
			}
	    	sc.close();
    }
	 public static String produceAnswer(String input) { 
		 	String [] inputstr=(input.split(" "));
		 	String op1=inputstr[0];
		 	String operator=inputstr[1];
		 	String op2=inputstr[2];
		 	Fraction operand1=new Fraction(inputstr[0]);
		 	Fraction operand2= new Fraction(inputstr[2]);
		 	Fraction answer=new Fraction();
		 	answer=operand
		 	answer=operand1.doMath(operator,operand2);
		 	return answer.toString();
		 	/*
		 	String [] finFrac1 = split(frac1);
		 	String [] finFrac2 = split(frac2);
		 	int[] fracnums= toImproperFrac(StringtoInt(finFrac1));
		 	int[] fracnums2= toImproperFrac(StringtoInt(finFrac2));
		 	int[] answer= {0, 0, 1};
		    answer= math(fracnums, fracnums2, op);
		 	return(toMixedNum(reduce(answer)));
	 }
	 public static boolean isDivisibleBy(int num1, int num2) {
			//determines whether or not a number is divisible by another number
		 	if(num2==0&&num1==0) {
		 		return(num2<=0);
		 	}
		 	if (num2==0) {
		 		return(num2==0);
		 	}
			return (num1%num2==0);
			//mod checks the remainder
		}
	 public static boolean isPrime (int num1) {
			//determines if a number is prime
			int num2 = 2;
				while(!isDivisibleBy(num1, num2)) {
					num2--;
				//	System.out.println(num2);
				//if num1 is divisible by num2 add 1 to two
			}
			if(num2 == num1) {
				//determining if they are the same number
				return (true);
			} else {
				return (false);
			}
		}
	 public static int absValue(int num1) {
			//returns the absolute value of a number
			if (num1<0){
			 return (num1*-1);
			 //makes the negative value always positive
			} else { 
				return (num1);
			}
		}
	 public static String[] split(String frac) {
		 //split fractions into an array based on the type
		 	String whole="0";
		 	String numerator="0";
		 	String denominator="1";
		 	if(frac.contains("_")&&(frac.contains("/"))){
		 		//mixed fraction
		 		String parts1[]=frac.split("_");
		 		String parts[]=parts1[1].split("/");
		 		whole=(parts1[0]);
		 		numerator=(parts[0]);
		 		denominator=(parts[1]);
		 	}
		 	else if (frac.contains("/")){
		 		//regular fraction
		 	   String parts[] = frac.split("/");
		 	   numerator=(parts[0]);
		 	   denominator=(parts[1]);
		 	}else {
		 		//whole number
		 		whole=frac;
		 	}
		 	String s[]={whole, numerator, denominator};
		 	return s;
	 }
	 public static int[] StringtoInt(String [] finFrac) {
		 //change string of arrays of the fractions into int array
		 int[] numbers = {0,0,1};
		 for(int i = 0;i < finFrac.length;i++) {
			 numbers[i] = Integer.parseInt(finFrac[i]);
		 }
		return numbers;
	 }
	 public static int[] toImproperFrac(int[] numbers) {	
			if(numbers[1]==0) {
				//whole numb
				numbers[1]=numbers[0];
				numbers[2]=1;
				return numbers;
			}
			 	if(numbers[0]<0) {
			 		numbers[1] =(numbers[0]*numbers[2]-numbers[1]);
					return numbers;
			 	}else{
			 	numbers[1]=(numbers[0]*numbers[2]+numbers[1]); 
				return numbers;
			}
	 }
	 public static int[] math (int[] fracnums1, int[] fracnums2, String op) {
		 int[] answer= {0,0,1};
		 if (op.equals("+")) {
			 //if addition
			  answer [1]= (fracnums1[1]*fracnums2[2]+fracnums1[2]*fracnums2[1]);
			  answer[2] =(fracnums1[2]*fracnums2[2]);
		 }
		 if (op.equals("-")) {
			 //if subtraction
			 answer [1]= (fracnums1[1]*fracnums2[2]-fracnums1[2]*fracnums2[1]);
			  answer[2] =(fracnums1[2]*fracnums2[2]);		 }
		 if (op.equals("*")) {
			 //if multiplies
			 answer[1]= (fracnums1[1]*fracnums2[1]);
			 answer[2]=(fracnums1[2]*fracnums2[2]);
		 }
		 if (op.equals("/")) {
			 //if divides
			 answer[1]= (fracnums1[1]*fracnums2[2]);
			 answer[2]=(fracnums1[2]*fracnums2[1]);
		 }
		 return answer;
	 }
	 public static int[] reduce(int[] answer) {
		int[] redfin= {0,0,1};
		int max = Math.max(absValue(answer[1]),absValue(answer[2]));
		int min = Math.min(absValue(answer[1]), absValue(answer[2]));
		int divisor=1;
		int tryit = min;
		while (tryit > 1) {
			if (isDivisibleBy(max, tryit)){
				if (isDivisibleBy(min, tryit)){
					divisor = tryit;
					tryit = 1;
				}
			}
			tryit--;
		}
		if(answer[1]<0 || answer[2]<0) {
			redfin[1]=-1*(answer[1]/divisor);
			redfin[1]=-1*(answer[2]/divisor);
		}
		redfin[1] = answer[1]/divisor;
		redfin[2] = answer[2]/divisor;
		return redfin;
	 }
	 public static String toMixedNum(int[]redfin) {
		// System.out.println("in mix");
		 String finalAns= "";
		 int wholeishNum = 0;
		 int numeratorThing = 0;
		 wholeishNum=redfin[1]/redfin[2];
		 numeratorThing=redfin[1]%redfin[2];
		 // If the numerator equals zero, and the whole number equals zero.
		 if (wholeishNum==0 && numeratorThing==0) {
			 finalAns="0";
		 }	 
		 // Whole num is not zero and nume is not zero ie. 1_1/2
		 if(wholeishNum!=0 && numeratorThing!=0) {
			 finalAns+=wholeishNum;
			 finalAns+="_";
			 finalAns+=absValue(numeratorThing)+"/";
			 finalAns+=absValue(redfin[2]);
		 }
		 // Whole num is not zero, numerator is zero -> 1
		 if(wholeishNum != 0 && numeratorThing==0) {
			 finalAns+=wholeishNum;
		 }
		 
		 // Whole num is zero, numerator is not zero -> 1/2
		 if(wholeishNum==0 && numeratorThing!=0) {
			 //if denominator is zero make the numerator negative instead
			 if(redfin[2]<0) {
				 finalAns+=-1*numeratorThing+"/";
				 finalAns+=absValue(redfin[2]); 
			 }else {
			 finalAns+=numeratorThing+"/";
			 finalAns+=(redfin[2]);
			 }
		 }
		return finalAns;
		*/
	}	 

}