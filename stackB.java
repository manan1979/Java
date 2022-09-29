import java.util.*;




class stackB {
    // static class Stack {
    // static ArrayList<Integer> list =  new ArrayList<>();

    // public static  boolean isEmpty() {
    //     return list.size() == 0;
    // }

    // public static void push(int data) {
    //     list.add(data);
    // }

    // public static int pop() {
    //     if(isEmpty()) {
    //         return -1;
    //     }
    //     int top = list.get(list.size() -1);
    //     list.remove(list.size()-1); 
    //     return top;

    // }
 
    // public static int  peek() {
    //     if(isEmpty()) {
    //         return -1; 
    //     }
    //     return list.get(list.size()-1);

    // }


    // }

   // **************** linked list stack implementaion


//     static class Node {
// int data;
// Node next;
// Node(int data) {
//     this.data = data;
//     this.next = null;

// }

//     }

//     static class Stack {
//         static Node head = null;


//         public static boolean isEmpty() {
//             return head == null;

//         }

//         public static void push(int data) {
//         Node newNode = new Node(data);

//         if(isEmpty())  {
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//         }

//         public static int pop() {

//             if(isEmpty()) {
//                 return -1;

//             }
//             int top  = head.data;
//             head= head.next;
//             return top;
        
//         }
//         public static int peek() {
//             if(isEmpty()) {
//                 return -1;
//             }
//             return head.data;
//         }
        
//     }


    public static void pushAtBottom(Stack<Integer> s, int data) {
    
    if(s.isEmpty()) {
        s.push(data);
        return;
    } 
    int top = s.pop();
     pushAtBottom(s, data);
     s.push(top);
    }

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<Character>();
        int idx = 0;
        while(idx <str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();

    }


    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<Integer>();
        span[0] = 1;
        s.push(0);


        for(int i = 1; i<stocks.length; i++) {
            int currPrice = stocks[i];
            while(!isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();


            }
            if(s.isEmpty()) {
                span[i] = i+1;

            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }

            s.push(i);
        }

    }



    


    private static boolean isEmpty() {
        return false;
    }

    public static void main(String args[]) {
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // pushAtBottom(s,4);
        
        // while(!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
        // }abc
        // String str = "abc";
        // String result = reverseString(str);
        // System.out.println(result);

        // int stocks[] = {100,80,60,70,60,85,100};
        // int span[] = new int[stocks.length];
        // stockSpan(stocks, span);

        // for(int i=0; i<span.length; i++) {
        //     System.out.println(span[i] + "");
        // }

        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<Integer>();
        int nxtGreater[] = new int[arr.length];

        for(int i = arr.length-1; i>=0; i--) {
        
            //while77
            while(!s.isEmpty() && arr[s.peek()] <= arr[i] ) {
                s.pop();
            } 

            //2 if else
            if(s.isEmpty()) {
                nxtGreater[i] = -1;

            } else {
                nxtGreater[i] = arr[s.peek()];
            }

            //3 push in s
            s.push(i);


        

        }

        for(int i = 0; i< nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();


    


        
    }




}