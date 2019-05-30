package by.htp.oop.clock2;

import java.util.Scanner;
import by.htp.oop.clock2.Main;

public class Consol {

	public int enter(String message) {
		int x;

		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		x = sc.nextInt();
		return x;
	}

	
	public int hourChange() {
		int hourChange;

		Scanner sc = new Scanner(System.in);

		hourChange = enter("На сколько часов изменить время?");

		return hourChange;
	}

	
	public int minuteChange() {
		int minuteChange;

		Scanner sc = new Scanner(System.in);

		minuteChange = enter("На сколько минут изменить время?");

		return minuteChange;
	}

	
	public int secundChange() {
		int secundChange;

		Scanner sc = new Scanner(System.in);

		secundChange = enter("На сколько секунд изменить время?");

		return secundChange;
	}
}
