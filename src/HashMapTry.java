
		import java.util.Scanner;
		import java.util.HashMap;
		import java.util.Map;

public class HashMapTry {

	public static void main(String[] args) {


		        System.out.println("Hello World");

		        int count = 0;

		        Scanner s = new Scanner(System.in);

		        int[] DonnysNums = {1,2,2,3,3,3,4,4,4,4};

		       

		        HashMap<String, Integer> hmap = new HashMap<String, Integer>();

		      hmap.put("NumOne", DonnysNums[0]);

		      hmap.put("NumTwo", DonnysNums[1]); 

		      hmap.put("NumTwo", DonnysNums[2]);

		      hmap.put("NumThree",DonnysNums[3]);

		      hmap.put("NumThree",DonnysNums[4]);

		      hmap.put("NumThree",DonnysNums[5]);

		      hmap.put("NumFour", DonnysNums[6]);

		      hmap.put("NumFour", DonnysNums[7]);

		      hmap.put("NumFour", DonnysNums[8]);

		      hmap.put("NumFour", DonnysNums[9]);

		        System.out.println("Enter the value that you would like to find multiples of:");

		        int x = s.nextInt();

		        for (Map.Entry<String, Integer> me : hmap.entrySet()) {

		            if (me.getValue() == x){

		           count++;

		            }

		     }     
		        
		        System.out.println(x + " appears " + count + " times.");

		}

	}

