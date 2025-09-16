package modules.module1.strings.format;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Sys {
    public static void main(String[] args) {

        Endereco endereco1 = new Endereco("06712150", "Rua Circular", "525, Casa 06", "Jardim Passargada I");
        Endereco endereco2 = new Endereco("04742150", "Rua Bento de Barros", "213, APT 44", "Jardim Amaralina");

        CupomItem item1 = new CupomItem(1, 001, "Rola de plastico", 2, "", 20.00);
        CupomItem item2 = new CupomItem(2, 002, "Rola de borracha", 2, "", 20.00);

        List<CupomItem> items = new ArrayList<CupomItem>();
        items.add(item1);
        items.add(item2);

        Cupom cupom = new Cupom("Bear LTDA", 12345, LocalTime.now(), 1234567809, LocalDate.now(), "09094049", "0458945849", "46040298812", endereco1, items);
        System.out.println(cupom);


    }
}
