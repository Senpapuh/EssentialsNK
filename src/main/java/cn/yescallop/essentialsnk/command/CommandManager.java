package cn.yescallop.essentialsnk.command;

import cn.nukkit.command.CommandMap;
import cn.yescallop.essentialsnk.EssentialsAPI;
import cn.yescallop.essentialsnk.command.defaults.*;
import cn.yescallop.essentialsnk.command.defaults.home.DelHomeCommand;
import cn.yescallop.essentialsnk.command.defaults.home.HomeCommand;
import cn.yescallop.essentialsnk.command.defaults.home.SetHomeCommand;
import cn.yescallop.essentialsnk.command.defaults.teleport.*;
import cn.yescallop.essentialsnk.command.defaults.warp.DelWarpCommand;
import cn.yescallop.essentialsnk.command.defaults.warp.SetWarpCommand;
import cn.yescallop.essentialsnk.command.defaults.warp.WarpCommand;

public class CommandManager {

    public static void registerAll(EssentialsAPI api) {
        CommandMap map = api.getServer().getCommandMap();
        map.register("EssentialsNK", new EssentialsCommand(api));

        map.register("EssentialsNK", new ClearInventoryCommand(api));
        map.register("EssentialsNK", new FlyCommand(api));
        map.register("EssentialsNK", new RepairCommand(api));
        map.register("EssentialsNK", new VanishCommand(api));
        map.register("EssentialsNK", new WhoisCommand(api));
    }
}
