import java.util.*;

public class ProcessadorVideo {
    private List<CanalNotificacao> canais = new ArrayList<CanalNotificacao>();

    public void registrarCanal (CanalNotificacao canal) {
        canais.add(canal);
    }

    public void processar (Video video) {
        for (CanalNotificacao canal: canais) {
            String texto = video.getArquivo() + " - " + video.getFormatoVideo();
            Mensagem mensagem = new Mensagem(texto, TipoMensagem.LOG);
            canal.notificar(mensagem);
        }
    }

}