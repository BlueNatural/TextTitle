package io.org.texttitle.marcus.text;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.boss.BossBar;

public class BarManager {
	public static List<BarShow> list = new ArrayList<>();
	
	public static void add(BarShow bs) {
		list.add(bs);
	}
	public static void delete(String name) {
		int i = 0;
		for(int integer = 0;i < list.size();i++) {
			if(list.get(integer).getName().equals(name)) {
			 i = integer;
			}
		}
		list.remove(i);
	}
    public static BarShow getName(String name) {
    	BarShow bs = null;
    	for(int i = 0;i <list.size();i++) {
    		if(list.get(i).getName().equals(name)) {
    			bs = list.get(i);
    			return bs;
    		}
    	}
		return bs;
    }
    public static boolean checkIfExists(BarShow bs) throws NullException {
       if(list.contains(bs)) {
    	   return true;
       }else {
    	   return false;
       }
    }

}
