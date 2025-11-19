package me.neigeuses.nocturnia;
import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;
import me.neigeuses.nocturnia.commands.Staff;
import me.neigeuses.nocturnia.commands.StaffChat;
import me.neigeuses.nocturnia.commands.*;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin  {

    public static final String COLOR_RED = "\u001B[31m";
    public static final String COLOR_RESET = "\u001B[0m";


    @Override
    public void onEnable() {
        System.out.println(" ");
        System.out.println(COLOR_RED + "[NocturiaStaffCore] NocturiaStaffCore is Enable" + COLOR_RESET);
        System.out.println(" ");
        getCommand("staff").setExecutor(new Staff());
        getCommand("staffchat").setExecutor(new StaffChat());
    }
    @Override
    public void onDisable() {
        System.out.println(" ");
        System.out.println(COLOR_RED + "[NocturiaStaffCore] NocturiaStaffCore Core is Disabled" + COLOR_RESET);
        System.out.println(" ");
        this.getServer().getMessenger().unregisterOutgoingPluginChannel(this);
        this.getServer().getMessenger().unregisterIncomingPluginChannel(this);
    }
}
