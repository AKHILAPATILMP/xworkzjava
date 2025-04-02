package com.xworkz.isarelation.stock;
    public class EquityStock extends Stock {
        public EquityStock() {
            super();
            System.out.println("EquityStock constructor is running");
        }

        public void dividendPayout() {
            System.out.println("EquityStock: Receiving dividend payouts...");
        }

        public void shortSelling() {
            System.out.println("EquityStock: Engaging in short selling...");
        }

        public void marginTrading() {
            System.out.println("EquityStock: Trading stocks on margin...");
        }

        public void IPOInvestment() {
            System.out.println("EquityStock: Investing in IPOs...");
        }

        public void portfolioDiversification() {
            System.out.println("EquityStock: Diversifying stock portfolio...");
        }
    }

