
package array;
public class new_array {
public static int getlargest(int numbers[]) {
	int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    
for(int i=0; i<numbers.length; i++) {
	 if(largest <numbers[i]){
		largest = numbers[i];
	}
	 if(smallest > numbers[i]) {
		 smallest = numbers[i];
	 }
}
System.out.println("smallest value is :"+ smallest);
return largest;
}
	public static void main(String args[]){
	int numbers[] = {23,4556,34854,10487,5499,885,67874,65,88,5,445};
System.out.println("Largest value is :"+ getlargest(numbers));
	}

}
