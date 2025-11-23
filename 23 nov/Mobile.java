class Mobile {
    String name;
    String brand;
    int amount;
    int qty;

    Mobile(String name, String brand, int amount, int qty){
        this.name = name;
        this.brand = brand;
        this.amount = amount;
        this.qty = qty;
    }

    void print() {
        System.out.println(name + ", " + brand + ", " + amount + ", " + qty);
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile("NOTE 8 PRO", "MI", 25000, 1);
        Mobile m2 = new Mobile("16 PRO", "APPLE", 100000, 1);
        Mobile m3 = new Mobile("S24 ULTRA", "SAMSUNG", 150000, 1);
        Mobile m4 = new Mobile("PHONE 2", "NOTHING", 40000, 1);

        m1.print();
        m2.print();
        m3.print();
        m4.print();
    }
}
