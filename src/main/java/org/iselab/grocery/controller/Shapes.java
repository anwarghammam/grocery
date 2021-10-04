package org.iselab.grocery.controller;

public class Shapes {
	public int calculateShape(String shape) {
		if(shape =="cercle") {
			System.out.println("area is blab;la");
		}
		else if(shape =="rectangle") {
			System.out.println("area is fsadfa;la");
		}
		
		else if(shape =="TRIANGLE") {
			System.out.println("area is FDSAASF;la");
		}
		
		else if(shape =="ellipse") {
			System.out.println("area is gdsadfsa;la");
		}
		else {
			return 5;
		}
		return 0;
		
	}

	public abstract class Shapes {
     String shape;

     public Shapes(String shape) {
         this.shape = shape;
     }

     public void  getShape() {
 		System.out.println("this is a "+ this.shape);
 	}

 	public abstract double calculateArea(double d);
 	public abstract double calculateArea(double a,double b);

	

}
