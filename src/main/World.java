package main;

import NPCs.Attendant;
import NPCs.Child;
import NPCs.Driver;
import NPCs.OldMan;
import items.Keycard;
import items.Magazine;
import items.Wallet;

public class World {

	public static Room buildWorld() {
		//Front+storage objects
		Room front = new Room("Front", "This is the front of the train where the operators are seated.");
		Room storage = new Room("Storage", "This is where the passengers suitcases are stored.");
		
		//Car+bathroom objects
		Room car1 = new Room("Car 1", "This is the first passenger car of the train.");
		Room car2 = new Room("Car 2", "This is the second passenger car of the train.");
		Room car3 = new Room("Car 3", "This is the third passenger car of the train.");
		Room broom1 = new Room("Bathroom 1", "This is the place where you go potty. Don't forget to wash your hands!");
		Room broom2 = new Room("Bathroom 2", "This is the place where you go potty. Don't forget to wash your hands!");
		Room broom3 = new Room("Bathroom 3", "This is the place where you go potty. Don't forget to wash your hands!");
		
		//Kitchen object
		Room kitchen = new Room("Kitchen Car",
				"This is where all the refreshments and food are stored for the passengers to buy.");
		
		//Sleeper1 and its cars objects
		Room sleeper1 = new Room("Sleeper Car 1", "This car contains rooms for higher paying customers.");
		Room room01 = new Room("room01", "room.");
		Room room02 = new Room("room02", "room.");
		Room room03 = new Room("room03", "room.");
		Room room04 = new Room("room04", "room.");
		
		//Sleeper2 and its cars objects
		Room sleeper2 = new Room("Sleeper Car 2", "This car contains rooms for higher paying customers.");
		Room room05 = new Room("room05", "room.");
		Room room06 = new Room("room06", "room.");
		Room room07 = new Room("room07", "room.");
		Room room08 = new Room("room08", "room.");
		
		//Observation object
		Room observation = new Room("Observation Car",
				"This is where you'll get the best view for watching the world around this train");

		// EXITS FOR CARS
		// 0 = east, 1 = west, 2 = north, 3 = south, 4 = up, 5 = down
		
		//Front exit
		front.addExit(storage, 3);

		//Storage exit
		storage.addExit(front, 2);
		storage.addExit(car1, 3);

		//Car exits
		car1.addExit(storage, 2);
			car1.addExit(broom1, 1);
			car1.addExit(car2, 3);
			broom1.addExit(car1, 0);

		car2.addExit(car1, 2);
			car2.addExit(broom2, 1);
			car2.addExit(car3, 3);
			broom2.addExit(car2, 0);

		car3.addExit(car2, 2);
			car3.addExit(broom3, 1);
			car3.addExit(kitchen, 3);
			broom3.addExit(car3, 0);

		//Kitchen exits
		kitchen.addExit(car3, 2);
		kitchen.addExit(sleeper1, 3);

		//Sleeper 1 exits
		sleeper1.addExit(kitchen, 2);
			sleeper1.addExit(room01, 1);
			sleeper1.addExit(room02, 0);
			sleeper1.addExit(room03, 1);
			sleeper1.addExit(room04, 0);
			
			room01.addExit(sleeper1, 0);
			room02.addExit(sleeper1, 1);
			room03.addExit(sleeper1, 0);
			room04.addExit(sleeper1, 1);
		sleeper1.addExit(sleeper2, 3);

		//Sleeper 2 exits
		sleeper2.addExit(sleeper1, 2);
			sleeper2.addExit(room05, 1);
			sleeper2.addExit(room06, 0);
			sleeper2.addExit(room07, 1);
			sleeper2.addExit(room08, 0);
	
			room05.addExit(sleeper2, 0);
			room06.addExit(sleeper2, 1);
			room07.addExit(sleeper2, 0);
			room08.addExit(sleeper2, 1);
		sleeper2.addExit(observation, 3);

		//Observation exits
		observation.addExit(sleeper2, 2);
		
			//LOCKED ROOMS
			//room08.setLocked(true);
			front.setLocked(true);
		
		
		//ITEMS
		car1.addItem("magazine", new Magazine()); //use to open br 1 *this won't be a key for later versions*
		broom1.addItem("toiletpaper", new Item("toiletpaper")); //you can take this just because
		//kitchen.addItem("corndog", new Item("corndog")); //you can take this just because
		broom3.addItem("wallet", new Wallet()); //contains worried man's liscence
		storage.addItem("keycard", new Keycard()); //use to open the front car
		
			//Heavy Objects
			Item seat = new Item("seat");
			seat.setCarry(false);
			car1.addItem("seat", seat);
			//room08.addItem("bomb", new Bomb());
			//bomb.setCarry(false);

		
		//NPCS
		front.addNPC("driver", new Driver());
		storage.addNPC("attendant", new Attendant());
		car1.addNPC("child", new Child());
		car2.addNPC("oldman", new OldMan());
		//car3.addNPC("woman", new Woman());
		//kitchen.addNPC("cashier", new Cashier());
		//room08.addNPC("deadman", new DeadMan());
		//observatory.addNPC("worriedman", new worriedman());
		return car1;
	}
}// end all