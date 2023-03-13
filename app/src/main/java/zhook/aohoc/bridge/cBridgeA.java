package zhook.aohoc.bridge;

import zhook.aohoc.aRoot.aPackage.aAClassPackage;
import zhook.aohoc.aRoot.ae;
import zhook.aohoc.aRoot.cPackage.aCClassCPackage;
import zhook.aohoc.aRoot.cPackage.bCClassCPackage;
import zhook.aohoc.aRoot.k;
import zhook.aohoc.aRoot.y;

/* loaded from: classes.dex */
public abstract class cBridgeA implements Runnable {
    public eBridgeA a;
    protected boolean b;
    protected boolean c;
    protected aAClassPackage f;
    private Thread u;
    private aCClassCPackage v;
    private bCClassCPackage w;
    private zhook.aohoc.aRoot.g m = new zhook.aohoc.aRoot.g();
    private zhook.aohoc.aRoot.g n = new zhook.aohoc.aRoot.g();
    public int d = 0;
    public int e = 0;
    public int g = -1;
    private boolean o = false;
    private boolean p = false;
    private final Object q = new Object();
    private int r = 0;
    private boolean s = false;
    private long t = System.currentTimeMillis();
    boolean h = true;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public int l = 0;
    long x = -1;

    public cBridgeA() {
        this.b = false;
        this.c = true;
        this.b = false;
        this.c = true;
        this.m.a(this);
    }

    public void a() {
        this.d = 0;
        this.e = 0;
        y.a("AOHGameLoop.start() : BEGIN");
        b();
        y.a("AOHGameLoop.start() : END");
    }

    public void a(int i) {
        String l = l();
        if (i != 0) {
            if (i == 1) {
                switch (this.f.A) {
                    case 13:
                    case 14:
                    case 15:
                    case 18:
                    case 19:
                    case 20:
                    case 26:
                        this.f.a(9);
                        break;
                }
            }
        } else {
            switch (this.f.A) {
                case 13:
                    if (l.length() >= 6) {
                        this.f.a.f = l;
                        this.f.a.d.a = 5;
                        this.f.a(1);
                        break;
                    } else {
                        return;
                    }
                case 14:
                    if (l.length() >= 3) {
                        this.f.a.d.d = l;
                        if (this.f.a.d.a != 4) {
                            this.f.a(15);
                            break;
                        } else {
                            this.f.a(26);
                            break;
                        }
                    } else {
                        return;
                    }
                case 15:
                    if (l.length() >= 6) {
                        this.f.a.d.e = l;
                        this.f.a(18);
                        break;
                    } else {
                        return;
                    }
                case 18:
                    this.f.a.g = l;
                    this.f.a(19);
                    break;
                case 19:
                    this.f.a.h = l;
                    this.f.a(20);
                    break;
                case 20:
                    this.f.a.i = l;
                    this.f.a(1);
                    break;
                case 26:
                    if (l.length() >= 1) {
                        this.f.a.d.e = l;
                        this.f.a(1);
                        break;
                    } else {
                        return;
                    }
            }
        }
        int i2 = i == 0 ? this.d : i == 1 ? this.e : -1;
        aBridgeA.a().b();
        switch (this.f.A) {
            case 1:
            case 2:
            case 3:
                aBridgeA.a().b();
                this.f.b.d();
                if (i2 != -1) {
                    try {
                        ae aeVar = this.f.g;
                        if (aeVar != null) {
                            aeVar.a(i2, true);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th.printStackTrace();
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }

    public abstract void a(String str);

    public abstract void a(k kVar);

    public void a(boolean z) {
        this.b = z;
    }

    public abstract String b(int i);

    public void b() {
        boolean z = this.h;
        this.h = true;
        if (this.f != null) {
            this.f.c();
            this.f.O = false;
        }
        if (!this.o) {
            Thread.yield();
            this.o = true;
            this.p = false;
        }
        this.f = new aAClassPackage(this);
        this.v = this.f.T;
        this.w = this.v.i;
        this.f.b();
        if (this.f.a(z) && !this.p) {
            this.f.b(-1);
            this.p = true;
        }
        this.f.O = true;
    }

    public void b(boolean z) {
        this.c = z;
    }

    public abstract int c(int i);

    public void c() {
        if (this.f.A == 3 || this.f.A == 1 || this.f.A == 2) {
            this.h = false;
            this.f.a(6);
        }
    }

    public void c(boolean z) {
        this.o = z;
    }

    public void d(int i) {
        this.r = i;
    }

    public void d(boolean z) {
        this.s = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0252 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d() {
        /*
            Method dump skipped, instructions count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zhook.aohoc.bridge.c.d():boolean");
    }

    public void e() {
        if (this.k) {
            return;
        }
        this.k = true;
        new Thread(new dBridgeA(this)).start();
    }

    public void f() {
        if (this.f == null || this.f.h == null) {
            return;
        }
        this.f.h.aI = true;
    }

    public abstract void g();

    public abstract eBridgeA h();

    public abstract int i();

    public abstract int j();

    public abstract void k();

    public abstract String l();

    public hBridgeA m() {
        return this.f.R;
    }

    public aAClassPackage n() {
        return this.f;
    }

    public void o() {
        this.k = false;
    }

    public boolean p() {
        return this.k;
    }

    public boolean q() {
        return this.c;
    }

    public boolean r() {
        return this.o;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        synchronized (this.q) {
            i = this.r;
            this.r = 0;
        }
        Thread.yield();
        while (this.o) {
            switch (i) {
                case -1:
                    try {
                        this.f.f();
                        if (this.f.r) {
                            Thread.sleep(150L);
                            continue;
                        } else {
                            g();
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                default:
                    if (this.f == null || !this.f.a()) {
                        return;
                    }
                    this.f.b.a(i);
                    return;
            }
        }
        if (i == -1) {
        }
    }

    public Object s() {
        return this.q;
    }

    public int t() {
        return this.r;
    }

    public zhook.aohoc.aRoot.g u() {
        return this.m;
    }

    public zhook.aohoc.aRoot.g v() {
        return this.n;
    }
}
