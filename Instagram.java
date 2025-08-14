public class Instagram implements Postagem {
    @Override
    public void publicar (String mensagem) {
        System.out.println("Conectando à API do Instagram...");
        System.out.println("Formatando a mensagem para o padrão do Instagram...");
        System.out.println("POSTADO no Instagram: " + mensagem);
        System.out.println("------------------------------------");
    }
}
