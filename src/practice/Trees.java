package practice;

public class Trees {

	TreeNode root;
	public Trees(){
		root=null;
	}
	
	
	
	public void preOrder(TreeNode localRoot)
	{
		
	if(localRoot != null)
	{
	System.out.print(localRoot.data + "");
	preOrder(localRoot.leftchild);
	preOrder(localRoot.rightchild);
	}
	}
	
	public void inOrder(TreeNode localRoot)
	{
		
	if(localRoot != null)
	{
		inOrder(localRoot.leftchild);
	System.out.print(localRoot.data + "");
	
	inOrder(localRoot.rightchild);
	}
	}
	
	public void postOrder(TreeNode localRoot)
	{
		
	if(localRoot != null)
	{
		postOrder(localRoot.rightchild);
		postOrder(localRoot.leftchild);
	System.out.print(localRoot.data + "");
	

	}
	}
	
	public void insertNode(int data){
	TreeNode newNode=new TreeNode(data);
	TreeNode parent;
	TreeNode current;
	if(root==null){
		root=newNode;
	}
	else{
		current=root;
		
		while(true){
			parent=current;
		if(data<current.data){
			current=current.leftchild;
			if(current==null){
				parent.leftchild=newNode;
			//	System.out.println(parent.leftchild);
			return;
			}
		}
		else {
			current=current.rightchild;
			if(current==null){
				parent.rightchild=newNode;
			//	System.out.println(parent.rightchild);
				return;
			}
		}
	}
	}
	}
	
	public void displayTree(){
		
		System.out.println("\nPre order traversal");
		preOrder(root);
		System.out.println("\nIn order traversal\n");
		inOrder(root);
		System.out.println("\nPost order traversal\n");
		postOrder(root);
		}
			
				
				
			
		
	
	
	
	
}
