import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		// Initializes Random, Unique Winning Nums
		Set<Integer> generatedLotNums = new HashSet<Integer>();
		Random r = new Random();
		int maxNum = 7;
		for (int i = 1; i < maxNum; i = i + 1) {
			int n = r.nextInt(50) + 1;
			if (generatedLotNums.contains(n) == false)
				generatedLotNums.add(n);
			else maxNum++;
		}

		// Prints out winning nums
		System.out.println("Winning nums");
		Iterator<Integer> it = (Iterator<Integer>) generatedLotNums.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Accepts 6 nums from User
		int[] userInputNums = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter unique lot nums");
		for (int i = 0; i < 6; i++) {
			System.out.println("Number " + (i + 1));
			userInputNums[i] = sc.nextInt();
		}

		// Checks if 6 nums are winning nums
		int totalMatches = 0;
		for (int i = 0; i < userInputNums.length; i++) {
			if (generatedLotNums.contains(userInputNums[i]))
				totalMatches++;
		}
		if (totalMatches == 6)
			System.out.println("We have a winner");

	}
}
