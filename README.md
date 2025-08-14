```
██████╗ ███████╗███████╗███╗   ██╗ ██████╗ █████╗ ██████╗ ███████╗
██╔════╝ ██╔════╝██╔════╝████╗  ██║██╔════╝██╔══██╗██╔══██╗██╔════╝
██║  ███╗█████╗  █████╗  ██╔██╗ ██║██║     ███████║██████╔╝█████╗
██║   ██║██╔══╝  ██╔══╝  ██║╚██╗██║██║     ██╔══██║██╔══██╗██╔══╝
╚██████╔╝███████╗███████╗██║ ╚████║╚██████╗██║  ██║██║  ██║███████╗
╚═════╝ ╚══════╝╚══════╝╚═╝  ╚═══╝ ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝
```

# 🚀 Gerenciador de Redes Sociais

Projeto que demonstra o uso do padrão Strategy para publicar mensagens em diferentes plataformas (Facebook, Twitter, Instagram) de forma flexível e organizada.

---

## 🗂️ Estrutura do Projeto

- 🧩 **Postagem (interface):** Contrato para estratégias de postagem
- 📘 **Facebook:** Estratégia de postagem para Facebook
- 🐦 **Twitter:** Estratégia de postagem para Twitter
- 📸 **Instagram:** Estratégia de postagem para Instagram
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
```

---

## ▶️ Como Executar

```bash
# Compile todos os arquivos .java
javac *.java

# Execute a classe Main
java Main
```

---

## 📚 Sobre Acoplamento e Coesão

- **Acoplamento:** Grau de dependência entre módulos. O padrão Strategy reduz o acoplamento ao permitir que o gerenciador trabalhe apenas com a interface.
- **Coesão:** Clareza e unicidade da responsabilidade de cada módulo.

---

---

_Projeto acadêmico para fins didáticos._
