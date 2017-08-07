package com.oocl.group3.ExerciseWithTest;
import java.util.Scanner;


public class Exercise {
	static int value = 10; 
	static boolean a,b,c; 
	
	public Exercise(){
		
	}
	
	static int p1(int input) 
	{ 
	   value = input * value; 
	   System.out.println("In p1: " + value); 
	   return value; 
	} 
	static int p2(int input) 
	{ 
	    int value = 5; 
	    value = input / value; 
	    System.out.println("In p2: " + value); 
	    return value; 
	} 
	public static void printNumber(String num){
		System.out.println("\n\n\n\n******Answer for # : " + num + " ********\n");
	}
	
	public static void main(String[] args){
		number1();
		number2();
		number3();
		number4();
		number5();//////////////written
		number6();//////////////written
		number7(60); //compute_value(60)
		number8();//////////////////written
		number9();/////////////////written
		number10a();
		number10b();
		number10c();
		number10d();
		number10e();
	}
	
	private static void number10e() {
		printNumber("10e");
		// TODO Auto-generated method stub
		int one =  /* type a value here */3; 
	    int two = /* type a value here */3; 
	    int three =  /* type a value here */3; 
	     
	    do 
	    { 
	      one++; 
	      System.out.print("cart"); 
	    } 
	    while ( one < 3); 
	    for (int i = 0; i < two; i++) 
	    { 
	      System.out.print("o"); 
	     } 
	    while (true) 
	    { 
	      three++; 
	      if (three == 5) 
	      { 
	        break; 
	      } 
	      System.out.print("n"); 
	    } 
	}
	private static void number10d() {
		// TODO Auto-generated method stub
		printNumber("10d");
		a = true; 
	    b = false; 
	    c = false; 
	    System.out.println (a + ", " + b + ", " + c); 
	    do 
	    { 
	      if (b == c) 
	        b = a; 
	      else if (a == c) 
	        b = c; 
	      else 
	        a = c; 
	      System.out.println(a + ", " + b + ", " + c); 
	    } 
	    while ( a || b || c); 
	}
	private static void number10c() {
		// TODO Auto-generated method stub	
		printNumber("10c");
		int value = 5; 
	    int value2 = 1; 
	    while (value2 < 4) 
	    { 
	      for (;value >= value2; value--) 
	      { 
	        System.out.println("*"); 
	      } 
	      value2++; 
	    } 
		
	}
	private static void number10b() {
		printNumber("10b");
		// TODO Auto-generated method stub
	    System.out.println("Main before p1: " + value); 
	    value = p1(value); 
	    System.out.println("Main before p2: " + value); 
	    value = p2(value);     System.out.println("Main at the end: " + value); 
	    System.out.println("-----"); 
	    int value = 30; 
	    System.out.println("Main before p1: " + value); 
	    value = p1(value); 
	    System.out.println("Main before p2: " + value); 
	    value = p2(value); 
	    System.out.println("Main at the end: " + value); 
	}
	public static double number10a() {
		// TODO Auto-generated method stub
		printNumber("10a");
		double count; 
	    int limit; 
	    count = 9.0; 
	    limit = 43/4; 
	    for (; count <= limit; count = count + 0.5) 
	    { 
	      System.out.println ("in for:" + count); 
	    } 
	    System.out.println ("after for" + count);
	    return count;
	}
	private static void number9() {
		// TODO Auto-generated method stub
		//printNumber("9");
	}
	private static void number8() {
		// TODO Auto-generated method stub
		//printNumber("8");
		
	}
	public static int number7(int integer_value) {  
		// Declare Local Variables  
		printNumber("7");
		boolean done = false;  
		int count = 1;  
		int current = integer_value + 2;  
		while (! done) {  
		  current = current / count;  
		  if (current % 3 == 0)  
		    done = true;  
		  else if (current < 1)  
		    done = true;  
		  else  
		    count += 1;  
		  System.out.println(current);  
		}  
		System.out.println (count);  
		return count;  
	} // method compute_value  
	private static void number6() {
		// TODO Auto-generated method stub
		//printNumber("6");
	}
	private static void number5() {
		// TODO Auto-generated method stub
		//printNumber("5");
	}
	public static int number4() {
		// TODO Auto-generated method stub	
		int count = 0;
		printNumber("4");
		int x;
		int y;
		 x = 3; 
		 y = 10; 
		 while (x < y) 
		   {System.out.println ("Hello"); 
		   	count++;
		     x = x + 1; 
		     y = y - 1; 
		 } 	
		 
		 return count;
	}
	public static int number3() {
		// TODO Auto-generated method stub
	  printNumber("3");
	  int inner=2, outer=2; 
	  int result=0; 
	   
	  for (int i=0; i<outer; i++) 
	      { 
	    for (int j=0; j<inner; j++) 
	        { 
	          result = (result*result)+1; 
	        } 
	    } 
	  System.out.println(result);
	  return result;
	}
	
	public static int number2() {
		// TODO Auto-generated method stub
	  printNumber("2");
	/* 2 */
	  int n; 
	  int F_0=1,F_1=1; 
	  int F_n=0; 
//		  System.out.println ("Enter the number"); 
//		  Scanner scan = new Scanner(System.in);
//		  n=scan.nextInt(); 
	  n = 5;
	  for (int i=1; i<n; i++) 
	  { 
	        F_n=F_0+F_1; 
	        F_0=F_1; 
	        F_1=F_n; 
      } 
      System.out.println (F_n); 
	  
	  return F_n;
	}
	public static int number1() {
		// TODO Auto-generated method stub
		/* 1 */
		printNumber("1");
		int i=1; 
		for (int j=0; j<5;j=j+2) 
		{ 
		  i= (i*i) +j ;
		} 
		switch (i)  
		{ 
		   case 3: 
		     System.out.println ("zero"); 
		    break; 
		   case 13: 
		     System.out.println ("one"); 
		   case 175: 
		     System.out.println ("two"); 
		   default: 
		     System.out.println ("default"); 
		} 
		return i;
	}
}
