package com.Shanwer;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

public class Main extends PluginBase implements Listener {
    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new Main(), this);
        this.getLogger().warning(TextFormat.GREEN + "GetItemID Enabled!Author:Shanwer");

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isPlayer()) {
            sender.sendMessage(TextFormat.colorize("&3&b 物品ID：" + ((Player) sender).getInventory().getItemInHand()));
            return true;
        } else {
            sender.sendMessage(TextFormat.colorize("请以玩家身份使用该指令！"));
            return true;
        }
    }
}