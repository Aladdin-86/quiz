import java.util.Scanner;
import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args) {
		String question =("How many months have 31 days in them?\n");
		question += "A) 10 ";
		question += "B) 8 ";
		question += "C) 6 ";
		question += "D) 7 ";
		question += "E) 5";
		String answer = JOptionPane.showInputDialog(question);
		answer = answer.toUpperCase();
		if (answer.equals("D")) {
			 JOptionPane.showMessageDialog(null,"Yes, that's right!");
			 }
		else if (answer.equals("B") || answer.equals("C") || answer.equals("A") || answer.equals("E")) {
			 JOptionPane.showMessageDialog(null,"Sorry, not correct, please try again");
		} else {
			JOptionPane.showMessageDialog(null,"Invalid input, Please enter A, B, C, D, E ");
			while (true) {
				JOptionPane.showMessageDialog(null,JOptionPane.showInputDialog(question));
			    Scanner input = new Scanner(System.in);
			    answer = input.nextLine();
			    if (answer.equals("D")) {
			    	JOptionPane.showMessageDialog(null,"Correct!");
			        break;
			    } else if (answer.equals("B") || answer.equals("C") || answer.equals("A") || answer.equals("E")) {
			    	JOptionPane.showMessageDialog(null,"Incorrect. Please try again.");
			    } else {
			    	JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
			    }
			}

		}
			}
	}
	