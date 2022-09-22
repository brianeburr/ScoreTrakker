import java.util.*;
import java.io.*;

public class ScoreTrakker {
	private ArrayList<Student> students;
	private String[] files = {"scores.txt", "badscore.txt"};
	
	private void loadDataFile(String fileName) {
		try {
		FileReader reader = new FileReader(fileName);
		
		
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		ScoreTrakker s = new ScoreTrakker();
	}
}
