package modules.module1.poo.essentials.herancaAndAbstracao;

public class WppApp extends LiveMessageSoftware {
    public void receiveMessage(){
        System.out.println("WhatsApp received Message");
    }

    public void sendMessage(){
        System.out.println("WhatsApp send a Message");
    }
}
