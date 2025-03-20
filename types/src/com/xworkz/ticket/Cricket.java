package com.xworkz.ticket;

 public class Cricket {

        Ticket ticket;

         public Cricket(Ticket ticket) {
            this.ticket = ticket;
        }

         public void watch() {
            ticket.buy();
            System.out.println("Watching cricket match");
        }

         public void profit() {
            ticket.sell();
            System.out.println("Made a profit from selling the ticket");
        }
    }


