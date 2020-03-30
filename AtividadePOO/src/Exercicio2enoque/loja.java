package Exercicio2enoque;
public class loja {
    public static void main(String[] args) {
        //instancias
        Livros livros = new Livros();
        CDs CDs = new CDs();
        DVDs DVDs = new DVDs();
        
        //vetor
        String produtos[] = new String[5];
        
        //iserindo valores
        livros.setNome("Admiravel Mundo Novo");
        livros.setPreco(50.90);
        livros.setAutor("Adous Huxley");
        
        produtos[0] = "Nome: " + livros.getNome() + " | Preço: " + livros.getPreco() + " | Autor: " + livros.getAutor();
        
        DVDs.setNome("Interestrelar");
        DVDs.setPreco(10);
        DVDs.setDuracao(2.30);
        
        produtos[1] ="Nome: " + DVDs.getNome() + " | Preço: " + DVDs.getPreco() + " | Duração: " + DVDs.getDuracao();
        
        CDs.setNome("Post Malone");
        CDs.setPreco(23.40);
        CDs.setNumeroFaixas(9);
        
        produtos[2] = "Nome: " + CDs.getNome() + " | Preço: " + CDs.getPreco() + " | Numero de faixas: " + CDs.getNumeroFaixas();
        
        livros.setNome("Fahrenheit 451");
        livros.setPreco(65.99);
        livros.setAutor("Ray Bradbury");
        
        produtos[3] = "Nome: " + livros.getNome() + " | Preço: " + livros.getPreco() + " | Autor: " + livros.getAutor();
        
        DVDs.setNome("Venom");
        DVDs.setPreco(30);
        DVDs.setDuracao(2.25);
        
        produtos[4] ="Nome: " + DVDs.getNome() + " | Preço: " + DVDs.getPreco() + " | Duração: " + DVDs.getDuracao();
        
        
        //inserindo valores nos vetores
        
        
        
        
        //imprimir valores
        System.out.println(produtos[0]);
        System.out.println(produtos[1]);
        System.out.println(produtos[2]);
        System.out.println(produtos[3]);
        System.out.println(produtos[4]);
    }
}
