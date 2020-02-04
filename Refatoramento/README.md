# SoftBar Company Refatorado

## Padrões utilizados

1. Strategy
> Permitir que o algoritmo varie independentemente dos clientes que o utilizam
  - Classes: **HomeStrategy**, **LoginStrategy**

2. Singleton
> Garantir que uma classe só tenha uma única instância, e prover um ponto de acesso global a ela.
  - Classes: **DataSingleton**, **UserSingleton**

3. Template Method
> Definir o esqueleto de um algoritmo dentro de uma operação, deixando alguns passos a serem preenchidos pelas subclasses. Template Method permite que suas subclasses redefinam certos passos de um algoritmo sem mudar sua estrutura.
  - Classes: **AdminAbstract**

## Login

- Admin:
CPF: 02855704472
Password: 123

- Client:
CPF: 67729825090
Password: 123

- Barman:
CPF: 35688259027
Password: 123

- Security Guard:
CPF: 81703978048
Password: 123


## Estrutura dos arquivos

```
Refatoramento
.
├── .classpath
├── .project
├── README.md
├── .settings
├── .vscode
├── bin
└── src
    ├── App.java
    ├── Drinks.java
    ├── ExceptionHandling.java
    ├── FakeData.java
    ├── data
    │   ├── DataSingleton.java
    │   ├── UserSingleton.java
    ├── person
    │   ├── Person.java
    │   ├── adminperson
    │   │   ├── AdminAbstract.java
    │   │   ├── AdminDrinks.java
    │   │   └── AdminPerson.java
    │   ├── barmanperson
    │   │   └── Barman.java
    │   ├── clientperson
    │   │   └── Client.java
    │   ├── securityguardperson
    │   │   └── SecurityGuard.java
    ├── views
    │   ├── adminscreen
    │   │   │   ├── options
    │   │   │   │   ├── OptionsA.java
    │   │   │   │   ├── OptionsB.java
    │   │   │   │   └── OptionsC.java
    │   │   └── AdminScreen.java
    │   ├── barmanscreen
    │   │   └── BarmanScreen.java
    │   ├── clientscreen
    │   │   └── ClientScreen.java
    │   ├── homescreen
    │   │   ├── ExitConcreteStrategy.java
    │   │   ├── HomeContext.java
    │   │   ├── HomeStrategy.java
    │   │   └── SignConcreteStrategy.java
    │   ├── loginscreen
    │   │   ├── AdminConcreteStrategy.java
    │   │   ├── BarmanConcreteStrategy.java
    │   │   ├── ClienteConcreteStrategy.java
    │   │   ├── LoginContext.java
    │   │   ├── LoginStrategy.java
    │   │   └── SecurityGuardConcreteStrategy.java
    │   ├── securityguardscreen    
    │   │   └── SecurityGuardScreen.java
```