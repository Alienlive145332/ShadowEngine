package net.ShadowEngine.entities.entity;

import net.ShadowEngine.core.managers.RenderManager;
import net.ShadowEngine.core.managers.UpdateManager;

import java.awt.*;

public class Entity {

    private RenderManager renderManager;
    private UpdateManager updateManager;
    private EntityManager entityManager;

    private HitBox hitBox;

    public Entity(RenderManager renderManager, UpdateManager updateManager, EntityManager entityManager, int positionX, int positionY, int sizeX, int sizeY) {
        this.renderManager = renderManager;
        this.updateManager = updateManager;
        this.entityManager = entityManager;

        this.hitBox = new HitBox(positionX, positionY, sizeX, sizeY);

        entityManager.registerEntity(this);
    }

    public void update() {}

    public void render(Graphics2D g2) {}

    public void move() {}

}

