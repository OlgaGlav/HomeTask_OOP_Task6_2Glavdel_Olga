package by.htp.oop.clock2;

import by.htp.oop.clock2.Consol;
import by.htp.oop.clock2.Clock;
import by.htp.oop.clock2.Logic;

public class Main {

	public static void main(String[] args) {
		int hour;
		int minute;
		int secund;

		Consol timeDisplay = new Consol();

		hour = timeDisplay.enter("Укажите часы: ");
		minute = timeDisplay.enter("Укажите минуты: ");
		secund = timeDisplay.enter("Укажите секунды: ");

		Clock clock = new Clock(hour, minute, secund);

		System.out.printf("%02d:%02d:%02d", clock.getHour(), clock.getMinute(), clock.getSecund());
		System.out.println();

		
		Logic changeTime = new Logic();

		int hourChange = timeDisplay.hourChange();
		int minuteChange = timeDisplay.minuteChange();
		int secundChange = timeDisplay.secundChange();

		changeTime.newTime(clock, hourChange, minuteChange, secundChange);
	}

}
