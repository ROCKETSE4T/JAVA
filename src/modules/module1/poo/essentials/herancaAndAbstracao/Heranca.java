package modules.module1.poo.essentials.herancaAndAbstracao;

public class Heranca {
    public static void main(String[] args) {
        FacebookApp fb = new FacebookApp();
        WppApp wp = new WppApp();
        TelegramApp tg = new TelegramApp();

        System.out.println("===== Facebook =====");
        fb.sendMessage();
        fb.receiveMessage();


        System.out.println("===== WhatsApp =====");
        wp.sendMessage();
        wp.receiveMessage();

        System.out.println("===== Telegram =====");
        tg.sendMessage();
        tg.receiveMessage();

    }
}
