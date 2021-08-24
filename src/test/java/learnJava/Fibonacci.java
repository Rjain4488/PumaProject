package learnJava;

public class Fibonacci {
	
	//0 1 1 2 3 5 8 13
//	public static void fibo() {
//		int n1=0, n2=1, n3, i, count=10;
//		System.out.print(n1+" "+n2);
//		
//		for(i=2;i<count;i++) {
//			n3=n1+n2;
//			n1=n2;
//			n2=n3;
//			System.out.print(" "+n3);
//		}
//	}
	static int n1=0,n2=1,n3=0;    
	 static void printFibonacci(int count){    
	    if(count>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(count-1);    
	     }    
	 }    
	 public static void main(String args[]){    
	  int count=10;    
	  System.out.print(n1+" "+n2);//printing 0 and 1    
	  printFibonacci(count-2);//n-2 because 2 numbers are already printed   
	 }  
	}  
