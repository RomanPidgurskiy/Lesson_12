package ua.lviv.lgs.Lesson_12_2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/** 
 * The {@code String} class represents string
 * @author R.Pidgurskiy
 * @since JDK 1.8.0_201
 * @version 1.0
 */


public class Enums {
	
	public enum Seasons {
		WINTER, SPRING, SUMMER, AUTUMN;
	}

	public enum Monthes {
		
		JANUARY(31, Seasons.WINTER), 
		FEBRUATY(28, Seasons.WINTER),
		DECEMBER(30,Seasons.WINTER),
		MARCH(31,Seasons.SPRING), 
		APRIL(30,Seasons.SPRING), 
		MAY(31,Seasons.SPRING),
		JUNE(30,Seasons.SUMMER), 
		JULY(31,Seasons.SUMMER),
		AUGUST(31,Seasons.SUMMER),
		SEPTEMBER(30,Seasons.AUTUMN),
		OCTOBER(31,Seasons.AUTUMN),
		NOVEMBER(30,Seasons.AUTUMN);
		
		
		int days;
		Seasons season;
		
		Monthes(int days, Seasons season){
			this.days=days;
			this.season=season;
		}
		
		public int getDays() {
			return days;
		}

		public Seasons getSeason() {
			return season;
		}
	}
	
	static void menu(){
		System.out.println("\n Select a menu item!");
		System.out.println("1 - Check if there is such a month");
		System.out.println("2 - Output all months with the same period of the year");
		System.out.println("3 - Output all months with the same number of days");
		System.out.println("4 - Display all months with fewer days");
		System.out.println("5 - Display all the months that have more days");
		System.out.println("6 - Display the next season");
		System.out.println("7 - Display the previous year of the screen");
		System.out.println("8 - Display all the months that have a couple of days");
		System.out.println("9 - Display all the months that have an odd number of days on the screen");
		System.out.println("0 - Display the screen or the console entered, the month has a couple of days");
		
	}
	
	
	
	
	/** Input month*/
	
	public static String  Input()  throws WrongInputConsoleParametersException{
		
		List monthNameList = new ArrayList();
		

		for (Monthes ma : Monthes.values()) {
			monthNameList.add(ma.name());
		} 

		System.out.println("  Enter the month:");
		Scanner scq = new Scanner(System.in);
		String mont = scq.next().toUpperCase();
		
		boolean flag = true;
		
		for (int n = 0; n<monthNameList.size();n++) {
			  if (monthNameList.get(n).equals(mont) )
					   {flag = false;  }
	        	}
			if (flag==true) { String message = "Error entering month " ;
			  throw new WrongInputConsoleParametersException(message);
			}
		 
	  return (mont);
	}
	
	
	


	public static void main(String[] args) throws WrongInputConsoleParametersException  {
		
	
		Scanner scase = new Scanner(System.in);
		
		
		List<Monthes> monthList = new ArrayList<Monthes>();
		List monthNameList = new ArrayList();
		List seasonList = new ArrayList();
		
		for (Monthes ma : Monthes.values()) {
			monthNameList.add(ma.name());
		} 
		
		for (Seasons s : Seasons.values()) {
			seasonList.add(s);
		} 
		
		
		for (Monthes ma : Monthes.values()) {
			monthList.add(ma);
		} 

		
		while(true) {
			menu ();
			switch(scase.next())  {
			
		/** Bring out the month */
			case "1": {
				String mont = Input();
				 System.out.println("So there is such a month - " + mont );
				 
			  break;
			}
			
		/** Output all months with the same period of the year */
			case "2": {
				String mont = Input();
				int i=0;
				for (i = 0; i<monthNameList.size();i++) {
					  if (monthNameList.get(i).equals(mont) ) { break;}
				}
				//String StrSeson = monthList.get(m).season.name() ;
				 
             for (int n = 0; n<monthNameList.size();n++) {
      			  if (monthList.get(n).season.name().equals(monthList.get(i).season.name())) { System.out.println(monthNameList.get(n));}
             }
			break;
		  }
			
			/**Output all months with the same number of days */
			case "3": {
				String mont = Input();
				int i=0;
				for (i = 0; i<monthNameList.size();i++) {
					  if (monthNameList.get(i).equals(mont) ) { break;}
				}
				
				 for (int n = 0; n<monthNameList.size();n++) {
	      			  if (monthList.get(n).days == monthList.get(i).days) { System.out.println(monthNameList.get(n));}
	             }
				  
			break;
		  }
			/** Display all months with fewer days */
			
			case "4": {		
				int days = monthList.get(0).days;
				
				for (int n = 0; n<monthNameList.size();n++) {
	      			  if (monthList.get(n).days < days) { days = monthList.get(n).days;}
	             }
				
				for (int n = 0; n<monthNameList.size();n++) {
	      			  if (monthList.get(n).days == days) {System.out.println( monthList.get(n)+" - Number of days "+ days);}
	             }
		 
			break;
		  }
			
		/**Display all the months that have more days */	 
          case "5": {
        	  int days = monthList.get(0).days;
				
				for (int n = 0; n<monthNameList.size();n++) {
	      			  if (monthList.get(n).days > days) { days = monthList.get(n).days;}
	             }
				
				for (int n = 0; n<monthNameList.size();n++) {
	      			  if (monthList.get(n).days == days) {System.out.println( monthList.get(n)+" - Number of days "+ days);}
	             }
		 
			break;
		  }	
          
          /**Display the next season  */
          case "6": {
        	  String mont = Input();
        	  int intOrdinal = 0;
        	  
        	 int i=0; 
        	  for (i = 0; i<monthNameList.size();i++) {
        		  if (monthNameList.get(i).equals(mont) ) { break;}
				  } 
        	  System.out.println(monthList.get(i).season);
        	  intOrdinal=monthList.get(i).season.ordinal()+1;	
        	 if (intOrdinal==4) {intOrdinal=0;}
				System.out.println(seasonList.get(intOrdinal));
			break;
		  }	
          
          
          /**Display the previous year of t he screen */
          case "7": {
        	  String mont = Input();
        	  int intOrdinal = 0;
        	  
        	 int i=0; 
        	  for (i = 0; i<monthNameList.size();i++) {
        		  if (monthNameList.get(i).equals(mont) ) { break;}
				  } 
        	  System.out.println(monthList.get(i).season);
        	  intOrdinal=monthList.get(i).season.ordinal()-1;	
        	 if (intOrdinal==-1) {intOrdinal=3;}
				System.out.println(seasonList.get(intOrdinal));
			break;
		  }
          
          /** Display all the months that have a couple of days */
          case "8": {
        	  System.out.println ("All the months that have a couple of days");
        	  for (int n = 0; n<monthNameList.size();n++) {
      			  if (monthList.get(n).days%2 == 0) {System.out.println( monthList.get(n)+" - Number of days "+  monthList.get(n).days);}
             }
        	 
			break;
		  }	
          
          
         /**Display all the months that have an odd number of days on the screen*/
          case "9": {
        	  System.out.println ("All the months that have not even a number of days");
        	  for (int n = 0; n<monthNameList.size();n++) {
      			  if (monthList.get(n).days%2 == 1) {System.out.println( monthList.get(n)+" - Number of days "+  monthList.get(n).days);}
             }
				  
			break;
		  }	
          
          case "0": {
        	  String mont = Input();
        	  int i=0; 
        	  for (i = 0; i<monthNameList.size();i++) {
        		  if (monthNameList.get(i).equals(mont) ) { break;}
				  } 
        	  if (monthList.get(i).days%2 == 1) {
        		   System.out.println(monthList.get(i)+" - "+monthList.get(i).days+" Even");
        	  }else{
        		  System.out.println(monthList.get(i)+" - "+monthList.get(i).days+" Odd number");
        	  }
        		  
       
			break;
		  }	
			
			}
			
		}


	}

}
