package reverseNumberAndString;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList);

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < arrayList.size(); i++){
            stack.push(arrayList.get(i));
        }
        for(int i = 0; i < arrayList.size(); i++){
            arrayList.set(i,stack.pop());
        }
        System.out.println(arrayList);
    }
}
