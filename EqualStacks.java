import java.util.Stack;

public class EqualStacks {
	public static void main(String[] args) {
		int[] data1 = {1,2,3,4,5,6};
		Stack<Integer> s1 = new Stack<Integer>();
		
		for (int i:data1) {
			s1.push(i);
		}
		int[] data2 = {6,5,4,3,2,1};
		Stack<Integer> s2 = new Stack<Integer>();
		
		for (int i:data2) {
			s2.push(i);
		}
		System.out.println(equals(s1, s2));
		
		
	}
	public static boolean equals(Stack<Integer> stack1, Stack<Integer> stack2) {
	    
	    boolean b = true;
	    if (stack1.size()!=stack2.size()) {
	        return false;
	    }
	    
	    else {
	        Stack<Integer> stack3 = new Stack<>();
	        while (!stack1.isEmpty()) {
	            int num1=stack1.pop();
	            int num2=stack2.pop();
	            stack3.push(num1);
	            stack3.push(num2);
	            
	            if (num1!=num2){
	                b = false;
	                break;
	               
	            }
	        }
	        
	        while (!stack3.isEmpty()) {
	            stack2.push(stack3.pop());
	            stack1.push(stack3.pop());
	        }
	    }
	    
	    return b;
	}
}
