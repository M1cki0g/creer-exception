public class main{
    public static void main(String[] args){
        try {
        Article a = new Article("ffff");
        }catch(CategorieInvalideException e){
        System.out.println("Erreur capture : " + e.getMessage());

        }
       
    }
}
