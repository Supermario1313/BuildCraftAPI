package buildcraft.api.items;

import javax.annotation.Nullable;

import net.minecraft.item.ItemStack;

public interface INamedItem {
    String getName(@Nullable ItemStack stack);

    boolean setName(@Nullable ItemStack stack, String name);
}
