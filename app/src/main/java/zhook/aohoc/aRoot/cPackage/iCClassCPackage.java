package zhook.aohoc.aRoot.cPackage;

import zhook.aohoc.aRoot.n;

/* loaded from: classes.dex */
public class iCClassCPackage {
    int a;
    int b;
    int c;
    byte[] d;
    byte[] e;
    byte[] f;
    zhook.aohoc.aRoot.j g;
    private int[] h = {0, 16711680, 65280, 255, 16776960, 16711935, 65535, 16777215};
    private aCClassCPackage i;
    private cCClassCPackage j;
    private gCClassCPackage k;

    public iCClassCPackage(n nVar) {
        this.g = nVar.c;
        this.b = nVar.e[0][0];
        this.c = nVar.e[0][1];
        this.d = nVar.e[1];
        this.e = nVar.e[2];
        this.f = nVar.e[3];
        this.a = nVar.d[0];
        this.i = nVar.i.T;
        this.j = this.i.j;
        this.k = this.i.k;
    }

    public int a() {
        return this.b;
    }

    public int a(int i) {
        return this.f[i] & 255;
    }

    public void a(int i, int i2, int i3) throws InterruptedException {
        this.k.a(this.g.k(this.a), this.d[i] & 255, this.e[i] & 255, this.b, this.c, i2, i3);
    }

    public int b() {
        return this.c;
    }
}
