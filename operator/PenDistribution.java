package operator;

public class PenDistribution {
	

	    public static void main(String[] args) {
	        int totalPens = 14;
	        int numStudents = 3;

	        int pensPerStudent = totalPens / numStudents;
	        int remainingPens = totalPens % numStudents;

	        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
	    }
	}

