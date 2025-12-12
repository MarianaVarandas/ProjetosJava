# Caça CEP - Buscador de Endereços 📍

Projeto desenvolvido como finalização do curso: "Java: consumindo API, gravando arquivos e lidando com erros", parte da formação Tech Foundation - Backend java do programa Oracle Next Education. Esta aplicação de console consome a API externa [ViaCEP](https://viacep.com.br/) para buscar endereços a partir de um CEP e gera arquivos JSON com os resultados.

## 🧠 Sobre o projeto

O **Caça CEP** tem como objetivo consolidar conhecimentos sobre requisições HTTP, manipulação de JSON e persistência de dados em arquivos. O usuário digita um CEP, o sistema consulta a API, exibe o endereço formatado na tela e salva as informações em um arquivo local.

## 🔨 Funcionalidades

- 🔍 **Consulta de Endereço:** Busca dados de logradouro, bairro, cidade e UF através do CEP.
- 📄 **Gerador de JSON:** Cria automaticamente um arquivo (ex: `endereco_01001000.json`) com os dados obtidos.
- 🛡️ **Validações e Tratamento de Erros:**
  - Verifica se o CEP possui 8 dígitos.
  - Identifica CEPs inexistentes na base de dados.
  - Trata falhas de conexão e formatos inválidos.
- 🖥️ **Menu Interativo:** Interface via console que permite múltiplas consultas sem reiniciar o programa.

## 🛠️ Tecnologias Utilizadas

- **Java (JDK 17+)**: Uso de `Records`, `Text Blocks` e `HttpClient`.
- **Gson**: Biblioteca do Google para serialização e deserialização de JSON.
- **ViaCEP API**: Serviço web gratuito para consulta de códigos postais.
- **IntelliJ IDEA**: IDE utilizada para o desenvolvimento.

## 🚀 Como usar

1. **Pré-requisitos:**
   - Ter o **Java JDK 17** (ou superior) instalado.
   - Ter uma IDE (IntelliJ, Eclipse, VS Code) instalada.
   - Ter o arquivo `.jar` da biblioteca **Gson** (versão 2.10.1 ou superior).

2. **Instalação:**
   - Clone este repositório:
     ```bash
     git clone [https://github.com/MarianaVarandas/ProjetosJava.git](https://github.com/MarianaVarandas/ProjetosJava.git)
     ```
   - Ou baixe o arquivo ZIP e extraia na sua máquina.

3. **Configurando a Biblioteca (Gson):**
   - Abra o projeto na sua IDE.
   - Baixe o [Gson JAR aqui](https://mvnrepository.com/artifact/com.google.code.gson/gson) se ainda não tiver.
   - Na IDE, vá em **Project Structure > Modules > Dependencies**.
   - Adicione o arquivo `.jar` do Gson baixado ao projeto.

4. **Rodando a aplicação:**
   - Localize a classe `Main.java` dentro da pasta `src`.
   - Clique em **Run** (Executar).

5. **Utilização:**
   - Siga as instruções no console para digitar o CEP desejado (apenas números).
   - O resultado será exibido no terminal e um arquivo JSON será gerado na raiz do projeto.

---

Feito com 💜 por [Dayalu](https://github.com/MarianaVarandas) – Professora de Voz, Gestora de Projetos e Desenvolvedora em formação.
Me siga nas redes:

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/mariana-varandas-7b912b82/)
[![Instagram](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/_dayalu/)