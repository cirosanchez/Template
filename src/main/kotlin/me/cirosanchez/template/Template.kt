package me.cirosanchez.template

import org.bukkit.plugin.java.JavaPlugin


// TODO: rename class and parent package.
class Template : JavaPlugin() {

    override fun onEnable() {
        this.logger.info("Plugin activated!")
    }
}