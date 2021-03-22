package dev.projectearth.genoa_plugin.entities.projectile;

import org.cloudburstmc.server.entity.EntityType;
import org.cloudburstmc.server.entity.impl.projectile.EntityArrow;
import org.cloudburstmc.server.entity.projectile.Arrow;
import org.cloudburstmc.server.level.Location;

public class MelonSeedProjectile extends EntityArrow {
    public MelonSeedProjectile(EntityType<Arrow> type, Location location) {
        super(type, location);
    }

    @Override
    public String getName() {
        return "melon_seed_projectile";
    }
}
