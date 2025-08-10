package io.github.riiimc.replica_aether_combat

import net.neoforged.fml.common.Mod
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS

@Mod(Main.ID)
object Main {
    const val ID = "replica_aether_combat"

    init {
        ModMatterTypes.register(MOD_BUS)
    }
}
