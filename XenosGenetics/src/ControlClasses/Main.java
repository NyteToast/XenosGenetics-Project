package ControlClasses;

import Creatures.Creature;
import Creatures.CreatureStorage;
import Genetics.GeneLibrary;
import Genetics.GeneticCode;
import Room.Room;


public class Main {
	
	
	CreatureStorage animals = new CreatureStorage();
	GeneLibrary genes = new GeneLibrary();
	
	public static void main(String args[]){
		Main m = new Main();
		Breeding breeder = new Breeding();
		
	}
	
	private void printCreatures(){
		for (int i = 0; i < animals.getListCreatureDetails().length; i++){
			System.out.println(animals.getListCreatureDetails()[i]);
		}
	}
	private void gameLoop(){
		while(true){
			checkLevelUps();
			
		}
	}

	private void checkLevelUps() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	//Testing ideas on how to create rooms and floors
	
	private static void createRooms(){
		//first number is the floor number
		//second and third numbers are x, y co-ordinates for rooms
		Room Test[][][] = new Room[5][5][5];
		
		Test[0][0][0] = new Room(1,1,1);
		Test[1][0][0] = new Room(2,1,1);
		Test[2][0][0] = new Room(3,1,1);
		
		findRooms(Test);
		
		
	}
	
	private static void findRooms(Room [][][] Test){
		
		for ( int i = 0 ; i < 3 ; i++ ){
			System.out.println(Test[i][0][0].getMaxLevel());
			//if(Test[i][0][0] == null){
			//	System.out.println("empty");
			//}else{
			//	System.out.println("not empty");
			//}
		}
		
		
		
	}
	
	//checks availability of tile 
	private static void checkTiles(){
		
	}
	
	
}
