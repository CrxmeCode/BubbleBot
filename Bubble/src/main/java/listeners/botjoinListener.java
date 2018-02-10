package listeners;

import net.dv8tion.jda.core.events.guild.GuildJoinEvent;
import net.dv8tion.jda.core.events.guild.GuildLeaveEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class botjoinListener extends ListenerAdapter {

    @Override
    public void onGuildJoin(GuildJoinEvent event) {
        event.getGuild().getTextChannels().get(0).sendMessage(
                ":wave: Hallo! Ich bin Bubble. Wir werden viel Spaß haben! \nIch wurde von <@343135399474102273> entwickelt."
        ).queue();
    }

    @Override
    public void onGuildLeave(GuildLeaveEvent event) {
        event.getGuild().getTextChannels().get(0).sendMessage(
                ":wave: Es ist Zeit, zugehen wenn es am schönsten ist...\nTschüss **" + event.getGuild().getName() + "**!"
        ).queue();
    }
}
