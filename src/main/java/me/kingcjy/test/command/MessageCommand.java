package me.kingcjy.test.command;

import me.kingcjy.ezframework.annotations.*;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;

@GenerateHelpCommand
@EzCommand("message")
public class MessageCommand {
    @Command("send <playerName> <message>")
    @Description("플레이어에게 메세지를 보냅니다.")
    public void messageToPlayer(@PathVariable String playerName, @PathVariable String message) {
        Player player = Bukkit.getPlayer(playerName);

        if(player != null) {
            player.sendMessage(message);
        }
    }

    @Command("broadcast <message>")
    @Description("전체에게 메세지를 보냅니다.")
    public void broadcastMessage(@PathVariable String message) {
        Bukkit.broadcastMessage(message);
    }
}
