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
   
   public void adicionarArestaEntrada(Aresta<T> aresta) {
    arestasEntrada.add(aresta);
}

public void adicionarArestaSaida(Aresta<T> aresta) {
    arestasSaida.add(aresta);
}


   public T getDados() {
    return dados;
   }


   public void setDados(T dados) {
    this.dados = dados;
   }


   public ArrayList<Aresta<T>> getArestasEntrada() {
    return arestasEntrada;
   }


   public void setArestasEntrada(ArrayList<Aresta<T>> arestasEntrada) {
    this.arestasEntrada = arestasEntrada;
   }


   public ArrayList<Aresta<T>> getArestasSaida() {
    return arestasSaida;
   }


   public void setArestasSaida(ArrayList<Aresta<T>> arestasSaida) {
    this.arestasSaida = arestasSaida;
   }

   

    
}
