package UNI1.aula5.exercicio;

public class PilhaVaziaException extends RuntimeException {

    public PilhaVaziaException() {
        super("A pilha está cheia!");
    }

    public PilhaVaziaException(String mensagem) {
        super(mensagem);
    }
}