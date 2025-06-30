 package stringbhuilder;

 public class Calculation {

		    public static void main(String[] args) {
		        String text = "hellop java world";
		        String[] words = text.split(" ");

		        for (int i = 0; i < words.length - 1; i++) {
		            for (int j = i + 1; j < words.length; j++) {
		                if (words[i].length() > words[j].length()) {
		                    String temp = words[i];
		                    words[i] = words[j];
		                    words[j] = temp;
		                }
		            }
		        }

		        for (int i = 0; i < words.length; i++) {
		            System.out.println(words[i]);
		        }
		    }
 }
 
		
