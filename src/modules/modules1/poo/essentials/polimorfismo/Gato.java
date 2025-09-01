package modules.modules1.poo.essentials.polimorfismo;

public class Gato extends Animal {


    private String nome;
    private String raca;
    private String dono;

    public Gato(String nome, String raca, String dono, int idade, String cor, String tipo) {
        super(cor, tipo, idade);
        this.nome = nome;
        this.raca = raca;
        this.dono = dono;
    }

    //Metodos com diferentes aplicaçoões
    @Override
    public void emitirSom(){
        System.out.println("Miau Miau Miau...");
    }


    @Override
    public void andar(){
        System.out.println(this.nome + "andando...");
    }

}
