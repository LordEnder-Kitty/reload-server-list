package net.enderkitty;

import com.mojang.blaze3d.platform.InputConstants;
import dev.architectury.registry.client.keymappings.KeyMappingRegistry;
import net.minecraft.client.KeyMapping;
import net.minecraft.resources.Identifier;
import org.lwjgl.glfw.GLFW;

public class ReloadServerList {
    public static final String MOD_ID = "reload_server_list";
    private static final KeyMapping.Category CATEGORY = KeyMapping.Category.register(Identifier.fromNamespaceAndPath(MOD_ID, "reload_server_list"));
    
    public static final KeyMapping REFRESH = new KeyMapping(
            "key.reload_server_list.refresh",
            InputConstants.Type.KEYSYM,
            GLFW.GLFW_KEY_R,
            CATEGORY
    );
    
    public static void init() {
        KeyMappingRegistry.register(REFRESH);
    }
}
