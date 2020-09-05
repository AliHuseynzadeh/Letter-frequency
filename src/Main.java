import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Include text: ");
		String text = scanner.nextLine();
		TreeMap<Character, Integer> frequency = new TreeMap<Character, Integer>();
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (frequency.containsKey(c)) {
				frequency.replace(c, frequency.get(c) + 1);
			} else {
				frequency.put(c, 1);
			} 
		}
		for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
			System.out.println("Character: " + entry.getKey() + " " + entry.getValue() + " defe gecir...");
		}
	}

}
