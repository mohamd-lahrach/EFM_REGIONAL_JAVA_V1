public class Main {
    public static void main(String[] args) throws Exception {
        Store store1 = new Store();
        store1.add(new Item(12121.2));
        store1.add(new Item(1000.0));
        store1.add(new Item(199.0));
        store1.add(new Item(399.99));
        store1.add(new ItemOnDiscount(200.0, 10.0));
        store1.add(new ItemOnDiscount(300.0, 65.0));
        store1.add(new ItemOnDiscount(589.99, 50.0));
        store1.add(new ItemOnDiscount(99.99, 9.99));
        store1.add(new ItemOnDiscount(100.0, 95.0));
        store1.add(new Item(499.99));
        store1.add(new ItemOnDiscount(599.99, 33.99));
        System.out.println(store1.numberOfItemsInDiscount());
        store1.save("src\\data.txt");
        ItemOnDiscount itemOnDiscount1 = new ItemOnDiscount(399.99, 98.0);
        System.out.println(itemOnDiscount1.itemPrice());
        System.out.println(itemOnDiscount1.getPrice());
        System.out.println(itemOnDiscount1);
    }
}