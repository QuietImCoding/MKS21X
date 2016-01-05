public class Sorts {

   public static void printArray(int[]data){
       System.out.print("[ ");
       for (int i = 0; i < data.length - 1; i++) {
	   System.out.print(data[i]);
	   System.out.print(", ");
       }
       System.out.println(data[data.length - 1] + " ]");
   }
   public static void insertionSort(int[]data){
       int j;
       for (int i = 1; i < data.length; i++) {
	   j = i;
	   while (j > 0 && data[j] < data[j - 1]) {
	       data[j] = data[j - 1];
	       j--;
	   }
       }
   }


    public static void main(String[] args) {
	int nums[] = new int[10];
	for(int i = 0; i < nums.length; i++) {
	    nums[i] = (int)(Math.random()*100);
	}
	printArray(nums);
	insertionSort(nums);
	printArray(nums);
    }
}
