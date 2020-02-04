package me.kingcjy.test.command;

import me.kingcjy.ezframework.annotations.Command;
import me.kingcjy.ezframework.annotations.CommandService;
import me.kingcjy.ezframework.annotations.PathVariable;
import me.kingcjy.ezframework.executor.CommandArgs;
import me.kingcjy.test.annotations.Sender;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandService("message")
public class MessageCommand {

    @Command("help")
    public void sendMessage(@Sender Player player) {
        player.sendMessage("[Server] -----------------------");
        player.sendMessage("[Server] /message <message>");
        player.sendMessage("[Server] /message <playerName> <message>");
        player.sendMessage("[Server] -----------------------");
    }

    @Command("send <message>")
    public void broadcastMessage(@PathVariable String message) {
        Bukkit.broadcastMessage(message);
    }

    @Command("send <playerName> <message>")
    public void messageToPlayer(@PathVariable String playerName, @PathVariable String message) {
        Player player = Bukkit.getPlayer(playerName);

        if(player != null) {
            player.sendMessage(message);
        }
    }
}
