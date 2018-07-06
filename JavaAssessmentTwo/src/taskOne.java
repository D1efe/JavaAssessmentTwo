public class taskOne {

	public String doubleChar(String input) {

		String[] doubler = input.split("");
		String holder = "";

		for (String x : doubler) {
			holder += x + x;
		}

		return holder;
	}

	// public String getSandwich(String input) {
	//
	// String bread = bread;
	// String[] remaining = bread.split("");
	//
	// for (int i = 0; i < bread.length(); i++)
	// if (input.startsWith(bread, i) == true)
	//
	//
	// }
	public boolean evenlySpaced(int a, int b, int c) {

		boolean result = false;

		if (a - b == b - c) {
			result = true;
		} else if (b - c == c - a) {
			result = true;
		} else if (c - a == a - b) {
			result = true;
		} else
			result = false;

		return result;
	}

	public String nTwice(String input, int a) {

		String result = null;

		result = input.substring(0, a) + input.substring(input.length() - a, input.length());

		return result;
	}

	public boolean endly(String input) {

		String ending = "ly";
		boolean reveal = false;

		if (input.endsWith(ending)) {
			reveal = true;

		}
		return reveal;

	}

//	public String stringClean(String input) {
//		String reducedStr = "";
//		String[] holder = input.split("");
//		ArrayList<String> sortCharacters = new ArrayList<>();
//
//		int counter = 0;
//		for (String x : holder) {
//			sortCharacters.add(x);
//		}
//
//		for (int i = 0; i < holder.length; i++) {
//			for (int j = 0; j < holder[i].length(); i++) {
//				if (sortCharacters.get(i) == (sortCharacters.get(j))) {
//					sortCharacters.remove(i + 1);
//
//				}
//
//			}
//			reducedStr += sortCharacters.get(i);
//
//		}
//
//		return reducedStr;
//	}

	int counter = 0;
	int adder = 0;
	boolean start = false;

	public int fibonacci(int input) {



		if (start == false) {
			start = true;
			counter = 1;
			fibonacci(input);

		} else if (counter <= input) {
			adder += counter;
			counter++;
			fibonacci(input);
			return adder;
		}
		return adder;
	}

}
