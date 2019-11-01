package br.ufrn.imd.lip2.projeto;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class GerenciadorDePatrimonio extends TelegramLongPollingBot {

	public void onUpdateReceived(Update update) {

		String comando = update.getMessage().getText();
		SendMessage mensagem = new SendMessage();
	
		if (comando.equals("/cadastrarlocalizacao")) {

		}

		if (comando.equals("/cadastrarcategoria")) {

		}

		if (comando.equals("/cadastraritem")) {

		}

		if (comando.equals("/buscaritem")) {

		}

		if (comando.equals("/movimentaritem")) {

		}

		if (comando.equals("/gerarrelatorio")) {

		}
		
        mensagem.setChatId(update.getMessage().getChatId());


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
