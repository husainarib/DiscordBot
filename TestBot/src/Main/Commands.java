package Main;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter
{
	public void onGuildMessageReceived(GuildMessageReceivedEvent event)
	{
		String[] message = event.getMessage().getContentRaw().split(" ");
		
		if(message[0].equalsIgnoreCase("!help") && message.length == 1)
		{
			EmbedBuilder em = new EmbedBuilder();
			em.setTitle("COMMANDS!");
			em.setColor(36);
			em.addField("To calculate:","Type \" !calculate \"", true);
			em.addField("To invite a user:", "Type \"!invite\"", true);
			em.addField("To get motivated:", "Type \" !affirmations \"", true);
			em.setFooter("Have a great day :]", event.getGuild().getIconUrl());
			event.getChannel().sendMessage(em.build()).queue();		

			
		}
	}
}
