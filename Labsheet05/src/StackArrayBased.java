public class StackArrayBased {
	
   private int[] stacks;	 	// array to store elements
   private final int MAX_STACK = 50;	// maximum size of stack
   private int top;		 	// index of the top element

   // create an empty stack with a maximum size
   public StackArrayBased() {
      stacks = new int[MAX_STACK];
      top = -1;
   }

   // create an empty stack with a specific size
   public StackArrayBased(int capacity) {
      stacks = new int[capacity];
      top = -1;
   }
   
   public boolean isEmpty() {
	//   if (top == -1) {
	//	   return true;
	//   }
	//  return false;
	   
	   return top == -1;
   }
    
   public boolean isFull() {
	   return top == stacks.length-1;
   }
   
   public boolean push(int new_element) {
	   if (!isFull()) { // isFull() == true
		   top++;
		   stacks[++top] = new_element;
		   return true;
	   } 
	   return false;
   }
   
   public int peek() {
	   return !isEmpty() ? stacks[top] : -1;
   }
   
   public int pop() {
	   return !isEmpty() ? stacks[top--] : -1;
   }
   
   
}
