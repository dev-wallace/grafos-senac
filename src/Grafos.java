import java.util.ArrayList;

public class Grafos<T> {
    private ArrayList<Vertice<T>> vertices;
    private ArrayList<Aresta<T>> arestas;

    public Grafos() {
        this.vertices = new ArrayList<Vertice<T>>();
        this.arestas = new ArrayList<Aresta<T>>();
    }

}
