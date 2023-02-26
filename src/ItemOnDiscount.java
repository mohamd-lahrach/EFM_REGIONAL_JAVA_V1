public class ItemOnDiscount extends Item {
    private Double discount;

    public ItemOnDiscount(Double _price, Double _discount) {
        super( _price);
        this.discount = _discount;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public Object itemPrice() {
        if (this.discount >= 0 && this.discount <= 90) {
            return this.getPrice() - (this.getPrice() * (this.discount / 100));
        } else {
            return this.discount + "% Is Invalid, discount must be 0%<=discount<=90%";
        }
    }

    @Override
    public String toString() {

        return "ItemOnDiscount{" + "\n" +
                "   code=" + this.getCode() + "\n" +
                "   price=" + this.getPrice() + "$\n" +
                "   priceItemOnDiscount=" + addingDollarSignOrNot() + "\n" +
                "   discount=" + this.discount + "%\n" +
                '}';
    }

    private String addingDollarSignOrNot() {
        String itemPriceFromObjToStr = this.itemPrice().toString();
        if (itemPriceFromObjToStr.matches("\\d+(\\.\\d+)?")) {
            return itemPriceFromObjToStr + "$";
        } else {
            return itemPriceFromObjToStr;
        }
    }
}
