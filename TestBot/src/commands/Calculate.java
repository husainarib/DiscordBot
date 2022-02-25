package commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Calculate extends ListenerAdapter
{
	public void onGuildMessageReceived(GuildMessageReceivedEvent e)
	{
		String[] messageSent = e.getMessage().getContentRaw().split(" ");

		if(messageSent[0].equalsIgnoreCase("!calculate") && messageSent.length == 1)
		{
			
			e.getMessage().reply("ready to calculate! Type \" !calcuate [add/subtract/multiply/divide] [First Number] [Second Number]").queue();
		}
		else if(messageSent[0].equalsIgnoreCase("!calculate") && messageSent[1].equalsIgnoreCase("add"))
		{
			int num1 = Integer.parseInt(messageSent[2]);
			int num2 = Integer.parseInt(messageSent[3]);
			e.getMessage().reply("The sum of " + num1 + " and " + num2 + " equals to " + (num1 + num2)).queue();
		}
		else if(messageSent[0].equalsIgnoreCase("!calculate") && messageSent[1].equalsIgnoreCase("subtract"))
		{
			int num1 = Integer.parseInt(messageSent[2]);
			int num2 = Integer.parseInt(messageSent[3]);
			e.getMessage().reply("The difference of " + num1 + " and " + num2 + " equals to " + (num1 - num2)).queue();
		}
		else if(messageSent[0].equalsIgnoreCase("!calculate") && messageSent[1].equalsIgnoreCase("multiply"))
		{
			int num1 = Integer.parseInt(messageSent[2]);
			int num2 = Integer.parseInt(messageSent[3]);
			e.getMessage().reply("The product of " + num1 + " and " + num2 + " equals to " + (num1*num2)).queue();
		}
		else if(messageSent[0].equalsIgnoreCase("!calculate") && messageSent[1].equalsIgnoreCase("divide"))
		{
			double num1 = Integer.parseInt(messageSent[2]);
			double num2 = Integer.parseInt(messageSent[3]);
			e.getMessage().reply(num1 + " divided by " + num2 + " equals to " + (num1/num2)).queue();
		}
		
	}
}
