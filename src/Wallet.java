
public class Wallet extends Item{

	private boolean usedWall;
	public Wallet() {
		super("wallet");
		usedWall = false;
	}
	
	@Override
	public void use() {
		if(usedWall) {
			Game.print("You open the wallet, but find nothing important.");
		}
		else {
			Game.items.add(new Item("liscense"));
			usedWall = true;
			Game.print("You open the wallet and find the owner's driver's liscence. No money though. This guy is poor!");
		}
	}
}
