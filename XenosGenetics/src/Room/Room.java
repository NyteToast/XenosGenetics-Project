package Room;

public class Room {

	private int level;
	private int maxLevel; 

	
	//GET
	public int getLevel(){return level;}
	public int getMaxLevel(){return maxLevel;}

	
	//SET
	public void setLevel(int level){this.level = level;}
	public void setMaxLevel(int maxLevel){this.maxLevel = maxLevel;}

	
	//Constructors
	public Room(int maxlevel){
		setMaxLevel(maxlevel);
		setLevel(1);
	}
	
	//Methods
	
	public void levelUp(){
		if(getLevel() < getMaxLevel()){
			  setLevel(getLevel() + 1);
		  }else{
			  //Have a class that returns information for the error
		  }
	}
	

	
}