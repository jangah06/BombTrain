public class World {

	public static Room buildWorld() {
		Room front = new Room("Front", "This is the front of the train where the operators are seated.");
		Room storage = new Room("Storage", "This is where the passengers suitcases are stored.");
		Room car1 = new Room("Car 1", "This is the first passenger car of the train.");
		Room car2 = new Room("Car 2", "This is the second passenger car of the train.");
		Room car3 = new Room("Car 3", "This is the third passenger car of the train.");
		Room broom1 = new Room("Bathroom 1", "This is the place where you go potty. Don't forget to wash your hands!");
		Room broom2 = new Room("Bathroom 2", "This is the place where you go potty. Don't forget to wash your hands!");
		Room broom3 = new Room("Bathroom 3", "This is the place where you go potty. Don't forget to wash your hands!");
		Room kitchen = new Room("Kitchen Car",
				"This is where all the refreshments and food are stored for the passengers to buy.");
		Room sleeper1 = new Room("Sleeper Car 1", "This car contains rooms for higher paying customers.");
		Room sleeper2 = new Room("Sleeper Car 2", "This car contains rooms for higher paying customers.");
		Room observation = new Room("Observation Car",
				"This is where you'll get the best view for watching the world around this train");

		// EXITS FOR CARS
		// 0 = east, 1 = west, 2 = north, 3 = south, 4 = up, 5 = down
		front.addExit(storage, 3);

		storage.addExit(front, 2);
		storage.addExit(car1, 3);

		car1.addExit(storage, 2);
		car1.addExit(broom1, 1);
		car1.addExit(car2, 3);

		car2.addExit(car1, 2);
		car2.addExit(broom2, 1);
		car2.addExit(car3, 3);

		car3.addExit(car2, 2);
		car3.addExit(broom3, 1);
		car3.addExit(kitchen, 3);

		broom1.addExit(car1, 0);
		broom2.addExit(car2, 0);
		broom3.addExit(car3, 0);

		kitchen.addExit(car3, 2);
		kitchen.addExit(sleeper1, 3);

		sleeper1.addExit(kitchen, 2);
		sleeper1.addExit(sleeper2, 3);

		sleeper2.addExit(sleeper1, 2);
		sleeper2.addExit(observation, 3);

		observation.addExit(sleeper2, 2);
		
		//Items
		car1.addItem("magazine", new Magazine()); //use to open br 1 *this won't be a key for later versions*
		broom1.addItem("toiletpaper", new Item("toiletpaper")); //you can take this just because
		kitchen.addItem("corndog", new Item("corndog")); //you can take this just because
		car3.addItem("wallet", new Wallet()); //contains a license
		storage.addItem("keycard", new Keycard()); //use to open the front car
		
		//Heavy Objects
		Item seat = new Item("seat");
		seat.setCarry(false);
		car1.addItem("seat", seat);
		
		//NPCs
		front.addNPC("driver", new Driver());
		storage.addNPC("attendant", new Attendant());
		car1.addNPC("child", new Child());
		car2.addNPC("oldman", new OldMan());
		//car3.addNPC("woman", new Woman());
		//kitchen.addNPC("cashier", new Cashier());
		
		//Locked Rooms
		broom1.setLocked(true);
		//storage.setLocked(true);
		sleeper1.setLocked(true);
		front.setLocked(true);
		return car1;
	}
}// end all