import java.util.*;
import java.io.*;

public class ScoreTrakker {
	private ArrayList<Student> students;
	private String[] files = {"scores.txt", "badscore.txt"};
	
	private void loadDataFile(String fileName) throws FileNotFoundException{
		
		FileReader reader = new FileReader(fileName);
		Scanner fileScanner = new Scanner(reader);
		String name = "", scoreBeforeInt = "";
		while (fileScanner.hasNext()) {
			try {
				name = fileScanner.nextLine();
				scoreBeforeInt = fileScanner.nextLine();
				int score = Integer.parseInt(scoreBeforeInt);
				students.add(new Student(name, score));
		
			} 
			catch (NumberFormatException e) {
				System.out.println("Incorrect format for " + name + " not a valid score: " + scoreBeforeInt);
			}
		}
		fileScanner.close();
	}
	
	
	
	public static void main(String[] args) {
		ScoreTrakker s = new ScoreTrakker();
	}
}
