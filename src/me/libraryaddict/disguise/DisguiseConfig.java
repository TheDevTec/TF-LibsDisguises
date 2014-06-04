package me.libraryaddict.disguise;

import me.libraryaddict.disguise.utilities.PacketsManager;
import org.bukkit.ChatColor;
import org.bukkit.configuration.ConfigurationSection;

public class DisguiseConfig {
    private static boolean animationEnabled;
    private static boolean bedEnabled;
    private static boolean blowDisguisesOnAttack;
    private static boolean collectEnabled;
    private static boolean colorizeSheep;
    private static boolean colorizeWolf;
    private static String disguiseBlownMessage;
    private static int disguiseCloneExpire;
    private static int disguiseEntityExpire;
    private static boolean enquipmentEnabled;
    private static boolean entityAnimationsAdded;
    private static boolean entityStatusEnabled;
    private static boolean hearSelfDisguise;
    private static boolean hidingArmor;
    private static boolean hidingHeldItem;
    private static boolean keepDisguiseEntityDespawn;
    private static boolean keepDisguisePlayerDeath;
    private static boolean keepDisguisePlayerLogout;
    private static int maxClonedDisguises;
    private static boolean maxHealthIsDisguisedEntity;
    private static boolean miscDisguisesForLivingEnabled;
    private static boolean modifyBoundingBox;
    private static boolean movementEnabled;
    private static boolean ridingEnabled;
    private static boolean sendsEntityMetadata;
    private static boolean sendVelocity;
    private static boolean showNameAboveHead;
    private static boolean showNameAboveHeadAlwaysVisible;
    private static boolean targetDisguises;
    private static boolean witherSkullEnabled;

    public static String getDisguiseBlownMessage() {
        return disguiseBlownMessage;
    }

    public static int getDisguiseCloneExpire() {
        return disguiseCloneExpire;
    }

    public static int getDisguiseEntityExpire() {
        return disguiseEntityExpire;
    }

    public static int getMaxClonedDisguises() {
        return maxClonedDisguises;
    }

    public static void initConfig(ConfigurationSection config) {
        setSoundsEnabled(config.getBoolean("DisguiseSounds"));
        setVelocitySent(config.getBoolean("SendVelocity"));
        setViewDisguises(config.getBoolean("ViewSelfDisguises"));
        setHearSelfDisguise(config.getBoolean("HearSelfDisguise"));
        setHideArmorFromSelf(config.getBoolean("RemoveArmor"));
        setHideHeldItemFromSelf(config.getBoolean("RemoveHeldItem"));
        setAddEntityAnimations(config.getBoolean("AddEntityAnimations"));
        setNameOfPlayerShownAboveDisguise(config.getBoolean("ShowNamesAboveDisguises"));
        setNameAboveHeadAlwaysVisible(config.getBoolean("NameAboveHeadAlwaysVisible"));
        setModifyBoundingBox(config.getBoolean("ModifyBoundingBox"));
        setMonstersIgnoreDisguises(config.getBoolean("MonstersIgnoreDisguises"));
        setDisguiseBlownOnAttack(config.getBoolean("BlowDisguises"));
        setDisguiseBlownMessage(ChatColor.translateAlternateColorCodes('&', config.getString("BlownDisguiseMessage")));
        setKeepDisguiseOnPlayerDeath(config.getBoolean("KeepDisguises.PlayerDeath"));
        setKeepDisguiseOnPlayerLogout(config.getBoolean("KeepDisguises.PlayerLogout"));
        setKeepDisguiseOnEntityDespawn(config.getBoolean("KeepDisguises.EntityDespawn"));
        setMiscDisguisesForLivingEnabled(config.getBoolean("MiscDisguisesForLiving"));
        setMovementPacketsEnabled(config.getBoolean("PacketsEnabled.Movement"));
        setWitherSkullPacketsEnabled(config.getBoolean("PacketsEnabled.WitherSkull"));
        setEnquipmentPacketsEnabled(config.getBoolean("PacketsEnabled.Enquipment"));
        setAnimationPacketsEnabled(config.getBoolean("PacketsEnabled.Animation"));
        setBedPacketsEnabled(config.getBoolean("PacketsEnabled.Bed"));
        setRidingPacketsEnabled(config.getBoolean("PacketsEnabled.Riding"));
        setEntityStatusPacketsEnabled(config.getBoolean("PacketsEnabled.EntityStatus"));
        setCollectPacketsEnabled(config.getBoolean("PacketsEnabled.Collect"));
        setMetadataPacketsEnabled(config.getBoolean("PacketsEnabled.Metadata"));
        setMaxHealthDeterminedByDisguisedEntity(config.getBoolean("MaxHealthDeterminedByEntity"));
        setDisguiseEntityExpire(config.getInt("DisguiseEntityExpire"));
        setDisguiseCloneExpire(config.getInt("DisguiseCloneExpire"));
        setMaxClonedDisguises(config.getInt("DisguiseCloneSize"));
        setSheepDyeable(config.getBoolean("DyeableSheep"));
        setWolfDyeable(config.getBoolean("DyeableWolf"));
    }

    public static boolean isAnimationPacketsEnabled() {
        return animationEnabled;
    }

    public static boolean isBedPacketsEnabled() {
        return bedEnabled;
    }

    public static boolean isCollectPacketsEnabled() {
        return collectEnabled;
    }

    public static boolean isDisguiseBlownOnAttack() {
        return blowDisguisesOnAttack;
    }

    public static boolean isEnquipmentPacketsEnabled() {
        return enquipmentEnabled;
    }

    public static boolean isEntityAnimationsAdded() {
        return entityAnimationsAdded;
    }

    public static boolean isEntityStatusPacketsEnabled() {
        return entityStatusEnabled;
    }

    /**
     * Is the plugin modifying the inventory packets so that players when self disguised, do not see their armor floating around
     */
    public static boolean isHidingArmorFromSelf() {
        return hidingArmor;
    }

    /**
     * Does the plugin appear to remove the item they are holding, to prevent a floating sword when they are viewing self disguise
     */
    public static boolean isHidingHeldItemFromSelf() {
        return hidingHeldItem;
    }

    public static boolean isKeepDisguiseOnEntityDespawn() {
        return keepDisguiseEntityDespawn;
    }

    public static boolean isKeepDisguiseOnPlayerDeath() {
        return keepDisguisePlayerDeath;
    }

    public static boolean isKeepDisguiseOnPlayerLogout() {
        return keepDisguisePlayerLogout;
    }

    public static boolean isMaxHealthDeterminedByDisguisedEntity() {
        return maxHealthIsDisguisedEntity;
    }

    public static boolean isMetadataPacketsEnabled() {
        return sendsEntityMetadata;
    }

    public static boolean isMiscDisguisesForLivingEnabled() {
        return miscDisguisesForLivingEnabled;
    }

    public static boolean isModifyBoundingBox() {
        return modifyBoundingBox;
    }

    public static boolean isMonstersIgnoreDisguises() {
        return targetDisguises;
    }

    public static boolean isMovementPacketsEnabled() {
        return movementEnabled;
    }

    public static boolean isNameAboveHeadAlwaysVisible() {
        return showNameAboveHeadAlwaysVisible;
    }

    public static boolean isNameOfPlayerShownAboveDisguise() {
        return showNameAboveHead;
    }

    public static boolean isRidingPacketsEnabled() {
        return ridingEnabled;
    }

    public static boolean isSelfDisguisesSoundsReplaced() {
        return hearSelfDisguise;
    }

    public static boolean isSheepDyeable() {
        return colorizeSheep;
    }

    /**
     * Is the sound packets caught and modified
     */
    public static boolean isSoundEnabled() {
        return PacketsManager.isHearDisguisesEnabled();
    }

    /**
     * Is the velocity packets sent
     */
    public static boolean isVelocitySent() {
        return sendVelocity;
    }

    /**
     * The default value if a player views his own disguise
     */
    public static boolean isViewDisguises() {
        return PacketsManager.isViewDisguisesListenerEnabled();
    }

    public static boolean isWitherSkullPacketsEnabled() {
        return witherSkullEnabled;
    }

    public static boolean isWolfDyeable() {
        return colorizeWolf;
    }

    public static void setAddEntityAnimations(boolean isEntityAnimationsAdded) {
        entityAnimationsAdded = isEntityAnimationsAdded;
    }

    public static void setAnimationPacketsEnabled(boolean enabled) {
        if (enabled != isAnimationPacketsEnabled()) {
            animationEnabled = enabled;
            PacketsManager.setupMainPacketsListener();
        }
    }

    public static void setBedPacketsEnabled(boolean enabled) {
        if (enabled != isBedPacketsEnabled()) {
            bedEnabled = enabled;
            PacketsManager.setupMainPacketsListener();
        }
    }

    public static void setCollectPacketsEnabled(boolean enabled) {
        if (enabled != isCollectPacketsEnabled()) {
            collectEnabled = enabled;
            PacketsManager.setupMainPacketsListener();
        }
    }

    public static void setDisguiseBlownMessage(String newMessage) {
        disguiseBlownMessage = newMessage;
    }

    public static void setDisguiseBlownOnAttack(boolean blowDisguise) {
        blowDisguisesOnAttack = blowDisguise;
    }

    public static void setDisguiseCloneExpire(int newExpires) {
        disguiseCloneExpire = newExpires;
    }

    public static void setDisguiseEntityExpire(int newExpires) {
        disguiseEntityExpire = newExpires;
    }

    public static void setEnquipmentPacketsEnabled(boolean enabled) {
        if (enabled != isEnquipmentPacketsEnabled()) {
            enquipmentEnabled = enabled;
            PacketsManager.setupMainPacketsListener();
        }
    }

    public static void setEntityStatusPacketsEnabled(boolean enabled) {
        if (enabled != isEntityStatusPacketsEnabled()) {
            entityStatusEnabled = enabled;
            PacketsManager.setupMainPacketsListener();
        }
    }

    /**
     * Can players hear their own disguises
     */
    public static void setHearSelfDisguise(boolean replaceSound) {
        if (hearSelfDisguise != replaceSound) {
            hearSelfDisguise = replaceSound;
        }
    }

    /**
     * Set the plugin to hide self disguises armor from theirselves
     */
    public static void setHideArmorFromSelf(boolean hideArmor) {
        if (hidingArmor != hideArmor) {
            hidingArmor = hideArmor;
            PacketsManager.setInventoryListenerEnabled(isHidingHeldItemFromSelf() || isHidingArmorFromSelf());
        }
    }

    /**
     * Does the plugin appear to remove the item they are holding, to prevent a floating sword when they are viewing self disguise
     */
    public static void setHideHeldItemFromSelf(boolean hideHelditem) {
        if (hidingHeldItem != hideHelditem) {
            hidingHeldItem = hideHelditem;
            PacketsManager.setInventoryListenerEnabled(isHidingHeldItemFromSelf() || isHidingArmorFromSelf());
        }
    }

    public static void setKeepDisguiseOnEntityDespawn(boolean keepDisguise) {
        keepDisguiseEntityDespawn = keepDisguise;
    }

    public static void setKeepDisguiseOnPlayerDeath(boolean keepDisguise) {
        keepDisguisePlayerDeath = keepDisguise;
    }

    public static void setKeepDisguiseOnPlayerLogout(boolean keepDisguise) {
        keepDisguisePlayerLogout = keepDisguise;
    }

    public static void setMaxClonedDisguises(int newMax) {
        maxClonedDisguises = newMax;
    }

    public static void setMaxHealthDeterminedByDisguisedEntity(boolean isDetermined) {
        maxHealthIsDisguisedEntity = isDetermined;
    }

    public static void setMetadataPacketsEnabled(boolean enabled) {
        sendsEntityMetadata = enabled;
    }

    public static void setMiscDisguisesForLivingEnabled(boolean enabled) {
        if (enabled != isMiscDisguisesForLivingEnabled()) {
            miscDisguisesForLivingEnabled = enabled;
            PacketsManager.setupMainPacketsListener();
        }
    }

    public static void setModifyBoundingBox(boolean modifyBounding) {
        modifyBoundingBox = modifyBounding;
    }

    public static void setMonstersIgnoreDisguises(boolean ignore) {
        targetDisguises = ignore;
    }

    public static void setMovementPacketsEnabled(boolean enabled) {
        if (enabled != isMovementPacketsEnabled()) {
            movementEnabled = enabled;
            PacketsManager.setupMainPacketsListener();
        }
    }

    public static void setNameAboveHeadAlwaysVisible(boolean alwaysVisible) {
        showNameAboveHeadAlwaysVisible = alwaysVisible;
    }

    public static void setNameOfPlayerShownAboveDisguise(boolean showNames) {
        showNameAboveHead = showNames;
    }

    public static void setRidingPacketsEnabled(boolean enabled) {
        if (enabled != isRidingPacketsEnabled()) {
            ridingEnabled = enabled;
            PacketsManager.setupMainPacketsListener();
        }
    }

    public static void setSheepDyeable(boolean color) {
        colorizeSheep = color;
    }

    /**
     * Set if the disguises play sounds when hurt
     */
    public static void setSoundsEnabled(boolean isSoundsEnabled) {
        PacketsManager.setHearDisguisesListener(isSoundsEnabled);
    }

    /**
     * Disable velocity packets being sent for w/e reason. Maybe you want every ounce of performance you can get?
     */
    public static void setVelocitySent(boolean sendVelocityPackets) {
        sendVelocity = sendVelocityPackets;
    }

    public static void setViewDisguises(boolean seeOwnDisguise) {
        PacketsManager.setViewDisguisesListener(seeOwnDisguise);
    }

    public static void setWitherSkullPacketsEnabled(boolean enabled) {
        witherSkullEnabled = enabled;
    }

    public static void setWolfDyeable(boolean color) {
        colorizeWolf = color;
    }

    private DisguiseConfig() {
    }
}
