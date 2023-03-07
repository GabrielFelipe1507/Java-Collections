package br.dio.collectionsjava.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

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

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
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


}