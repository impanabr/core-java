class Rapido1 {
    String firstName = "Kiran";
    String secondName = "Raj";

    Rapido1() {
        this("Kiran", "Raj");
        System.out.println("Rapido1 Const 1");
    }
    Rapido1(String firstName, String secondName) {
        System.out.println("Rapido1 Const 2");
        System.out.println("firstName: " + firstName);
        System.out.println("secondName: " + secondName);
    }
}