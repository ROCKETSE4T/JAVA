package modules.modules1.accessModifiers.package2;

import modules.modules1.accessModifiers.package1.AccessModifiers;

public class SubClasseForaPacote extends AccessModifiers {
    public void testar(){
        System.out.println("City (public): " + city);            // OK - public
        System.out.println("Salary (protected): " + salary);     // OK - protected via herança

        // System.out.println("Name: " + name);                  // ERRO - default, fora do pacote
        // System.out.println("Email: " + email);                // ERRO - private
    }
}
