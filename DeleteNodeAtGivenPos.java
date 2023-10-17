// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LL {
    Node head;
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
 
        /* 3. Make next of new Node as head */
        new_node.next = head;
 
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
 
    
    // public void addFirst(String data){
    //     Node newNode = new Node(data);
    //     if(head == null){
    //         head = newNode;
    //         return;
    //     }
        
    //     newNode.next = head;
    //     head = newNode;
        
    // }
    
    // public void addLast(String data){
    //     Node newNode = new Node(data);
    //     if(head == null){
    //         head = newNode;
    //         return;
    //     }
        
    //     Node currNode = head;
    //     while(currNode.next != null){
    //         currNode = currNode.next;
            
    //     }
    //     currNode.next = newNode;
    // }
    
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
    
    // public void deleteFirst(){
    //     if(head == null){
    //         System.out.println("The list is empty");
    //         return;
    //     }
        
    //     head = head.next;
    // }
    
    // public void deleteLast(){
    //     if(head == null){
    //         System.out.println("The list is empty");
    //         return;
    //     }
    //     if(head.next == null){
    //         head = null;
    //         return;
    //     }
    //     Node currNode = head;
    //     while(currNode.next.next != null){
    //         currNode = currNode.next;
    //     }
    //     currNode.next = null;
        
    // }
    
    public void deleteNodeAtPosition(int position){
        int count = 0;
        if(head == null || head.next == null){
            return;
        }
        if(position == 0 && head.next != null){
            head = head.next;
        }
        
        Node curr = head;
        while(curr.next!= null){
            if(count == position - 1){
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;
            count++;
            
        }
        
    }
    
    
    public static void main(String[] args) {
        LL llist = new LL();
        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
        llist.push(8);
        llist.printNodes();
        llist.deleteNodeAtPosition(4);
        llist.printNodes();
    }
}
