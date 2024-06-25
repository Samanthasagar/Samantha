package apjfsa;

//importing statements.
import java.util.LinkedList;
import java.util.List;

//class declaration
public class DemoLinkedList
{
  //main method
  public static void main(String[] args)
  {
		
	//creating linkedlist object named as llist
	List<Double> llist=new LinkedList<Double>();

	//adding list elements
        llist.add(2000.03);
        llist.add(3005.35);
        llist.add(4002.03);
        llist.add(5003.05);
        llist.add(321.35);
        llist.add(436.35);

	//printing list
        System.out.println(llist);
        
	//displays size of the list
	System.out.println(llist.size());

	//removes an element in the list
        llist.remove(0);
        System.out.println(llist);
		
        llist.add(4002.03);
        System.out.println(llist);

	//checks whether list is empty or not.
        System.out.println(llist.isEmpty());

	//returns last occurence of the specified element in the list.
        System.out.println(llist.lastIndexOf(4002.03));
	
	//displays first occurence of the element in the list.	
        System.out.println(llist.indexOf(321.35));
		
       // llist.push(5062.85);
        System.out.println(llist);
   }
}
