package io.github.teamgalacticraft.galacticraft.world.gen.chunk;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.chunk.ChunkGeneratorType;

public class GalacticraftChunkGeneratorTypes {

    public static final ChunkGeneratorType<MoonChunkGeneratorConfig, MoonChunkGenerator> MOON = Registry.register(Registry.CHUNK_GENERATOR_TYPE, "galacticraft-rewoven:moon", new ChunkGeneratorType<>(null, true, MoonChunkGeneratorConfig::new));

    public static void init() {}
}
