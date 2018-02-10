package core;

import commands.*;
import commands.botanswer.botDev;
import commands.botanswer.botHi;
import listeners.*;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import util.STATIC;

import javax.security.auth.login.LoginException;

public class Main {

    public static JDABuilder builder;

    public static void main(String[] Args) {

        builder = new JDABuilder(AccountType.BOT);

        builder.setToken("Mzc5MjQxNzE1NjgyMjQ2NjU2.DOnL5w.WGoEpUSFLLxGovKSvGqrf8QtyfY");
        builder.setStatus(OnlineStatus.ONLINE);
        builder.setGame(Game.of("Bubble | v" + STATIC.VERSION + " | codet by CrxmeCode"));
        builder.setAutoReconnect(true);

        addListeners();
        addCommands();

        try {
            JDA jda = builder.buildBlocking();
        } catch (LoginException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (RateLimitedException e) {
            e.printStackTrace();
        }

    }

    public static void addCommands() {
        commandHandler.commands.put("ping", new cmdPing());
        commandHandler.commands.put("clear", new cmdClear());
        commandHandler.commands.put("dev", new cmdDev());
        commandHandler.commands.put("help", new cmdHelp());
        commandHandler.commands.put("däv", new botDev());
    }

    public static void addListeners() {

        builder.addEventListener(new commandListener());
        builder.addEventListener(new readyListener());
        builder.addEventListener(new voiceListener());
        builder.addEventListener(new joinListener());
        builder.addEventListener(new leaveListener());
        builder.addEventListener(new botjoinListener());

    }

}
