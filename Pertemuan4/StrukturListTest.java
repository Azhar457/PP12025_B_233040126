package Pertemuan4;

public class StrukturListTest {

    public static void main(String[] args) {
        StrukturList list = new StrukturList();
//		Soal 1
//        list.addTail(7.0 / 2);
//        list.addTail(9.0 / 2);
//        list.addMid(15.0 / 2, 2);
//        list.addHead(11.0 / 2);
       
//      Soal 2 a
//      list.addTail(4.5);
//      list.addMid(3.4, 1);
//      list.addHead(2.1);
        
//		Soal 2 b
        list.addTail(4.5);
        list.addTail(5.5);
        list.addMid(1.1, 1);
        list.addMid(2.1, 1);
        list.addHead(3.4);
        list.displayElement();

    }
}
