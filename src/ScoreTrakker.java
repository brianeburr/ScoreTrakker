import java.util.*;
import java.io.*;

public class ScoreTrakker {
	private ArrayList<Student> students;
	private String[] files  = {"scores.txt", "badscore.txt", "nofile.txt"};
	
	public ScoreTrakker() {
		students = new ArrayList<Student>();
	}
	
	public void loadDataFile(String fileName) throws FileNotFoundException{
		students.clear();
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
				System.out.println();
			}
		}
		fileScanner.close();
	}
	
	public void printInOrder() {
		students.sort(null);
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println();
	}
	
	public void processFiles() throws FileNotFoundException {
		for (String file : files) {
			try {
				loadDataFile(file);
				printInOrder();
			} catch (FileNotFoundException e) {
				System.out.println("Can't open file: " + file);
			}

		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		ScoreTrakker s = new ScoreTrakker();
		s.processFiles();
	}
}
