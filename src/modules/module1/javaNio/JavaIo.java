package modules.module1.javaNio;

import java.io.File;
import java.io.IOException;

public class JavaIo {
    //Api antiga do Java para lidar com inputs e outputs.
    public static void main(String[] args) {

        File diretorio = new File("/Users/enzorodrigues/Developer/www/courses/rocketseat/JAVA/src/modules/modules1/javaNio/example");

        if (!diretorio.exists()) {
            // Preciso utilizar o mkdirs caso eu náo tenha a estrutura de diretorio totalmente pronta, e quero criar subpastas;
            //Caso precise criar apenas um diretorio, posso utilizar apenas o mkdir ( um diretorio por vez)
            diretorio.mkdir();
        }

        // Ao tentarmos criar um arquivo, existem alguns erros que podem ocorrer durante esse processo e por isso o Java precisa que esse tipo de erro seja tratado.
        // Sáo as famosas checked Excpetions.

        try {
            File arquivo = new File(diretorio, "teste.txt");
            arquivo.createNewFile();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
