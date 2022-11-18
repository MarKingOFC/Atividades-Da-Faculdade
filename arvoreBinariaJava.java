class Node{
    int dado;
    Node esquerdo, direito;

    public Node (int item){
        dado = item;
        esquerdo = direito = null;
    }
}

class ArvoreBinaria {
    Node raiz;

    boolean isArvoreBinariaCheia(Node node){
        if(node == null){
            return true;
        }
        if(node.esquerdo == null && node.direito == null){
            return true;
        }
        if(node.esquerdo != null && node.direito != null){
            return (isArvoreBinariaCheia(node.esquerdo) && isArvoreBinariaCheia(node.direito));
        }

        return false;
    }
    
    boolean isArvoreBinariaPerfeita(Node node, int profundidade, int nivel){
        if(node == null){
            return true;
        }
        if(node.esquerdo == null && node.direito == null){
            return (profundidade == nivel + 1);
        }
        if(node.esquerdo == null || node.direito == null){
            return false;
        }

        return isArvoreBinariaPerfeita(node.esquerdo, profundidade, nivel + 1) && isArvoreBinariaPerfeita(node.direito, profundidade, nivel + 1);
    }

    int verificaProfundidade(Node node) {
        int profundidade = 0;
        while(node!=null){
            profundidade++;
            node = node.esquerdo;
        }
        return profundidade;
    }

    boolean isPerfeita(Node node){
        int profundidade = verificaProfundidade(node);
        return isArvoreBinariaPerfeita(node, profundidade, 0);
    }

  
      void inorder(Node node) {
      if (node == null)
      return;
    // Travessia esquerda
    inorder(node.esquerdo);
    // Travessia raiz
    System.out.print(node.dado + "->");
    // Travessia direita
    inorder(node.direito);
    }

  void preorder(Node node) {
    if (node == null)
    return;
    // Travessia raiz
    System.out.print(node.dado + "->");
    // Travessia esquerda
    preorder(node.esquerdo);
    // Travessia direita
    preorder(node.direito);
    }

void postorder(Node node) {
  if (node == null)
  return;
  // Travessia esquerda
  postorder(node.esquerdo);
  // Travessia direita
  postorder(node.direito);
  // Travessia raiz
  System.out.print(node.dado + "->");
}
 int search(Node root, int numero){
if(root == null)
    return 0;
if(numero == root.dado){
  System.out.print( "\n\nValor encontrado! " + root.dado);
  return  root.dado;}
if(numero < root.dado){
   System.out.print(root.dado);
    return search(root.esquerdo, numero);}
if(numero > root.dado){
  System.out.print(root.dado);
   return search(root.direito, numero);}
   return 0;
} 
  Node create(Node root, int num){
    return root = new Node(num);
  }

  
  Node insert(Node root, int numero){
     if(root == null ){
       System.out.println("\nInserido numero:" + numero);
       return create(root,numero);
     }
    if(numero < root.dado){
      return root.esquerdo = insert(root.esquerdo, numero);
    }else if(numero > root.dado){
      return root.direito =  insert (root.direito, numero);
    }
    return null ;
  }

    Node excluir(Node root, int numero){
            // PRIMEIRA FORMA DE EXCLUIR > FOLHAS
    if (root.dado == numero && (root.esquerdo == null && root.direito == null)){
            System.out.println("CASO UM EXCLUSÃO");
      return root = null;
    }
      if(root.dado == numero){   
           // SEGUNDA FORMA DE EXCLUIR SUBSTITUINDO OS NÓS FILHOS QUANDO É SOMENTE UM NÓ A ESQUERDA OU DIREITA
                  if(root.direito != null && root.esquerdo == null){
                    System.out.println("CASO DOIS EXCLUSÃO");
                    root.dado = root.direito.dado;
                    root.direito = null;
                  }
                  if(root.esquerdo != null && root.direito == null){
                     System.out.println("CASO DOIS EXCLUSÃO");
                    root.dado = root.esquerdo.dado;
                    root.esquerdo = null;
                }
          //TERCEIRA FORMA DE EXCLUIR
                  if(root.esquerdo != null && root.direito != null){
                     System.out.println("CASO TRÊS EXCLUSÃO");
                    Node noSucessor =  root.direito.esquerdo;
                    root.dado =  noSucessor.dado;
                    noSucessor = null;
                  }
                
      }

      
    return null;
} 
}

class Main {
  public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.raiz = new Node(5);    
        arvore.raiz.esquerdo = new Node(2);
        arvore.raiz.direito = new Node(6);
        arvore.raiz.direito.direito = new Node(9);
       arvore.raiz.direito.direito.direito = new Node(12);


        if(arvore.isArvoreBinariaCheia(arvore.raiz)){
            System.out.println("A arvore binaria é cheia");
        }
        else{
            System.out.println("A arvore binaria não é cheia");
        }

        if(arvore.isPerfeita(arvore.raiz)){
            System.out.println("A arvore binaria  é Perfeita");
        }
        else{
            System.out.println("A arvore binaria não é Perfeita\n");
        }
    System.out.print( "Em Ordem: ");
    arvore.inorder(arvore.raiz);

    System.out.print( "\nPré Ordem: ");
    arvore.preorder(arvore.raiz);

    System.out.print( "\nPós ordem: ");
    arvore.postorder(arvore.raiz);
     System.out.print( "\n\n------Caminho pesquisa:------------");

    // -----PESQUISA
    arvore.search(arvore.raiz, 12);

   // ------INSERT----
    arvore.insert(arvore.raiz, 15);
        arvore.insert(arvore.raiz, 18);

    // EXCLUIR
    arvore.excluir(arvore.raiz,12);
  }

}

//Marco Aurelio Santos
//RGM:25762141