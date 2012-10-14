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
		
	}
	public final static class Blocks {
		public static final int WarpGate = 569;
		public static final String WarpGateFriendlyName = "Tachyon Warp Gate";
		public static final String WarpGateName = "eldertrolls.warpGate";

		public static final String TachyonHavesterName = "eldertrolls.tachyonHavester";
		public static final String TachyonFieldGenName = "eldertrolls.tachyonFieldGen";
		
		public static final String TachyonHavesterFriendlyName = "Tachyon Fusion Havester";
		public static final String TachyonFieldGenFriendlyName = "Tachyon Field Generator";

	}
	public final static class Items {
		public static final int TachyonCrystal = 550, ItemTachyonPlate = 551, ItemTachyonExtractor = 552, ItemTachyonFieldGen = 553;
		
		public static final String TachyonCrystalName = "eldertrolls.tachyonCrystal";
		public static final String TachyonCatalystName = "eldertrolls.tachyonCatalyst";
		
		public static final String TachyonCrystalFriendlyName = "Tachyon Crystal";
		public static final String TachyonCatalystFriendlyName = "Tachyon Catalyst";
		
		
	}
	
}
