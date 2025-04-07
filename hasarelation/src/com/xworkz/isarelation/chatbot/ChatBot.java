package com.xworkz.isarelation.chatbot;

public class ChatBot {

    public ChatBot() {
        System.out.println("ChatBot constructor is running - parent class");
    }

    public void greetUser() {
        System.out.println("Hello! How can I help you today? - parent class");
    }

    public void answerQuestion() {
        System.out.println("Answering a basic question - parent class");
    }

    public void processCommand() {
        System.out.println("Processing a command - parent class");
    }

    public void speak() {
        System.out.println("ChatBot is speaking in basic voice - parent class");
    }

    public void shutdown() {
        System.out.println("ChatBot is shutting down - parent class");
    }
}
