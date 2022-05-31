package mini;

import java.util.Scanner;

public class CourierSystem {

	    @SuppressWarnings("resource")
		public static void main(String[] args){
	        float weight, distance, courierCharge;
	        Scanner scan = new Scanner(System.in);

	        System.out.println("+++++ LAKE Inc. - COURIER SYSTEM +++++");
	        System.out.println("---------------------------------------");
	        System.out.println("Enter Weight of Parcel (in kg.): ");
	        weight = scan.nextFloat();
	        System.out.println("Enter the Distance to Destination (in km.): ");
	        distance = scan.nextFloat();

	        if (weight <= 5)
	            courierCharge = 6;
	        else
	        {
	            weight = weight - 5;
	            courierCharge = (float)(6 + (weight*1.2));
	        }
	        if(distance <= 6)
	            courierCharge = courierCharge + (float)4.2;
	        else
	        {
	            distance = distance - 6;
	            courierCharge = courierCharge + ((float)(4.2 + (distance*1.4)));
	        }
	            String currencySym = java.text.NumberFormat.getCurrencyInstance().format(courierCharge);

	        System.out.println("\nYour charge is " + currencySym + courierCharge);
	    }

}
