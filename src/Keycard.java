
public class Keycard extends Item{
	private boolean usedcard;
	public Keycard() {
		super("keycard");
		usedcard = false;
	}
	
	@Override
	public void use() {
		if(Game.getLocation().equals("storage")) {
			if(usedcard) {
				Game.print("The Front Car is already unlocked!");
			}
			else {
				Game.getLocation().getExit(2).setLocked(false);
				usedcard = true;
				Game.print("You use the keycard on the Front Car's door, and by chance, it works!");
			}
		}
		
		else {
			Game.print("The keycard doesn't seem to have any use here.");
		}
	}//end use
	
}//end class
