package Pertemuan1;

public class NodeMain {
	public static void main(String[] args) {
		
		//Membuat 2 Buah Node n1 & n2
		Node n1 = new Node(5);
		Node n2 = new Node(7);
		//Menambahkan 2 Buah Node n3 & n4		
		Node n3 = new Node(9);
		Node n4 = new Node(8);
		//Menambahkan 2 Buah Node n5 & n6
		Node n5 = new Node(2);
		Node n6 = new Node(3);
		
		// Membuat Relasi Node n1 & n2 untuk soal 4 A
		n1.setNext(n2);
		//Membuat Relasi Node n2 & n3 untuk soal 4 A
		n2.setNext(n3);
		//Membuat Relasi Node n3 & n4 untuk soal 4 A
		n3.setNext(n4);
		
		n5.setNext(n6);

		n6.setNext(n1);
		
		//Menampilkan Node dengan pointer p dan p1
//		Node p = n1;
		Node p1 = n5;
//		while(p != null)
//		{
//			System.out.printf("%d ", p.getNilai());
//			p = p.getNext();
//		}
//		System.out.println("");
		while(p1 != n4)
		{
			System.out.printf("%d ", p1.getNilai());
			p1 = p1.getNext();
		}
	}
}
