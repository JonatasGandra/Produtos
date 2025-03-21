# Detalhamento



## Classe objeto:

- ### Declaração das variáveis. tornei-as privadas:

  - `private int id;`
    `private String nome;`
    `private double valor;`
    `private int quantidade;`
    `private String cor;`

- ### Construtores:

  - #### Padrão:
  
    - `Produtos() {}`
  
  - #### Construtores parametrizados:

    - `public Produtos(int id, String nome) {`
  ` this.id = id;`
  `this.nome = nome.toUpperCase();`
  `}`

    - `public Produtos(int quantidade, double valor, String cor) {`
  `this.quantidade = quantidade;`    
  `this.valor = valor;`
  `this.cor = cor.toLowerCase();`
  `}`

- ### Métodos de encapsulamento:

  - #### Setters:
  
    - `public void setNome(String nome) {`
     `this.nome = nome.toUpperCase();`
     `}`

  - #### Getters:
  
    - `public String getNome() {`
        `return nome;`
    `}`

---

## Classe driver:

- ### Case 1:

  - `Scanner scanner = new Scanner(System.in);`:
     Recebe a função de "input" e a guarda numa variável.<br><br>
  - `List<Produtos> produtos = new ArrayList<>();`
     A fim de não ter um número limitado de produtos a serem cadastrados, usei o Array list para adicionar elementos ao vetor dinamicamente.<br><br>
  - `menu = scanner.nextInt();`
     menu recebe o número para determinar qual caso o programa deverá executar.<br><br>
  - `List<Integer> ids = new ArrayList<>();`
     Declara uma variável chamada ids como uma lista que armazena números inteiros (Integer)<br><br>
  - `ids.contains(id)`
     verifica se tem um id na lista e se tiver, ele nao permite e continua a repetição voltando o índice: `i--; continue;`. isso funciona se estiver na mesma sequência só.<br><br>
  - `boolean idRepetido = false;`
     usada posteriormente para indicar que nao há um id igual.<br><br>
  - `for (Produtos produto : produtos) {`
    `if (produto.getId() == id) {`
     Percorre a lista produtos para verificar se já existe um produto com o mesmo id. se ele passar pela condição receberá: `idRepetido = true;`
  e em seguida terá outra condição que retorna um valor do índice e continua o código do começo.<br><br>
  - `ids.add(id);`
      Caso o valor de id nao passe por nenhuma das condições anteriores, é adicionado um id no Array. Em seguida são adicionados os outros atributos do produto:
    - `Produtos novoProduto = new Produtos();`
      `novoProduto.setInfo(id, nome, preco, quantidade, cor);`
      `produtos.add(novoProduto);`

---
- ### Case 2:

  -  `boolean produtoEncontrado = false;`
  `for (Produtos produto : produtos) {`
  `if (produto.getId() == id)`
       percorre toda a lista produtos e se ja houver o id ele inicia a função de "update" usando o "setAtributo"<br><br>

    - `if (!produtoEncontrado)`
       se encontrar um id que nao foi cadastrado manda uma menssagem e para o caso.

---

- ### Case 3:
  - `if (produtos.get(i).getId() == id)`
     Se o id do produto na posição i da lista é igual ao id que o usuário digitou para excluir.
o produtos.get(i) Acessa o produto na posição i da lista produtos.
.getId(): Chama o método getId() do objeto Produtos para obter o id do produto. depois usa o produtos.remove(i) para remover.

---

- ### Case 4:
  - `produtos.isEmpty()`
      Se a lista estiver vazia, printa uma mensagem dizendo isso. <br><br>
  - `Produtos produto = produtos.get(j);`
     Seleciona o produto na devida posição do vetor e printa os atributos usando o metodo "getAtributo".

---

- ### Case 5:
  
  - Fala que esta saindo, e como o usuário digitou o valor 5, "while (menu != 5);" sai da repetição "do while"

---