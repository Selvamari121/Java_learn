package cscorner;

public class StringLearn {

	public static void main(String[] args) {
		String greeting="Hello";
		System.out.println(greeting); //string use
		
		String txt ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of thr text String is "+txt.length()); //lengthof string
		
		System.out.println(txt.toLowerCase());//upper lower
		System.out.println(txt.toUpperCase());
		
		String FirstName="selva";
		String SecondName="mari";
		
		System.out.println(FirstName+ " " +SecondName); //concat types
		System.out.println(FirstName.concat(SecondName));
		
		String doc="Hello , \'It's\' new \"software\" in \\the world";//\balackslash use
		System.out.println(doc);
	}

}
