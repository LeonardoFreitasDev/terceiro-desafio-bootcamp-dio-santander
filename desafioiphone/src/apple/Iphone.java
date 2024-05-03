package apple;

import dispositivos.AparelhoTelefonico;
import dispositivos.NavegadorInternet;
import dispositivos.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

	@Override
	public void tocar() {
		System.out.println("Tocando música");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música");
		
	}

	@Override
	public void selecionarMusica(String nomeMusica) {
		System.out.println("Selecionando música: " + nomeMusica);
		
	}

	@Override
	public void exibirPagina(String endereco) {
		System.out.println("Exibindo a página: " + endereco);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina");
		
	}

	@Override
	public void ligar() {
		System.out.println("Realizando ligação");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciiando Correio de Voz");	
	}
	
}
