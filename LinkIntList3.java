
public class LinkedIntList3 {
	private ListNode front;   // null for an empty list


	public static void main(String[] args) {
		LinkedIntList list = new LinkedIntList();
		list.add(2);
		list.add(0);
		list.add(1);
		list.add(8);					
		System.out.println(list.hasTwoConsecutive());
			
		}
	public boolean hasTwoConsecutive() {
		boolean b=false;
		if (front == null) {
	        return false;
	    }
	    
		ListNode current=front.next;
		while (current!=null) {
	        if (current.data - front.data==1) {
	            b =true;
	        }
	        front=current;
	        current=front.next;
	    }
	    return b;
	}
}

