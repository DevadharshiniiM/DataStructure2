package stack;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the maximum size of the stack");
        int size = sc.nextInt();

        Stack stack = new Stack(size);
        while (true) {
            System.out.println("Choice 1 : Push");
            System.out.println("Choice 2 : Pop");
            System.out.println("Choice 3 : Display");
            System.out.println("Any other choice : Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter the element to be pushed");
                int val = sc.nextInt();
                stack.push(val);
            } else if (choice == 2) {
                int popped = stack.pop();
                if (popped != -1000) {
                    System.out.println("The popped element is " + popped);
                }
            } else if (choice == 3) {
                System.out.print("The contents of the stack are ");
                stack.display();
            } else {
                break;
            }
        }
    }
}

class Stack {
    private int[] arr;
    private int top;
    private int maxSize;

    public Stack(int size) {
        maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }

    public void push(int data) {
         if(arr.length-1==top){
             System.out.println("Stack is full");
         }
         else{
             top++;
             arr[top]=data;
         }
          
    }

    public int pop() {
        if(top==-1){
            System.out.println("Stack is empty");
            return -1000; 
        }
        else{
            int res = arr[top];
            top--;
            return res;
        }
    }

    public void display() {
      if(top==-1){
          System.out.println("{}");
      }
      for(int i =top;i>=0;i--){
          if(i==0){
              System.out.println(arr[i]);
          }
          else{
              System.out.println(arr[i]+" ");
          }
      }
      System.out.println();
    }
}