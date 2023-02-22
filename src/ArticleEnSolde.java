public class ArticleEnSolde extends Article {
    private Double remise;

    public ArticleEnSolde(Integer _code, Double _price, Double _remise) {
        super(_code, _price);
            this.remise = _remise;
    }

    public Double getRemise() {
        return remise;
    }

    public void setRemise(Double remise) {
        this.remise = remise;
    }
    @Override
    public Object priceArticle() {
        Double remise = (Double)this.remise;
        if (remise >= 0 && remise <= 90){
            return this.getPrice() - (this.getPrice() * (remise / 100) );
        }else {
            return " " + remise + "% Is Invalid, 0%<=remise<=90%";
        }
    }

    @Override
    public String toString() {

        String priceArticle = this.priceArticle().toString();
        String priceArticleWithDollarSignOrWithout;

        if (priceArticle.matches("\\d+(\\.\\d+)?")) {
            priceArticleWithDollarSignOrWithout = priceArticle + "$";
        } else {
            priceArticleWithDollarSignOrWithout = priceArticle;
        }
        return "ArticleEnSolde{" + "\n" +
                "   code=" + this.getCode() + "\n" +
                "   price=" + this.getPrice() + "$\n" +
                "   priceArticleEnSolde="+ priceArticleWithDollarSignOrWithout + "\n" +
                "   remise=" + this.remise + "%\n" +
                '}';
    }
}
