import java.io.*;
import java.util.*;

@SuppressWarnings("unchecked")
public class SerializarEstudantes<T> {
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        try {
            FileOutputStream arquivo = new FileOutputStream(nomeArquivo);
            ObjectOutputStream out = new ObjectOutputStream(arquivo);

            out.writeObject(estudantes);

            out.close();
            arquivo.close();
        }

        catch(IOException ex) {
            System.out.println("Nao foi possivel serializar");
        }
    }
    public List<Estudante> desserializar(){
        List<Estudante> estudantes = new ArrayList<Estudante>();
        try {
            FileInputStream arquivo = new FileInputStream(nomeArquivo);
            ObjectInputStream in = new ObjectInputStream(arquivo);

            estudantes = (List<Estudante>) in.readObject();

            in.close();
            arquivo.close();
        }

        catch(Exception ex) {
            System.out.println("Nao foi possivel desserializar");
        }
        return estudantes;
    }
}