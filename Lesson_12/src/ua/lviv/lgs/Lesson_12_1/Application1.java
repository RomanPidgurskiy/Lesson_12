package ua.lviv.lgs.Lesson_12_1;

import java.util.Random;
//import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Application1 {
 public static void main(String[] args) {
	
	 String [] material = {"leather", "alcantara"};
	    int sizeCol = rand(1,3);
	    int sizeRow = rand(1,3);
	   
	    List<Auto> list = new ArrayList<Auto>();
	  
		for (int i=0;i<sizeCol;i++) {
			for (int j=0;j<sizeRow;j++) {
				list.add(new Auto(rand(10,120),rand(2000,2019), new Kermo(rand(30,90), material[rand(0,1)]), new Engine(rand(4,12))));
			}
		}
		
		
	  
	   list.add(new Auto(rand(10,120),rand(2000,2019), new Kermo(rand(30,90), material[rand(0,1)]), new Engine(rand(4,12))));
        
	   System.out.println("List.add");
	   System.out.println(list);
	   
	   Collections.sort(list,new Comparator<Auto>() {
			@Override
			public int compare(Auto a1, Auto a0) {
				return a1.getHorsepower()-a0.getHorsepower();
			}
		});
	   
	   System.out.println("List.sort");
	   System.out.println(list);

	}    
	static int rand(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("Error min_max");
		}
		Random arrValue = new Random();
		return arrValue.nextInt(max - min + 1) + min;
}
}
