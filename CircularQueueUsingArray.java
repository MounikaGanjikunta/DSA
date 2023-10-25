// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }
        
        
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        
        public static boolean isFull(){
            return (rear + 1)% size == front;
        }
        
        public static void Enqueue(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        
        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return - 1;
            }
            
            int res = arr[front];
            if(front == rear){
                rear = front = -1;
            }else{
                front = (front + 1)%size;
            }
            
            return res;
        }
        
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return - 1;
            }
            
            return arr[front];
        }
    }
    

    
    public static void main(String[] args) {
        Queue q = new Queue(5);
        
        Queue.Enqueue(1);
        Queue.Enqueue(2);
        Queue.Enqueue(3);
        Queue.Enqueue(4);
        Queue.Enqueue(5);
        System.out.println(q.dequeue());
        Queue.Enqueue(6);
        System.out.println(q.dequeue());
        Queue.Enqueue(7);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
