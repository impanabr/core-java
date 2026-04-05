class Swiggy1 {
    String firstName = "Ravi";
    String secondName = "Kumar";

    Swiggy1() {
        this("Ravi", "Kumar");
        System.out.println("Swiggy1 Const 1");
    }
    Swiggy1(String firstName, String secondName) {
        System.out.println("Swiggy1 Const 2");
        System.out.println("firstName: " + firstName);
        System.out.println("secondName: " + secondName);
    }
}