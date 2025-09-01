package modules.modules1.poo.essentials.polimorfismo;

public class Animal {

    private String cor;
    private String tipo;
    private int idade;


    public Animal(String cor, String  tipo, int idade){
        this.cor = cor;
        this.tipo = tipo;
        this.idade = idade;
    }


    public void emitirSom(){
        System.out.println("Som emitido");
    }

    public void andar(){
        System.out.println("Andando...");
    }

}
