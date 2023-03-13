package zhook.aohoc.aRoot;

import zhook.aohoc.aRoot.cPackage.aCClassCPackage;
import zhook.aohoc.bridge.bBridgeA;

/* loaded from: classes.dex */
public final class c {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g;
    public String h;
    boolean i = false;
    boolean j = false;
    private aCClassCPackage k;

    public c(aCClassCPackage aCClassCPackageVar, String str, String str2) {
        this.g = "";
        this.h = "";
        this.k = aCClassCPackageVar;
        bBridgeA a = aCClassCPackageVar.h.a();
        int a2 = a.a();
        this.a = aCClassCPackageVar.c;
        this.b = (int) ((a2 * 1.5f) + 0.5f);
        this.c = 5;
        this.d = (int) (((this.b - a2) / 2.0f) + 0.5f);
        this.e = (this.a - 5) - a.a(str2);
        this.f = this.d;
        this.g = str;
        this.h = str2;
    }

    public void a(int i) {
        if (i == this.a) {
            return;
        }
        bBridgeA a = this.k.h.a();
        this.a = i;
        this.e = (i - 5) - a.a(this.h);
    }

    public void a(int i, int i2) {
        this.k.a(this.i ? -2039418 : -12632286);
        this.k.g.a(i, i2, this.a, this.b);
        this.k.a(this.i ? -12108274 : -15001595);
        this.k.g.a(i + 1, i2 + 1, this.a - 2, this.b - 2);
        this.k.a(this.j ? this.i ? -16711936 : -16728064 : this.i ? -1 : -4144960);
        if (a()) {
            aCClassCPackage aCClassCPackageVar = this.k;
            this.k.g.a(this.g, this.c + i, this.d + i2, 20);
        }
        if (b()) {
            aCClassCPackage aCClassCPackageVar2 = this.k;
            this.k.g.a(this.h, this.e, this.f + i2, 20);
        }
    }

    public boolean a() {
        return (this.g == null || "".equals(this.g)) ? false : true;
    }

    public boolean b() {
        return (this.h == null || "".equals(this.h)) ? false : true;
    }
}
