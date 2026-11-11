
	import java.util.Scanner;

	public class UI{
	
		
		Scanner input = new Scanner(System.in);
		
		double arrVA[] = new double[3];
		double arrVB[] = new double[3];

		Vector3 vA = null;
		Vector3 vB = null;


		public void getVectors(){
			

			System.out.println();
			
			for(int i = 0; i < 3; i++){

				if(i == 0){
					System.out.print(
					"Please enter the x componenet of vector A: " );
				} else if ( i == 1){
					System.out.print(
					"Please enter the y componenet of vector A: " );
				} else if ( i == 2){
					System.out.print(
					"Please enter the z componenet of vector A: " );
				}

				arrVA[i] = input.nextDouble();
		
			}
			
			System.out.println("\n");

			for(int i = 0; i < 3; i++){
					
				if(i == 0){
					System.out.print(
					"Please enter the x componenet of vector B: " );
				} else if ( i == 1){
					System.out.print(
					"Please enter the y componenet of vector B: " );
				} else if ( i == 2){
					System.out.print(
					"Please enter the z componenet of vector B: " );
				}


				arrVB[i] = input.nextDouble(); 	
			}

			vA = new Vector3(arrVA[0], arrVA[1], arrVA[2]);
			vB = new Vector3(arrVB[0], arrVB[1], arrVB[2]);
	


			System.out.println("\n \n");


		}
		
		public void displayMenu(){

			System.out.println("Vector A: " + vA);
			System.out.println("Vector B: " + vB);


			System.out.println("\n \n \n");

			System.out.println("Chose Operation: \n");
			
			// operations
			System.out.println("1. Add "); 
			System.out.println("2. Subtract "); 
			System.out.println("3. Scaler Multiply ");
			System.out.println("4. Negate ");
			System.out.println("5. Magnitude ");
			System.out.println("6. Exit ");

			System.out.println("\n");

		}

		public void performOperations(){
				
			int operation;
			double c;
			char vector;
			boolean loopRuns = true;

			while(loopRuns){
				
				displayMenu();

				System.out.print("Please enter the number of the operation you want to perform(1, 2, 3, ...): ");
				operation = input.nextInt();

				System.out.println();

				switch(operation){
					case 1: 
						System.out.println("\n \033[1m Result: " + vA.add(vB) + "\033[0m" + "\n \n \n");
						break;
					case 2:
						int subtractCheck;
						System.out.print("You want A - B or B - A enter (1 or 2): ");
						subtractCheck = input.nextInt();

						if(subtractCheck == 1){	
							System.out.println("\n \n \033[1m Result: " + vA.subtract(vB) + "\033[0m" + "\n \n \n");
						} else if (subtractCheck == 2){	
							System.out.println("\nResult: " + vB.subtract(vA) + "\n \n \n");
						} else {
							System.out.println("Invalid Chose 1 for A - B and 2 for B - A");
						}

						break;
					case 3:
						System.out.print("Enter the number you want to multiply: ");
						c = input.nextDouble();

						System.out.print("Enter the vector you want to multiply the number: (A or B): ");
						vector = input.next().charAt(0);

						if(vector ==  'A'){
							System.out.println("\n \033[1m Result: " + vA.multiply(c) + "\033[0m");
						} else if ( vector == 'B'){
							System.out.println("\n \033[1m Result: " + vB.multiply(c) + "\033[0m");
						} else {
							System.out.println("Invalid input enter A or B");
						}
						
						System.out.println("\n \n");
						break;

					case 4: 
						System.out.print("Enter the vector you want to multiply the number: (A or B): ");
						vector = input.next().charAt(0); if(vector ==  'A'){ System.out.println(" \033[1m Resutl: " + vA.negate() + "\033[0m");
						} else if ( vector == 'B'){
							System.out.println("\n \033[1mResult: " + vB.negate() + "\033[0m");
						} else {
							System.out.println("Invalid input enter A or B");
						}

						System.out.println("\n \n");
						break;

					case 5: 

						System.out.print("Enter the vector you want to multiply the number: (A or B): ");
						vector = input.next().charAt(0);

						if(vector ==  'A'){
							System.out.println("\n \033[1m Result: " + vA.magnitude() + "\033[0m");
						} else if ( vector == 'B'){
							System.out.println("\n \033[1m Result: " + vB.magnitude() + "\033[0m");
						} else {
							System.out.println("Invalid input enter A or B");
						}

						System.out.println("\n \n");
						break;

					case 6:
						loopRuns = false;
						break;

					default:
						System.out.println("Invalid Input operation");

										
				}



			}
		}


	
		public void start(){
			getVectors();
			performOperations();
		}

	}
