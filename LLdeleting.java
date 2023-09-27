// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LL {
    Node head;
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data = data;
            next = null;
        }
    }
    
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
        
    }
    
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
            
        }
        currNode.next = newNode;
    }
    
    public void printNodes(){
        Node currNode = head;
        if(head == null){
            System.out.println("The list is empty");
        }
        
        while(currNode != null){
            
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }
    
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        
        head = head.next;
    }
    
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node currNode = head;
        while(currNode.next.next != null){
            currNode = currNode.next;
        }
        currNode.next = null;
        
    }
    
    
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        // list.pringNodes();
        list.addLast("hi");
        list.printNodes();
        list.deleteFirst();
        list.printNodes();
        list.addFirst("is");
        list.deleteLast();
        list.printNodes();
    }
}
