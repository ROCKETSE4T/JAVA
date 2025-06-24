package modules.modules1.imports;

//Importação com nome qualificado, ou seja, caminho completo + nome literal da classe
//import modules.modules1.imports.package1.User;

public class Imports {
    public static void main(String[] args) {

        //Não é necessário fazer a importação pois a classe está no mesmo pacote que Imports;
        User user1 = new User();
        user1.showMyName();

        // Importamos com o nome qualificado, pois queremos utilizar uma classe com o mesmo nome que outra, porém em pacotes diferentes.
        modules.modules1.imports.package1.User user2 = new modules.modules1.imports.package1.User();
        user2.showMyName();
    }
}
