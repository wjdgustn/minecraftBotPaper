package com.hyonsu.minecraftBotPaper.plugin

import io.github.monun.kommand.kommand
import org.bukkit.plugin.java.JavaPlugin

class MinecraftBotPaperPlugin : JavaPlugin() {
    override fun onEnable() {
        server.pluginManager.registerEvents(MinecraftBotPaperPluginListener(), this)

        println("§aplugin enabled")

        kommand {
            command()
        }
    }
}