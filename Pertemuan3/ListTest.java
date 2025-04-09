package Pertemuan3;

public class ListTest {

    public static void main(String[] args) {
       StrukturList list1a = new StrukturList();
       list1a.addTail(3);
       list1a.addTail(4);
       list1a.addTail(5);
       
       System.out.print("Element: ");
       list1a.displayElement();

       StrukturList list1b = new StrukturList();
       list1b.addTail(1);
       list1b.addTail(4);
       list1b.addTail(5);
       list1b.addTail(7);
       
       System.out.println("");
       System.out.print("Element: ");
       list1b.displayElement();

       StrukturList list2 = new StrukturList();
       list2.addHead(5);
       list2.addHead(4);
       list2.addHead(3);

       System.out.println("");
       System.out.print("Element: ");
       list2.displayElement();

       StrukturList list3a = new StrukturList();
       list3a.addHead(1);
       list3a.addHead(2);
       list3a.addHead(3);

       System.out.println("");
       System.out.print("Element: ");
       list3a.displayElement();
        
        StrukturList list3b = new StrukturList();
        list3b.addHead(7);
        list3b.addHead(5);
        list3b.addHead(4);
        list3b.addHead(1);
        
        System.out.println("");
        System.out.print("Element: ");
        list3b.displayElement();
    }
}
