class DSFsolution {

	public static int findButton(int l, int h) {

		Integer[][] frequencies = {
				{ 1906, 2033, 2174, 1979, 2106, 2247, 2061, 2188, 2329, 2150,
						2277, 2418 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 11 } };

		for (int i = 0; i <= 11; i++) {

			if (l + h == frequencies[0][i]) {
				return frequencies[1][i];
			}
		}
		return 20;
	}

	public static void main(String[] args) {

		try {

			int[] freqEntered = new int[args.length];

			for (int i = 0; i < args.length; i++) {
				freqEntered[i] = Integer.parseInt(args[i]);
				// System.out.println(freqEntered[i]);
			}

			int i = 1;
			while (i < freqEntered.length) {

				int digitsTest = findButton(freqEntered[i - 1], freqEntered[i]);

				if (digitsTest == 20) {
					System.out
							.println("There has been an error in the entered frequencies");
				} else {
					if (digitsTest == 10) {
						System.out.println("Digit entered: " + (char) 42);
					} else {
						if (digitsTest == 11) {
							System.out.println("Digit entered: " + (char) 35);
						} else {
							System.out.println("Digits entered: " + digitsTest);
						}
					}
				}
				i += 2;
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out
					.println("Issue with array length, consider revising input");
		} catch (NumberFormatException e) {
			System.out
					.println("Non integer characters entered, alteration of input required");
		}

	}

}