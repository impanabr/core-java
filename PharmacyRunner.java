class PharmacyRunner {

    public static void main(String[] args) {

        Pharmacy p1 = new Pharmacy();

        double re = p1.getMedicinePrice("Paracetamol");
        System.out.println(re);

        re = p1.getMedicinePrice("Dolo");
        System.out.println(re);

        re = p1.getMedicinePrice("Crocin");
        System.out.println(re);

        re = p1.getMedicinePrice("Aspirin");
        System.out.println(re);

        re = p1.getMedicinePrice("Vitamin C");
        System.out.println(re);

        System.out.println("-------------------------");

        re = p1.getBillAmount(100, 5, 5);
        System.out.println(re);
    }
}