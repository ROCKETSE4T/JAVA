package modules.modules1.accessModifiers.package1;

public class TesteMesmoPacote {
    public static void testar() {
        AccessModifiers a = new AccessModifiers();

        System.out.println("Name (default): " + a.name);         // ✅ - mesmo pacote
        System.out.println("Salary (protected): " + a.salary);   // ✅ - mesmo pacote
        System.out.println("City (public): " + a.city);          // ✅ - público

        // System.out.println("Email: " + a.email);              // X - private
    }
}
