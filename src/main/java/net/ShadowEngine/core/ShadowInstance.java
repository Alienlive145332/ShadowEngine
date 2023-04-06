package net.ShadowEngine.core;

import net.ShadowEngine.core.managers.RenderManager;

public class ShadowInstance {

    private RenderManager renderManager;

    private String instanceName = "Shadow-Instance";
    private WindowState windowState = WindowState.window;

    public void instanceName(String name) {this.instanceName = name;}
    public void windowState(WindowState windowState) {this.windowState = windowState;}

    public void start() {
        this.renderManager = new RenderManager(this.instanceName, this.windowState);
    }

    public RenderManager getRenderManager() {return this.renderManager;}

}
