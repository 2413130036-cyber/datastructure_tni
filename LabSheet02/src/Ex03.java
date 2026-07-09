
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		NumberArrayController nums = new NumberArrayController();
		nums.display("Display an initial array: ");
		
		int[] new_nums = new int [nums.getNums().length];
		
		for (int i=0; i<nums.getNums().length; i++) {
			new_nums[i] = nums.getNums()[i];
		}
		
		nums.setNums(new_nums);
		nums.display("\n\nAfter copy element:");
		
		nums.getNums()[nums.getNums().length-1] =15;
		nums.display("\n\nAfter aded the last element:");
		
	}

}
