//write a program demonstrating Array List for inserting integer values and retrieve it,get index and get the last index of methods
package apjfsa;

//importing statements.
import java.util.ArrayList;
import java.util.List;

//class declaration
public class DemoArrayList {
     
	//main method
	public static void main(String[] args) {
		
		//object creation
		ArrayList list=new ArrayList();
		
		//adding elements
		
		list.add(10);//appends the element at end of the list
		list.add(20);
		list.add(30);
		list.add('a');
		list.add(3.14);
		list.add("Java");
		System.out.println(list);//printing list elements
		
		list.add(1,2);
		System.out.println(list);
		list.set(2,4);//Replaces the element at the specified position in this list with the specified element.
		System.out.println(list);
		
		//The Integer class wraps a value of the primitive type int in an object. An object of type Integer contains a single field whose type is int. 
        List<Integer> arrlist=new ArrayList<Integer>();//object creation
		
        //addAll. Appends all of the elements in the specified collection to the end of this list,
        //in the order that they are returned by the specified collection's Iterator. 
        arrlist.addAll(list);

		System.out.println(arrlist);//printing elements.
		System.out.println(arrlist.set(3,5));
		
		list.add(30);
		list.add(20);
		System.out.println(list);
		
		System.out.println(list.get(6));//Returns the element at the specified position in this list.
        System.out.println(list.contains(1));//Returns true if this list contains the specified element.
		System.out.println(list.indexOf('a'));//Returns the index of the first occurrence of the specified element in this list.
        System.out.println(list.lastIndexOf(20));//Returns the index of the last occurrence of the specified element in this list.
		System.out.println(list.add(null));//Array list which accepts null list.
		System.out.println(list.size());//Returns number of elements in the list.
		System.out.println(list.remove(8));//removes the element at then specified position in the list.
		System.out.println(list);//prints the list elements.
		System.out.println(list.remove("Java"));
		System.out.println(list);
		System.out.println(list.isEmpty());//Returns true if this list contains no elements.

		//clear,Removes all of the elements from this list. The list will be empty after this call returns.
		//And displays output as [].
        list.clear();
		System.out.println(list);
				
	}

}
