package listeners;

import net.dv8tion.jda.core.events.guild.member.GuildMemberLeaveEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class leaveListener extends ListenerAdapter {

    @Override
    public void onGuildMemberLeave(GuildMemberLeaveEvent event) {
        event.getGuild().getTextChannelsByName("willkommen", true).get(0).sendMessage(
                ":x: Hey, **" + event.getMember().getUser().getName() + "**! \nHat uns leider verlassen. Wir wünschen ihm, weiterhin noch viel Spaß! :)"
        ).queue();
    }
}
