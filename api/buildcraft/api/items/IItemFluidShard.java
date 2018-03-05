package buildcraft.api.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.item.ItemStack;

import net.minecraftforge.fluids.FluidStack;

public interface IItemFluidShard {
    void addFluidDrops(List<ItemStack> toDrop, @Nullable FluidStack fluid);
}
