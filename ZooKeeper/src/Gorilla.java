import java.util.*;
public class Gorilla extends Mammal{
	public void throwSomething() {
		this.energyLevel = energyLevel - 5;
		System.out.println("Humans bad");
	}
	public void eatBananas() {
		energyLevel = energyLevel + 10;
		System.out.println("Bananas good");
	}
	public void climb() {
		energyLevel = energyLevel - 10;
		System.out.println("Why did the gorilla climb the tree?");
	}
}
