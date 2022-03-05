package com.typecasting.project;

public class AccessModifiers { 
	  void display() 
	     { 
	         System.out.println("You are using defalut access specifier"); 
	     } 
	} 
public class AccessSpecifiers1 {

	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		AccessSpecifiers1 obj = new AccessSpecifiers1(); 		  
        obj.display(); 

	}
}
//2. using private access specifiers
class Preaccessspecifier 
{ 
 private void display() 
  { 
      System.out.println("You are using private access specifier"); 
  } 
} 

public class AccessSpecifiers2 {

	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		Preaccessspecifier  obj = new Preaccessspecifier(); 
      //trying to access private method of another class 
      //obj.display();

	}
}







