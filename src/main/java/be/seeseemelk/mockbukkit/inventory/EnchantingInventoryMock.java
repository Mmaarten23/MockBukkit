package be.seeseemelk.mockbukkit.inventory;

import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

/**
 * created on 02/08/2021 by Mmaarten. Project: MockBukkit-1.17
 */
public class EnchantingInventoryMock extends InventoryMock
{
	public EnchantingInventoryMock(InventoryHolder holder) {
		super(holder, InventoryType.ENCHANTING);
	}

	@Override
	@NotNull
	public Inventory getSnapshot() {
	Inventory inventory = new EnchantingInventoryMock(getHolder());
		inventory.setContents(getContents());
		return inventory;
	}
}
