public class Ex3 {
    public static void main(String[] args) {
        //initializare temperature cu valoarea 23
        int temperature = 23; // celsius
        //temperature afisata ar fi: 23 - 25 - 24 - 23 + 23 = -72
        temperature = temperature++ - ++temperature +
                +(-(--temperature)) - (--temperature + temperature++);
        System.out.println(temperature);
    }
}
