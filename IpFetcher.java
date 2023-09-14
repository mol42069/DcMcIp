package mcip;
		
	import java.net.*;
	import java.io.*;
		
		public class IpFetcher {
			
			String systemipaddress;
			String systemipaddressold;
			
			String getip() {
				systemipaddress = "";
					try{
							URL url_name = new URL("http://ipv4bot.whatismyipaddress.com");
							BufferedReader sc =
							new BufferedReader(new InputStreamReader(url_name.openStream()));
							systemipaddress = sc.readLine().trim();
					}
					catch (Exception e){
							systemipaddress = null;
					}
					return systemipaddress;
			}
			boolean ipnew() {
				if(systemipaddress.equals(systemipaddressold)) {
					systemipaddressold = systemipaddress;
					return false;
				}else {
					systemipaddressold = systemipaddress;
					return true;
				}
			}
		}