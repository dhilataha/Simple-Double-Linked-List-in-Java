public class Main1 {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.addHead(189);
        dll.addHead(89);
        dll.addHead(90);
        dll.addTail(97);
        dll.tampilkanDLL();
        dll.deleteMid(2);
        dll.tampilkanDLL();
        dll.searchFromTail(97);
        dll.searchFromHead(97);
        dll.Sort();
        dll.tampilkanDLL();

    
        // dll.deleteHead();
        // dll.tampilkanDLL();
        // dll.deleteTail();
        // dll.tampilkanDLL();
        // System.out.println(dll.tail.data);
    }   
    
}