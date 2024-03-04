package me.cirosanchez.template

import me.cirosanchez.template.extension.Symbol
import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.plugin.java.JavaPlugin


// TODO: rename class and parent package.
class Template : JavaPlugin() {


    companion object{
        val mm = MiniMessage.miniMessage();
    }

    override fun onEnable() {
        this.logger.info("Plugin activated!")
    }
}