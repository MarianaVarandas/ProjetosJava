# Desafio Java: Minhas Músicas (Áudio Player)

Esse projeto foi criado como um desafio prático para consolidar o conhecimento sobre **Programação Orientada a Objetos (POO)**, focando em **Herança**, **Polimorfismo** e **Encapsulamento**. Foi desenvolvido durante a formação Tech Foundation do programa Oracle Next Education.

## 🧠 Sobre o projeto

**Minhas Músicas** é um sistema de console desenvolvido em Java puro. O objetivo é simular o back-end de uma plataforma de streaming, gerenciando diferentes tipos de conteúdo de áudio e suas interações com o usuário.

O grande diferencial deste projeto é a arquitetura desacoplada: através de uma classe mãe (`Audio`), consigo tratar Músicas e Podcasts de forma genérica, enquanto aplico regras de negócio específicas (como a classificação por estrelas) de forma individualizada para cada tipo de mídia.

## 🧩 Funcionalidades

- 🎵 **Modelagem de Áudio:** Uso de herança para criar Músicas e Podcasts que compartilham atributos (título, duração) da classe mãe `Audio`.
- 🎧 **Sistema de Reprodução:** Controle de total de reproduções e curtidas através de métodos encapsulados.
- ⭐ **Classificação Inteligente:** Uso de sobrescrita de métodos (`@Override`) para definir regras distintas:
    - **Músicas:** Classificadas baseadas no número de reproduções.
    - **Podcasts:** Classificados baseados no número de curtidas.
- 🔄 **Polimorfismo:** A classe `MinhasPreferidas` consegue avaliar e promover qualquer objeto que seja um `Audio`, sem precisar conhecer sua implementação específica.

## 🚀 Como usar

1. **Ter o Java instalado:** Certifique-se de ter o JDK (versão 17 ou superior) configurado na sua máquina.
2. **Clonar ou baixar o arquivo:** Acesse o repositório e baixe o código fonte.
3. **Executar a aplicação:**
    - Abra a pasta do projeto em sua IDE (IntelliJ, Eclipse, VS Code).
    - Localize a classe `Main.java` (em `io.github.marianavarandas.minhasmusicas.principal`).
4. **Visualizar:**
    - Execute o método `main`.
    - O console exibirá a simulação das músicas e podcasts sendo tocados e a avaliação automática de "Sucesso Absoluto" ou recomendações baseadas na lógica implementada.

## 🧩 Tecnologias

- Java (JDK 17+)
- Programação Orientada a Objetos (Herança, Polimorfismo, Encapsulamento)
- Sobrescrita de Métodos
- IDE IntelliJ IDEA

---

Feito com 💜 por [Dayalu](https://github.com/MarianaVarandas) – Professora de Voz, Gestora de Projetos e Desenvolvedora em formação.  
Me siga nas redes:

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/mariana-varandas-7b912b82/)
[![Instagram](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/_dayalu/)