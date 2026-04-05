class Ola1 {

    String firstName = "Megha";
    String secondName = "Sharma";

    Ola1() {
        this("Megha", "Sharma");
        System.out.println("Ola1 Const 1");
    }

    Ola1(String firstName, String secondName) {
        System.out.println("Ola1 Const 2");
        System.out.println("firstName: " + firstName);
        System.out.println("secondName: " + secondName);
    }
}