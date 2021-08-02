package be.seeseemelk.mockbukkit.inventory;

import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

/**
 * created on 02/08/2021 by Mmaarten. Project: MockBukkit-1.17
 */
public class BlastFurnaceInventoryMock extends InventoryMock
{
	public BlastFurnaceInventoryMock(InventoryHolder holder) {
		super(holder, InventoryType.BLAST_FURNACE);
	}

	@Override
	@NotNull
	public Inventory getSnapshot() {
		Inventory inventory = new BlastFurnaceInventoryMock(getHolder());
		inventory.setContents(getContents());
		return inventory;
	}
}
