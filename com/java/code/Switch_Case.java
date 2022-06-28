package com.java.code;

public class Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day=8;
        String day_name;
        switch(day)
        {
        case 1:
            day_name="Monday";
            break;
            
        case 2:
            day_name="Tuesday";
            break;
            
        case 3:
            day_name="Wednesday";
            break;
            
        case 4:
            day_name="Thrusday";
            break;
            
        case 5:
            day_name="Friday";
            break;
        
        case 6:
            day_name="Saturday";
            break;
            
        case 7:
            day_name="Sunday";
            break;
            
        default:
            day_name="Invalid";
            
        }
        System.out.println(day_name);
	}

}
