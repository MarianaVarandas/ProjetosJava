# Projeto Java - Compras no Cartão (Desafio de Listas e Coleções)

Este projeto foi desenvolvido como parte da Formação Java e Orientação a Objetos da [Alura](https://www.alura.com.br/), dentro do programa [Oracle Next Education](https://www.oracle.com/br/education/oracle-next-education/) da Oracle. O objetivo principal é consolidar o conhecimento sobre manipulação de listas, ordenação de objetos e interfaces em Java.

É uma aplicação de console que simula o funcionamento de um limite de cartão de crédito e a geração de uma fatura organizada.

## 🧠 Sobre o projeto

**Compras no Cartão** é um sistema simples onde o usuário define um limite de crédito inicial e lança compras sequencialmente. O sistema valida se há saldo suficiente para cada compra e, ao final (ou quando o limite acaba), exibe uma fatura detalhada ordenada pelo valor dos itens (do menor para o maior).

## 🧩 Funcionalidades e Conceitos Aplicados

O projeto foca no uso prático da Collections Framework do Java:

- **Interface `Comparable`:** A classe `Item` implementa a interface `Comparable`, permitindo definir uma regra de ordenação natural para os objetos (neste caso, pelo preço).
- **Ordenação com `Collections.sort()`:** Utilização da classe utilitária `Collections` para ordenar automaticamente a lista de compras antes de exibir a fatura final.
- **Manipulação de `ArrayList`:** Armazenamento dinâmico das compras realizadas.
- **Lógica de Negócio:** Controle de fluxo (`while`, `if/else`) para gerenciar o menu, validar o saldo disponível e impedir compras que excedam o limite.
- **Interação via Console:** Uso da classe `Scanner` para capturar a entrada de dados do usuário.

## 🚀 Como rodar o projeto

Como é um projeto Java de console, não há um link de deploy. Para executá-lo, você precisará ter o Java (JDK 17+) e uma IDE instalada.

1.  **Clonar o repositório:**
    ```bash
    git clone [https://github.com/MarianaVarandas/compras-cartao-java.git](https://github.com/MarianaVarandas/compras-cartao-java.git)
    ``` 
    *(Observação: você precisará criar este repositório no seu GitHub e atualizar o link acima!)*

2.  **Abrir na sua IDE:**
    - Abra a pasta do projeto (ex: IntelliJ IDEA, Eclipse).
    - Certifique-se de que a pasta onde está o arquivo `Main.java` está configurada corretamente como fonte (Sources Root).

3.  **Localizar o arquivo principal:**
    - Navegue até o arquivo `Main.java`.

4.  **Executar (Run):**
    - Clique com o botão direito no arquivo `Main.java` e selecione "Run 'Main.main()'".
    - Interaja com o menu no console da sua IDE (digitando o limite e as compras).

## 🧩 Tecnologias

- **Java 17+**
- **Java Collections Framework**
- **IntelliJ IDEA**

---

Feito com 💜 por [Mariana Varandas](https://github.com/MarianaVarandas) – Desenvolvedora em formação.
Me siga nas redes:

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/mariana-varandas-7b912b82/)
[![Instagram](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/_dayalu/)