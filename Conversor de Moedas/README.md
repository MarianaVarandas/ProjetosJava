# Conversor de Moedas - Challenge Java 💱

Projeto desenvolvido na finalização da formação Java e Orientação a Objetos no Tech Advance do programa Oracle Next Education. Esta aplicação de console consome a API externa [ExchangeRate-API](https://www.exchangerate-api.com/) para realizar conversões de moedas com taxas em tempo real.

## 🧠 Sobre o projeto

O **Conversor de Moedas** tem como objetivo colocar em prática o consumo de APIs,  desserialização de dados JSON e manipulação de fluxo de dados em Java. O usuário interage através de um menu dinâmico, escolhe o par de moedas desejado, insere o valor e recebe a conversão atualizada instantaneamente.

## 🔨 Funcionalidades

- 🔄 **Conversão em Tempo Real:** Conecta-se à API para obter a taxa de câmbio exata do momento.
- 🌎 **Suporte a 6 Moedas:** Realiza conversões entre:
  - Dólar Americano (USD)
  - Real Brasileiro (BRL)
  - Peso Argentino (ARS)
  - Peso Colombiano (COP)
  - Peso Chileno (CLP)
  - Boliviano (BOB)
- 🛡️ **Blindagem de Erros:**
  - Tratamento para entradas inválidas (letras que deveriam ser números).
  - Verificação de status da conexão e da API.
  - Mensagens de erro amigáveis para o usuário.
- 🖥️ **Menu Interativo:** Interface via console que permite múltiplas conversões sem reiniciar o programa até que o usuário decida sair.

## 🛠️ Tecnologias Utilizadas

- **Java (JDK 17+)**: Uso de `Records`, `Switch Expressions`, `HttpClient` e `Try-Catch`.
- **Gson**: Biblioteca do Google para manipulação de JSON.
- **ExchangeRate-API**: Serviço utilizado para buscar as taxas de conversão.
- **IntelliJ IDEA**: IDE utilizada para o desenvolvimento.

## 🚀 Como executar

1. **Pré-requisitos:**
   - Ter o Java instalado.
   - Ter uma chave de API (API Key) da [ExchangeRate-API](https://www.exchangerate-api.com/) (gratuita).
   - Biblioteca Gson configurada.

2. **Clonar o repositório:**
   ```bash
   git clone [https://github.com/MarianaVarandas/ProjetosJava.git](https://github.com/MarianaVarandas/ProjetosJava.git)

3. Configuração da API

   1. Abra a classe `Main.java`.
   2. Localize a linha da URL e insira sua API Key onde indicado:
      `.../v6/SUA-CHAVE-AQUI/pair/...`

3. 🚀 Executar

   1. Abra o projeto na sua IDE.
   2. Execute o método `main`.
   3. Siga as instruções do menu no console.

   ---

   Feito com 💜 por [Dayalu](https://github.com/MarianaVarandas) - Desenvolvedora em formação.

   Me siga nas redes:

   [![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/mariana-varandas-7b912b82/)
   [![Instagram](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/_dayalu/)
