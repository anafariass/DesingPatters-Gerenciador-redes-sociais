package br.com.example.redesocial;

public class Twitter implements Postagem {
    @Override
    public void publicar(String mensagem) {
        System.out.println("Conectando à API do Twitter...");
        try { Thread.sleep(500); } catch (InterruptedException e) { }
        System.out.println("Conexão estabelecida com sucesso!");
        System.out.println("Formatando a mensagem para o padrão do Twitter...");
        System.out.println("POSTADO no Twitter: " + mensagem);
        System.out.println("------------------------------------");
    }
}
