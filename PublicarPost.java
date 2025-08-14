public class PublicarPost {
    private Postagem postagem;

    public PublicarPost(Postagem postagem) {
        this.postagem = postagem;
    }

    public void setPostagem(Postagem postagem) {
        this.postagem = postagem;
    }   
    
    public void executarPublicacao(String mensagem) {
        System.out.println("Iniciando publicação da mensagem: '" + mensagem + "'");
        this.postagem.publicar(mensagem);
    }
}
