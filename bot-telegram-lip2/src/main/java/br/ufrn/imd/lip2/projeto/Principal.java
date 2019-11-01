package br.ufrn.imd.lip2.projeto;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Principal {
	public static void main(String[] args) {
		
		ApiContextInitializer.init();		
		TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
		
		try {
			telegramBotsApi.registerBot(new GerenciadorDePatrimonio());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}
}