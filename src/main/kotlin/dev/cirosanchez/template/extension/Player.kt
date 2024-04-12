package dev.cirosanchez.template.extension

import org.bukkit.entity.Player


fun Player.sendColorizedMessage(message: String) {
    this.sendMessage(message.colorize())
}