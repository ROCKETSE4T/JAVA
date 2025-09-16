package modules.module1.strings;

import java.time.LocalDate;
import java.util.Locale;

public class ExpressoesSimples {
    public static void main(String[] args) {
        String nome = "NomelkNEFOKNweklfnklFNL'K`SNFL'KSEnlk'fnskléfnslkNFKLSnfklosenLKFNSElknflksnFKLesnelknflksNLKFneslkenflkesnFLKsenklfnslkNFE";
        int rm = 553377;
        double salario = 2600.90;
        LocalDate dataNascimento = LocalDate.of(2025, 12, 25);


        String dados = String.format(new Locale("pt", "BR"),"Nome: %-30.30s RM: %08d Salário: %,.2f Data Nasc.: %tD", nome, rm, salario, dataNascimento);
        System.out.println(dados);
    }
}
