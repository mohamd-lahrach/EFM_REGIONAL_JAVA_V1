public class Article {
    private Integer code ;
    private Double price;

    public Article(Integer code, Double price) {
        this.code = code;
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
        return "Article{" + "\n" +
                "   code=" + code + "\n" +
                "   price=" + price + "$\n" +
                '}';
    }
    public Object priceArticle(){
        return getPrice();
    }
}
