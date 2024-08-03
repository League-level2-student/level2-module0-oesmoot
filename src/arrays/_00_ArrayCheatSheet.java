package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] things = {"thing1","thing2","thing3","thing4","thing5"};
		//2. print the third element in the array
		System.out.println(things[2]);
		//3. set the third element to a different value
		things[2] = "thingIII";
		//4. print the third element again
		System.out.println(things[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0; i<things.length; i++) {
			System.out.println(things[i]);
		}
		
		//6. make an array of 50 integers
		int[] nums = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random ran = new Random();
		for(int i=0; i<nums.length; i++) {
			nums[i] = ran.nextInt();
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallestNumber = nums[0];
		for(int i=1;i<nums.length;i++) {
			if(nums[i]<smallestNumber) {
				smallestNumber = nums[i];
			}
		}
		System.out.println(smallestNumber);
		//9 print the entire array to see if step 8 was correct
		for(int numb : nums) {
			System.out.println(numb);
		}
		//10. print the largest number in the array.
		int largestNumber = nums[0];
		for(int i=1; i<nums.length; i++) {
			if(nums[i]>largestNumber) {
				largestNumber = nums[i];
			}
		}
		System.out.println(largestNumber);
	}
}
