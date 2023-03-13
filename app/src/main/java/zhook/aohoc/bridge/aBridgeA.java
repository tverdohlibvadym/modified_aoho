package zhook.aohoc.bridge;

import zhook.aohoc.bridge.aBridge.bABridge;
import zhook.aohoc.bridge.platform.aPlatform;
import zhook.aohoc.bridge.platform.bPlatform;

/* loaded from: classes.dex */
public abstract class aBridgeA {
    protected static aBridgeA aBridgeA;
    public static aPlatform b;
    public static bPlatform c;
    public static gBridgeA d;
    public static iBridgeA e;
    public static bABridge f;
    protected cBridgeA[] g = new cBridgeA[2];
    protected int h = 0;
    protected int i = 1;
    private final Object l = new Object();
    protected int j = 0;
    protected int k = 0;

    public static aBridgeA a() {
        return aBridgeA;
    }

    public static void a(int i) {
        b = new aPlatform(i);
        aBridgeA = (aBridgeA) b.a(aPlatform.c);
        c = (bPlatform) b.a(aPlatform.b);
        d = (gBridgeA) b.a(aPlatform.e);
        e = (iBridgeA) b.a(aPlatform.f);
        f = (bABridge) b.a(aPlatform.d);
    }

    private void c(int i) {
        if (i < 0 || i + 1 > 2) {
            throw new IllegalArgumentException("AOHAppManager.initLoop : INVALID INDEX=" + i);
        }
        if (this.g[i] != null) {
            return;
        }
        this.g[i] = (cBridgeA) b.a(aPlatform.g);
        this.g[i].g = i;
    }

    private void d(int i) {
        int i2 = 0;
        synchronized (this.l) {
            if (i < 0 || i + 1 > 2) {
                return;
            }
            if (this.g[i] == null) {
                c(i);
            }
            cBridgeA cBridgeAVar = this.g[i];
            for (int i3 = 0; i3 < this.g.length; i3++) {
                if (i3 != i && this.g[i3] != null) {
                    this.g[i3].n().c();
                    this.g[i3].a(false);
                    this.g[i3].b(true);
                }
            }
            cBridgeAVar.b(false);
            cBridgeAVar.a(true);
            cBridgeAVar.f();
            System.out.println("   ##### AOHAppManager.display() : Now loop with index=" + i + " is  displayed");
            this.h = i;
            if ( cBridgeAVar.r()) {
                while ( cBridgeAVar.i && i2 <= 200) {
                    try {
                        Thread.sleep(50L);
                        i2 += 50;
                    } catch (InterruptedException e2) {
                    }
                }
                cBridgeAVar.n().b();
            } else {
                cBridgeAVar.a();
                if (!cBridgeAVar.p()) {
                    cBridgeAVar.e();
                }
            }
        }
    }

    private void j() {
        if (this.h == -1) {
            throw new IllegalStateException("displayedLoopIndex == -1");
        }
        if (this.h < 0 || this.h + 1 > 2) {
            throw new IllegalStateException("invalid displayedLoopIndex=" + this.h);
        }
        if (this.g[this.h] == null) {
            throw new IllegalStateException("displayedLoop == null");
        }
    }

    public void a(boolean z) {
        System.out.println("   ######### AOHAppManager.onDestroyApp() : BEGIN");
        for (int i = 0; i < this.g.length; i++) {
            cBridgeA cBridgeAVar = this.g[i];
            if ( cBridgeAVar != null) {
                System.out.println("       ======> AOHAppManager.onDestroyApp() : destroy loop with index=" + i);
                if ( cBridgeAVar.u().b()) {
                    cBridgeAVar.u().a();
                }
                if ( cBridgeAVar.v().b()) {
                    cBridgeAVar.v().a();
                }
                if ( cBridgeAVar.p()) {
                    cBridgeAVar.o();
                }
                if ( cBridgeAVar.r()) {
                    cBridgeAVar.n().b(false);
                }
                this.g[i] = null;
            }
        }
        System.out.println("       ======> AOHAppManager.onDestroyApp() : set '_instance' to null");
        aBridgeA = null;
        System.gc();
        System.out.println("   ######### AOHAppManager.onDestroyApp() : END");
    }

    public abstract void b();

    public void b(int i) {
        if (i == this.i) {
            return;
        }
        if (i == 0 || i == 1) {
            this.i = i;
            for (int i2 = 0; i2 < this.g.length; i2++) {
                cBridgeA cBridgeAVar = this.g[i2];
                if ( cBridgeAVar != null) {
                    cBridgeAVar.c();
                    if (i2 != this.h) {
                        try {
                            if ( cBridgeAVar.u().b()) {
                                cBridgeAVar.u().a();
                            }
                            if ( cBridgeAVar.v().b()) {
                                cBridgeAVar.v().a();
                            }
                            if ( cBridgeAVar.p()) {
                                cBridgeAVar.o();
                            }
                            if ( cBridgeAVar.r()) {
                                cBridgeAVar.c(false);
                            }
                            if ( cBridgeAVar.f != null) {
                                cBridgeAVar.f.b(false);
                                cBridgeAVar.f.Q = null;
                                cBridgeAVar.f.b = null;
                            }
                            cBridgeAVar.f = null;
                            this.g[i2] = null;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        } finally {
                            System.gc();
                        }
                    }
                }
            }
        }
    }

    public abstract int c();

    public abstract int d();

    public void e() {
        System.out.println("   ######### AOHAppManager.onStartApp() : BEGIN");
        d(0);
        System.out.println("   ######### AOHAppManager.onStartApp() : END");
    }

    public void f() {
        System.out.println("   ######### AOHAppManager.onPauseApp() : BEGIN");
        i().n().c();
        System.out.println("   ######### AOHAppManager.onPauseApp() : END");
    }

    public void g() {
        System.out.println("   ######### AOHAppManager.onResumeApp() : BEGIN");
        i().n().b();
        System.out.println("   ######### AOHAppManager.onResumeApp() : END");
    }

    public void h() {
        System.out.println("   ######### AOHAppManager.switchDisplayedGameLoop() : BEGIN");
        int i = this.h + 1;
        d((i < 0 || i >= 2) ? 0 : 0);
        System.out.println("   ######### AOHAppManager.switchDisplayedGameLoop() : END");
    }

    public cBridgeA i() {
        cBridgeA cBridgeAVar;
        synchronized (this.l) {
            j();
            cBridgeAVar = this.g[this.h];
        }
        return cBridgeAVar;
    }
}
