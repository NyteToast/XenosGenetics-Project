package Room;

public class RoomLibrary {

	//Creature Storage Rooms -- Needs names and balancing
	public RoomCreatureStorage smallRoomCS = new RoomCreatureStorage(10, 1, 1, 5, 5); 
	public RoomCreatureStorage mediumRoomCS = new RoomCreatureStorage(10, 1, 1, 15, 12); 
	public RoomCreatureStorage largeRoomCS = new RoomCreatureStorage(10, 1, 1, 25, 28); 
	
	//Creature Training Rooms -- Needs names and balancing
	public RoomCreatureTraining smallRoomCT = new RoomCreatureTraining(10, 1, 1);
	public RoomCreatureTraining mediumRoomCT = new RoomCreatureTraining(10, 1, 1);
	public RoomCreatureTraining largeRoomCT = new RoomCreatureTraining(10, 1, 1);
	
	//Players Item Storage Room -- Needs names and balancing
	public RoomItemStorage smallRoomIS = new RoomItemStorage(10, 1, 1);
	public RoomItemStorage mediumRoomIS = new RoomItemStorage(10, 1, 1);
	public RoomItemStorage largeRoomIS = new RoomItemStorage(10, 1, 1);
	
	//Merchant Room -- Needs names and balancing
	//Merchant sells you equipment for science labs or something like that
	public RoomMerchant smallRoomM = new RoomMerchant(10, 1, 1);
	public RoomMerchant mediumRoomM = new RoomMerchant(10, 1, 1);
	public RoomMerchant largeRoomM = new RoomMerchant(10, 1, 1);
	
	//Players Science Labs -- Need names and Balancing
	public RoomScienceLab bioSplicer = new RoomScienceLab(10, 1, 1);
	
}