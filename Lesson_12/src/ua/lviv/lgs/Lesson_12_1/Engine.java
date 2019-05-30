package ua.lviv.lgs.Lesson_12_1;

public class Engine {
	private int sumCelinder;

	public Engine(int sumCelinder) {
		super();
		this.sumCelinder = sumCelinder;
	}



	public int getSumCelinder() {
		return sumCelinder;
	}

	public void setSumCelinder(int sumCelinder) {
		this.sumCelinder = sumCelinder;
	}

	@Override
	public String toString() {
		return " Engine [sumCelinder=" + sumCelinder + "]";
	}
}
