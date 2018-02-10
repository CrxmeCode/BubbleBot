package listeners;

import net.dv8tion.jda.core.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class joinListener extends ListenerAdapter {

    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent event) {
        event.getGuild().getTextChannelsByName("willkommen", true).get(0).sendMessage(
                ":notebook: Hey, **" + event.getMember().getUser().getAsMention() + "**! \nHerzlich Willkommen auf dem **" + event.getGuild().getName() + "** Server! Wir wünschen dir, viel Spaß! :)"
        ).queue();
    }
}
