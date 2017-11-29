import java.util.*;
class ParallelResistorSolver {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Number of resistors in parallel: ");
	int numResistors = sc.nextInt();
	double sumBot = 0;
	for(int i=0; i < numResistors; i++) {
		System.out.println("Resistor Value: ");
		double temp = sc.nextInt();
		temp = 1/temp;
		sumBot += temp;
	}
	System.out.println(1/sumBot);
	}
}