public class Facebook implements Postagem {
    public void publicar(String mensagem) {
        System.out.println("Conectando à API do Facebook...");
        System.out.println("Formatando a mensagem para o padrão do Facebook...");
        System.out.println("POSTADO no Facebook: " + mensagem);
        System.out.println("------------------------------------");
    }
    
}
