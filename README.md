# Desafio Stone

##Sobre o Programa
Este programa foi desenvolvido para gerenciar a divisão igualitaria entre pessoas a partir de uma lista de compra.

## Como executar o programa
Na classe `Desafio` já foi instanciada duas listas na qual será necessário adicionar os dados que o programa processará.

Passo a passo:
1. Abra o programa na sua IDE ou editor de textos preferido.
2. No método `main` logo abaixo a instanciação das listas adicione a quantidade de itens deseja na lista `itens`.  
Por exemplo:  
   ```
        List<Item> itens = new ArrayList<>();
        itens.add(new Item("caneta", 1, 100));
   ```
3. Ainda na classe `main` adicione também a quantidade de emails desejada na lista emails.  
Por exemplo: 
   ```
        List<String> emails = new ArrayList<>();
        emails.add("priscila@teste.com.br");
   ```
4. Salve as alterações feitas.
5. Para executar o programa existe duas maneiras:  
   5.1. **Pela IDE:** basta executar o método `main`.  
   5.2. **Pelo terminal:** basta acessar a pasta `scr` do projeto e rodar o comando para 
   compilar a classe: `javac ./br/com/priscila/Desafio.java`  e depois o comando para executá-la: `java br.com.priscila.Desafio`
   

   