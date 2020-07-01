package com.github.alexthe666.rats.client.model;

import com.github.alexthe666.citadel.client.model.AdvancedEntityModel;
import com.github.alexthe666.citadel.client.model.AdvancedModelBox;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRatlanteanSpirit<T extends Entity> extends AdvancedEntityModel<T>{
    public AdvancedModelBox head;
    public AdvancedModelBox snout;
    public AdvancedModelBox leftEar;
    public AdvancedModelBox rightEar;
    public AdvancedModelBox leftEye;
    public AdvancedModelBox rightEye;
    public AdvancedModelBox nose;
    public AdvancedModelBox wisker2;
    public AdvancedModelBox wisker2_1;

    public ModelRatlanteanSpirit() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.nose = new AdvancedModelBox(this, 32, 26);
        this.nose.setRotationPoint(0.0F, -0.6F, -2.1F);
        this.nose.addBox(-0.5F, -0.3F, -1.0F, 1, 1, 2, 0.0F);
        this.rightEar = new AdvancedModelBox(this, 33, 20);
        this.rightEar.setRotationPoint(-1.5F, -0.5F, 0.0F);
        this.rightEar.addBox(-2.0F, -2.0F, 0.0F, 2, 2, 0, 0.0F);
        this.setRotateAngle(rightEar, 0.0F, 0.7853981633974483F, 0.0F);
        this.wisker2 = new AdvancedModelBox(this, 35, 0);
        this.wisker2.setRotationPoint(-1.0F, 0.0F, -1.0F);
        this.wisker2.addBox(-2.5F, -1.5F, 0.0F, 2, 3, 0, 0.0F);
        this.setRotateAngle(wisker2, 0.0F, 0.6108652381980153F, 0.0F);
        this.head = new AdvancedModelBox(this, 22, 20);
        this.head.setRotationPoint(0.0F, 20.0F, 1.0F);
        this.head.addBox(-2.0F, -1.5F, -2.5F, 4, 3, 3, 0.0F);
        this.setRotateAngle(head, 0.18657569703819382F, 0.0F, 0.0F);
        this.snout = new AdvancedModelBox(this, 22, 26);
        this.snout.setRotationPoint(0.0F, 0.5F, -2.5F);
        this.snout.addBox(-1.5F, -1.0F, -2.0F, 3, 2, 2, 0.0F);
        this.rightEye = new AdvancedModelBox(this, 37, 20);
        this.rightEye.setRotationPoint(-2.0F, -0.5F, -1.6F);
        this.rightEye.addBox(-0.5F, -0.7F, -0.5F, 1, 1, 1, 0.0F);
        this.wisker2_1 = new AdvancedModelBox(this, 35, 0);
        this.wisker2_1.mirror = true;
        this.wisker2_1.setRotationPoint(1.0F, 0.0F, -1.0F);
        this.wisker2_1.addBox(0.5F, -1.5F, 0.0F, 2, 3, 0, 0.0F);
        this.setRotateAngle(wisker2_1, 0.0F, -0.6108652381980153F, 0.0F);
        this.leftEar = new AdvancedModelBox(this, 33, 20);
        this.leftEar.mirror = true;
        this.leftEar.setRotationPoint(1.5F, -0.5F, 0.0F);
        this.leftEar.addBox(0.0F, -2.0F, 0.0F, 2, 2, 0, 0.0F);
        this.setRotateAngle(leftEar, 0.0F, -0.7853981633974483F, 0.0F);
        this.leftEye = new AdvancedModelBox(this, 37, 20);
        this.leftEye.setRotationPoint(2.0F, -0.5F, -1.6F);
        this.leftEye.addBox(-0.5F, -0.7F, -0.5F, 1, 1, 1, 0.0F);
        this.snout.addChild(this.nose);
        this.head.addChild(this.rightEar);
        this.snout.addChild(this.wisker2);
        this.head.addChild(this.snout);
        this.head.addChild(this.rightEye);
        this.snout.addChild(this.wisker2_1);
        this.head.addChild(this.leftEar);
        this.head.addChild(this.leftEye);
        this.updateDefaultPose();
    }

    @Override
    public Iterable<ModelRenderer> getParts() {
        return ImmutableList.of(head);
    }

    public void setRotationAngles(Entity rat, float f, float f1, float f2, float f3, float f4) {
        this.resetToDefaultPose();
        float speedIdle = 0.35F;
        float degreeIdle = 0.15F;
        this.faceTarget(f3, f4, 1, head);
        float ulatingScale = 0.9F + (float) Math.sin(f2 * 0.75F) * 0.1F;
        this.swing(this.wisker2, speedIdle, degreeIdle, false, 0, 0, f2, 1);
        this.swing(this.wisker2_1, speedIdle, degreeIdle, true, 0, 0, f2, 1);
        this.flap(this.wisker2, speedIdle, degreeIdle, false, 1, 0, f2, 1);
        this.flap(this.wisker2_1, speedIdle, degreeIdle, false, 1, 0, f2, 1);
        this.walk(this.wisker2, speedIdle, degreeIdle, false, 2, 0, f2, 1);
        this.walk(this.wisker2_1, speedIdle, degreeIdle, false, 2, 0, f2, 1);
        this.nose.setScale(ulatingScale, ulatingScale, ulatingScale);
        this.walk(this.head, speedIdle, degreeIdle, false, 0, 0, f, f1);
        this.faceTarget(f3, f4, 1, head);

    }

    public Iterable<AdvancedModelBox> getAllParts() {
        return ImmutableList.of(this.nose, this.leftEye, this.rightEye, this.head, this.leftEar, this.rightEar, this.snout, this.wisker2_1, this.wisker2);
    }

    public void setRotateAngle(AdvancedModelBox AdvancedModelBox, float x, float y, float z) {
        AdvancedModelBox.rotateAngleX = x;
        AdvancedModelBox.rotateAngleY = y;
        AdvancedModelBox.rotateAngleZ = z;
    }
}
