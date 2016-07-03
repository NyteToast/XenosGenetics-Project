package Utility;

public class NodeExtended<T>  extends Node{
	
	private NodeExtended<T> left;
	private NodeExtended<T> right;
	
	//GET
	
	//SET
	
	//CONSTRUCTORS
	public NodeExtended(T rootData) {
		super(rootData);
	}
	public NodeExtended(T rootData, int probability, Node<T> parent){
		super(rootData, probability, parent);
	}
	public NodeExtended(T rootData, Node<T> parent){
		super(rootData, parent);
	}
}
