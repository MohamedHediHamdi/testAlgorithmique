package com.mohamed;

public class Multiple {

	private void displayMagicalNumber(int plMin, int plMax) {
		int i = plMin;
		while (i <= plMax) {
			int div3 = i % 3;
			int div5 = i % 5;
			if (div3 == 0) {
				System.out.print("H");
			}
			if (div5 == 0) {
				System.out.print("S");
			}
			if (div3 != 0 && div5 != 0) {
				System.out.print(i);
			}
			System.out.println();
			i++;
		}

	}

	public static void main(String[] args) {

		new Multiple().displayMagicalNumber(0, 50);

	}

}