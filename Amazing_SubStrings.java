import java.util.*;

class Main {
	void vowel(String name) {
		int count = 0;

		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == 'a' || name.charAt(i) == 'A') {
				for (int j = i; j < name.length(); j++) {
					count++;
					for (int k = i; k <= j; k++) {
						System.out.print(name.charAt(k));
					}
					System.out.print("\n");
				}
			}

			else if (name.charAt(i) == 'e' || name.charAt(i) == 'E') {
				for (int j = i; j < name.length(); j++) {
					count++;
					for (int k = i; k <= j; k++) {
						System.out.print(name.charAt(k));
					}
					System.out.print("\n");
				}
			}

			else if (name.charAt(i) == 'i' || name.charAt(i) == 'I') {
				for (int j = i; j < name.length(); j++) {
					count++;
					for (int k = i; k <= j; k++) {
						System.out.print(name.charAt(k));
					}
					System.out.print("\n");
				}
			}

			else if (name.charAt(i) == 'o' || name.charAt(i) == 'O') {
				for (int j = i; j < name.length(); j++) {
					count++;
					for (int k = i; k <= j; k++) {
						System.out.print(name.charAt(k));
					}
					System.out.print("\n");
				}
			}

			else if (name.charAt(i) == 'u' || name.charAt(i) == 'U') {
				for (int j = i; j < name.length(); j++) {
					count++;
					for (int k = i; k <= j; k++) {
						System.out.print(name.charAt(k));
					}
					System.out.print("\n");
				}
			}

		}
		if (count > 0) {
			System.out.println("\nHere, No. of Substrings are " + count + " and " + count + " % 10003 = " + (count % 10003));
		} else {
			System.out.println("No vowel letters found!!");
		}
	}

}
class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter word : ");
		String name = sc.nextLine();
		Main m1 = new Main();
		long start = System.currentTimeMillis();
		m1.vowel(name);
		long end = System.currentTimeMillis();
		System.out.println("\nThe time taken to find substrings of "+name+" is "+(end-start)+" ms");
	}
}