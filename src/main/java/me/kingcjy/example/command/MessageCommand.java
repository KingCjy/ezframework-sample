package me.kingcjy.example.command;

import me.kingcjy.ezframework.annotations.*;
import org.bukkit.Bukkit;

@GenerateHelpCommand
@EzCommand("message")
public class MessageCommand {

    @Command("send <message>")
    @Description("전체 플레이어에게 메세지를 보냅니다.")
    public void broadcastMessage(@PathVariable String message) {
        Bukkit.broadcastMessage(message);
    }
}
