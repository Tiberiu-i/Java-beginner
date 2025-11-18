import java.util.Scanner;

public class ProfilUtilizator {
    String nume;
    String prenume;
    String email;
    String telefon;
    int dataNasterii;
    String gen;

    public void initializeazaProfil(Scanner sc) {
        nume = sc.nextLine();
        prenume = sc.nextLine();
        email = sc.nextLine();
        telefon = sc.nextLine();
        dataNasterii = sc.nextInt();
        sc.nextLine();
        gen = sc.nextLine();
    }

    public void actualizareEmail(String email1) {
        email = email1;
    }

    public void actualizareNumarTelefon(String telefon1) {
        telefon = telefon1;
    }

    public void afisareVarsta(int an) {
        System.out.println(an - dataNasterii);
    }

    public void afisareStareInterna() {
        System.out.println("Nume: " + nume);
        System.out.println("Prenume: " + prenume);
        System.out.println("Email: " + email);
        System.out.println("Numar de telefon: " + telefon);
        System.out.println("Data nasterii: " + dataNasterii);
        System.out.println("Gen: " + gen);
    }
}
