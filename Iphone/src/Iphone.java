public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
   }

    @Override
    public void atender() {
        System.out.println("Ligação recebida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música em pausa");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
    }
}

