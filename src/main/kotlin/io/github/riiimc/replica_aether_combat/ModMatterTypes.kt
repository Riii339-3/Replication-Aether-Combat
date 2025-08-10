package io.github.riiimc.replica_aether_combat

import com.buuz135.replication.ReplicationRegistry
import com.buuz135.replication.api.IMatterType
import net.neoforged.neoforge.registries.DeferredHolder
import net.neoforged.neoforge.registries.DeferredRegister
import net.minecraft.resources.ResourceLocation
import net.neoforged.bus.api.IEventBus


object ModMatterTypes {

    val MATTER_TYPES: DeferredRegister<IMatterType> =
        DeferredRegister.create(ReplicationRegistry.MATTER_TYPES_KEY, Main.ID)

    private val ETHERIO_INSTANCE = EtherioMatterType()

    val ETHERIO: DeferredHolder<IMatterType, IMatterType> =
        MATTER_TYPES.register("etherio") { _: ResourceLocation -> ETHERIO_INSTANCE }

    fun register(bus: IEventBus) {
        MATTER_TYPES.register(bus)
    }
}