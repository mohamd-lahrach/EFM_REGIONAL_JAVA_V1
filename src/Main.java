public class Main {
    public static void main(String[] args) throws Exception {
        Magasin magasin1 = new Magasin();
        magasin1.ajouter(new Article(1, 12121.2));
        magasin1.ajouter(new Article(4, 1000.0));
        magasin1.ajouter(new Article(5, 199.0));
        magasin1.ajouter(new Article(8, 399.99));
        magasin1.ajouter(new ArticleEnSolde(2, 200.0, 10.0));
        magasin1.ajouter(new ArticleEnSolde(3, 300.0, 65.0));
        magasin1.ajouter(new ArticleEnSolde(6, 589.99, 50.0));
        magasin1.ajouter(new ArticleEnSolde(7, 99.99, 9.99));
        magasin1.ajouter(new ArticleEnSolde(9, 100.0, 95.0));
        System.out.println(magasin1.nombreArticlesEnSolde());
        System.out.println(magasin1.supprimer(2));
        System.out.println(magasin1.indiceDe(2));
        magasin1.enregistrer("src\\data.txt");
    }
}