package com.github.pocketkid2.mvp;

import org.bukkit.plugin.java.JavaPlugin;

public class MVPlugin extends JavaPlugin {

	@Override
	public void onEnable() {
		getLogger().info("Done!");
	}

	@Override
	public void onDisable() {
		getLogger().info("Done!");
	}
}
