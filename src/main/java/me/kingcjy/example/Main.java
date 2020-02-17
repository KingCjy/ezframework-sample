package me.kingcjy.example;

import me.kingcjy.ezframework.EzFramework;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
//    플러그인 활성화
    @Override
    public void onEnable() {
//        프레임워크 초기화
        EzFramework.run(this);
    }
}
