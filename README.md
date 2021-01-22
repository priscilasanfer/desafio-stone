# Desafio Stone

## Sobre o Programa  
Este programa foi desenvolvido para gerir a divisão de forma mais igualitária possível entre todas as pessoas a partir de uma lista de compras.

Como o desafio pede para que fosse construido de uma forma simple e objetiva optei por fazer toda a lógica na classe `Desafio`,
utilizando a classe `Item` como apoio para que a lista `itens` fique mais limpa e fácil de trabalhar com todos os atributos.

Outro ponto solicitado é que os valores fossem tratados como inteiro sem a necessidade de formatação. 
Por isso declarei a variável `valor` na classe `Items` como `int`.

A classe `Item` contém os seguintes atributos:
- Uma String `nome`
- Um int `quantidade`
- Um int `valor`
 
Já a classe `Desafio` contém os métodos: 
- `valorTotalDaCompra`: responsável por retornar o valor total referente a lista de itens, ou seja, vai multiplicar 
o valor de cada item pela quantidade de todos os itens da lista.
- `valorIndividual`: responsável por retornar o valor que cada email deveria pagar na conta sem se importar com erros 
  de arredondamento que a divisão por números do tipo `int` causam e trata exceções caso a lista de emails esteja vazia.
- `calculaValorPorEmail`: método que contém a lógica responsável por atribuir o valor devido à cada pessoa e verificar se
  falta algum centavo a ser pago. 
  Caso falte algum centavo, esse valor vai ser atribuído sequencialmente às primeiras pessoas adicionadas à estrutura `map`.
  Lembrando que a estrutura `map` não garante ordem por isso esses centavos serão atribuídos aleatoriamente.  
- `main`: responsável por executar o projeto, popular as listas, exibir o valor devido de cada integrante da lista de `emails` e,
caso ocorra algum erro, encerra o programa.

O programa ficou estruturado da seguinte forma:

```
Projeto
├── stone
│   └── src/br/com/priscilasanfer
│       └── Item
│       └── Desafio
└── README.md
```

## Como executar o programa
Na classe `Desafio` já foram instanciadas duas listas nas quais será necessário adicionar os dados que o programa processará.

Passo a passo:
1. Abra o programa na sua IDE ou editor de textos preferido.
2. No método `main`, logo abaixo da instanciação das listas, adicione a quantidade de itens desejados na lista `itens`.  
Por exemplo:  
   ```
        List<Item> itens = new ArrayList<>();
        itens.add(new Item("caneta", 1, 100));
   ```
3. Ainda na classe `main`, adicione também a quantidade de emails desejada na lista `emails`.  
Por exemplo: 
   ```
        List<String> emails = new ArrayList<>();
        emails.add("priscila@teste.com.br");
   ```
4. Salve as alterações feitas.
5. Para executar o programa existem duas maneiras:  
   5.1. **Pela IDE:** basta executar o método `main`.  
   5.2. **Pelo terminal:** basta acessar a pasta `scr` do projeto e rodar o comando para 
   compilar a classe: `javac ./br/com/priscila/Desafio.java`  e depois o comando para executá-la: `java Desafio`
6. Verifique os valores devidos de cada integrante.

   