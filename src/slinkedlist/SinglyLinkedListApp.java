package slinkedlist;
public class SinglyLinkedListApp {
     public static void main(String[] args) {
    
        SinglyLinkedList lk = new SinglyLinkedList();
        lk.insertAwal(100);
        lk.display();
        System.out.println(" ");
        lk.insertAkhir(200);
        lk.display();
        System.out.println(" ");
        lk.insertAtPos(50, 1);
        lk.display();
        System.out.println(" ");
        lk.insertAtPos(80, 2);
        lk.display();
        System.out.println(" ");
        lk.deleteAtPos(1);
        lk.display();
        System.out.println(" ");
    }
}
