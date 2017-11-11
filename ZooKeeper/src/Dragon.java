import java.util.*;
public class Dragon extends Mammal{
	public Dragon(){
		this.energyLevel = 300;
	}
	
	public void fly() {
		this.energyLevel = energyLevel - 50;
		System.out.println("Woooosh");
	}
	public void eatHumans() {
		energyLevel = energyLevel + 25;
		System.out.println("Nevermind");
	}
	public void attackTown() {
		energyLevel = energyLevel - 100;
		System.out.println("Ahhhhhh, crackle, crackle, crackle");
	}
}
