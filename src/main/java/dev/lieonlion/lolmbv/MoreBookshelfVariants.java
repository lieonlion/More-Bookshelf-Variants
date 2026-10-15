package dev.lieonlion.lolmbv;

import dev.lieonlion.lolmbv.init.MbvItemInit;
import dev.lieonlion.lolmbv.init.MbvBlockInit;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class MoreBookshelfVariants implements ModInitializer {
    public static final String MODID = "lolmbv";

    @Override
    public void onInitialize() {
        MbvBlockInit.registerBlocks();
        MbvItemInit.registerItems();

        registerFlammableBlocks();
    }

    private void registerFlammableBlocks() {
        FlammableBlockRegistry fire = FlammableBlockRegistry.getDefaultInstance();
        fire.add(MbvBlockInit.SPRUCE_BOOKSHELF, 30, 20);
        fire.add(MbvBlockInit.BIRCH_BOOKSHELF, 30, 20);
        fire.add(MbvBlockInit.JUNGLE_BOOKSHELF, 30, 20);
        fire.add(MbvBlockInit.ACACIA_BOOKSHELF, 30, 20);
        fire.add(MbvBlockInit.DARK_OAK_BOOKSHELF, 30, 20);
        fire.add(MbvBlockInit.MANGROVE_BOOKSHELF, 30, 20);
        fire.add(MbvBlockInit.CHERRY_BOOKSHELF, 30, 20);
        fire.add(MbvBlockInit.PALE_OAK_BOOKSHELF, 30, 20);
        fire.add(MbvBlockInit.BAMBOO_BOOKSHELF, 30, 20);
    }

    public static Identifier asId(String path) {
        return Identifier.fromNamespaceAndPath(MODID, path);
    }
}