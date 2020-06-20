
public class IntTree3 {
	private IntTreeNode overallRoot;
	
	// pre : max > 0
	// post:constructs a sequential tree with given number of 
	//		nodes
	
	public IntTree3(int max) {
		if (max <= 0) {
			throw new IllegalArgumentException("max: " + max);
		}
		overallRoot = buildTree(1,max);
	}
	
	// post: returns a sequential tree with n as its root unless 
	// 		n is greater than max, in which case it returns an 
	//	empty tree
	private  IntTreeNode buildTree(int n, int max) {
		if (n > max) {
			return null;
		} else {
			return new IntTreeNode (n,buildTree(2*n,max),
									buildTree(2*n+1,max));
		}
	}
	
	public static void main(String[] args) {
		IntTree3 tree =new IntTree3(18);
		System.out.println((tree).isFull());
	}
	public boolean isFull(){
	    return isFull(overallRoot);
	}

	private boolean isFull(IntTreeNode node) {
	    if (node == null) {
	        return true;
	    }
	    
	    if (node.left==null && node.right!=null) {
	        return false;
	    }
	    
	    if (node.left!=null && node.right==null) {
	        return false;
	    }
	    else {
	        return isFull(node.left) && isFull(node.right);
	    }
	    
	}
}
