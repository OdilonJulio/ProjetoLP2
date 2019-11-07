package br.ufrn.imd.lip2.projeto;


import org.apache.logging.log4j.message.MapMessage.MapFormat;
import org.glassfish.jersey.jaxb.internal.XmlCollectionJaxbProvider.General;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class GerenciadorDePatrimonio extends TelegramLongPollingBot {

	private MaquinaDeEstado estado = MaquinaDeEstado.INATIVO;

	public void onUpdateReceived(Update update) {
		
		String comando = update.getMessage().getText();
		SendMessage mensagem = new SendMessage();
		
		if(estado == MaquinaDeEstado.INATIVO){
			if (comando.equals("/about")) {
				System.out.println("Enviando mensagem sobre o Bot.");
				mensagem.setText("Olá! Meu nome é Bot Gerenciador de Patrimônio. Eu farei a gestão dos bens.");
			}

			else if (comando.equals("/cadastrarlocalizacao")) {
				System.out.println("Adicionando localização.");
				mensagem.setText("Vamos adicionar o local. Escreva o nome do local.");
				estado = MaquinaDeEstado.AGUARDANDO_LOCALIZACAO_NOME;
			}
	
			if (comando.equals("/cadastrarcategoria")) {
				System.out.println("Adicionando categoria.");
				mensagem.setText("Vamos adicionar a categoria. Escreva o nome do local.");
				estado = MaquinaDeEstado.AGUARDANDO_CATEGORIA_NOME;
			}
	
			if (comando.equals("/cadastraritem")) {
				System.out.println("Adicionando bem.");
				mensagem.setText("Vamos adicionar o bem. Escreva o nome do bem.");
				estado = MaquinaDeEstado.AGUARDANDO_BEM_NOME;
			}
	
			if (comando.equals("/buscaritem")) {
				
				System.out.println("Buscando o bem.");
				mensagem.setText("Qual bem deseja buscar?");
				/**
				 * falta implementar
				 * estado = MaquinaDeEstado.XXXXXXX
				*/
			}
	
			if (comando.equals("/movimentaritem")) {
				System.out.println("Movimentando o bem.");
				mensagem.setText("Qual bem deseja movimentar?");
				/**
				 * falta implementar
				 * estado = MaquinaDeEstado.XXXXXXX
				*/
			}
	
			if (comando.equals("/gerarrelatorio")) {
				System.out.println("Gerando relatório.");
				mensagem.setText("Vamos gerar o relatório de bens por local.");
				estado = MaquinaDeEstado.EMITIR_RELATORIO_BENS_POR_LOCAL;
			}
			
			mensagem.setChatId(update.getMessage().getChatId());
	
		}

        try {
            execute(mensagem);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
	}

	public String getBotUsername() {
		return "GerenciadorDePatrimonioBot";
	}

	@Override
	public String getBotToken() {
		return "1013942836:AAGRBW1lPqYE7kfgmVSubWl2NJkhsNuDH0E";
	}
}
