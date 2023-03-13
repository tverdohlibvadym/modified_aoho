package zhook.aohoc.aRoot;

import java.util.Timer;

import zhook.aohoc.bridge.cBridgeA;

/* loaded from: classes.dex */
public class g {
    cBridgeA a;
    private String b = "UNDEFINED_TASK";
    private long c = Long.MAX_VALUE;
    private long d = Long.MAX_VALUE;
    private long e = Long.MAX_VALUE;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private Timer i = new Timer();

    public void a() {
        this.h = false;
        this.i.cancel();
    }

    public void a(cBridgeA cBridgeAVar) {
        this.a = cBridgeAVar;
    }

    public boolean b() {
        return this.h;
    }
}
