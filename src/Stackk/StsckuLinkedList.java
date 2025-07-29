package Stackk;

import Stackk.StsckuArrayList.stackB;

public class StsckuLinkedList {
   static class Node{
	   int data;
	   Node next;
	   Node(int data)
	   {
		   this.data=data;
		   this.next=null;
	   }
   }
   
static class Stsck{
	   static Node head=null;
	   //isEmpty
	   public static boolean isEmpty()
	   {
		   return head==null;
	   }
	   
	   //add
	   public static void push(int data)
	   {
		   Node newNode=new Node(data);
		//cs1   
		   if(isEmpty())
		   {
			   head=newNode;
			   return;
		   }
		   
		   newNode.next=head;
		   head=newNode;
		   
	   }
	   //pop
	   public static int pop()
	   {
		   if(isEmpty())
		   {
			   return -1;
		   }
		   
		   int top=head.data;
		   head=head.next;
		   return top;
	   }
	   //peek
	   public static int peek()
	   {
		   if(isEmpty())
		   {
			   return -1;
		   }
		   
		   return head.data;
	   }
	   
	   
	   
	   
	   public static void main(String[] args) {
		   Stsck ss =new Stsck();
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


}
