public class Driver extends NPC{
	public Driver() {
		super("driver");
	}

	@Override
	public void talk() {
		say("How did you get in here?!");
		String[] s = {
			"Uh, I work here.",
			"Wait did you hear that on the radio?",
			"I love trains!"
		};//end array
		int option = getResponse(s);
		switch(option) {
			case 1:
				say("No you don't! I know my staff, and you're not one of them!");
				break;
			case 2:
				say("Yeah, aparently on social media there was some sort of threat to blow up a train"
						+ ", but, you know, you can't always belive what you hear online.");
				break;
			case 3:
				say("Cool, now get heck outta here!");
				break;
			default:
				say("Come again?");
		}
	}
	
}//end

