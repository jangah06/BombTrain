
public class Child extends NPC{
	public Child() {
		super("child");
	}
	
	@Override
	public void talk() {
		say("Mister, mister help me!");
		String[] s = {
			"What's going on little one?",
			"Sorry, but I have somewhere to be.",
			"Where are your parents at?"
		};//end array
		int option = getResponse(s);
		switch(option) {
			case 1:
				say("I was using the potty and then before I left, I saw a wiered piece of paper "
						+ "that said there was gonna be a really big boom!");
				break;
			case 2:
				say("Aw okay.");
				break;
			case 3:
				say("Umm I think they're waiting for me at our seats.");
				break;
			default:
				say("What didjya sayy?");
		}
	}
}
