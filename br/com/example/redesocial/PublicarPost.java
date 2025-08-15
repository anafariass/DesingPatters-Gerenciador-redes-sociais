package br.com.example.redesocial;

public class PublicarPost {
    private Postagem postagem;

    public PublicarPost(Postagem postagem) {
        this.postagem = postagem;
    }

    public void setPostagem(Postagem postagem) {
        this.postagem = postagem;
    }

    public void executarPublicacao(String mensagem) {
        postagem.publicar(mensagem);
    }
}
