import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;


public class PatrimonyBot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {

        System.out.println(update.getMessage().getText());
        System.out.println(update.getMessage().getFrom().getFirstName);

        String command = update.getMessage().getText();

        SendMessage message = new SendMessage();

        if (command.equals("/myname")) {

            System.out.println(update.getMessage().getFrom().getFirstName());

            message.setText(update.getMessage().getFrom().getFirstName());

        }

        if (command.equals("/mylastname")) {

            System.out.println(update.getMessage().getFrom().getLastName());

            message.setText(update.getMessage().getFrom().getLastName());

        }

        if (command.equals("/myfullname")) {

            System.out.println(update.getMessage().getFrom().getFirstName() + " " + update.getMessage().getFrom().getLastName());

            message.setText(update.getMessage().getFrom().getFirstName() + " " + update.getMessage().getFrom().getLastName());

        }

        message.setChatId(update.getMessage().getChatId());

        try {
            execute(message);
        } catch (TelegramApiException e){
            e.printStackTrace();
        }

    }

    public String getBotUserName() {
        return "PatrimonyBot";
    }

    public String getBotToken() {
        return "1040890707:AAG7hKxhkO2bU5-Bs6DxZtS_TJvmAHjAMxM";
    }

}
