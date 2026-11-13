
public class OldMan extends NPC{
	public OldMan() {
		super("oldman");
	}
	
	@Override
	public void talk() {
		say("Yeah, whaddya want?");
		String[] s = {
			"I was just wondering if you'd seen anything suspicious around here?",
			"Can I have some money?",
			"Oh, sorry. I didn't mean to bother you."
		};//end array
		int option = getResponse(s);
		switch(option) {
			case 1:
				say("Yeah I have actually. There was this one fella who was moving pretty fast "
						+ "and looked like he had somewhere to be, although we're on a train "
						+ "so I don't know where that would be.");
				break;
			case 2:
				say("No! Young man you won't get anywhere asking for handouts like that!");
				break;
			case 3:
				say("*Grumbles*");
				break;
			default:
				say("What? I can't hear you!");
		}
	}
}
