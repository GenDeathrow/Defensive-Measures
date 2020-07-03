package defensive_measures.init;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

public class ModNetwork {
	
	public static final ResourceLocation CHANNEL_NAME = new ResourceLocation(ModReference.ModID, "network");
	
	public static final String NETWORK_VERSION = new ResourceLocation(ModReference.ModID, "1").toString();
	
	public static SimpleChannel getNetworkChannel() {
		
		final SimpleChannel channel = NetworkRegistry.ChannelBuilder.named(CHANNEL_NAME)
				.clientAcceptedVersions(version -> true)
				.serverAcceptedVersions(version -> true)
				.networkProtocolVersion(() -> NETWORK_VERSION)
				.simpleChannel();
	
		
//		my old crap for reference
//		channel.messageBuilder(PacketEnviroProperty.class, 1)
//				.decoder(PacketEnviroProperty::decode)
//				.encoder(PacketEnviroProperty::encode)
//				.consumer(PacketEnviroProperty::handle)
//				.add();
		
//		channel.messageBuilder(Hydration_Packets.class, 2)
//				.decoder(Hydration_Packets::decode)
//				.encoder(Hydration_Packets::encode)
//				.consumer(Hydration_Packets::handle)
//				.add();
//
//		channel.messageBuilder(FluidTankContentsMessage.class, 2)
//				.decoder(FluidTankContentsMessage::decode)
//				.encoder(FluidTankContentsMessage::encode)
//				.consumer(FluidTankContentsMessage::handle)
//				.add();
		
		
		return channel;
	}
}
