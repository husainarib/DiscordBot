package commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class InviteCommand extends ListenerAdapter
{
	public void onGuildMessageReceived(GuildMessageReceivedEvent e)
	{
		String[] message = e.getMessage().getContentRaw().split(" ");
		
		if(message[0].equalsIgnoreCase("!invite") && message.length == 1)
		{
			e.getMessage().reply("To invite a user, type the command \" !invite create \"").queue();
		}
		else if(message.length >= 2 && message[0].equalsIgnoreCase("!invite") & message[1].equalsIgnoreCase("create"))
		{
			e.getMessage().reply(e.getAuthor().getName() + " created an invite!").queue();
			e.getMessage().reply("Send them this invite link: " + e.getChannel().createInvite().complete().getUrl()).queue();;
		}
	}
}
