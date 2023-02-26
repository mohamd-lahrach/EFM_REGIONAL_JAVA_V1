public class Item {
    private static Integer counter = 0;
    private Integer code ;
    private Double price;

    public Item(Double price) {
        this.code = ++counter;
        this.price = price;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" + "\n" +
                "   code=" + code + "\n" +
                "   price=" + price + "$\n" +
                '}';
    }
    public Object itemPrice(){
        return getPrice();
    }
}
