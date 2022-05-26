package net.lizistired.animationoverhaul.mixin;

import net.lizistired.animationoverhaul.access.LivingEntityAccess;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Unique
@Mixin(LivingEntity.class)
public abstract class MixinLivingEntity implements LivingEntityAccess {

    @Shadow public abstract void updateTrackedHeadRotation(float f, int i);

    private String songName;
    private boolean songPlaying;
    private BlockPos songOrigin = new BlockPos(0, 0, 0);

    private String equippedArmor = "";

    public boolean useInventoryRenderer = false;

    /*
    public float getAnimationVariable(String variableType){
        return 4F;
    }
    public void setAnimationVariable(String variableType, float newValue){
    }

     */

    public boolean getUseInventoryRenderer(){
        return useInventoryRenderer;
    }

    public void setUseInventoryRenderer(boolean bool){
        useInventoryRenderer = bool;
    }
}
