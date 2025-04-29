import java.util.ArrayList;

public class Vertice <T> {

    private T dados;
    private ArrayList<Aresta<T>> arestasEntrada;
    private ArrayList<Aresta<T>> arestasSaida;


   public Vertice(T valor){
    this.dados=valor;
    this.arestasEntrada=new ArrayList<Aresta<T>>();
    this.arestasSaida=new ArrayList<Aresta<T>>();
   }

    
}
