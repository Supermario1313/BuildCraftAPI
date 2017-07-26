package buildcraft.api.items;

import javax.annotation.Nullable;

import net.minecraft.item.ItemStack;

public interface IList extends INamedItem {
    boolean matches(@Nullable ItemStack stackList, @Nullable ItemStack item);
}
