package Room;

public class Room {

	private int level;
	private int maxLevel; 
	private int width;
	private int length;

	//GET
	public int getLevel(){return level;}
	public int getMaxLevel(){return maxLevel;}
	public int getWidth(){return width;}
	public int getLength(){return length;}
	
	//SET
	public void setLevel(int level){this.level = level;}
	public void setMaxLevel(int maxLevel){this.maxLevel = maxLevel;}
	public void setWidth(int width){this.width = width;}
	public void setLength(int length){this.length = length;}

	//Constructors
	public Room(int maxlevel, int width, int length){
		setMaxLevel(maxlevel);
		setWidth(width);
		setLength(length);
		setLevel(1);
	}
	
	//Methods

	//Increments level of the room
	public void levelUp(){
		if(getLevel() < getMaxLevel()){
			  setLevel(getLevel() + 1);
		  }else{
			  //Have a class that returns information for the error
		  }
	}
	
	//Test
	public void test(){
		System.out.println("Test");
	}
}