package io.izzel.arclight.common.bridge.core.server.management;

public interface PlayerInteractionManagerBridge {

    boolean bridge$isFiredInteract();

    void bridge$setFiredInteract(boolean b);

    boolean bridge$getInteractResult();

    void bridge$setInteractResult(boolean b);
}
