# Challenge

Projeto de Teste para o processo seletivo da CI&T - Automação do processo de compra no e-commerce My Store.
Foi utilizado Selenium Web-Driver com Java.

## Getting Started

Para a execução do projeto é necessário seguir as especificações abaixo:

### Prerequisites

[Java JDK](https://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)
>> De acordo com o Sistema operacional da máquina onde os testes serão executados

IDE à sua escolha
Exemplos:</br>
[Eclipse](https://www.eclipse.org/downloads/)

[InteliiJ](https://www.jetbrains.com/idea/download/)

Nas duas IDE's é possível instalar um plugin para melhorar a visualização das especificações.

[Cucumber Eclipse Plugin](https://marketplace.eclipse.org/content/cucumber-eclipse-plugin)

[Cucumber for Java para IntelliJ](https://plugins.jetbrains.com/plugin/7212-cucumber-for-java/)

>> 
### Installing

As dependências abaixo são necessárias no arquivo pom.xml

[cucumber-java, versão 1.2.5](https://mvnrepository.com/artifact/info.cukes/cucumber-java/1.2.5)

[cucumber-junit,versão 1.2.5](https://mvnrepository.com/artifact/info.cukes/cucumber-junit/1.2.5)

[selenium-java, versão 3.141.59](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59)

[commons-io, versão 2.6](https://mvnrepository.com/artifact/commons-io/commons-io/2.6)

![image](https://user-images.githubusercontent.com/58777136/70628159-64846080-1c06-11ea-9354-7fdb70c8a15b.png)

## Running the tests

Os testes devem ser executados através do ChallengeRunner criado a partir do JUnit.

### Break down into end to end tests

O teste realiza o login no e-commerce My Store e então realiza uma compra.

Uma próxima automação poderia ser a criação de um usuário, dado que somente usuários logados podem realizar compras, porém por se tratar de um e-commerce, o foco inicial foi em concluir uma compra com sucesso. 

>> Devido ao tempo curto, não foi possível realizar o teste de API, que pode ser realizado através do postman, utilizando os snippets de teste que existem ou configurar alguns mais customizados, então pode-se salvar a colection e executá-lo através do Newman(Postman via linha de comando)
```
newman run nome_collection -r html
```
O comando vai gerar um relatório no mesmo local onde foi exportada a collection.

>> Para os testes end2end, como melhoria poderia utilizar Page Object, modularizando o código. Onde teriamos uma classe mapeando os objetos da página, e nos testes apenas as chamadas.

Att, Raphael
