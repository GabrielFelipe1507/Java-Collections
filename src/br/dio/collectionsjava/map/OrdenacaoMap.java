package br.dio.collectionsjava.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class OrdenacaoMap {
    /*
     * Dasdas as seguintes informações sobre meus livros favoritos e seus autores,
     * crie um dicionário e ordene este dicionário:
     * exibindo (Nome Autor - Nome Livro);
     */

    public static void main(String[] args) {
        System.out.println("Ordem Aleatória:");
        Map<String, Livro> meusLivros = new HashMap<>() {
            {

                // put("Felipe, Neves", new Livro("Uma Breve História", 244));
                // put("Gustavo, Isidoro", new Livro("Uma Breve Comédia", 235));
                // put("Gabriel, Felipe", new Livro("Uma Breve História", 244));

            }
        };
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("Ordem Inserção:");
        Map<String, Livro> meusLivros1 = new HashMap<>() {
            {

                // put("Felipe, Neves", new Livro("Uma Breve História", 244));
                // put("Gustavo, Isidoro", new Livro("Uma Breve Comédia", 235));
                // put("Gabriel, Felipe", new Livro("Uma Breve História", 244));

            }
        };
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("Ordem Alfabética autores:");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros) {
            {

                // put("Felipe, Neves", new Livro("Uma Breve História", 244));
                // put("Gustavo, Isidoro", new Livro("Uma Breve Comédia", 235));
                // put("Gabriel, Felipe", new Livro("Uma Breve História", 244));

            }
        };
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        // Exercicios:
        // 1 - Dadas as seguintes informações de id e contato, crie um dicionário e
        // ordene este dicionário exibindo (Nome id - Nome contato);
        // Ex:
        // id = 1 - Contato = nome: Pelé, numero: 2222;
        // id = 4 - Contato = nome: Ronaldo, numero: 7777;
        // id = 3 - Contato = nome: Camisa Grande, numero: 5555;

        System.out.println("Ordem Aleatória:\n");
        Map<Integer, Contato> jogadoresAgenda = new HashMap<>(){{
           // put(1, new Contato(1, "Pelé", 7777));
           // put(4, new Contato(4, "Ronaldo", 7777));
           // put(3, new Contato(3, "Camisa Grande", 5555));
        }};
        System.out.println(jogadoresAgenda);

    }

    class Livro {
        private String nome;
        private Integer paginas;

        // construtores:
        public Livro(String nome, Integer paginas) {
            this.nome = nome;
            this.paginas = paginas;
        }

        public Livro() {

        }

        /* getters e setters */
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getPaginas() {
            return paginas;
        }

        public void setPaginas(Integer paginas) {
            this.paginas = paginas;
        }

        // métodos equals e hascode:
        @Override
        public int hashCode() {
            return Objects.hash(nome, paginas);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Livro other = (Livro) obj;
            if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
                return false;
            if (nome == null) {
                if (other.nome != null)
                    return false;
            } else if (!nome.equals(other.nome))
                return false;
            if (paginas == null) {
                if (other.paginas != null)
                    return false;
            } else if (!paginas.equals(other.paginas))
                return false;
            return true;
        }

        private OrdenacaoMap getEnclosingInstance() {
            return OrdenacaoMap.this;
        }

        // método to string():
        @Override
        public String toString() {
            return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
        }

    }

    class Contato {
        Integer id;
        String nome;
        Integer numero;

        // construtores:
        public Contato(Integer id, String nome, Integer numero) {
            this.id = id;
            this.nome = nome;
            this.numero = numero;
        }

        // getters e setters:
        public Contato() {
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumero() {
            return numero;
        }

        public void setNumero(Integer numero) {
            this.numero = numero;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getEnclosingInstance().hashCode();
            result = prime * result + ((id == null) ? 0 : id.hashCode());
            result = prime * result + ((nome == null) ? 0 : nome.hashCode());
            result = prime * result + ((numero == null) ? 0 : numero.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Contato other = (Contato) obj;
            if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
                return false;
            if (id == null) {
                if (other.id != null)
                    return false;
            } else if (!id.equals(other.id))
                return false;
            if (nome == null) {
                if (other.nome != null)
                    return false;
            } else if (!nome.equals(other.nome))
                return false;
            if (numero == null) {
                if (other.numero != null)
                    return false;
            } else if (!numero.equals(other.numero))
                return false;
            return true;
        }

        private OrdenacaoMap getEnclosingInstance() {
            return OrdenacaoMap.this;
        }

    }

}