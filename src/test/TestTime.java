package test;

public class TestTime {
	public static void main(String[] args) {
	      
	      Time t1 = new Time(1, 2, 3);
	      System.out.println(t1);  
	      Time t2 = new Time();    // The default constructor
	      System.out.println(t2);
	      
        t1.setHour(5);
	      t1.setMinute(6);
	      t1.setSecond(7);
	      System.out.println(t1);  
	    
	      System.out.println("Hour is: " + t1.getHour());
	      
	      System.out.println("Minute is: " + t1.getMinute());
	      
	      System.out.println("Second is: " + t1.getSecond());
	      
        t1.setTime(58, 59, 23);
	      System.out.println(t1);
	      System.out.println(t1.nextSecond()); 
	      
	      System.out.println(t1.nextSecond().nextSecond().nextSecond());  
	      
	   }
	}



