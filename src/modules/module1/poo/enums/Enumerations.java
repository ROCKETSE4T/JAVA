package modules.module1.poo.enums;

public class Enumerations {
    public static void main(String[] args) {
        Cliente enzo = new Cliente("Enzo Rodrigues", 21, Estado.valueOf("SP"));

        //Acessando atributos da ENUM
        System.out.println(enzo.getEstado().name()); // Recupera o nome literal da Enum
        System.out.println(enzo.getEstado().getNome()); // Recupera o atributo nome
        System.out.println(enzo.getEstado().getSigla()); // Recupera o atributo sigla

    }
}

class Cliente {
    private String nome;
    private int idade;
    private Estado estado;

    public Cliente(String nome, int idade, Estado estado){
        this.nome = nome;
        this.idade = idade;
        this.estado = estado;
    }


    public String getNome(){
        return this.nome;
    }

    public Estado getEstado(){
        return  this.estado;
    }
}
