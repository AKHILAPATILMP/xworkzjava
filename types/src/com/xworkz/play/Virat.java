package com.xworkz.play;

import com.xworkz.clip.Clip;
import com.xworkz.ticket.Cricket;
import com.xworkz.ticket.Ticket;

 class Virat {
    Brush brush;
    Clip[] clips;
    Ticket ticket;
    Cricket cricket;
    Virat(Brush brush, Clip[] clips, Ticket ticket, Cricket cricket) {
        this.brush = brush;
        this.clips = clips;
        this.ticket = ticket;
        this.cricket = cricket;
    }

    void play() {
        cricket.watch();
        cricket.profit();
    }

    void clean() {
        brush.clean();
        brush.scrub();
    }

    void relax() {
        ticket.buy();
        ticket.sell();
    }

    void useClips() {
        for (Clip clip : clips) {
            clip.hold();
        }
    }
}
