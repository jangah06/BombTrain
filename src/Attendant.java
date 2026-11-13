
public class Attendant extends NPC{
	public Attendant() {
		super("attendant");
	}
	@Override
	public void talk() {
		say("Hi there! How can I help you?");
		String[] s = {
			"Have you seen any strange individual around here?",
			"Do you know where I can go to buy some food?",
			"Can you help me get my luggage?"
		};//end array
		int option = getResponse(s);
		switch(option) {
			case 1:
				say("No. Why, is there something going on?");
				break;
			case 2:
				say("Sure! The Kitchen is 4 cars backwards from here!");
				break;
			case 3:
				say("Why yes sure (you can get it yourself though)!");
				break;
			default:
				say("Come again?");
		}
	}
}
