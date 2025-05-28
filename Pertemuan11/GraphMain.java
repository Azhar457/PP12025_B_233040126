package Pertemuan11;

public class GraphMain {
    public static void main(String[] args) {
        Graph Graph = new Graph(5); // Membuat graf dengan kapasitas 5 vertex

        Graph.addVertex('A'); // Menambahkan vertex A
        Graph.addVertex('B'); // Menambahkan vertex B
        Graph.addVertex('C'); // Menambahkan vertex C
        Graph.addVertex('D'); // Menambahkan vertex D
        Graph.addVertex('E'); // Menambahkan vertex E

        Graph.addEdge(0, 1); // Menambahkan edge antara A dan B
        Graph.addEdge(1, 2); // Menambahkan edge antara B dan C
        Graph.addEdge(0, 3); // Menambahkan edge antara A dan D
        Graph.addEdge(3, 4); // Menambahkan edge antara D dan E

        System.out.println("Adjacency Matrix:");
        Graph.adjacencyMatrix(); // Mencetak adjacency matrix
    }
}
