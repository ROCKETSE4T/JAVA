package modules.modules1.variables;

public class Variables {

    // ===============================
    // Escopo de Classe (Class Scope)
    // Variáveis definidas diretamente no corpo da classe.
    // Também chamadas de variáveis de instância (non-static fields).
    // Podem ser acessadas por todos os métodos da classe.
    // ===============================
    int classLevelVariable = 10;

    public void exampleMethodScope(int param) {
        // ===============================
        // Escopo de função e argumentos (Method Scope)
        // A variável 'param' está no escopo do método e só pode ser usada aqui.
        // Variáveis locais também pertencem a esse escopo.
        // ===============================
        int localVariable = 5;

        for (int i = 0; i < 3; i++) {
            // ===============================
            // Escopo de Loop (Looping Scope)
            // A variável 'i' só existe dentro do loop.
            // ===============================
            int loopVariable = i * 2;
            System.out.println("Loop var: " + loopVariable);
        }

        if (true) {
            // ===============================
            // Escopo de bloco (Block Scope)
            // A variável 'blockVar' só existe dentro deste bloco {}
            // ===============================
            int blockVar = 99;
            System.out.println("Block var: " + blockVar);
        }

        // ===============================
        // Variable Shadowing (Ocultação de variável)
        // A variável local 'classLevelVariable' esconde a variável de instância com o mesmo nome.
        // Para acessar a variável da classe, usa-se 'this.classLevelVariable'.
        // ===============================
        int classLevelVariable = 20;
        System.out.println("Shadowed var: " + classLevelVariable); // 20
        System.out.println("Original class var: " + this.classLevelVariable); // 10
    }
}
