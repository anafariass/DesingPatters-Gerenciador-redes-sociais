package br.com.example.redesocial;

public class LinkedIn implements Postagem {
    @Override
    public void publicar(String mensagem) {
        System.out.println("Conectando à API do LinkedIn...");
        try { Thread.sleep(500); } catch (InterruptedException e) { }
        System.out.println("Conexão estabelecida com sucesso!");
        System.out.println("Formatando a mensagem para o padrão do LinkedIn...");
        System.out.println("POSTADO no LinkedIn: " + mensagem);
        System.out.println("------------------------------------");
    }
}
