package petshop;

import java.util.Scanner;

import petshop.pets.Bird;
import petshop.pets.Cat;
import petshop.pets.Dog;
import petshop.pets.Hamster;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Need a pet shop
		PetShop petShop = new PetShop();

		// Need pet supplies
		PetSupplies petSupplies = new PetSupplies();

		// Need a cash register
		CashRegister cashRegister = new CashRegister();

		// Need some pets
		Pet firstBird = new Bird("Polly");
		Pet firstCat = new Cat("Skittles");
		Pet firstDog = new Dog("Buddy");
		Pet firstHamster = new Hamster("Jerry");

		petShop.addPet(firstBird);
		petShop.addPet(firstCat);
		petShop.addPet(firstDog);
		petShop.addPet(firstHamster);

		// Need a player introduction
		System.out.println("\"Finally! I've been waiting on you for ages!\"");
		System.out.println("");
		System.out.println("1. \"Do I know you?\"");
		System.out.println("2. \"You've been waiting for me?\"");
		System.out.println("3. \"Right, of course. I'm sorry I'm late\"");

		String greetingResponse = input.nextLine();

		switch (greetingResponse) {
		case "1":
			System.out.println("\"You're the new shop keeper, right? I was");
			System.out.println("told my replacement would be in this afternoon.");
			break;
		case "2":
			System.out.println("\"Yes! I was supposed to clock out two hours ago!");
			break;
		case "3":
			System.out.println("\"Well, you're here now at least.");
			break;
		}

		System.out.println("What's your name again?\"");

		String playerName = input.nextLine();

		ShopKeeper player = new ShopKeeper(playerName);

		System.out.println("\"Nice to meet you, " + player.getName() + ". We only have the one name tag");
		System.out.println("so your name will have to be Kevin while you're on the clock.");
		System.out.println("I already refilled the food dishes, cleaned the cages, and restocked");
		System.out.println("all the supplies. You won't have to do any of that for a while.\"");
		System.out.println("");
		System.out.println("1. Stare at blankly");
		System.out.println("2. \"Um...thanks, I guess\"");
		System.out.println("3. \"What happened to the first Kevin?\"");

		String introResponse = input.nextLine();

		switch (introResponse) {
		case "1":
			System.out.println("\"No questions? Perfect!");
			break;
		case "2":
			System.out.println("\"You're welcome!");
			break;
		case "3":
			System.out.println("\"We're all Kevin. Weren't you listening?");
			break;
		}

		System.out.println("Your replacement should be here in the morning.");
		System.out.println("I trust you'll be able to give them the same rundown.");
		System.out.println("Have a splendid evening, Kevin!\"");

	}
}
