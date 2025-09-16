package modules.module1.accessModifiers.package1;

import modules.module1.accessModifiers.package2.SubClasseForaPacote;

public class AccessModifiers {

    // =====================================================
    // Modificadores de acesso definem a visibilidade de atributos e métodos.
    // Existem 4: private, (default ou package), protected e public.
    // =====================================================

    // private: Acesso somente dentro da própria classe.
    private String email = "usuario@email.com";

    // default (sem modificador): Acesso apenas dentro do mesmo pacote.
    String name = "Enzo";

    // protected: Acesso dentro do mesmo pacote e também por subclasses (mesmo fora do pacote).
    protected String salary = "2000";

    // public: Acesso de qualquer lugar do sistema.
    public String city = "São Paulo";

    public static void main(String[] args) {
        AccessModifiers a = new AccessModifiers();

        System.out.println("✅ Acessos dentro da própria classe:");
        System.out.println("✅ Email (private): " + a.email); // ✅
        System.out.println("✅ Name (default): " + a.name); // ✅
        System.out.println("✅ Salary (protected): " + a.salary); // ✅
        System.out.println("✅ City (public): " + a.city); // ✅

        System.out.println("\nChamando TesteMesmoPacote...");
        TesteMesmoPacote.testar();

        System.out.println("\nChamando SubclasseForaDoPacote...");
        SubClasseForaPacote sub = new SubClasseForaPacote();
        sub.testar();
    }
}
