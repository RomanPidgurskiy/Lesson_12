package ua.lviv.lgs.Lesson_12_1;

public class Auto {

	private int  horsepower; 
	private int year_release;
	private Kermo kermo;
	private Engine engine;
	
	public Auto(int horsepower, int year_release, Kermo kermo, Engine engine) {
		super();
		this.horsepower = horsepower;
		this.year_release = year_release;
		this.kermo = kermo;
		this.engine = engine;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public int getYear_release() {
		return year_release;
	}

	public void setYear_release(int year_release) {
		this.year_release = year_release;
	}

	public Kermo getKermo() {
		return kermo;
	}

	public void setKermo(Kermo kermo) {
		this.kermo = kermo;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Auto [horsepower=" + horsepower + ", year=" + year_release + "]" + kermo + engine + "\n" ;
				
	}
	
}
