package com.xworkz.isarelation.chatbot;

public class SmartChatBot extends ChatBot {

    public SmartChatBot() {
        super();
        System.out.println("SmartChatBot constructor is running - subclass");
    }

    @Override
    public void greetUser() {
        System.out.println("Hi there! I'm your virtual assistant - subclass");
    }

    @Override
    public void answerQuestion() {
        System.out.println("Answering question using AI knowledge base - subclass");
    }

    @Override
    public void processCommand() {
        System.out.println("Executing smart command with automation - subclass");
    }

    @Override
    public void speak() {
        System.out.println("Speaking with natural voice synthesis - subclass");
    }

    @Override
    public void shutdown() {
        System.out.println("SmartChatBot shutting down with system logs - subclass");
    }

    public void learnFromUser() {
        System.out.println("SmartChatBot is learning from user input - only in subclass");
    }
}
