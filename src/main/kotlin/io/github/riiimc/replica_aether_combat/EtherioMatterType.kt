package io.github.riiimc.replica_aether_combat

import com.buuz135.replication.api.IMatterType
import java.util.function.Supplier

class EtherioMatterType : IMatterType {
    override fun getName(): String = "etherio"

    override fun getColor(): Supplier<FloatArray> = Supplier {
        floatArrayOf(64f / 256f, 200f / 256f, 255f / 256f, 1f)
    }

    override fun getMax(): Int = 64
}
