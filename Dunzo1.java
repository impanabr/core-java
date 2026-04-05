class Dunzo1 {
    String firstName = "Anu";
    String secondName = "Priya";

    Dunzo1() {
        this("Anu", "Priya");
        System.out.println("Dunzo1 Const 1");
    }
    Dunzo1(String firstName, String secondName) {
        System.out.println("Dunzo1 Const 2");
        System.out.println("firstName: " + firstName);
        System.out.println("secondName: " + secondName);
    }
}