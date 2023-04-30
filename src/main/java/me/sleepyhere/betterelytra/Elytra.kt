package me.sleepyhere.betterelytra

import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.ShapedRecipe
import org.bukkit.plugin.java.JavaPlugin



class Elytra : JavaPlugin() {
    @Override
    override fun onEnable() {
        logger.info("Better Elytra Enabled.")
        var elytra = ItemStack(Material.ELYTRA, 2)
        var key = NamespacedKey(this, "Elytra")
        var recipe = ShapedRecipe(key, elytra)

        recipe.shape("DED", "LSL", "LSL")
        recipe.setIngredient('D', Material.DIAMOND_BLOCK)
        recipe.setIngredient('E', Material.ELYTRA)
        recipe.setIngredient('L', Material.LEATHER)
        recipe.setIngredient('S', Material.STICK)

        Bukkit.addRecipe(recipe)
/*
        fun onListening(listener: Listener) {
            server.pluginManager.registerEvents(listener, this)
            class MyListener : Listener {
                @EventHandler
                fun onPlayerJoin(event: EntityPickupItemEvent?) {
                    if (event != null) {
                        if(event.entityType == EntityType.PLAYER) {
                            var elytra = ItemStack(Material.ELYTRA)
                            if(event.item == elytra) {
                                val p = event.entity as Player
                                p.discoverRecipe(key)
                            }
                        }  PS: CODE NOT WORKING AWAITING FIXING SO JUST A COMMENT FOR NOW :)

                    }
                }
            }
        }*/
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("Disabling . . . BYEEEEEEEEE")
    }
}