import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.util.EnumSet;

/**
 * @author Cristiano M
 * @created 2023-10-11
 * @modifield 2023-10-14
 */

public class BotLauncher extends ListenerAdapter {

    public static JDA jda;
    public static void main (String[] args) throws InterruptedException {

        jda = JDABuilder.create(Config.KEY_TOKEN, EnumSet.allOf(GatewayIntent.class)).build();
        jda.getPresence().setPresence(Activity.customStatus("Versão 0.0.2"), true);

        jda.addEventListener(new Commands());
        jda.awaitReady();
    }
}
