package net.ShadowEngine.entities.entity;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class EntityManager {

    private List<Entity> entities = new ArrayList<>();

    public void updateEntities() {for (Entity e : entities) e.update();}

    public void renderEntities(Graphics2D g2) {for (Entity e : entities) e.render(g2);}

    public void registerEntity(Entity e) {entities.add(e);}
    public void removeEntity(Entity e) {entities.remove(e);}

}
