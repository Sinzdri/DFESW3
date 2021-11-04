package com.qa.lambda;
interface Calc{
	int operation(int a, int b);
}
public class LambdaCalc {
	
	private int operate(int a, int b, Calc funcObj) {
		return funcObj.operation(a, b);
	}
	
	
	public static Calc add = (i,j) -> (i + j);
	Calc sub = (i,j) -> (i - j);
	Calc mult = (i,j) -> (i * j);
	Calc div = (i,j) -> (i / j);
	
	public static void main(String[] args) {
		LambdaCalc lambda = new LambdaCalc();
		System.out.println(lambda.operate(5, 7, add));
	}

		    
}
