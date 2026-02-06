import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class AnimalNamesAges {

	static int counter = 0;
	static int totalAge = 0;

	public static void main(String[] args) throws IOException {
		String fileName = "NamesAges.txt";
		Scanner fileReader = new Scanner(new File("NamesAges.txt"));
		ArrayList<String> animals = new ArrayList<String>();
		ArrayList<Integer> ages = new ArrayList<Integer>();

		while (fileReader.hasNextLine()) {
			String word = fileReader.nextLine();
			String[] wordArray = word.split(",");
			animals.add(wordArray[0]);
			Collections.sort(animals);

			ages.add(Integer.parseInt(wordArray[1]));
			totalAge += (Integer.parseInt(wordArray[1]));
			counter++;

		}

		System.out.println("(1) List of Alphabetized animal Names:");
		System.out.println();

		for (String animal : animals) {
			System.out.println(animal);
		}
		System.out.println();
		System.out.println("(2) Average age of all animals: ");
		System.out.println();
		System.out.println("The average age is " + totalAge / counter);
// test branch
	}
}
