package me.kingcjy.test;

import me.kingcjy.ezframework.EzFramework;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        EzFramework.run(this);
    }
}
