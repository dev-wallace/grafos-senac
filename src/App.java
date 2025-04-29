public class App {
    public static void main(String[] args) throws Exception {
        Grafos<String> grafo = new Grafos<String>();

        grafo.adicionarVertice("Paulo");
        grafo.adicionarVertice("wallace");
        grafo.adicionarVertice("vt");
        grafo.adicionarVertice("yokai");
        grafo.adicionarVertice("lakers");
        grafo.adicionarVertice("gabriel");

        grafo.adicionarAresta(2.0, "Paulo", "wallace");
        grafo.adicionarAresta(3.0, "wallace", "yokai");
        grafo.adicionarAresta(1.5, "Paulo", "vt");
        grafo.adicionarAresta(4.0, "vt", "lakers");
        grafo.adicionarAresta(2.2, "gabriel", "Paulo");
        grafo.adicionarAresta(3.3, "yokai", "gabriel");

        
    }
}
