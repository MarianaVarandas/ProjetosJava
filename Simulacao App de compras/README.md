# Aplicação de Compras com Cartão de Crédito

Esse projeto foi criado como um desafio prático para consolidar o conhecimento sobre **Coleções (Collections)**, **Ordenação** e **Lógica de Programação** em Java. Ele simula o uso de um cartão de crédito, controlando o limite disponível e gerando uma fatura organizada.

## 🧠 Sobre o projeto

**Aplicação de Compras** é um sistema de console desenvolvido em Java puro. O objetivo é permitir que o usuário defina um limite de crédito e realize compras sucessivas. O sistema gerencia o saldo em tempo real, impedindo gastos que excedam o limite.
O grande diferencial deste projeto é a aplicação da interface `Comparable` e da classe `Collections`, garantindo que, ao final da execução, a lista de compras seja apresentada **ordenada pelo valor** (do menor para o maior).

## 🧩 Funcionalidades

- 💳 **Definição de Limite:** O usuário inicia o sistema definindo o valor total do cartão.
- 🛒 **Realizar Compras:** Adição dinâmica de itens (descrição e valor) à lista de compras.
- 🚫 **Validação de Compra:** O sistema verifica automaticamente se há saldo suficiente antes de aprovar a transação.
- 📉 **Ordenação Automática:** A fatura final é exibida ordenando os itens do mais barato para o mais caro.
- 🔄 **Menu Interativo:** Loop contínuo que permite adicionar compras ou verificar saldo até que o usuário decida sair.

## 🚀 Como usar

1. **Ter o Java instalado:** Certifique-se de ter o JDK (versão 17 ou superior) configurado na sua máquina.
2. **Clonar ou baixar o arquivo:** Acesse o repositório e baixe o código fonte.
3. **Executar a aplicação:**
    - Abra a pasta do projeto em sua IDE (IntelliJ, Eclipse, VS Code).
    - Localize e execute a classe `Main.java`.
4. **Interagir:**
    - Defina o limite inicial do cartão quando solicitado.
    - Escolha a opção **1** para comprar e digite o nome do produto e o valor.
    - Tente comprar algo maior que o saldo para testar a validação.
    - Escolha a opção **3** para finalizar e ver sua fatura ordenada!

## 🧩 Tecnologias

- Java (JDK)
- Java Collections Framework (`ArrayList`, `Collections.sort`)
- Interface `Comparable` (para lógica de ordenação)
- Classe `Scanner` (Entrada de dados)
- Programação Orientada a Objetos (Classes e Objetos)

---

Feito com 💜 por [Dayalu](https://github.com/MarianaVarandas) – Professora de Voz, Gestora de Projetos e Desenvolvedora em formação.  
Me siga nas redes:

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/mariana-varandas-7b912b82/)
[![Instagram](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/_dayalu/)