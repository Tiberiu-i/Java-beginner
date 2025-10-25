public class Ex4 {
    public static void main(String[] args) {
        int mathEquation, operand1, operand2, operand3;

// Este valid? - DA / NU
// De ce? Raspunsul tau: NU pentru ca operand3 nu a fost initializat
//        operand1 = operand2 = operand3;

// Este valid? - DA / NU
// De ce? Raspunsul tau: NU pentru ca mathEquation nu a fost initializat
//        System.out.println(mathEquation);

// Este valid? - DA / NU
// De ce? Raspunsul tau: DA pentru ca mathEquation este initializat in print
        System.out.println(mathEquation = 4);

// Este valid? - DA / NU
// De ce? Raspunsul tau: NU pentru ca unul sau mai multi operanzi nu au fost initializati
//        mathEquation = operand1 + operand2;

// Este valid? - DA / NU
// De ce? Raspunsul tau: DA pentru ca se initializeaza toti operanzii
        operand1 = 2; operand2 = 5; operand3 = 14;

// Este valid? - DA / NU
// De ce? Raspunsul tau: NU pentru ca nu se poate atribui o valoare returnata unei expresii matematice
//        mathEquation = operand1 + operand2 = operand3;

// Este valid? - DA / NU
// De ce? Raspunsul tau: NU pentru ca rezoltatul returnat nu se atribuie nici unei variabile
//        operand2 + operand3 + operand1;

// Este valid? - DA / NU
// De ce? Raspunsul tau: DA pentru ca se pot folosi oricate perechi de paranteze
        mathEquation = ((((operand1))) + (operand2) + (operand3));

// Este valid? - DA / NU
// De ce? Raspunsul tau: NU pentru ca nu se poate atribui o valoare returnata unei expresii matematice cu variabile
//        mathEquation / 2 = operand1 + operand2;

// Este valid? - DA / NU
// De ce? Raspunsul tau: DA pentru ca putem folosi oricate perechi de paranteze si sa modificam valoarea variabilei
        mathEquation = ((operand1)) + (operand2) + (operand3);

// Este valid? - DA / NU
// De ce? Raspunsul tau: DA pentru ca putem folosi oricate perechi de paranteze si sa modificam valoarea variabilei in print
        System.out.println(((mathEquation = (operand1 + operand2)/2)));

// Este valid? - DA / NU
// De ce? Raspunsul tau: DA pentru ca putem atribui valoarea variabilei ei insasi
        System.out.println(mathEquation = ((mathEquation)));
    }
}
