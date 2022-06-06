import java.util.*;

public class Blog {
    private List<Post> posts;

    public Blog() {
        posts = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post) {
        this.posts.add(post);
    }

    public Set<String> obterTodosAutores() {
        Set<String> autores = new TreeSet<String>();
        for (Post post: this.posts) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> contagem = new TreeMap<String, Integer>();
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
}