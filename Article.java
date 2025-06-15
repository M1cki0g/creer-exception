public class Article {
    private String categorie;
    
    public Article(String categorie) throws CategorieInvalideException{
        
        if(!categorie.equals("Informatique")  && !categorie.equals("Bureatique"))
        throw new CategorieInvalideException("categorie invalide");
        this.categorie = categorie; 
    }
}
