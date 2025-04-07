package com.xworkz.isarelation.chatbot;

public class BotHandler {

    public void handle(ChatBot bot) {
        bot.greetUser();
        bot.answerQuestion();
        bot.processCommand();
        bot.speak();
        bot.shutdown();

        if (bot instanceof SmartChatBot) {
            System.out.println("Casting: ChatBot is instance of SmartChatBot");
            SmartChatBot smart = (SmartChatBot) bot;
            smart.learnFromUser();
        }
    }
}
