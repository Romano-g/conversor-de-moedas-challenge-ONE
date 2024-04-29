<h1 align="center"><img loading="lazy" src="https://github.com/Romano-g/conversor-de-moedas-challenge-ONE/assets/143983377/502fb180-6a68-4d6c-877e-b9d53ba5ed8f" width=600px></h1>
<br>
<p align="center">
  <img loading="lazy" alt="Release month badge" src="https://img.shields.io/badge/RELEASE%20MONTH-APRIL-darkgreen">
  <img loading="lazy" alt="Java Developer Kit badge" src="https://img.shields.io/badge/JDK-V17.0.10-%23eb8302">
  <img loading="lazy" alt="Status badge" src="https://img.shields.io/badge/STATUS-FINALIZADO-9400D3">
</p>
<br>
<p>O Coinversor é uma ferramenta de uso pelo terminal criada durante o projeto ONE - Oracle Next Education, e se utiliza da API <a href="https://www.exchangerate-api.com/" target="_blank">Exchange Rate</a> para converter o valor digitado pelo usuário para Reais, ou vice-versa!</p>

<br>
<h2>🔨 Funcionalidades do Projeto</h2>
<br>

- `Menu interativo`: No menu de opções, que vai de 1 até 11, o cliente pode escolher entre converter de Reais para Dólares, Pesos Argentinos, Bolivianos, Pesos Chilenos ou Pesos Colombianos, bem como converter dessas moedas para Real;
<br>

- `Leitura do valor`: Após a escolha da opção pelo cliente, o programa pedirá o valor a ser convertido, o valor deve estar no formato `double` ou `int`;
<br>

- `Conversão`: Ao receber o valor do cliente, o código irá consultar a cotação da moeda pela API, formatará usando a biblioteca <a href="https://mvnrepository.com/artifact/com.google.code.gson/gson" target="_blank">Gson</a>, e fará o cálculo, retornando na tela o valor convertido para a moeda escolhida.
<br>

<p align="center"><img loading="lazy" alt="GIF mostrando o código em funcionamento" src="https://github.com/Romano-g/conversor-de-moedas-challenge-ONE/assets/143983377/42e62599-70ba-461a-a7b3-59800f9e8829"></p>
<br>

<h2>🛠️ Abrindo e rodando o projeto</h2>
<br>

<p>Após baixar o projeto, você pode abrir com o IntelliJ, mas antes precisará baixar a biblioteca GSON, como descrito no passo a passo abaixo:</p>
<br>

- Clique <a href="https://mvnrepository.com/artifact/com.google.code.gson/gson/2.10.1" target="_blank">aqui</a> para acessar o download da biblioteca;
- Baixe o arquivo ".jar" e o extraia;
- Abra o IntelliJ, e selecione <b>"File" > "New" > "New project from existing sources..."</b> (ou alguma opção similar);
- Adicione o projeto do local onde foi baixado (caso esteja em zip será necessário extraí-lo antes);
- Após abrir o projeto, vá em <b>"File" > "Project Structure" > "Modules" > "Dependencies"</b>;
- No menu a esquerda clique em <b>"+" > "JARs or directorys..."</b>, e então selecione a biblioteca GSON baixada anteriormente (se ela estiver em .zip é necessária a extração);
- Clique em OK e está pronto para rodar o código!
<br>

<h2>✔️ Técnicas e tecnologias utilizadas</h2>
<br>

- `Java Developer Kit V17.0.10`
<br>
  
- `IntelliJ IDEA`
<br>
  
- `Gson V2.10.1`
<br>
  
- `API`
<br>
  
- `Programação Orientada a Objetos`

