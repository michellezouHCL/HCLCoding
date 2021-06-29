package com.michelle;

public class Date {
	private int month;
	private int day;
	private int year;
	
	public Date(int month, int day, int year) {
		super();
		this.setMonth(month);
		this.setDay(day);
		this.setYear(year);
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
	
	public int getYear() {
				return year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
		public void setDay(int day) {
		this.day = day;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void displayDate(int month, int day, int year) {
		System.out.printf("%02d/%02d/%4d", month, day, year);
	}
}
