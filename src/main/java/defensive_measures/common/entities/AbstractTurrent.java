package defensive_measures.common.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.IInventoryChangedListener;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.IPacket;
import net.minecraft.util.HandSide;
import net.minecraft.world.World;

public class AbstractTurrent extends LivingEntity implements IInventoryChangedListener {

	protected Inventory ammoBox;
	// private net.minecraftforge.common.util.LazyOptional<?> itemHandler = null;
	
	
	public AbstractTurrent(EntityType<? extends LivingEntity> type, World worldIn) {
		super(type, worldIn);
	}


	@Override
	protected void registerData() {

	}

	protected int getInventorySize() {
		return 2;
	}

	// protected void initAmmoBox() {
	// Inventory inventory = this.ammoBox;
	// this.ammoBox = new Inventory(this.getInventorySize());
	// if (inventory != null) {
	// inventory.removeListener(this);
	// int i = Math.min(inventory.getSizeInventory(),
	// this.ammoBox.getSizeInventory());
	//
	// for(int j = 0; j < i; ++j) {
	// ItemStack itemstack = inventory.getStackInSlot(j);
	// if (!itemstack.isEmpty()) {
	// this.ammoBox.setInventorySlotContents(j, itemstack.copy());
	// }
	// }
	// }
	//
	// this.ammoBox.addListener(this);
	// this.itemHandler = net.minecraftforge.common.util.LazyOptional.of(() -> new
	// net.minecraftforge.items.wrapper.InvWrapper(this.ammoBox));
	// }

	@Override
	public IPacket<?> createSpawnPacket() {
		return null;
	}

	@Override
	public void onInventoryChanged(IInventory arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public Iterable<ItemStack> getArmorInventoryList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack getItemStackFromSlot(EquipmentSlotType slotIn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setItemStackToSlot(EquipmentSlotType slotIn, ItemStack stack) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HandSide getPrimaryHand() {
		// TODO Auto-generated method stub
		return null;
	}

	// @Override
	// public <T> net.minecraftforge.common.util.LazyOptional<T>
	// getCapability(net.minecraftforge.common.capabilities.Capability<T>
	// capability, @Nullable net.minecraft.util.Direction facing) {
	// if (this.isAlive() && capability ==
	// net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY &&
	// itemHandler != null)
	// return itemHandler.cast();
	// return super.getCapability(capability, facing);
	// }
	//
	// @Override
	// public void remove(boolean keepData) {
	// super.remove(keepData);
	// if (!keepData && itemHandler != null) {
	// itemHandler.invalidate();
	// itemHandler = null;
	// }
	// }

}
