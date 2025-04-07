package com.xworkz.isarelation.chatbot;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of ChatBot");
        ChatBot bot = new ChatBot();
        bot.greetUser();
        bot.answerQuestion();
        bot.processCommand();
        bot.speak();
        bot.shutdown();

        System.out.println("\nCreating an instance of SmartChatBot using ChatBot reference");
        ChatBot botRef = new SmartChatBot();
        botRef.greetUser();
        botRef.answerQuestion();
        botRef.processCommand();
        botRef.speak();
        botRef.shutdown();

        System.out.println("\nCreating an instance of SmartChatBot using subclass reference");
        SmartChatBot smart = new SmartChatBot();
        smart.greetUser();
        smart.answerQuestion();
        smart.processCommand();
        smart.speak();
        smart.shutdown();
        smart.learnFromUser();

        System.out.println("\nCasting and calling from BotHandler");
        BotHandler handler = new BotHandler();
        handler.handle(bot);      // parent only
        handler.handle(botRef);   // cast and call subclass method
        handler.handle(smart);    // cast and call subclass method
    }
}
