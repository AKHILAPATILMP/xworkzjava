package com.xworkz.isarelation.chatbot;
public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating an instance of ChatBot");
        ChatBot chatBot = new ChatBot();
        chatBot.greetUser();
        chatBot.answerQuery();
        chatBot.logInteraction();
        chatBot.endChat();

        System.out.println("\nCreating an instance of AIChatBot using ChatBot reference");
        ChatBot botRef = new AIChatBot();
        botRef.greetUser();
        botRef.answerQuery();
        botRef.logInteraction();
        botRef.endChat();

        System.out.println("\nCreating an instance of AIChatBot using subclass reference");
        AIChatBot aiChatBot = new AIChatBot();
        aiChatBot.greetUser();
        aiChatBot.answerQuery();
        aiChatBot.logInteraction();
        aiChatBot.endChat();
    }
}
