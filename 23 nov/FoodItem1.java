class FoodItem1 {
    String name;
    int productId;
    int amount;

    FoodItem1(String n, int id, int amt) {
        name = n;
        productId = id;
        amount = amt;
    }

    void display() {
        System.out.println(name + " " + productId + " " + amount);
    }

    public static void main(String[] args) {
        FoodItem1 f1 = new FoodItem1("IDLY", 1, 8);
        FoodItem1 f2 = new FoodItem1("POORI", 2, 30);
        FoodItem1 f3 = new FoodItem1("DOSA", 3, 25);

        f1.display();
        f2.display();
        f3.display();
    }
}
