package tree;

class Node{
	Node lt;
	Node rt;
	int data;
	
	Node(int data){
		lt = null;
		rt = null;
		this.data = data;
	}
}

public class Number1 {
	
	Node root;
	
	public void DFS(Node root) {
		if(root == null) {
			return;
		} else {
			//전위
			DFS(root.lt);
			//중위
			DFS(root.rt);
			//후위
		}
	}
	
	public static void main(String[] args) {
		Number1 tree = new Number1();
		tree.root = new Node(1);
	}

}
