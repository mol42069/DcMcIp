package mcip;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Console {
		
		public static JDA jda;
	public static void main(String[] args) {
		
		try {
			jda = JDABuilder.createDefault("HERE YOUR DISCORD TOKEN").build();
		} catch (LoginException e) {
			System.out.println("token ist falsch!!!!");
		}
//		IpFetcher ipf = new IpFetcher();
//		ipf.systemipaddressold = "0";
		
		jda.addEventListener(new Commands());
		
		
		
			
	}

}
