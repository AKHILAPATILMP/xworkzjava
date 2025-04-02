package com.xworkz.isarelation.chatbot;

public class Runner {
        public static void main(String[] args) {
            System.out.println("Creating an instance of ChatBot");
            ChatBot chatbot = new ChatBot();
            chatbot.greetUser();
            chatbot.provideInformation();
            chatbot.answerFAQs();
            chatbot.performBasicTasks();
            chatbot.endConversation();

            System.out.println("\nCreating an instance of AIChatBot using ChatBot reference");
            ChatBot chatbotRef = new AIChatBot();
            chatbotRef.greetUser();
            chatbotRef.provideInformation();
            chatbotRef.answerFAQs();
            chatbotRef.performBasicTasks();
            chatbotRef.endConversation();

            System.out.println("\nCreating an instance of AIChatBot using subclass reference");
            AIChatBot aiChatBot = new AIChatBot();
            aiChatBot.greetUser();
            aiChatBot.provideInformation();
            aiChatBot.answerFAQs();
            aiChatBot.performBasicTasks();
            aiChatBot.endConversation();
            aiChatBot.useNaturalLanguageProcessing();
            aiChatBot.providePersonalizedResponses();
            aiChatBot.supportMultipleLanguages();
            aiChatBot.integrateWithAPIs();
            aiChatBot.learnFromConversations();
        }
    }

