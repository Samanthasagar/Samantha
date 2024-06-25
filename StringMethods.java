//write a program to define a string object and demonstrate multiple methods of string.
package apjfsa;

//class declaration
public class StringMethods 
{
    //main method
	public static void main(String[] args) 
	{
		// declaration of string using literal
		String name="Anudip";
		System.out.println(name);
		
		String course=new String("APJFSA");//using constructor
		System.out.println(course);
		
		char[] courseType= {'a','w','s'};
		String course1=new String(courseType);//using character array
		System.out.println(course1);
		
		System.out.println(name.concat(" Foundation"));
		name="Anudip Foundation";
		System.out.println(name);
		System.out.println(name.charAt(7));//returns char value at a specified index
		System.out.println(name.indexOf('d'));
		System.out.println(name.lastIndexOf('o'));//Returns the index within this string of the last occurrence of the specified character. 
        System.out.println(name.indexOf('n', 2));
		System.out.println(name.length());//length of the string
		System.out.println(name.contains(course));
		System.out.println(name.compareTo(course1));//returns integer value ,calculates the unicode of char string
	
		String name1="anudip foundation";
		System.out.println(name1);
		System.out.println(name.compareTo(name1));//compares two strings
		System.out.println(name.compareToIgnoreCase(name1));//compares two strings without case difference
		System.out.println(name.equalsIgnoreCase(name1));//compare this string to another string by ignoring case difference
		System.out.println(name1.lastIndexOf('n'));
		System.out.println(name.strip());
		System.out.println(name.contentEquals(course1));//compares the string to the another
		System.out.println(name.toLowerCase());//returns all characters in lower case
		System.out.println(name1.toUpperCase());//returns all characters in upper case
		System.out.println(name.codePointAt(0));//returns the character(unicode) at a specified index
		System.out.println(name.repeat(2));//repeated count of string 
		System.out.println(name.startsWith(course));//Tests if this string starts with the specified prefix.
        System.out.println(name1.replace('f', 'F'));//replacing of old string character to new. 
        System.out.println(name.substring(5));
        System.out.println(name.trim());

	}

}
