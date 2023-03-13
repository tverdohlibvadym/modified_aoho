package zhook.aohoc.aRoot.cPackage;

import zhook.aohoc.bridge.eBridgeA;

/* loaded from: classes.dex */
public class aCClassCPackage {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public eBridgeA g;
    public eBridgeA h;
    public cCClassCPackage j = new cCClassCPackage(this);
    public bCClassCPackage i = new bCClassCPackage(this);
    public gCClassCPackage k = new gCClassCPackage(this);

    public aCClassCPackage() {
        this.i.k = this.k;
        this.k.c = this.i;
    }

    public void a() {
        this.g = this.h;
        this.e = this.c;
        this.f = this.d;
    }

    public void a(int i) {
        this.g.a(i);
    }

    public void a(int i, int i2, int i3, int i4) {
        if (this.j.c(i, i2, i3, i4)) {
            this.g.a(i, i2, i3, i4);
        }
        this.j.e();
    }

    public void b() {
        this.g.a(this.j.p, this.j.q, this.j.r, this.j.s);
    }

    public void b(int i) {
        this.g.a(i);
        this.g.a(this.j.p, this.j.q, this.j.r, this.j.s);
    }

    public void b(int i, int i2, int i3, int i4) {
        a(this.j.p, this.j.q, i3, i2 - this.j.q);
        a(this.j.p, i2, i, i4);
        a(i + i3, i2, this.j.t - (i + i3), i4);
        a(this.j.p, i2 + i4, i3, this.j.u - (i2 + i4));
    }
}
