package com.xworkz.isarelation.chatbot;


public class AIChatBot extends ChatBot {

    public AIChatBot() {
        super();
        System.out.println("AIChatBot constructor is running - subclass");
    }

    @Override
    public void greetUser() {
        System.out.println("Hi there! I’m your smart assistant. How can I assist you? - subclass");
    }

    @Override
    public void answerQuery() {
        System.out.println("Using AI to provide accurate responses - subclass");
    }

    @Override
    public void logInteraction() {
        System.out.println("Saving interaction with advanced metadata - subclass");
    }

    @Override
    public void endChat() {
        System.out.println("Session ended. Hope to talk to you soon! - subclass");
    }
}



