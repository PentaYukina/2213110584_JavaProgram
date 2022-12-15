import javax.swing.*;

public class Lab606 {
	static int nums[] = {25, 78, 41, 22, 36, 85, 37};
	
	public static void main(String[] args) {
		
		int indexOfArray = Integer.parseInt
				(JOptionPane.showInputDialog("Input index of array:"));
		while(indexOfArray < 0 || indexOfArray > (nums.length-1)) {
			indexOfArray = Integer.parseInt
					(JOptionPane.showInputDialog("Input index of array,again:"));
		}
		checkIndex(nums,indexOfArray);
		JOptionPane.showMessageDialog(null,"Current data, nums["+indexOfArray+"] is "+currentData(nums,indexOfArray)
		+(indexOfArray!=0
		?"\nPrevious data, nums["+(indexOfArray-1)+"] is "+prevData(nums,indexOfArray)
		:"\nNo previous data")
		+(indexOfArray!=nums.length-1
		?"\nNext data, nums["+(indexOfArray+1)+"] is "+nextData(nums,indexOfArray)
		:"\nNo previous data")) ;
	}
	public static boolean checkIndex(int[] nums, int index) {
		return (index >= nums.length)? true:false ;
	}
	public static int currentData(int[] nums, int index) {
		return nums [index] ;
	}
	public static int prevData(int[] nums, int index) {
		return nums [index-1] ;
	}
	public static int nextData(int[] nums, int index) {
		return nums [index+1] ;
	}
}
