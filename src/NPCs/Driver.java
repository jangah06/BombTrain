package NPCs;

import main.NPC;

public class Driver extends NPC{
	int convoNumber = 0;
	public Driver() {
		super("driver");
	}

	@Override
	public void talk() {
		switch(convoNumber) {
			case 0:
				talk0();
				break;
			case 1:
				talk1();
				break;
			default:
				talkfinal();
		}
	}
	
	public void talk0() {
		say("How did you get in here?!");
		String[] s = {
			"Uh, I work here.",
			"Wait did you hear that on the radio?",
			"I love trains!"};//end array
		
		int option = getResponse(s);
		switch(option) {
			case 1:
				say("No you don't! I know my staff, and you're not one of them!");
				convoNumber = 2;
				break;
			case 2:
				say("Yeah, aparently on social media there was some sort of threat to blow up a train"
						+ ", but, you know, you can't always belive what you hear online.");
				convoNumber = 1;
				break;
			case 3:
				say("Cool, now get heck outta here!");
				convoNumber = 3;
				break;
			default:
				say("Come again?");
		}
	}
	
	public void talk1() {
		say("Yeah, what's up?");
		String[] s = {
			"Don't you think you should still run a search here just to be safe?",
			"Yeah, I guess you're right.",
			"Nothing much buttercup!"};//end array
		
		int option = getResponse(s);
		switch(option) {
			case 1:
				say("Well, I guess one search couldn't hurt.");
				convoNumber = 11;
				break;
			case 2:
				say("I've always told people that social media is dangerous, "
						+ "and now my point is finally being proven!");
				convoNumber = 12;
				break;
			case 3:
				say("Uh...");
				convoNumber = 13;
				break;
			default:
				say("Come again?");
		}
	}
	
	public void talkfinal() {
		switch(convoNumber) {
			case 2:
				say("I've already called the police you imposter!");
				break;
			case 3:
				say("Didn't I tell you to get lost?!");
				break;
			case 11:
				say("Good looking out champ!");
				break;
			case 12:
				say("It's the government! They're spying on us!");
				break;
			case 13:
				say("You're a weird one aren't you?");
				break;
		}
	}
	
}//end

