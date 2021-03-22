package dev.projectearth.genoa_plugin.entities.rabbit;

import org.cloudburstmc.server.entity.EntityType;
import org.cloudburstmc.server.entity.impl.passive.EntityRabbit;
import org.cloudburstmc.server.entity.passive.Rabbit;
import org.cloudburstmc.server.level.Location;

public class HarelequinRabbit extends EntityRabbit {
    public HarelequinRabbit(EntityType<Rabbit> type, Location location) {
        super(type, location);
    }

    @Override
    public String getName() {
        return "Harelequin Rabbit";
    }
}
