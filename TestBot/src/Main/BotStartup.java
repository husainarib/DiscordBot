package Main;


import javax.security.auth.login.LoginException;

import commands.Calculate;
import commands.Greetings;
import commands.Happy;
import commands.InviteCommand;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class BotStartup
{
	public static void main(String[] args) throws LoginException
	{
		JDABuilder jda = JDABuilder.createDefault("OTI5NTEzMTU5ODUxNjY3NTg2.Ydoalg.GUaQ1V1muCSt8C8BddJamXsXj_c");
		jda.setActivity(Activity.listening("to you."));

		jda.setStatus(OnlineStatus.ONLINE);

		jda.addEventListeners(new Commands());
		jda.addEventListeners(new CategoryCreate());
		jda.addEventListeners(new Calculate());
		jda.addEventListeners(new InviteCommand());
		jda.addEventListeners(new Greetings());
		jda.addEventListeners(new Happy());

		jda.build();
	}
}
