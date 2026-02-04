import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
public class AnimalNamesAges
	{

		public static void main(String[] args) throws IOException
			{
				String fileName = "NamesAges.txt";
				Scanner fileReader = new Scanner(new File("NamesAges.txt"));
				ArrayList<String> animals = new ArrayList<String>();
				ArrayList<Integer> ages = new ArrayList<Integer>();
				
				while (fileReader.hasNextLine())
					{
						String word = fileReader.nextLine();
						String [] wordArray = word.split(",");
						animals.add(wordArray[0]);
						ages.add(Integer.parseInt(wordArray[1]));
						
						
						
						
						
						
					}

			}

	}
