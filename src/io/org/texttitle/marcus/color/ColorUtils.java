package io.org.texttitle.marcus.color;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.ChatColor;

public class ColorUtils {
	public static char COLOR_CHAR = ChatColor.COLOR_CHAR;
	 public static String translateHexColorCodes(String startTag, String endTag, String message)
	    {
	        final Pattern hexPattern = Pattern.compile(startTag + "([A-Fa-f0-9]{6})" + endTag);
	        Matcher matcher = hexPattern.matcher(message);
	        StringBuffer buffer = new StringBuffer(message.length() + 4 * 8);
	        while (matcher.find())
	        {
	            String group = matcher.group(1);
	            matcher.appendReplacement(buffer, COLOR_CHAR + "x"
	                    + COLOR_CHAR + group.charAt(0) + COLOR_CHAR + group.charAt(1)
	                    + COLOR_CHAR + group.charAt(2) + COLOR_CHAR + group.charAt(3)
	                    + COLOR_CHAR + group.charAt(4) + COLOR_CHAR + group.charAt(5)
	                    );
	        }
	        return matcher.appendTail(buffer).toString();
	    }
      public static String colorTranslate(String string) {
    	  return ChatColor.translateAlternateColorCodes('&', string);
      }
      public static List<String> translateLores(List<String> lores){
    	  List<String> lores2 = null;
    	  for(String string: lores) {
    		  colorTranslate(string);
    		  lores2.add(string);
    	  }
    	  return lores2;
      }
}
