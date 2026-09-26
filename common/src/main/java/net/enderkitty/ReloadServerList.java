package net.enderkitty;

import dev.architectury.registry.client.keymappings.KeyMappingRegistry;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;

public class ReloadServerList {
    public static final String MOD_ID = "reload_server_list";
    private static final KeyBinding.Category CATEGORY = KeyBinding.Category.create(Identifier.of(MOD_ID, "reload_server_list"));
    
    public static final KeyBinding REFRESH = new KeyBinding(
            "key.reload_server_list.refresh",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_R,
            CATEGORY
    );
    
    public static void init() {
        KeyMappingRegistry.register(REFRESH);
    }
}
