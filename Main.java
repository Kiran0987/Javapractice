package com.bridgelabz.javafundamentals;

import java.util.Date;

public class Main {
	static byte a = 10;
	short b = 34;
	int c = 10;
	long d = 23;
	float e = 5.2f;
	double f = 4.9;
	boolean g = true;
	char h = '#';
	
	String i = "Hello";
	Byte j = 29 ;
	Short k = 65 ;
	Integer l = 12 ;
	Long m = 32l;
	Float n = 1.5f;
	Double o = 5.7;
	Boolean p = false;
	Character q = '8';
	Date s = new Date();
	Main t = new Main();
	Date[] u;
	
	static final float PI = 3.14f;
	
    public static void main (String[] args) {
	  System.out.println("Welcome to java Fundamentals");
	
	  int sum = add(5, 10);
	 System.out.println(sum);
	 
	  a = 50;
	  int sum2 = add(5, a);
	 System.out.println(sum2);
  }

static int add(int a , int b) {
	return a + b;
   }
}

