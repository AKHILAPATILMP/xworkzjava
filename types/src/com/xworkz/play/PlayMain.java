package com.xworkz.play;

import com.xworkz.clip.Clip;
import com.xworkz.ticket.Cricket;
import com.xworkz.ticket.Ticket;
import com.xworkz.ticket.TicketType;

class PlayMain {
    public static void main(String[] args) {
        // Creating brush
        Brush myBrush = new Brush(BrushColor.BLUE);

        // Creating an array of clips
        Clip[] clips = {
                new Clip("Red"),
                new Clip("Blue"),
                new Clip("Green"),
                new Clip("Yellow"),
                new Clip("Black")
        };

        // Creating ticket and cricket
        Ticket myTicket = new Ticket(TicketType.VIP, 500);
        Cricket myCricket = new Cricket(myTicket);

        // Creating Virat instance
        Virat virat = new Virat(myBrush, clips, myTicket, myCricket);

        // Using methods
        virat.play();
        virat.clean();
        virat.relax();
        virat.useClips();
    }
}