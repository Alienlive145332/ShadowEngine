package test;

import net.ShadowEngine.core.ShadowInstance;
import net.ShadowEngine.core.WindowState;

public class Main {
    public static void main(String[] args) {
        ShadowInstance instance = new ShadowInstance();
        instance.instanceName("Test");
        instance.windowState(WindowState.fullscreen);
        instance.start();
    }
}