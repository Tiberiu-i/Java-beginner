public class Monitor {
    int diagonala;
    int numarHerti;
    String rezolutieMaxima;
    String tipEcran;
    int pret;
    String culoare;
    int anFabricatie;

    public void modificaPret(int pretNou) {
        pret = pretNou;
    }

    public void printObjectState() {
        System.out.println("Diagonala monitorului este de " + diagonala + " inci");
        System.out.println("Numarul de herti este de: " + numarHerti);
        System.out.println("Rezolutia maxima este de: " + rezolutieMaxima);
        System.out.println("Ecranul este de tip: " + tipEcran);
        System.out.println("Pretul este de " + pret + " lei");
        System.out.println("Culoarea monitorului este: " + culoare);
        System.out.println("Anul fabricatiei este: " + anFabricatie + "\n");
    }

    public void initializeState(int diagonala1, int numarHerti1, String rezolutieMaxima1, String tipEcran1, int pret1,
                                String culoare1, int anFabricatie1) {
        diagonala = diagonala1;
        numarHerti = numarHerti1;
        rezolutieMaxima = rezolutieMaxima1;
        tipEcran = tipEcran1;
        pret = pret1;
        culoare = culoare1;
        anFabricatie = anFabricatie1;
    }
}
