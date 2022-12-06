package com.midel.schedulebott.command;

/**
 * Enumeration for {@link Command}'s.
 */
public enum CommandName {

    TEST("/test"),
    START("/start"),
    MENU("/menu"),
    HELP("/help"),
    ADMIN_HELP("/ahelp"),
    NO("no_command"),
    UNKNOWN("unknown"),
    SWITCH_SCHEDULE("/switchschedule"),
    SWITCH_DEBUG("/switchdebug"),
    GET_LESSON("/getlesson"),
    GET_SCHEDULE_FOR("/schedulefor"),
    SEND_MESSAGE("/sendmessage"),
    GET_SCHEDULE_USER("/розклад"),
    TEST_SCHEDULE("/scheduletest"); // toDo староста


    private final String commandName;

    CommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }

}