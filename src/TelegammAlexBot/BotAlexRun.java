package TelegammAlexBot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class BotAlexRun extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {


    }

    @Override
    public String getBotUsername() {
        return "AlexBot";
    }
    @Override
    public String getBotToken(){
        return "AAE5KJON98nAclSqkJSty5Bi5F0wyiHTCbY";
    }
}
