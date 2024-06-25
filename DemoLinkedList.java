package apjfsa;

import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {

	public static void main(String[] args) {
		
		
		List<Double> llist=new LinkedList<Double>();
		
        llist.add(2000.03);
        llist.add(3005.35);
        llist.add(4002.03);
        llist.add(5003.05);
        llist.add(321.35);
        llist.add(436.35);
        
        System.out.println(llist);
        System.out.println(llist.size());
        
        llist.remove(0);
        System.out.println(llist);
        llist.add(4002.03);
        System.out.println(llist);
       
        System.out.println(llist.isEmpty());
        System.out.println(llist.lastIndexOf(4002.03));
        System.out.println(llist.indexOf(321.35));
       // llist.push(5062.85);
        System.out.println(llist);
	}

}
