package org.lessons.java.valutazioni;

public class Studente {

	private int id;
	private int percAssenze;
	private float avgVoti;
	
	public Studente(int id, int percAssenze, float avgVoti) {
		
		setId(id);
		setPercAssenze(percAssenze);
		setAvgVoti(avgVoti);
	}
	
	public int getId() {
		
		return id;
	}
	public void setId(int id) {
		
		this.id = id;
	}
	public int getPercAssenze() {
		
		return percAssenze;
	}
	public void setPercAssenze(int percAssenze) {
		
		this.percAssenze = percAssenze;
	}
	public float getAvgVoti() {
		
		return avgVoti;
	}
	public void setAvgVoti(float avgVoti) {
		
		this.avgVoti = avgVoti;
	}
	
	public boolean isBocciato() {
		
		return (getPercAssenze() > 50) 
				|| (getPercAssenze() > 25 && getAvgVoti() <= 2)
				|| (getAvgVoti() < 2);
	}
	
	@Override
	public String toString() {
		
		return "[" + getId() + "] Studente: " 
				+ getPercAssenze() + "% - " 
				+ String.format("%.2f", getAvgVoti()) + "/5";
	}
}
