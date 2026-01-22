## 🚗 Buscador de Preços - Tabela FIPE

Aplicação de linha de comando desenvolvida em Java com Spring Boot que consome a API da Tabela FIPE para consultar o histórico de preços de veículos (carros, motos e caminhões).

O objetivo principal foi consolidar conhecimentos sobre consumo de APIs REST, manipulação de dados JSON e uso de Streams do Java.

### 🔨 Funcionalidades

- **Menu Interativo**: O usuário escolhe entre Carros, Motos ou Caminhões.
- **Listagem de Marcas**: Exibe todas as marcas disponíveis para o tipo de veículo selecionado.
- **Busca de Modelos**: Permite selecionar uma marca pelo código.
- **Filtro Inteligente**: O usuário digita um trecho do nome do veículo (ex: "Palio") e o sistema filtra a lista de modelos usando `Streams`.
- **Histórico Completo**: Após escolher um modelo específico, a aplicação busca e exibe o valor do veículo para **todos** os anos disponíveis na tabela FIPE.

### 🧠 O que eu aprendi

Neste projeto, aprofundei meus conhecimentos em:

- **Maven & Gerenciamento de Dependências**:
  - Primeiro contato com o gerenciador de projetos Maven.
  - Manipulação do arquivo `pom.xml` para adicionar novas dependências ao projeto (como a biblioteca Jackson).
- **Jackson Library**:
  - Desserialização de JSON para Objetos Java.
  - Uso de **Records** para modelagem de dados imutáveis.
  - Anotações `@JsonAlias` (para mapear nomes diferentes) e `@JsonIgnoreProperties` (para ignorar dados desnecessários).
  - Tratamento de estruturas JSON complexas (Listas vs. Objetos Envelopados).
- **Java Streams & Lambdas**:
  - `filter()` para busca por trechos de texto.
  - `map()` para transformações de dados.
  - `forEach()` para impressão organizada.
- **Tratamento de Exceções**: Lidar com erros de desserialização e fluxo do `Scanner`.

### 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot** (CommandLineRunner)
- **Maven**
- **Jackson Databind**
- **API da Tabela FIPE** (https://deividfortuna.github.io/fipe/)

### 📂 Como Executar

1. Clone o repositório.
2. Abra o projeto na sua IDE de preferência (gosto do IntelliJ).
3. Execute a classe principal `FipeApiApplication`.
4. Siga as instruções no console:
   - Digite o tipo de veículo.
   - Digite o código da marca.
   - Digite o trecho do nome do carro.
   - Selecione o código do modelo específico.

---

Feito com 💜 por [Dayalu](https://github.com/MarianaVarandas) – Desenvolvedora em formação.

Me siga nas redes:

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/mariana-varandas-7b912b82/)
[![Instagram](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/_dayalu/)
