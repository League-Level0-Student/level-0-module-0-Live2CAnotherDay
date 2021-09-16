package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random(); // This will be used later to make random numbers.

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);

		// 1. Create some variables to hold health levels
		int playerHealth = 100;
		// playerHealth to store your health - set it equal to 100
		int dragonHealth = 100;
		// dragonHealth to store the dragon's health - set it equal to 100
		int bow_Arrow = 10;
		int flames = 15;
		int sword_Slash = 15;
		int wing_whirlwind = 10;
		// 2. Create some variables to hold the attack strengths. These will be given
		// different values later.
		int playerAttack = 0;
		// playerAttack to store the damage the player's attack will do - set it equal
		// to 0 for now.
		int dragonAttack = 0;
		// dragonAttack to store the damage the dragon's attack will do - set it equal
		// to 0 for now.

		// This while statement will cause the game attack code to repeat
		String choice = JOptionPane
				.showInputDialog("Oh, No! A Wild Dragon has appeared! Do You Want To Fight it? [Y or N]");
		String name;
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON

			// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
			// or a kick
			if (choice.equalsIgnoreCase("Y")) {
				choice = JOptionPane
						.showInputDialog("Do You Want to slash it with a Sword or Shoot an Arrow at it? [S or A]");
				if (choice.equalsIgnoreCase("A"))
					;
				{
				}
				dragonHealth = dragonHealth - bow_Arrow;
				if (ran.nextBoolean()) {
					dragonAttack = dragonAttack + wing_whirlwind;
				} else {
					dragonAttack = dragonAttack + flames;
				}
				playerHealth = playerHealth - dragonAttack;
				JOptionPane.showMessageDialog(null, "Nice! The Dragon has " + dragonHealth + " left! You have "
						+ playerHealth + " remaining! Good Luck!");

			} else if (choice.equalsIgnoreCase("S")) {
				dragonHealth = dragonHealth - sword_Slash;
				if (ran.nextBoolean()) {
					dragonAttack = dragonAttack + wing_whirlwind;
				} else {
					dragonAttack = dragonAttack + flames;
				}
				playerHealth = playerHealth - dragonAttack;
				JOptionPane.showMessageDialog(null, "Nice! The Dragon has " + dragonHealth + " left! You have "
						+ playerHealth + " remaining! Good Luck!");

			} else {
				JOptionPane.showMessageDialog(null, "You ran away but the dragon caught you and ate you. R.I.P.");
				System.exit(0);
			}

			if (dragonHealth <= 0) {
				JOptionPane.showMessageDialog(null,
						"Congratulations! You Defeated the only Dragon in the world and destroyed another ecosystem! Great Job!");
				System.exit(0);

			} else if (playerHealth <= 0) {
				JOptionPane.showMessageDialog(null, "Sad You Failed To Win. Better luck next time!");
				System.exit(0);
			}

			// 4. If they typed in "yell":

			// -- Find a random number between 0 and 10 and store it in playerAttack. Use
			// ran.nextInt(10)

			// 5. If they typed in "kick":

			// -- Find a random number between 0 and 25 and store it in playerAttack.

			// 6. Subtract the player attack value from the dragon's health

			// THE DRAGON RETALIATES

			// 7. Find a random number between 0 and 35 and store it in dragonAttack

			// 8. Subtract the dragon attack value from the player's health

			// ASSESS THE DAMAGE

			// 9. If the player's health is less than or equal to 0, the game is over,
			// call the playerLost() method

			// 10. If the dragon's health is less than or equal to 0, the game is over,
			// call the dragonLost() method

			// 11. Pop up a message that tells us how much health the player and
			// dragon have left.

			// (Bonus: Also display the amount of health that was lost by each in this
			// round)

		} // this is the end of the while loop

	}

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no
		// treasure

		System.exit(0); // This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of
		// gold!

		System.exit(0); // This code ends the program
	}

}
