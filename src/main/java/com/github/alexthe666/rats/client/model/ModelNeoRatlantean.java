package com.github.alexthe666.rats.client.model;

import com.github.alexthe666.citadel.animation.IAnimatedEntity;
import com.github.alexthe666.citadel.client.model.AdvancedEntityModel;
import com.github.alexthe666.citadel.client.model.AdvancedModelBox;
import com.github.alexthe666.citadel.client.model.ModelAnimator;
import com.github.alexthe666.rats.server.entity.EntityNeoRatlantean;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class ModelNeoRatlantean<T extends EntityNeoRatlantean> extends AdvancedEntityModel<T>{
    public AdvancedModelBox body1;
    public AdvancedModelBox floaty;
    public AdvancedModelBox floatyPivot;
    public AdvancedModelBox body2;
    public AdvancedModelBox tail1;
    public AdvancedModelBox leftThigh;
    public AdvancedModelBox rightThigh;
    public AdvancedModelBox coat1;
    public AdvancedModelBox neck;
    public AdvancedModelBox leftArm;
    public AdvancedModelBox rightArm;
    public AdvancedModelBox coat2;
    public AdvancedModelBox head;
    public AdvancedModelBox snout;
    public AdvancedModelBox leftEar;
    public AdvancedModelBox rightEar;
    public AdvancedModelBox leftEye;
    public AdvancedModelBox rightEye;
    public AdvancedModelBox brain1;
    public AdvancedModelBox nose;
    public AdvancedModelBox wisker2;
    public AdvancedModelBox wisker2_1;
    public AdvancedModelBox brain2;
    public AdvancedModelBox brain3;
    public AdvancedModelBox leftHand;
    public AdvancedModelBox rightHand;
    public AdvancedModelBox tail1_1;
    public AdvancedModelBox leftFoot;
    public AdvancedModelBox rightFoot;
    private ModelAnimator animator;

    public ModelNeoRatlantean() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.rightHand = new AdvancedModelBox(this, 32, 13);
        this.rightHand.setRotationPoint(-0.4F, 2.0F, -0.3F);
        this.rightHand.addBox(-0.5F, 0.0F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rightHand, 0.9599310885968813F, -0.17453292519943295F, 0.08726646259971647F);
        this.brain2 = new AdvancedModelBox(this, 0, 21);
        this.brain2.setRotationPoint(2.0F, -2.0F, -0.5F);
        this.brain2.addBox(-1.5F, -2.0F, -1.5F, 3, 3, 4, 0.0F);
        this.brain1 = new AdvancedModelBox(this, 38, 25);
        this.brain1.setRotationPoint(0.0F, -0.5F, -0.4F);
        this.brain1.addBox(-1.5F, -3.3F, -1.5F, 3, 3, 3, 0.0F);
        this.wisker2 = new AdvancedModelBox(this, 35, 0);
        this.wisker2.setRotationPoint(-1.0F, 0.0F, -1.0F);
        this.wisker2.addBox(-2.5F, -1.5F, 0.0F, 2, 3, 0, 0.0F);
        this.head = new AdvancedModelBox(this, 22, 20);
        this.head.setRotationPoint(0.0F, -0.5F, -1.9F);
        this.head.addBox(-2.0F, -1.5F, -2.5F, 4, 3, 3, 0.0F);
        this.setRotateAngle(head, 1.3089969389957472F, 0.0F, 0.0F);
        this.leftFoot = new AdvancedModelBox(this, 22, 15);
        this.leftFoot.mirror = true;
        this.leftFoot.setRotationPoint(0.0F, 3.0F, 0.5F);
        this.leftFoot.addBox(-0.5F, 0.0F, -3.5F, 1, 1, 4, 0.0F);
        this.leftHand = new AdvancedModelBox(this, 32, 13);
        this.leftHand.mirror = true;
        this.leftHand.setRotationPoint(0.4F, 2.0F, -0.3F);
        this.leftHand.addBox(-0.5F, 0.0F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(leftHand, 0.9599310885968813F, 0.17453292519943295F, -0.08726646259971647F);
        this.body1 = new AdvancedModelBox(this, 0, 0);
        this.body1.setRotationPoint(0.0F, 15.5F, 0.0F);
        this.body1.addBox(-2.5F, -3.0F, 0.0F, 5, 5, 6, 0.0F);
        this.setRotateAngle(body1, -1.5707963267948966F, 0.0F, 0.0F);
        this.neck = new AdvancedModelBox(this, 42, 17);
        this.neck.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.neck.addBox(-1.0F, -1.0F, -1.5F, 2, 3, 2, 0.0F);
        this.setRotateAngle(neck, 0.091106186954104F, 0.0F, 0.0F);
        this.rightThigh = new AdvancedModelBox(this, 22, 9);
        this.rightThigh.setRotationPoint(-2.5F, 0.0F, 4.5F);
        this.rightThigh.addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3, 0.0F);
        this.setRotateAngle(rightThigh, 1.5707963267948966F, 0.0F, 0.0F);
        this.leftArm = new AdvancedModelBox(this, 32, 9);
        this.leftArm.mirror = true;
        this.leftArm.setRotationPoint(2.0F, 1.5F, -3.0F);
        this.leftArm.addBox(0.0F, 0.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(leftArm, 1.3089969389957472F, 0.0F, 0.0F);
        this.rightEye = new AdvancedModelBox(this, 37, 20);
        this.rightEye.setRotationPoint(-2.0F, -0.5F, -1.6F);
        this.rightEye.addBox(-0.5F, -0.7F, -0.5F, 1, 1, 1, 0.0F);
        this.floaty = new AdvancedModelBox(this, -15, 30);
        this.floaty.addBox(-7.5F, 0.0F, -7.5F, 15, 0, 15, 0.0F);
        this.setRotateAngle(floaty, 0.0F, -0.7853981633974483F, 0.0F);
        this.floatyPivot = new AdvancedModelBox(this, 0, 0);
        this.floatyPivot.setRotationPoint(0.0F, 24.5F, 0.0F);
        this.setRotateAngle(floatyPivot, 0.0F, 0.0F, 0.0F);
        this.tail1_1 = new AdvancedModelBox(this, 0, 11);
        this.tail1_1.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail1_1.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F);
        this.setRotateAngle(tail1_1, 0.20943951023931953F, 0.0F, 0.0F);
        this.coat1 = new AdvancedModelBox(this, 31, 31);
        this.coat1.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.coat1.addBox(-4.0F, -3.0F, 0.0F, 8, 6, 8, 0.0F);
        this.leftEye = new AdvancedModelBox(this, 37, 20);
        this.leftEye.setRotationPoint(2.0F, -0.5F, -1.6F);
        this.leftEye.addBox(-0.5F, -0.7F, -0.5F, 1, 1, 1, 0.0F);
        this.leftThigh = new AdvancedModelBox(this, 22, 9);
        this.leftThigh.mirror = true;
        this.leftThigh.setRotationPoint(2.5F, 0.0F, 4.5F);
        this.leftThigh.addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3, 0.0F);
        this.setRotateAngle(leftThigh, 1.5707963267948966F, 0.0F, 0.0F);
        this.rightEar = new AdvancedModelBox(this, 33, 20);
        this.rightEar.setRotationPoint(-1.5F, -0.5F, 0.0F);
        this.rightEar.addBox(-2.0F, -2.0F, 0.0F, 2, 2, 0, 0.0F);
        this.setRotateAngle(rightEar, -0.17453292519943295F, 0.7056366165813075F, -1.3089969389957472F);
        this.rightFoot = new AdvancedModelBox(this, 22, 15);
        this.rightFoot.setRotationPoint(0.0F, 3.0F, 0.5F);
        this.rightFoot.addBox(-0.5F, 0.0F, -3.5F, 1, 1, 4, 0.0F);
        this.leftEar = new AdvancedModelBox(this, 33, 20);
        this.leftEar.mirror = true;
        this.leftEar.setRotationPoint(1.5F, -0.5F, 0.0F);
        this.leftEar.addBox(0.0F, -2.0F, 0.0F, 2, 2, 0, 0.0F);
        this.setRotateAngle(leftEar, -0.17453292519943295F, -0.7853981633974483F, 1.3089969389957472F);
        this.brain3 = new AdvancedModelBox(this, 0, 21);
        this.brain3.setRotationPoint(-2.0F, -2.0F, -0.5F);
        this.brain3.addBox(-1.5F, -2.0F, -1.5F, 3, 3, 4, 0.0F);
        this.nose = new AdvancedModelBox(this, 32, 26);
        this.nose.setRotationPoint(0.0F, -0.6F, -2.1F);
        this.nose.addBox(-0.5F, -0.3F, -1.0F, 1, 1, 2, 0.0F);
        this.wisker2_1 = new AdvancedModelBox(this, 35, 0);
        this.wisker2_1.mirror = true;
        this.wisker2_1.setRotationPoint(1.0F, 0.0F, -1.0F);
        this.wisker2_1.addBox(0.5F, -1.5F, 0.0F, 2, 3, 0, 0.0F);
        this.body2 = new AdvancedModelBox(this, 22, 0);
        this.body2.setRotationPoint(0.0F, -0.4F, 0.5F);
        this.body2.addBox(-2.0F, -2.0F, -5.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(body2, 0.17453292519943295F, 0.0F, 0.0F);
        this.coat2 = new AdvancedModelBox(this, 38, 4);
        this.coat2.setRotationPoint(0.0F, -0.6F, -5.0F);
        this.coat2.addBox(-4.0F, -3.0F, -0.4F, 8, 6, 5, 0.0F);
        this.setRotateAngle(coat2, -0.17453292519943295F, 0.0F, 0.0F);
        this.tail1 = new AdvancedModelBox(this, 0, 11);
        this.tail1.setRotationPoint(0.0F, -1.9F, 5.5F);
        this.tail1.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F);
        this.setRotateAngle(tail1, 1.3362240753268586F, 0.0F, 0.0F);
        this.rightArm = new AdvancedModelBox(this, 32, 9);
        this.rightArm.setRotationPoint(-2.0F, 1.5F, -3.0F);
        this.rightArm.addBox(-1.0F, 0.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(rightArm, 1.3089969389957472F, 0.0F, 0.0F);
        this.snout = new AdvancedModelBox(this, 22, 26);
        this.snout.setRotationPoint(0.0F, 0.5F, -2.3F);
        this.snout.addBox(-1.5F, -1.0F, -2.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(snout, 0.17453292519943295F, 0.0F, 0.0F);
        this.rightArm.addChild(this.rightHand);
        this.brain1.addChild(this.brain2);
        this.head.addChild(this.brain1);
        this.snout.addChild(this.wisker2);
        this.neck.addChild(this.head);
        this.leftThigh.addChild(this.leftFoot);
        this.leftArm.addChild(this.leftHand);
        this.body2.addChild(this.neck);
        this.body1.addChild(this.rightThigh);
        this.body2.addChild(this.leftArm);
        this.head.addChild(this.rightEye);
        this.tail1.addChild(this.tail1_1);
        this.body1.addChild(this.coat1);
        this.head.addChild(this.leftEye);
        this.body1.addChild(this.leftThigh);
        this.head.addChild(this.rightEar);
        this.rightThigh.addChild(this.rightFoot);
        this.head.addChild(this.leftEar);
        this.brain1.addChild(this.brain3);
        this.snout.addChild(this.nose);
        this.snout.addChild(this.wisker2_1);
        this.body1.addChild(this.body2);
        this.body2.addChild(this.coat2);
        this.body1.addChild(this.tail1);
        this.body2.addChild(this.rightArm);
        this.head.addChild(this.snout);
        this.floatyPivot.addChild(this.floaty);
        this.animator = ModelAnimator.create();
        this.updateDefaultPose();
    }

    @Override
    public Iterable<ModelRenderer> getParts() {
        return ImmutableList.of(body1, floatyPivot);
    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4) {
        this.resetToDefaultPose();
        EntityNeoRatlantean neoRatlantean = (EntityNeoRatlantean) entity;
        animator.update(entity);
    }

    public void setRotationAngles(EntityNeoRatlantean rat, float f, float f1, float f2, float f3, float f4) {
        animate((IAnimatedEntity) rat, f, f1, f2, f3, f4);
        this.floaty.rotateAngleY = (float) Math.toRadians(MathHelper.wrapDegrees(f2 * 10));
        this.floaty.setScale(2.0F, 2.0F, 2.0F);
        float speedWalk = 1F;
        float degreeWalk = 0.3F;
        float speedRun = 0.5F;
        float degreeRun = 0.2F;
        float speedIdle = 0.75F;
        float degreeIdle = 0.15F;
        float ulatingScale = 0.9F + (float) Math.sin(f2 * 0.75F) * 0.1F;
        float brain1Scale = 0.9F + (float) Math.sin(f2 * 0.5F + 2) * 0.05F;
        float brain2Scale = 0.9F + (float) Math.sin(f2 * 0.5F + 2.5F) * 0.075F;
        this.swing(this.wisker2_1, speedIdle, degreeIdle, false, 0, 0, f2, 1);
        this.swing(this.wisker2, speedIdle, degreeIdle, true, 0, 0, f2, 1);
        this.flap(this.wisker2_1, speedIdle, degreeIdle, false, 1, 0, f2, 1);
        this.flap(this.wisker2, speedIdle, degreeIdle, false, 1, 0, f2, 1);
        this.walk(this.wisker2_1, speedIdle, degreeIdle, false, 2, 0, f2, 1);
        this.walk(this.wisker2, speedIdle, degreeIdle, false, 2, 0, f2, 1);
        this.nose.setScale(ulatingScale, ulatingScale, ulatingScale);
        this.brain1.setScale(brain1Scale, brain1Scale, brain1Scale);
        this.brain1.setShouldScaleChildren(true);
        this.brain2.setScale(brain2Scale, brain2Scale, brain2Scale);
        this.brain3.setScale(brain2Scale, brain2Scale, brain2Scale);
        this.walk(this.leftArm, speedIdle * 0.5F, degreeIdle * 0.5F, true, 1, 0, f2, 1);
        this.walk(this.rightArm, speedIdle * 0.5F, degreeIdle * 0.5F, false, 1, 0, f2, 1);
        this.walk(this.rightHand, speedIdle * 0.5F, degreeIdle * 0.5F, false, 0, -0.1F, f2, 1);
        this.walk(this.leftHand, speedIdle * 0.5F, degreeIdle * 0.5F, true, 0, -0.1F, f2, 1);
        float f12 = f1;
        float maxTailRotation = (float) Math.toRadians(15);
        if (f12 > maxTailRotation) {
            f12 = maxTailRotation;
        }
        if (f12 < (float) Math.toRadians(-15)) {
            f12 = (float) Math.toRadians(-15);
        }
        this.tail1.rotateAngleX += f12;
        this.tail1_1.rotateAngleX -= f12;
        this.floatyPivot.rotateAngleX += f12;
        this.walk(this.tail1, speedRun, degreeRun, false, -1, 0.1F, f, f1);
        this.walk(this.tail1_1, speedRun, degreeRun * 0.5F, false, -2, 0.1F, f, f1);
        this.faceTarget(f3, f4, 2, neck, head);
        this.faceTarget(f3, f4, 2, floatyPivot);
        if (rat.func_233570_aj_()) {
            this.walk(this.rightThigh, speedWalk, degreeWalk * 4F, false, 1, 0, f, f1);
            this.walk(this.rightFoot, speedWalk, degreeWalk * 2F, false, 3.5F, -0.1F, f, f1);
            this.walk(this.leftThigh, speedWalk, degreeWalk * 4F, true, 1, 0, f, f1);
            this.walk(this.leftFoot, speedWalk, degreeWalk * 2F, true, 3.5F, 0.1F, f, f1);
        }
    }

    public void setRotateAngle(AdvancedModelBox AdvancedModelBox, float x, float y, float z) {
        AdvancedModelBox.rotateAngleX = x;
        AdvancedModelBox.rotateAngleY = y;
        AdvancedModelBox.rotateAngleZ = z;
    }

    @Override
    public Iterable<AdvancedModelBox> getAllParts() {
        return ImmutableList.of(body1,
                floaty,
                floatyPivot,
                body2,
                tail1,
                leftThigh,
                rightThigh,
                coat1,
                neck,
                leftArm,
                rightArm,
                coat2,
                head,
                snout,
                leftEar,
                rightEar,
                leftEye,
                rightEye,
                brain1,
                nose,
                wisker2,
                wisker2_1,
                brain2,
                brain3,
                leftHand,
                rightHand,
                tail1_1,
                leftFoot,
                rightFoot);
    }
}
