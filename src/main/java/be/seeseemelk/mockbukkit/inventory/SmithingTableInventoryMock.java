package be.seeseemelk.mockbukkit.inventory;

import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

/**
 * created on 02/08/2021 by Mmaarten. Project: MockBukkit-1.17
 */
public class SmithingTableInventoryMock extends InventoryMock
{
	public SmithingTableInventoryMock(InventoryHolder holder) {
		super(holder, InventoryType.SMITHING);
	}

	@Override
	@NotNull
	public Inventory getSnapshot() {
		Inventory inventory = new SmithingTableInventoryMock(getHolder());
		inventory.setContents(getContents());
		return inventory;
	}
}
