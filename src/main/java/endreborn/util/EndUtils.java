package endreborn.util;

import net.minecraft.item.ItemStack;

public class EndUtils 
{
	public static ItemStack copyStackWithAmount(ItemStack stack, int amount)
	{
		if(stack.isEmpty())
			return ItemStack.EMPTY;
		ItemStack s2 = stack.copy();
		s2.setCount(amount);
		return s2;
	}
}
