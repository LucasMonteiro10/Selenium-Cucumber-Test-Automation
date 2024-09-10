# Automação Para o Sistema de E-Commerce Swag Labs

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Cucumber](https://img.shields.io/badge/Cucumber-23D96C?style=for-the-badge&logo=cucumber&logoColor=white)
![Gherkin](https://img.shields.io/badge/Gherkin-5C2D91?style=for-the-badge&logo=cucumber&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

## Visão Geral do Projeto

O projeto consiste em um Projeto Java Maven que inclui as seguintes dependências:

- **Java**: Para manipular métodos Selenium.
- **Selenium**: Para automação de navegadores.
- **Cucumber**: Para abordagem BDD.
- **Gherkin**: Para facilitar a escrita de especificações de comportamento
- **JUnit**: Para framework de testes.
- **Maven**: Para gerenciamento de dependências.

## Estrutura do Projeto

```plaintext
src
└── test
    ├── java
    │   └── com
    │       └── swaglabs
    |           ├── locators
    |           |   ├── CarLocators.java
    |           |   ├── CheckoutCompletedLocators.java
    |           |   ├── CheckoutOverviewLocators.java
    |           |   ├── InformationLocators.java
    |           |   ├── LoginLocators.java
    |           |   ├── ProductsLocators.java
    │           ├── pages
    │           │   ├── CartPage.java
    │           │   ├── CheckoutCompletedPage.java
    │           │   ├── CheckoutOverviewPage.java
    │           │   ├── InformationPage.java
    │           │   ├── LoginPage.java
    │           │   └── ProductsPage.java
    │           ├── steps
    │           │   ├── CartSteps.java
    │           │   ├── CheckoutCompletedSteps.java
    │           │   ├── CheckoutOverviewSteps.java
    │           │   ├── InformationSteps.java
    │           │   ├── LoginSteps.java
    │           │   └── ProductsSteps.java
    │           ├── utils
    │           │   ├── drivers
    │           │   │   └── geckodriver.exe
    │           │   ├── DriverManager.java
    │           │   └── Hooks.java
    │           └── TestRunner.java
    └── resources
        ├── features
        │   ├── checkout.feature
        │   ├── login.feature
        │   ├── logout.feature
        │   ├── productSorting.feature
        │   └── shoppingCart.feature
        └── media
            └── XXX.png
```

Esta estrutura segue uma organização comum para projetos de automação de testes utilizando Java, Selenium, Cucumber e Page Object Model, onde:

- locators: Contém os seletores para encontrar os elementos dentro das páginas do navegador.
- pages: Contém as classes que representam as páginas do site, com métodos que encapsulam a interação com os elementos da página.
- steps: Contém as classes que implementam as etapas dos cenários definidos nos arquivos .feature.
- utils: Inclui classes utilitárias, como gerenciamento de drivers e hooks para setup e teardown dos testes.
- resources: Contém arquivos externos ao código Java, como arquivos .feature que descrevem os cenários de teste, e outras mídias ou arquivos de configuração.

## Swag Labs Home Page

![Imagem da Tricentis Home Page](src/test/resources/media/tricentishome.png)
