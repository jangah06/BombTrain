
public class Magazine extends Item {
	private boolean usedKey;

	public Magazine() {
		super("magazine");
		usedKey = false;
	}

	@Override
	public void use() {
		if (Game.getLocation().getRname().equals("Car 1")) {
			if (usedKey) {
				Game.print("The bathroom is already unlocked!");
			} else {
				Game.getLocation().getExit(1).setLocked(false);
				usedKey = true;
				Game.print("Finally I can use the bathroom!");
			}
		} else
			Game.print("The magazine doesn't seem to work for this.");
	}
}