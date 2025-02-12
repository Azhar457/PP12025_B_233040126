package Pertemuan1;

public class Node {
	private int Nilai;
	private Node Next;
	
	// inisialisasi node
	public Node(int Nilai) {
		this.Nilai = Nilai;
	}
	
	// Setter & Getter	
	public void setNilai (int Nilai) {
		this.Nilai=Nilai;
	}
	
	public int getNilai() {
		return Nilai;
	}
	
	public void setNext (Node Next) {
		this.Next = Next;
	}
	
	public Node getNext() {
		return Next;
	}

}