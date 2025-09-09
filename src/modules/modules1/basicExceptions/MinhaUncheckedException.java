package modules.modules1.basicExceptions;

public class MinhaUncheckedException extends  RuntimeException {
    public MinhaUncheckedException() {
        super("Usuário não pertence ao sistema!");
    }
}
