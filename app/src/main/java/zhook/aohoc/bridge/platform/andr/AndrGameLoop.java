package zhook.aohoc.bridge.platform.andr;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import zhook.aohoc.bridge.aBridgeA;
import zhook.aohoc.bridge.cBridgeA;
import zhook.aohoc.bridge.eBridgeA;

/* loaded from: classes.dex */
public class AndrGameLoop extends cBridgeA {
    private Bitmap m;
    private Canvas n;
    private Canvas o;
    private String p = null;

    @Override // zhook.aohoc.bridge.c
    public void a(String str) {
        this.p = str;
    }

    @Override // zhook.aohoc.bridge.c
    public void a(zhook.aohoc.aRoot.k kVar) {
    }

    @Override // zhook.aohoc.bridge.c
    public String b(int i) {
        try {
            return "[" + i + "]";
        } catch (Throwable th) {
            return "";
        }
    }

    @Override // zhook.aohoc.bridge.c
    public int c(int i) {
        return 0;
    }

    @Override // zhook.aohoc.bridge.c
    public void g() {
        if (!this.b) {
            d();
        } else if (aAndr.aAndr == null || !aAndr.aAndr.a()) {
        } else {
            aAndr.aAndr.b();
        }
    }

    @Override // zhook.aohoc.bridge.c
    public eBridgeA h() {
        if (aAndr.aAndr == null) {
            return null;
        }
        if (this.n == null) {
            this.m = Bitmap.createBitmap(aBridgeA.a().c(), aBridgeA.a().d(), Bitmap.Config.ARGB_8888);
            this.n = new Canvas(this.m);
            System.out.println("AOHGameLoop.getGameLoopGraphics() : initialized offScreenCanvas w=" + this.m.getWidth() + " h=" + this.m.getHeight());
        }
        if (!this.b || this.c) {
            if (this.o != this.n) {
                this.o = this.n;
                this.a = new cAndr(this.o, this.m);
                System.out.println("AOHGameLoop.getGameLoopGraphics() : initialized graphics (offScreen) w=" + this.m.getWidth() + " h=" + this.m.getHeight());
            }
        } else if (aAndr.aAndr.b != null && this.o != aAndr.aAndr.b) {
            this.o = aAndr.aAndr.b;
            this.a = new cAndr(this.o);
            System.out.println("AOHGameLoop.getGameLoopGraphics() : initialized graphics (frontScreen) w=" + this.m.getWidth() + " h=" + this.m.getHeight());
        }
        return this.a;
    }

    @Override // zhook.aohoc.bridge.c
    public int i() {
        if (aAndr.aAndr == null) {
            return 0;
        }
        int c = aBridgeA.a().c();
        return MainActivity.a.a() == 2 ? c - aAndr.aAndr.d.a() : c;
    }

    @Override // zhook.aohoc.bridge.c
    public int j() {
        if (aAndr.aAndr == null) {
            return 0;
        }
        int d = aBridgeA.a().d();
        return MainActivity.a.a() != 2 ? d - aAndr.aAndr.d.b() : d;
    }

    @Override // zhook.aohoc.bridge.c
    public void k() {
        if (aAndr.aAndr != null) {
            aAndr.aAndr.c();
        }
    }

    @Override // zhook.aohoc.bridge.c
    public String l() {
        return this.p;
    }
}
