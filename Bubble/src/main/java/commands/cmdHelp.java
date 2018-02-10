package commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.awt.*;

public class cmdHelp implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        event.getTextChannel().sendMessage(
                new EmbedBuilder().setColor(Color.GREEN).setDescription(":notebook:  **Bubble | Dein Discord-Bot**\n\n:pushpin: **Hey!** Ich bin **Bubble**. Mein Entwickler ist **CrxmeCode**."
                + "\n\n:pushpin:  **Commands**\n\n **- Bubble ping** - Der Bot antwortet mit **'Pong!'**\n **- Bubble dev** - Zeigt den **Developer** von **Bubble** an."
                + "\n **- Bubble clear** - Du musst die Größe der Nachrichten angeben,\n die gelöscht werden sollen.Diese muss zwischen 2 und 100 liegen."
                + "\n **- Bubble help** - Hilft dir vielleicht weiter. ;)"
                + "\n\n:pushpin: **Musik - Commands**\n\n **- Bubble musik play** **URL** - Spielt das **gewählte** **Lied / Playlist**"
                + "\n **- Bubble musik stop** - Bot **verlässt** den Channel.\n **- Bubble musik skip** - **Überspringt** das gerad' spielende Lied.\n **- Bubble musik shuffle** - Wählt ein **zufälliges** Lied aus (Playlist)"
                + "\n **- Bubble musik info** - Zeigt **Informationen** über das gerad' spielende Lied an\n **- Bubble musik queue** - Zeigt die **kommenden** Lieder an (Playlist)"
                + "\n\n:pushpin: **Informationen**\n\n **Der Bot wird fast täglich geupdatet.**"
                + "\n\n\n** Bubble | Dein Discord-Bot**"
                ).build()
        ).queue();
    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return null;
    }
}
