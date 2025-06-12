package operator;

public class Pi {
	

	    public static void main(String[] args) {
	        double radiusKm = 6378.0;
	        double pi = Math.PI;

	        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

	        double kmToMiles = 0.621371;
	        double radiusMiles = radiusKm * kmToMiles;

	        double volumeMiles3 = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

	        System.out.println("The volume of earth in cubic kilometers: " + volumeKm3 + " km^3");
	        System.out.println("The volume of earth in cubic miles: " + volumeMiles3 + " miles^3");
	    }
	}

