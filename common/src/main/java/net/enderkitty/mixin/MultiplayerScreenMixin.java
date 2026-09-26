package net.enderkitty.mixin;

import net.enderkitty.ReloadServerList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.sounds.SoundEvents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(JoinMultiplayerScreen.class)
public abstract class MultiplayerScreenMixin {
    @Shadow protected abstract void refreshServerList();

    @Inject(method = "keyPressed", at = @At(value = "HEAD"))
    private void reloadKey(KeyEvent event, CallbackInfoReturnable<Boolean> cir) {
        if (ReloadServerList.REFRESH.matches(event) && event.hasControlDown()) {
            this.refreshServerList();
            Minecraft.getInstance().getSoundManager().play(SimpleSoundInstance.forUI(SoundEvents.UI_BUTTON_CLICK, 1.0f));
        }
    }
    
    @Inject(method = "keyPressed", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screens/multiplayer/JoinMultiplayerScreen;refreshServerList()V"))
    private void f5MakeNoise(KeyEvent event, CallbackInfoReturnable<Boolean> cir) {
        Minecraft.getInstance().getSoundManager().play(SimpleSoundInstance.forUI(SoundEvents.UI_BUTTON_CLICK, 1.0f));
    }
}
