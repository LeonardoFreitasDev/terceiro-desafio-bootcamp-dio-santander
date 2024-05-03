package desafioIphone;

import apple.Iphone;

public class Usuario extends Iphone{
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		//Funcoes Telefonicas
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		//Funcoes Musicais
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("Êxodo");
		
		//Funcoes Internet
		iphone.exibirPagina("https://www.google.com");
		iphone.atualizarPagina();
		iphone.adicionarNovaAba();
	}
}
