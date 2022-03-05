package com.metods.project;

public class InnerClass {

		 private String msg="Welcome to Java"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
		 }  


		public static void main(String[] args) {

			InnerClass obj=new InnerClass();
			InnerClass.Inner in=obj.new Inner();   
			in.hello();  
		}
	}


	public class InnerClassAssisted2 {

	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	 
	public static void main(String[] args) {
		InnerClassAssisted2  ob=new InnerClassAssisted2 ();  
		ob.display();  
		}
	}


	//anonymous inner class
	abstract class AnonymousInnerClass {
		   public abstract void display();
		}


		public class InnerClassAssisted3 {

		public static void main(String[] args) {
		AnonymousInnerClass i = new AnonymousInnerClass() {

		         public void display() {
		            System.out.println("Anonymous Inner Class");
		         }
		      };
		      i.display();
		   }
		}








	

