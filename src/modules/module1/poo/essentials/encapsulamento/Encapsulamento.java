package modules.module1.poo.essentials.encapsulamento;

import modules.module1.poo.essentials.herancaAndAbstracao.FacebookApp;
import modules.module1.poo.essentials.herancaAndAbstracao.LiveMessageSoftware;
import modules.module1.poo.essentials.herancaAndAbstracao.TelegramApp;
import modules.module1.poo.essentials.herancaAndAbstracao.WppApp;

public class Encapsulamento {
    public static void main(String[] args) {
        LiveMessageSoftware so = null;
        String app = "wpp";


        if(app.equals("fb")) {
            so = new FacebookApp();
        }else if(app.equals("wpp")) {
            so = new WppApp();
        }else{
            so = new TelegramApp();
        }


        so.sendMessage();
        so.receiveMessage();

    }
}
