package UNI1.aula5.exercicio;
public class PilhaCheiaException extends RuntimeException {

    public PilhaCheiaException() {
        super("A pilha está cheia!");
    }

    public PilhaCheiaException(String mensagem) {
        super(mensagem);
    }
}