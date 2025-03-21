import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        List<Produtos> produtos = new ArrayList<>();

        do {
            System.out.println(
                    "MENU: \n 1 - Cadastrar produto \n 2 - Alterar produto \n 3 - Excluir produto \n 4 - Listar todos os produtos \n 5 - Sair");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1 -> {
                    System.out.println("Quantos produtos quer cadastrar?");
                    int qnt = scanner.nextInt();
                    scanner.nextLine();

                    List<Integer> ids = new ArrayList<>();

                    for (int i = 0; i < qnt; i++) {
                        System.out.println("Digite o id do produto: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        if (ids.contains(id)) {
                            System.out.println("Você já digitou este ID nesta sequência. Por favor, digite um ID diferente.");
                            i--;
                            continue;
                        }

                        boolean idRepetido = false;
                        for (Produtos produto : produtos) {
                            if (produto.getId() == id) {
                                System.out.println("Já existe um produto com este ID. Por favor, digite um ID diferente.");
                                idRepetido = true;
                                break;
                            }
                        }

                        if (idRepetido) {
                            i--;
                            continue;
                        }

                        ids.add(id);

                        System.out.println("Digite o nome do produto: ");
                        String nome = scanner.nextLine();
                        System.out.println("Digite o preço do produto: ");
                        double preco = scanner.nextDouble();
                        System.out.println("Digite a quantidade do produto: ");
                        int quantidade = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Digite a cor do produto: ");
                        String cor = scanner.nextLine();

                        Produtos novoProduto = new Produtos();
                        novoProduto.setInfo(id, nome, preco, quantidade, cor);
                        produtos.add(novoProduto); 
                    }
                }
                case 2 -> {
                    System.out.println("Digite o ID do produto que deseja alterar: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    boolean produtoEncontrado = false;
                    for (Produtos produto : produtos) {
                        if (produto.getId() == id) {
                            System.out.println("Digite o novo nome do produto: ");
                            produto.setNome(scanner.nextLine());
                            System.out.println("Digite o novo preço do produto ");
                            produto.setValor(scanner.nextDouble());
                            System.out.println("Digite a nova quantidade do produto: ");
                            produto.setQuantidade(scanner.nextInt());
                            scanner.nextLine();
                            System.out.println("Digite a nova cor do produto: ");
                            produto.setCor(scanner.nextLine());
                            produtoEncontrado = true;
                            break;
                        }
                    }

                    if (!produtoEncontrado) {
                        System.out.println("Produto não encontrado!");
                    }

                    System.out.println("\n\n");
                    break;
                }
                case 3 -> {
                    System.out.println("Digite o ID do produto que deseja excluir: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    boolean produtoEncontrado = false;
                    for (int i = 0; i < produtos.size(); i++) {
                        if (produtos.get(i).getId() == id) {
                            produtos.remove(i);
                            System.out.println("Produto removido!");
                            produtoEncontrado = true;
                            break;
                        }
                    }

                    if (!produtoEncontrado) {
                        System.out.println("Produto não encontrado!");
                    }

                    System.out.println("\n\n");
                    break;
                }
                case 4 -> {
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado!");
                    } else {
                        for (int j = 0; j < produtos.size(); j++) {
                            Produtos produto = produtos.get(j);
                            System.out.println("ID:");
                            System.out.println(produto.getId());

                            System.out.println("NOME:");
                            System.out.println(produto.getNome());

                            System.out.println("VALOR:");
                            System.out.println(produto.getValor());

                            System.out.println("QUANTIDADE:");
                            System.out.println(produto.getQuantidade());

                            System.out.println("COR:");
                            System.out.println(produto.getCor());
                            System.out.println("\n\n");
                        }
                    }
                    break;
                }
                case 5 -> {
                    System.out.println("Saindo...");
                }
                default -> System.out.println("Opção inválida!");
            }
        } while (menu != 5);
    }
}
