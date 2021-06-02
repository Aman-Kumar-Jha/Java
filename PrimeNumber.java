//WAP to print all the prime numbers in an array of n elements 
//by taking command line arguments.
class PrimeNumber { 
	public static void main(String[] args){ 
// Wrapper Class
		int n = args.length;
		int num [] = new int[n];
		for(int i=0; i<n; i++){
			num[i] = Integer.parseInt(args[i]);
			boolean flag = true;
				for(int key = 2; key<num[i]; key++){
					if(num[i] % key == 0){
						flag = false;
						break;
					}
				}// end of inner for loop
			if(flag == true){
				System.out.println(num[i]);
			}
		}// end of outer for loop
} 
} 

