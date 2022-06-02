public interface Armazenavel <T, U>{
    public void adicionarAoInventario(T nome, U valor);
    public U obterDoInventario(T nome);
}