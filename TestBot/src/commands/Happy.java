package commands;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Happy extends ListenerAdapter
{
	public void onGuildMessageReceived(GuildMessageReceivedEvent event)
	{
		String[] message = event.getMessage().getContentRaw().split(" ");
		String[] happyQuotes = {"I am successful.", "I am confident.", 
				"I am powerful.", "I am strong.", 
				"I am getting better and better every day.",
				"All I need is within me right now.",
				"I wake up motivated.", "I am an unstoppable force of nature.",
				"I am not defined my by past; I am driven by my future.", 
				"I use obstacles to motivate me to learn and grow." ,"Today will be a productive day." 
				,"I am going to forgive myself and free myself. I deserve to forgive and be forgiven." ,
				"I am healing and strengthening every day." ,
				"My soul radiates from the inside and warms the souls of others" ,
				"Happiness is a choice, and today I choose to be happy." ,
				"I am living with abundance."};
		
		Random rn = new Random();
		int answer = rn.nextInt(15);
		
		if(message[0].equalsIgnoreCase("!affirmations"))
		{
			event.getChannel().sendMessage("\"Say this with me!\"").queue();
			for(int i = answer ; i < happyQuotes.length; i++)
			{
				event.getChannel().sendMessage(happyQuotes[i]).queue();
				break;
			}
		}
	}
}
