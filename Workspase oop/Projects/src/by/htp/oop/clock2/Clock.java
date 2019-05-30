package by.htp.oop.clock2;

public class Clock {
	private int hour;
	private int minute;
	private int secund;

	public Clock() {
		this.hour = 0;
		this.minute = 0;
		this.secund = 0;
	}

	public Clock(int hour, int minute, int secund) {
		this.hour = hour;
		if (hour >= 24 | hour < 0) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}

		this.minute = minute;
		if (minute >= 60 | minute < 0) {
			this.minute = 0;
		} else {
			this.minute = minute;
		}

		this.secund = secund;
		if (secund >= 60 | secund < 0) {
			this.secund = 0;
		} else {
			this.secund = secund;

		}
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecund() {
		return secund;
	}

	public void setSecund(int secund) {
		this.secund = secund;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + hour;
		result = result * prime + minute;
		result = result * prime + secund;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clock other = (Clock) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		if (secund != other.secund)
			return false;
		return true;
	}
}
