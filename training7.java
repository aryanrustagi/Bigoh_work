class Node{
    int data;
    Node next;

    Node(int data){
        this.data= data;
        this.next = null;
    }
}
class training7 {
    static Node hello(Node head, int data, int k){
        Node n1 = new Node(data);
        Node temp = head;
        for(int i=0;i<k-1;i++){
            temp = temp.next;
        }
        Node temp1 = temp.next;
        temp.next = n1;
        n1.next = temp1;
        return head;
    }
    static void printList(Node head){
        while(head != null){
            System.out.print(head.data+" --> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int data = 6;
        int k = 1;
        head = hello(head, data, k);
        printList(head);
    }
}