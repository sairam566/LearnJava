package com.main.cal;

import com.main.operators.Operators;

public class Calculator {

	public static void main(String[] args) {
	
		Operators op=new Operators();
		System.out.println("The addition of 12 + 12 = "+op.add(12, 12));
		System.out.println("The Subtraction of 12 - 12 = "+op.sub(12, 12));
	}

}
