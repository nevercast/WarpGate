package eldertrolls.warpgate.common.core;

import eldertrolls.warpgate.client.core.ClientProxy;

public final class Constants {
	
	public final static class Rendering {
		public static int WARPGATE_RENDER;
		public static final String WARPGATE_TEXTURE = "/eldertrolls/warpgate/client/resources/warpgate.png";
	}
	
	public final static class Reference {
		public static final String MOD_ID = "eldertrolls_warpGate";
		public static final String MOD_NAME = "Warp Gates";
		public static final String MOD_VERSION = "1.0.0.0";
		
		/* ElderTrolls channel will be used for all our mods */
		public static final String NET_CHANNEL = "eldertrolls";
		
		public static final String PROXY_CLIENT = "eldertrolls.warpgate.client.core.ClientProxy";
		public static final String PROXY_SERVER = "eldertrolls.warpgate.common.core.CommonProxy";
		public static final String BLOCKTEXTURE = "/eldertrolls/warpgate/client/resources/blocks.png";
		
	}
	public final static class Blocks {
		public static final int WarpGate = 569;
		public static final int CatalystOre = 570;
		public static final String WarpGateFriendlyName = "Tachyon Warp Gate";
		public static final String WarpGateName = "eldertrolls.warpGate";

		public static final String TachyonHavesterName = "eldertrolls.tachyonHavester";
		public static final String TachyonFieldGenName = "eldertrolls.tachyonFieldGen";
		
		public static final String TachyonHavesterFriendlyName = "Tachyon Fusion Havester";
		public static final String TachyonFieldGenFriendlyName = "Tachyon Field Generator";
		
		public static final int CatalystOreTexture = 0;
		public static final String CatalystOreName = "eldertrolls.catalystOre";
		public static final String CatalystOreFriendlyName = "Tachyon Catalyst Ore" +
				"";

	}
	public final static class Items {
		public static final int TachyonCrystal = 550, TachyonCatalyst = 551, TachyonCrystalCharged = 552;
		
		public static final String TachyonCrystalName = "eldertrolls.tachyonCrystal";
		public static final String TachyonCatalystName = "eldertrolls.tachyonCatalyst";
		
		public static final String TachyonCrystalFriendlyName = "Tachyon Crystal";
		public static final String TachyonCatalystFriendlyName = "Tachyon Catalyst";

		public static final String TextureFile = "/eldertrolls/warpgate/client/resources/items.png";

		public static final int TachyonIngot = 553;

		public static final String TachyonIngotName = "eldertrolls.tachyonIngot";

		public static final String TachyonIngotFriendlyName = "Tachyon Ingot";
		
		
	}
	
}
