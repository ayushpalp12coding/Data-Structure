
class Tree_Traversal {
	public  static class  Node {
		int data;
		Node left,right;
		Node(int data) {
			this.data=data;
			left=null;
			right=null;
		}
	}

	public  static void preorder(Node root) {
		if(root == null) return;
		System.out.print(root.data);

		preorder(root.left);
		preorder(root.right);
	}
	public  static void inorder(Node root) {
		if(root == null) return;


		inorder(root.left);
		System.out.print(root.data);
		inorder(root.right);
	}
		public  static void postorder(Node root) {
		if(root == null) return;


		postorder(root.left);
	
		postorder(root.right);
			System.out.print(root.data);
	}

	public static void main(String[] args) {

		Node root = new Node(1);

		root.left = new Node(2);
		root.right = new Node(3);

		root.left.left = new Node(4);
		root.left.right = new Node(5);

		root.right.left = new Node(6);


		System.out.println(root.data);
		System.out.println(root.left.data);
		System.out.println(root.right.data);
		preorder(root);
		System.out.println();
		inorder(root);
		System.out.println();
		postorder(root);


	}
}