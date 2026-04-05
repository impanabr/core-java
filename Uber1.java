class Uber1 {
    String firstName = "Arjun";
    String secondName = "Reddy";

    Uber1() {
        this("Arjun", "Reddy");
        System.out.println("Uber1 Const 1");
    }
    Uber1(String firstName, String secondName) {
        System.out.println("Uber1 Const 2");
        System.out.println("firstName: " + firstName);
        System.out.println("secondName: " + secondName);
    }
}