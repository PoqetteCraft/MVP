package com.github.pocketkid2.mvp;

import org.bstats.bukkit.MetricsLite;
import org.bukkit.plugin.java.JavaPlugin;

public class MVPlugin extends JavaPlugin {

	@Override
	public void onEnable() {
		MetricsLite metrics = new MetricsLite(this);
		getLogger().info("Done!");
	}

	@Override
	public void onDisable() {
		getLogger().info("Done!");
	}
}
