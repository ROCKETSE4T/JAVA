package modules.module1.poo.essentials.herancaAndAbstracao;

public class TelegramApp extends LiveMessageSoftware{

    public void receiveMessage(){
        System.out.println("Telegram received Message");
    }

    public void sendMessage(){
        System.out.println("Telegram send a Message");
    }

}
