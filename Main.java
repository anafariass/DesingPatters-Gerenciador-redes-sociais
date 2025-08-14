import br.com.seuprojeto.redesocial.Facebook;
import br.com.seuprojeto.redesocial.Instagram;
import br.com.seuprojeto.redesocial.PublicarPost;
import br.com.seuprojeto.redesocial.Twitter;

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
