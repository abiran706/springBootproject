import java.util.Stack;

public class stack{
    public static String smallestKDigit(int[] arr, int k) {
        Stack<Integer> stack=new Stack<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && stack.peek()>arr[i] && (stack.size()-1+n-i)>=k){
                stack.pop();

            }
            if(stack.size()<k){
                stack.push(arr[i]);

            }
        }

        StringBuilder result=new StringBuilder();
        for(int num:stack){
            result.append(num);

        }
        return result.toString();

        
       
       
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 6, 3, 7, 1, 9};
        int k = 4;
        System.out.println("Smallest K-Digit Number: " + smallestKDigit(arr, k)); // Output: 2319
    }
}