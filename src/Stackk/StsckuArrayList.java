package Stackk;


import java.util.ArrayList;

public class StsckuArrayList 
{
   static class stackB {
        static ArrayList<Integer> list = new ArrayList<>();
        
        // isEmpty
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static int pop() {
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public static int peek() {
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        stackB ss =new stackB();
        ss.push(5);
        ss.push(10);
        ss.push(15);
        ss.push(20);
        while (!ss.isEmpty()) {
            System.out.println(ss.peek());
            ss.pop();
        }
    }
}
