package UNI1.aula1;

public class ListaEstatica {
    private int[] info;
    private int tamanho;

    public ListaEstatica() {
        info = new int[10];
        tamanho = 0;
    }

    private void redimensionar(){

    }

    public void inserir(int valor){
        info[tamanho] = valor;
        tamanho++;
    }

    public void exibir(){

    }

    public int buscar(int valor) {
        
        return 0;
    }

    public void retirar(){
        tamanho--;
        redimensionar();
    }

    public boolean estaVazia(){
        if (tamanho == 0){
            return true;
        }
        return false;
    }
}
