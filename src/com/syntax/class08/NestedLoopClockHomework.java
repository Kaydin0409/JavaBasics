package com.syntax.class08;

public class NestedLoopClockHomework {

	public static void main(String[] args) {
		/*
		 * Using nested loop, create a 24 hour clock that will display 2 digits for an
		 * hour and 2 digits for a minute. Example:10:00 10:01 10:02…..etc 10:59 11:00
		 * ……etc
		 */

		int hour, hour2, minute1, minute2;

		for (hour = 0; hour <= 24; hour++) {

			for (minute1 = 0; minute1 <= 5; minute1++) {

				for (minute2 = 0; minute2 <= 9; minute2++) {

					System.out.print(hour + ":" + minute1 + minute2 + " ");

				}

			}

		} // this code does not print hours in 2 digits

		// below is code done with Asel

		for (int hrs = 0; hrs < 24; hrs++) {

			for (int min = 0; min < 60; min++) {
				String time;
				if (hrs < 10 && min < 10) {
					time = "0" + hrs + ":" + "0" + min;
					System.out.println(time);
				} else if (hrs < 10 && min >= 10) {
					time = "0" + hrs + ":" + min;
				} else if (hrs >= 10 && min < 10) {
					time = hrs + ":" + "0" + min;
				} else {
					time = hrs + ":" + min;
				}
				System.out.println(time);
			}
		}

		// best code done with Asel

		for (int a = 0; a <= 2; a++) {

			for (int b = 0; b <= 9; b++) {
				if (a == 2 && b == 4) {
					break;

				}
				for (int c = 0; c <= 5; c++) {
					for (int d = 0; d <= 9; d++) {
						System.out.println(a + b + ":" + c + d);
					}
				}
			}
		}

	}
}
