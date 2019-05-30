package by.htp.oop.clock2;

import by.htp.oop.clock2.Clock;
import by.htp.oop.clock2.Main;
import by.htp.oop.clock2.Consol;

public class Logic {

	public void newTime(Clock clock, int hourChange, int minuteChange, int secundChange) {
		int secund = clock.getSecund();
		int minute = clock.getMinute();
		int hour = clock.getHour();

		int newSecund;
		int newMinute = 0;
		int newHour = 0;

		newSecund = secund + secundChange;
		if (newSecund >= 60) {
			newMinute = newMinute + (int) (newSecund / 60);
			newSecund = newSecund - (int) (newSecund / 60) * 60;
		}

		newMinute = minute + minuteChange + newMinute;
		if (newMinute >= 60) {
			newHour = newHour + (int) (newMinute / 60);
			newMinute = newMinute - (int) (newMinute / 60) * 60;
		}

		newHour = hour + hourChange + newHour;
		if (newHour >= 24) {
			newHour = newHour - (int) (newHour / 24) * 24;
		}

		System.out.printf("Новое время %02d:%02d:%02d", newHour, newMinute, newSecund);

	}
}
