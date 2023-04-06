package net.ShadowEngine.entities;

import net.ShadowEngine.core.managers.RenderManager;
import net.ShadowEngine.core.managers.UpdateManager;
import net.ShadowEngine.entities.entity.Entity;
import net.ShadowEngine.entities.entity.EntityManager;

import java.awt.*;

public class SamplePlayer extends Entity {

    public SamplePlayer(RenderManager renderManager, UpdateManager updateManager, EntityManager entityManager, int positionX, int positionY, int sizeX, int sizeY) {
        super(renderManager, updateManager, entityManager, positionX, positionY, sizeX, sizeY);
    }
    @Override
    public void update() {}

    @Override
    public void render(Graphics2D g2) {

        g2.setColor(Color.WHITE);

        g2.fillRect(0, 0, 48, 48);
    }

}
