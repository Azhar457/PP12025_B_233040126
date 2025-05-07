package Pertemuan8;

public class StrukturListTest {
    public static void main(String[] args) {
        ListMatakuliah list = new ListMatakuliah();
        

        list.addHead(new Matakuliah("IF002, ", " Pemograman Web, ", 3));
        list.addHead(new Matakuliah("IF004, ", " Konstruksi PL Berorientasi Objek, ", 3));
        list.addMid(new Matakuliah("IF003, ", " Struktur Diskrit, ", 3),2);
        list.addTail(new Matakuliah("IF001, ", " Dasar Pemograman, ", 4));
        list.displayElement();
    }
}