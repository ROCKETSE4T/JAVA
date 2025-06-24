package modules.modules1.poo.enums;

// ===============================
// Enum
// As enumerações em Java são uma maneira de definir um conjunto fixo de constantes.
// Cada constante é uma instância da enum e pode ter atributos e métodos associados.
// ===============================
public enum Estado {

    // As possibilidades representam instâncias da enum, cada uma com seus próprios atributos;
    // O construtor deve receber os argumentos especificados no construtor da enum.
    SP("São Paulo", "SP"),
    RJ("Rio de Janeiro", "RJ");

    // Atributos da enumeração
    private String nome;
    private String sigla;

    // Construtor da enumeração
    private Estado(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
