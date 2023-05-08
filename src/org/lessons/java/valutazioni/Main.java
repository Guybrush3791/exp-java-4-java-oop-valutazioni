package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Studente[] students = new Studente[20];
		int studentsLng = students.length;
		
		Random rnd = new Random();
		for (int x=0;x<studentsLng;x++) {
			
			Studente s = new Studente(x + 1, 
						rnd.nextInt(101), 
						rnd.nextFloat(5));
			
			students[x] = s;
		}
		
		int promCounter = 0;
		for (int x=0;x<studentsLng;x++) {
			
			Studente s = students[x];
			
			System.out.println(s + " --> bocciato: " + s.isBocciato());
			if (!s.isBocciato()) {
				promCounter++;
			}
		}
		
		System.out.println("-----------------------");
		System.out.println("promossi: " + promCounter + "/" + studentsLng);
	}
}
