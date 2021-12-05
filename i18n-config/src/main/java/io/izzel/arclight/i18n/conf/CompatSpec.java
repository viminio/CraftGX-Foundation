package io.izzel.arclight.i18n.conf;

import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@ConfigSerializable
public class CompatSpec {

    @Setting("material-property-overrides")
    private Map<String, MaterialPropertySpec> materials;

    @Setting("entity-property-overrides")
    private Map<String, EntityPropertySpec> entities;

    @Setting("symlink-world")
    private boolean symlinkWorld;

    @Setting("extra-logic-worlds")
    private List<String> extraLogicWorlds;

    public Map<String, MaterialPropertySpec> getMaterials() {
        return materials;
    }

    public Optional<MaterialPropertySpec> getMaterial(String key) {
        return Optional.ofNullable(materials.get(key));
    }

    public Map<String, EntityPropertySpec> getEntities() {
        return entities;
    }

    public Optional<EntityPropertySpec> getEntity(String key) {
        return Optional.ofNullable(entities.get(key));
    }

    public boolean isSymlinkWorld() {
        return symlinkWorld;
    }

    public List<String> getExtraLogicWorlds() {
        return extraLogicWorlds;
    }
}
