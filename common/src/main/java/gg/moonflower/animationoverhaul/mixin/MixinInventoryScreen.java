package gg.moonflower.animationoverhaul.mixin;

import gg.moonflower.animationoverhaul.access.LivingEntityAccess;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InventoryScreen.class)
public class MixinInventoryScreen {
    @Inject(method = "renderEntityInInventory", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/EntityRenderDispatcher;setRenderShadow(Z)V"))
    private static void setRendererToEntity(int i, int j, int k, float f, float g, LivingEntity livingEntity, CallbackInfo ci){
        ((LivingEntityAccess)livingEntity).setUseInventoryRenderer(true);
    }
}
