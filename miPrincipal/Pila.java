package miPrincipal;
public class Pila {
    //Atributo cabeza apunta al tope de la pila
    private Nodo<T> cabeza;
    //Atributo tamanio almacena el total de elementos de la pila
    private int tamanio;
    //constructor de defecto
    public Pila(){
        cabeza = null;
        tamanio = 0;
    }
    //Devuelve el total de elemento de la pila
    public int getTamanio(){
        return tamanio;
    }
    //Verifica si la pila esta vacia
    public boolean esVacia(){
        return (cabeza==null);
    }
    public void apilar(T valor){
        //Crear un nuevo nodo
        Nodo<T> nuevo = new Nodo<T>();
        //fijar valor dentro del nodo
        nuevo.setValor(valor);
        if(esVacia()){
            //cabeza apunta al nuevo nodo
            cabeza = nuevo;
        }else{
            //se enlaza el campo siguiente de nuevo con la cabeza
            nuevo.setSiguiente(cabeza);
            //la nueva cabeza de la pila pasa a ser nuevo
            cabeza = nuevo;
        }
        //Incrementar el tamanio porque hay un nuevo elemento en la pila
        tamanio++;
    }
    //Eliminar un elemento de la pila
    public void retirar(){
        if(!esVacia()){
            cabeza = cabeza.getSiguiente();
            tamanio--;

        }
    }
    //Devuelve el elemento almacenado en el tope de la cima
    public T cima(){
        if(esVacia())
            return cabeza.getValor();
        else
            return null;
    }
    
}