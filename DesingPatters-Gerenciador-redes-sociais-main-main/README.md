```
██████╗ ███████╗███████╗███╗   ██╗ ██████╗ █████╗ ██████╗ ███████╗
██╔════╝ ██╔════╝██╔════╝████╗  ██║██╔════╝██╔══██╗██╔══██╗██╔════╝
██║  ███╗█████╗  █████╗  ██╔██╗ ██║██║     ███████║██████╔╝█████╗
██║   ██║██╔══╝  ██╔══╝  ██║╚██╗██║██║     ██╔══██║██╔══██╗██╔══╝
╚██████╔╝███████╗███████╗██║ ╚████║╚██████╗██║  ██║██║  ██║███████╗
╚═════╝ ╚══════╝╚══════╝╚═╝  ╚═══╝ ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝
```

# 🚀 Gerenciador de Redes Sociais

Projeto que demonstra o uso do padrão Strategy para publicar mensagens em diferentes plataformas (Facebook, Twitter, Instagram, LinkedIn) de forma flexível e organizada.

---

## 🗂️ Estrutura do Projeto

- 🧩 **Postagem (interface):** Contrato para estratégias de postagem
- 📘 **Facebook:** Estratégia de postagem para Facebook
- 🐦 **Twitter:** Estratégia de postagem para Twitter
- 📸 **Instagram:** Estratégia de postagem para Instagram
- 💼 **LinkedIn:** Estratégia de postagem para LinkedIn
- 🔄 **PublicarPost:** Gerencia e troca dinamicamente a estratégia
- 🏁 **Main:** Demonstra o uso do padrão Strategy

---

## 💡 Benefícios Demonstrados

- 🔗 **Baixo Acoplamento:** O gerenciador depende apenas da interface `Postagem`.
- 🧩 **Alta Coesão:** Cada classe tem uma responsabilidade clara.
- ➕ **Extensibilidade:** Adicione novas redes sociais facilmente.

---

## ⚙️ Funcionamento

O sistema simula a publicação de mensagens em diferentes redes sociais, exibindo mensagens de conexão, formatação e postagem. **Não há integração real com APIs externas.**

---

## 📝 Exemplo de Uso

```java
PublicarPost publicarPost = new PublicarPost(new Facebook());
publicarPost.executarPublicacao("Olá, Facebook!");
publicarPost.setPostagem(new Twitter());
publicarPost.executarPublicacao("Tweetando!");
publicarPost.setPostagem(new Instagram());
publicarPost.executarPublicacao("Postando no Insta!");
publicarPost.setPostagem(new LinkedIn());
publicarPost.executarPublicacao("Publicando no LinkedIn!");
```

---

## ▶️ Como Executar

```bash
# 1. Abra o terminal e navegue até a pasta do projeto:
cd C:\Users\thavy\Downloads\DesingPatters-Gerenciador-redes-sociais-main\DesingPatters-Gerenciador-redes-sociais-main

# 2. Compile todos os arquivos Java e direcione os .class para a pasta bin:
javac -d bin Main.java br\com\example\redesocial\Facebook.java br\com\example\redesocial\Instagram.java br\com\example\redesocial\LinkedIn.java br\com\example\redesocial\Postagem.java br\com\example\redesocial\PublicarPost.java br\com\example\redesocial\Twitter.java

# 3. Execute o programa principal usando o classpath da pasta bin:
java -cp bin Main
```

---

## 📚 Sobre Acoplamento e Coesão

- **Acoplamento:** Refere-se ao quanto um módulo depende de outro. Um baixo acoplamento facilita manutenção, testes e evolução do sistema. O padrão Strategy reduz o acoplamento porque o gerenciador só conhece a interface `Postagem`, tornando fácil adicionar ou modificar redes sociais sem alterar o restante do código.

- **Coesão:** Indica o quão bem as responsabilidades de um módulo estão agrupadas. Alta coesão significa que cada classe tem uma função clara e única, tornando o código mais legível, reutilizável e fácil de entender. Neste projeto, cada classe representa uma rede social ou uma ação específica, mantendo a coesão elevada.

---

_Projeto acadêmico para fins didáticos._
