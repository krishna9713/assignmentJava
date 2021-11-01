package ArithmeticOperators;

public class CalculateArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int[] numbers = new int[] {20,30,25,35,-16,60,-100};
		int sum=0;
		for(int k=0; k< numbers.length; k++) {
			sum = sum+numbers[k];
			//calculate average value
			double average = sum/numbers.length;
			System.out.println("Average value of the array elements is:"+average);
		}

	}

}
