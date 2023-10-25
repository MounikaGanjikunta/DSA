// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }
        
        
        public static boolean isEmpty(){
            return rear == -1;
        }
        
        public static void Enqueue(int data){
            if(rear == size - 1){
                System.out.println("Queue is full");
                return;
            }
            
            rear++;
            arr[rear] = data;
        }
        
        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return - 1;
            }
            
            int front = arr[0];
            for(int i = 0; i < size - 1; i++){
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }
        
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return - 1;
            }
            
            int front = arr[0];
            return front;
        }
    }
    

    
    public static void main(String[] args) {
        Queue q = new Queue(5);
        
        Queue.Enqueue(1);
        Queue.Enqueue(2);
        Queue.Enqueue(3);
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
