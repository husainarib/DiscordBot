package commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Greetings extends ListenerAdapter         
{
	public void onGuildMessageReceived(GuildMessageReceivedEvent event)
	{
		String[] message = event.getMessage().getContentRaw().split(" ");
		
		if(message.length == 1)
		{
			if(message[0].equalsIgnoreCase("!hi") || message[0].equals("!hello"))
			{
				if(!event.getAuthor().isBot())
				{
					event.getChannel().sendMessage("Hello " + event.getAuthor().getName()).queue();
				}
			}
			else if(message[0].equalsIgnoreCase("!bye") || message[0].equals("!Goodbye"))
			{
				if(!event.getAuthor().isBot())
				{
					event.getChannel().sendMessage("See you soon " + event.getAuthor().getName()).queue();
				}
			}
		}
	}

}
