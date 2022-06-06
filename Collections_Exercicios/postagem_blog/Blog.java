import java.util.*;

public class Blog {
    private List<Post> posts;

    public Blog() {
        posts = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post postAdicionado) {
        for (Post post: this.posts) {
            if (post.getAutor().equals(postAdicionado.getAutor())) {
                if (post.getTitulo().equals(postAdicionado.getTitulo())) {
                    throw new IllegalArgumentException("Postagem jah existente");
                }
            }
        }
        this.posts.add(postAdicionado);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<Autor>();
        for (Post post: this.posts) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> contagem = new TreeMap<Categorias, Integer>();
        for (Post post: this.posts) {
            if(contagem.containsKey(post.getCategoria())) {
                contagem.put(post.getCategoria(), contagem.get(post.getCategoria())+1);
            }
            else {
                contagem.put(post.getCategoria(), 1);
            }
        }

        return contagem;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> postsAutor = new TreeSet<Post>();
        for (Post post: this.posts) {
            if (post.getAutor().equals(autor)) {
                postsAutor.add(post);
            }
        }
        return postsAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> postsCategoria = new TreeSet<Post>();
        for (Post post: this.posts) {
            if (post.getCategoria().equals(categoria)) {
                postsCategoria.add(post);
            }
        }
        return postsCategoria;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> postsPorCategoria = new TreeMap<Categorias, Set<Post>>();
        for (Categorias categoria: Categorias.values()) {
            postsPorCategoria.put(categoria, obterPostsPorCategoria(categoria));
        }

        return postsPorCategoria;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> postsPorAutor = new TreeMap<Autor, Set<Post>>();
        Set<Autor> autores = obterTodosAutores();
        for (Autor autor: autores) {
            postsPorAutor.put(autor, obterPostsPorAutor(autor));
        }

        return postsPorAutor;
    }
}