package ticketprinter;

import java.util.Scanner;

public abstract class Section implements Ticket {

	private int price;
	private String section;

	public Section(int price, String section) {
		this.price = price;
		this.section = section;
	}

	
	
	
	
	
	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Choose a section\nPress 1 for Club:\nPress 2 for First Class:\nPress 3 for Mid Venue:\nPress 4 for Low Tier:\nPress 5 for General Admission:");
		String userSection = userInput.nextLine();
		
		int userSelection = Integer.parseInt(userSection);
		
		
		if (userSelection == 1) {
			section = "Club";
		}
		else if (userSelection == 2) {
			section = "First Class";
		}
		else if (userSelection == 3) {
			section = "Mid Venue";
		}
		else if (userSelection == 4) {
			section = "Low Tier";
		}
		else {											// 5 and any other number will produce general admission ticket
			section = "General Admission";
		}
		
		Scanner userCorrection = new Scanner(System.in);
		System.out.println("You have selected " + section + ", is this correct? Y/N?");
		String isCorrect = userCorrection.nextLine();
		
		if (isCorrect.toUpperCase().equals("Y")) {			// any input except Y will prompt the user to select again
			this.section = section;
		}
		
		//setSection(String section);
		this.section = section;
	}

	public int getPrice() {
		if (this.section.equals("Club")) {
			this.price = 300;
		}
		if (this.section.equals("First Class")) {
			this.price = 200;
		}
		if (this.section.equals("Mid Venue")) {
			this.price = 100;
		}
		if (this.section.equals("Low Tier")) {
			this.price = 50;
		}
		if (this.section.equals("General Admission")) {
			this.price = 25;
		}
		return this.price;
	}

}
