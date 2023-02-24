package TelegammAlexBot;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
public class BotAlexRun extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()){
        SendMessage massage = new SendMessage();
        massage.setChatId(update.getMessage().getChatId().toString());
        massage.setText("Привет");
        try{
            execute(massage);
        }catch (TelegramApiException e){
            e.printStackTrace();
        }
    }

    }



    ////////////////////////////////////////////////////////////////////
    @Override
    public String getBotUsername() {
        return "AlexBot";
    }
    @Override
    public String getBotToken(){
        return "5345176381:AAE5KJON98nAclSqkJSty5Bi5F0wyiHTCbY";
    }
}
