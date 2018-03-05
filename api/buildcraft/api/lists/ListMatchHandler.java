package buildcraft.api.lists;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.item.ItemStack;

public abstract class ListMatchHandler {
    public enum Type {
        TYPE,
        MATERIAL,
        CLASS
    }

    public abstract boolean matches(Type type, @Nullable ItemStack stack, @Nullable ItemStack target, boolean precise);

    public abstract boolean isValidSource(Type type, @Nullable ItemStack stack);

    /** Get custom client examples.
     * 
     * @param type
     * @param stack
     * @return A List (even empty!) if the examples satisfy this handler, null if iteration and .matches should be used
     *         instead. */
    public List<ItemStack> getClientExamples(Type type, @Nullable ItemStack stack) {
        return null;
    }
}
