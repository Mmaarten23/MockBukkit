package be.seeseemelk.mockbukkit.inventory;

import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

/**
 * created on 02/08/2021 by Mmaarten. Project: MockBukkit-1.17
 */
public class AnvilInventoryMock extends InventoryMock
{
	public AnvilInventoryMock(InventoryHolder holder) {
		super(holder, InventoryType.ANVIL);
	}

	@Override
	@NotNull
	public Inventory getSnapshot() {
		Inventory inventory = new AnvilInventoryMock(getHolder());
		inventory.setContents(getContents());
		return inventory;
	}
}
