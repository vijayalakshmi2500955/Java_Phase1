package com.string.search;

public class ArraysDemo {
	public static void main(String[] args) {


		String  str1 = new String("Java");

		String str4 = new String("Java");

		String str2 = "Python";

		String str3 = "Python";

		System.out.println(str1.toString());

		System.out.println(str2);


		System.out.println(str1.equals(str4));// compare content / values

		System.out.println(str1 == str4);


		System.out.println(str2.equals(str3));

		System.out.println(str2 == str3);


		 str1 = str1.concat(" Language");

		 System.out.println(str1);

		 str1 = str1 + " Course";

		 System.out.println(str1);

	}

//syn2

int  ar2[] = new int[4];
ar2[0] = 701;
ar2[1] = 702;
ar2[2] = 703;

for (int i = 0; i < ar2.length; i++) { // normal for loop


	System.out.println(ar2[i]);
}


System.out.println("for each loop");

for (int element : ar2) {  // foreach  can be use with arrays , collections

	System.out.println(element);
}
}
}
