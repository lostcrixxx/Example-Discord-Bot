import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * @author Cristiano M
 * @created 2023-10-11
 * @modifield 2023-10-14
 */

public class Commands extends ListenerAdapter {

    private final String PREFIX = "!";

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        String[] args = event.getMessage().getContentRaw().split(" ");

        if(args[0].equalsIgnoreCase(PREFIX + "teste")){
            event.getChannel().sendTyping().queue();
            event.getMessage().reply("Teste feito com sucesso!").queue();
        }
    }
}
