package io.org.texttitle.marcus.text;

import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import io.org.texttitle.marcus.TextTitle;

public class BarShow {
	private String name;
	private String title;
	private BarColor barcolor;
	private BarStyle barstyle;
	private BarFlag barflag;
	private Player player;
	private Double progress;
	public BarShow(String name,Player p) {
		this.name = name;
		this.player = p;
	}
	public String getName() {
		return name;
	}
	public Double getProgress() {
		return progress;
	}
	public BarFlag getFlag() {
		// TODO Auto-generated method stub
		return barflag;
	}
	public BarStyle getStyle() {
		// TODO Auto-generated method stub
		return barstyle;
	}
	public BarColor getColor() {
		// TODO Auto-generated method stub
		return barcolor;
	}
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}
	public Player getPlayer() {
		return player;
	}
	
	public void buildBB() {
		TextTitle.plugin.getServer().getScheduler().scheduleSyncRepeatingTask(TextTitle.plugin, new Runnable() {

			@Override
			public void run() {
				
				BossBar bb = Bukkit.createBossBar(getTitle(), getColor(), getStyle(), null);
				bb.addPlayer(getPlayer());
				bb.setProgress(getProgress());
				
			}
			
		},0,10);
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setProgress(Double d) {
		this.progress = d;
	}
	public void setColor(BarColor bc) {
		this.barcolor = bc;
	}
	public void setStyle(BarStyle bs) {
		this.barstyle = bs;
	}
	public void setFlag(BarFlag flag) {
		this.barflag = flag;
	}
}
