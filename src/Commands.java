import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        String[] args = event.getMessage().getContentRaw().split(" ");

        if(args[0].equalsIgnoreCase("!" + "teste")){
            event.getMessage().reply("Teste feito com sucesso!").queue();
        }
    }
}
