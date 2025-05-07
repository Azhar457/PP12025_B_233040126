package Main;

import Pertemuan7.*;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list1 = new StrukturList();
        StrukturList list2 = new StrukturList();
        StrukturList list3 = new StrukturList();
         list1.addTail(5);
         list1.addTail(4);
         list1.addTail(6);
         list1.displayElement();
         list1.findList(6);
         list1.addHead(6);
         list1.addHead(7);
         list1.addTail(2);
         list1.addTail(3);
         list1.addMid(4, 3);
         list1.displayElement();
         list1.sizeList();
         list2.removeHead();
         list2.removeTail();
         list2.removeHead();
         list2.removeTail();
         list2.removeHead();
         list2.removeTail();
         list3.addHead(7);
         list3.addHead(3);
         list3.addHead(4);
         list3.addTail(8);
         list3.addTail(1);
         list3.addTail(9);
         list3.displayElement();
         list3.removaAll();
         list3.displayElement();
    }
}