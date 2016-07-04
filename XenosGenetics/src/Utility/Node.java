package Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Node<T> {
	private T data;					//Object that is stored in Node<T>
	private Node<T> parent;			//Allows the finding of the extended node
	private List<Node<T>> children; //Any node that can be mutated to parent auto included as demutation.
	
	//Get
	public T getData(){return data;}
	public Node<T> getParent(){return parent;}
	public List<Node<T>> getChildren(){return children;}
	//Set
	public void setData(T data){this.data = data;}
	public void setParent(Node<T> parent){this.parent = parent;}
	public void setChild(Node<T> child){this.children.add(child);}
	
	//Constructors
	public Node(T rootData) {
		setData(rootData);
	    children = new ArrayList<Node<T>>();
	}
	public Node(T rootData, Node<T> parent){
		setData(rootData);
		children = new ArrayList<Node<T>>();
		setParent(parent);
		parent.setChild(this);
	}
	//Methods
	public void addChild(Node<T> child){
		children.add(child);
	}
	public Node<T> getChild(){
		Random r = new Random();
		return children.get(r.nextInt(children.size()));
	}
	public Node<T> findByData(T data){
		Node<T> output = null;
		Node<T> current;
		if (getData().equals(data)){
			for(int i = 0; i < getChildren().size(); i++){
				current = getChildren().get(i).findByData(data);
				if(!current.equals(null)){return current;}
			}
		}else {
			output = this;
		}
		return output;
	}
}
