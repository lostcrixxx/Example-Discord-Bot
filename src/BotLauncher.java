import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.util.EnumSet;

public class BotLauncher extends ListenerAdapter {

    public static JDA jda;
    public static void main (String[] args){

        jda = JDABuilder.create(Config.KEY_TOKEN, EnumSet.allOf(GatewayIntent.class)).build();

        jda.addEventListener(new Commands());

    }
}
