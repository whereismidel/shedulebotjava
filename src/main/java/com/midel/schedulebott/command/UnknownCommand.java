package com.midel.schedulebott.command;

import com.midel.schedulebott.telegram.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * Unknown {@link Command}.
 */
public class UnknownCommand extends Command {

    public static final String UNKNOWN_MESSAGE = "Не розумію тебе \uD83D\uDE1F, спробуй /help";

    public UnknownCommand(SendMessage sendMessage){
        super(sendMessage);
    }

    @Override
    public void execute(Update update) {
        sendMessage.sendHTMLMessage(update.getMessage().getChatId().toString(), UNKNOWN_MESSAGE);
    }
}