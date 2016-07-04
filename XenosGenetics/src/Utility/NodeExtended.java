package Utility;

public class NodeExtended<T> extends Node<T>  {
	
	private NodeExtended<T> left;
	private NodeExtended<T> right;
	
	//GET
	public NodeExtended<T> getLeft(){return left;}
	public NodeExtended<T> getRight(){return right;}
	
	//SET
	public void setLeft(NodeExtended<T> left){this.left = left;}
	public void setRight(NodeExtended<T> right){this.right = right;}
	
	//CONSTRUCTORS
	public NodeExtended(T rootData, NodeExtended<T> left, NodeExtended<T> right) {
		super(rootData);
		setLeft(left);
		setRight(right);
	}
	public NodeExtended(T rootData, Node<T> parent, NodeExtended<T> left, NodeExtended<T> right){
		super(rootData, parent);
		setLeft(left);
		setRight(right);
	}
}
