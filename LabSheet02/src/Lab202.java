import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        int[] init = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        for (int n : init) {
            nums.add(n);
        }

        Scanner sc = new Scanner(System.in);

        String id = "2513110292";
        int d1 = Character.getNumericValue(id.charAt(id.length() - 1));
        int d2 = Character.getNumericValue(id.charAt(id.length() - 2));
        int d3 = Character.getNumericValue(id.charAt(id.length() - 3));

        int today = 9;

        System.out.print("The last element = ");
        int addNum = sc.nextInt();
        nums.add(addNum);

        System.out.print("The insert element = ");
        int insNum = sc.nextInt();
        if (d1 <= nums.size()) {
            nums.add(d1, insNum);
        } else {
            nums.add(insNum);
        }

        if (d2 < nums.size()) {
            nums.remove(d2);
        }

        if (d3 < nums.size()) {
            nums.set(d3, today);
        }

        System.out.println("display alll element : " + nums);
        System.out.println("display all element : " + nums);
        sc.close();
    }
}