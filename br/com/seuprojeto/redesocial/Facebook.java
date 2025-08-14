package br.com.seuprojeto.redesocial;

public class Facebook implements Postagem {
    @Override
    public void publicar(String mensagem) {
        System.out.println("Conectando à API do Facebook...");
        try { Thread.sleep(500); } catch (InterruptedException e) { }
        System.out.println("Conexão estabelecida com sucesso!");
        System.out.println("Formatando a mensagem para o padrão do Facebook...");
        System.out.println("POSTADO no Facebook: " + mensagem);
        System.out.println("------------------------------------");
    }
}
