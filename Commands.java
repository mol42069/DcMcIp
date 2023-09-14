package mcip;


import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter{
	int i;
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String args = event.getMessage().getContentRaw();
		i = 0;
		
		if(args.equals("ip")) {
			IpFetcher ipf = new IpFetcher();
			String ip = ipf.getip();
			
			if(ip == null) {
				event.getChannel().sendMessage("Irgwas ist broke").queue();
			}else if(ip != null) {
				if(i == 0) {
					String rip = String.format("Ip: %s:25565", ip);
					i = 1;
					event.getChannel().sendMessage(rip);
				}
			}
		}
	}

	
		
	}	