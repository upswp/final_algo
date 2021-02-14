package final_algo.data_structure;

class Tree{
	class Node{
		int data;
		Node left;
		Node right;
		Node (int data){
			this.data = data;
		}
	}
	Node root;
	public void makeTree(int[] a) {
		root = makeTreeR(a, 0, a.length -1);
	}
	
	public void seachBTree (Node n, int find) {
		if (find < n.data) {
			System.out.println("Data is smaller than " + n.data);
			seachBTree(n.left, find);
		}else if (find > n.data) {
			System.out.println("Data is bigger than " + n.data);
			seachBTree(n.right, find);
			
		}else {
			System.out.println("Data found!!");
		}
	}
	public Node makeTreeR(int[] a, int start, int end) {
		if(start > end) return null;
		int mid = (start + end) / 2;
		Node node = new Node(a[mid]);
		node.left = makeTreeR(a, start, mid - 1);
		node.right = makeTreeR(a,mid + 1, end);
		return node;
	}
}




public class BinaryTree {

	public static void main(String[] args) {
		int [] a = new int [10];
		for(int i = 0; i<a.length; i++) {
			a[i] = i;
		}
		
		Tree t = new Tree();
		t.makeTree(a);
		t.seachBTree(t.root, 2);
	}
}
