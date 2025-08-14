package br.com.seuprojeto.redesocial;

public class Twitter implements Postagem {
    @Override
    public void publicar(String mensagem) {
        System.out.println("Conectando à API do Twitter...");
        try { Thread.sleep(500); } catch (InterruptedException e) { }
        System.out.println("Conexão estabelecida com sucesso!");
        String mensagemCurta = mensagem.length() > 280 ? mensagem.substring(0, 280) : mensagem;
        System.out.println("Formatando a mensagem para o padrão do Twitter...");
        System.out.println("TWEETADO no Twitter: " + mensagemCurta);
        System.out.println("------------------------------------");
    }
}
