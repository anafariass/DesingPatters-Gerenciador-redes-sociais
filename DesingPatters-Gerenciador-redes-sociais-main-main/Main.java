import br.com.example.redesocial.Facebook;
import br.com.example.redesocial.Instagram;
import br.com.example.redesocial.PublicarPost;
import br.com.example.redesocial.Twitter;

public class Main {
    public static void main (String[] args) {
        
        PublicarPost publicarPost = new PublicarPost (new Facebook());
        publicarPost.executarPublicacao("Olá, Facebook! Estou aprendendo a programar.");

        publicarPost.setPostagem(new Twitter());
        publicarPost.executarPublicacao("Tweeting my first message! #HelloWorld");

        publicarPost.setPostagem(new Instagram());
        publicarPost.executarPublicacao("Postando no Instagram com uma foto incrível! #InstaPic");

    }
}
