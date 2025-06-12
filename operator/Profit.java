package operator;

public class Profit {

	public static void main(String[] args) {
		
		    
		        double costPrice = 129.0;
		        double sellingPrice = 191.0;

		        double profitLoss = sellingPrice - costPrice;
		        double profitLossPercentage = (profitLoss / costPrice) * 100;

		        String result;
		        if (profitLoss > 0) {
		            result = "Profit: " + String.format("%.2f", profitLoss) + " INR\n" +
		                     "Profit Percentage: " + String.format("%.2f", profitLossPercentage) + "%";
		        } else if (profitLoss < 0) {
		            result = "Loss: " + String.format("%.2f", Math.abs(profitLoss)) + " INR\n" +
		                     "Loss Percentage: " + String.format("%.2f", Math.abs(profitLossPercentage)) + "%";
		        } else {
		            result = "No Profit, No Loss.";
		        }

		        System.out.println(result);
		    }
		}

	


