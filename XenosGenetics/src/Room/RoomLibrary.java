package Room;

public class RoomLibrary {

	//Creature Storage Rooms -- Needs names and balancing
	public RoomCreatureStorage smallRoomCS = new RoomCreatureStorage(10, 5, 5); 
	public RoomCreatureStorage mediumRoomCS = new RoomCreatureStorage(10, 15, 12); 
	public RoomCreatureStorage largeRoomCS = new RoomCreatureStorage(10, 25, 28); 
	
	//Creature Training Rooms -- Needs names and balancing
	public RoomCreatureTraining smallRoomCT = new RoomCreatureTraining(10);
	public RoomCreatureTraining mediumRoomCT = new RoomCreatureTraining(10);
	public RoomCreatureTraining largeRoomCT = new RoomCreatureTraining(10);
	
	//Creature Nursery Room -- Needs names and balancing
	public RoomCreatureNursery smallRoomCN = new RoomCreatureNursery(10);
	public RoomCreatureNursery mediumRoomCN = new RoomCreatureNursery(10);
	public RoomCreatureNursery largeRoomCN = new RoomCreatureNursery(10);
	
	//Players Item Storage Room -- Needs names and balancing
	public RoomItemStorage smallRoomIS = new RoomItemStorage(10);
	public RoomItemStorage mediumRoomIS = new RoomItemStorage(10);
	public RoomItemStorage largeRoomIS = new RoomItemStorage(10);
	
	//Merchant Room -- Needs names and balancing
	//Merchant sells you equipment for science labs or something like that
	public RoomMerchant smallRoomM = new RoomMerchant(10);
	public RoomMerchant mediumRoomM = new RoomMerchant(10);
	public RoomMerchant largeRoomM = new RoomMerchant(10);
	
	//Players Science Labs -- Need names and Balancing
	public RoomScienceLab bioSplicer = new RoomScienceLab(10);
	
}