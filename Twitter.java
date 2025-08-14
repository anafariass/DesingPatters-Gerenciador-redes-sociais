public class Twitter implements Postagem {
    public void publicar(String mensagem) {
        System.out.println("Conectando à API do Twitter...");
        String mensagemCurta = mensagem.length() > 280 ? mensagem.substring(0, 280) : mensagem;
        System.out.println("Formatando a mensagem para o padrão do Twitter...");
        System.out.println("TWEETADO no Twitter: " + mensagem);
        System.out.println("------------------------------------");
    }
}
