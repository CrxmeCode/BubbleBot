package listeners;

import net.dv8tion.jda.core.events.guild.voice.GuildVoiceJoinEvent;
import net.dv8tion.jda.core.events.guild.voice.GuildVoiceLeaveEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class voiceListener extends ListenerAdapter {

    @Override
    public void onGuildVoiceJoin(GuildVoiceJoinEvent event) {
        event.getGuild().getTextChannelsByName("botlog", true).get(0).sendMessage(
                "[ " + event.getVoiceState().getMember().getJoinDate().getDayOfMonth() + " / " + event.getVoiceState().getMember().getJoinDate().getDayOfWeek() + " / " + event.getVoiceState().getMember().getJoinDate().getYear() + " ]"
                + " Der User **" + event.getVoiceState().getMember().getUser().getName() + "** hat **" + event.getChannelJoined().getName() + "** betreten."
                + " Das UserLimit liegt bei: **" + event.getChannelJoined().getUserLimit() + "**"
        ).queue();
    }

    @Override
    public void onGuildVoiceLeave(GuildVoiceLeaveEvent event) {
        event.getGuild().getTextChannelsByName("botlog", true).get(0).sendMessage(
                "[ " + event.getVoiceState().getMember().getJoinDate().getDayOfMonth() + " / " + event.getVoiceState().getMember().getJoinDate().getDayOfWeek() + " / " + event.getVoiceState().getMember().getJoinDate().getYear() + " ]"
                        + " Der User **" + event.getVoiceState().getMember().getUser().getName() + "** hat **" + event.getChannelLeft().getName() + "** verlassen."
        ).queue();
    }
}
