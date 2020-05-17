public class DLL{
    Node head, tail;
    public DLL() {
        // head = null;
        // tail = null;
    }
    public void deleteHead() {
        if (isEmpty()){
            return;
        }
        head=head.next;
        return;
    }
    public void deleteTail(){
        if (isEmpty()){
            return;
        }
        tail.prev.next=null;
        tail =tail.prev;
        return;
    }
    public void deleteMid(int index) {
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        current.next.prev = current;
    }

    public void searchFromTail(int data){
        Node current = tail;
        int index = 1;
        while(current != null){
            if (current.data == data){
                System.out.println("Data" +data+ "terletak di posisi" +index);
                return;
            }
            current = current.prev;
            index++;

        }
        System.out.println("Data tidak ditemukan");   
    }

    public void searchFromHead(int data){
        Node current = head;
        int index = 1;
        while(current != null){
            if (current.data == data){
                System.out.println("Data" +data+ "terletak di posisi" +index);
                return;
            }
            current = current.next;
            index++;

        }
        System.out.println("Data tidak ditemukan");
    }
    public boolean isEmpty() {
        return (head == null);
    }
    public void addHead (int data) {        // Menambah Node dari Depan
        Node node = new Node (data);
        if (isEmpty()) {
            tail = node;
        } else {
            head.prev = node;
        }
        node.next = head;
        head = node;
    }
public int count(){
    Node current= head;
    int panjang = 0;

    while (current!=null){
        current = current.next;
        panjang++;

    }
    return panjang;
}
    public void Sort(){
        Node current=head;
        for (int i=0;i<count();i++){
            while(current!=tail){
                if(current.data>current.next.data){
                    int temp =current.data;
                    current.data=current.next.data;
                    current.next.data=temp;
                }
                current=current.next;
            }
            current=head;
        }
        
    }
    public void addTail (int data) {        // Menambah Node dari Belakang
        Node node = new Node (data);
        if (isEmpty()) {
            addHead(data);
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    void tampilkanDLL(){
        Node node = head;
        while (node != null) {
            System.out.print(node.data+" --> ");
            node = node.next;
        }
        System.out.println("null");
    }
}