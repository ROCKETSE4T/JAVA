package modules.module1.basicExceptions;

public class MinhaCheckedException extends Exception {
    public MinhaCheckedException() {
        super("Usuário não encontrado!");
    }
}
