package zhook.aohoc.aRoot.cPackage;

import zhook.aohoc.aRoot.aPackage.aAClassPackage;
import zhook.aohoc.aRoot.ag;
import zhook.aohoc.aRoot.y;
import zhook.aohoc.bridge.aBridgeA;
import zhook.aohoc.bridge.eBridgeA;
import zhook.aohoc.bridge.fBridgeA;
import zhook.aohoc.bridge.platform.bPlatform;

/* loaded from: classes.dex */
public class fCClassCPackage {
    public int a;
    public short[] b;
    public short[] c;
    public String[] d;
    public fBridgeA e;
    public eBridgeA f;
    zhook.aohoc.aRoot.j g;
    aAClassPackage h;
    aCClassCPackage i;
    cCClassCPackage j;
    int[] k;
    String[] l;
    public boolean m = true;
    public boolean n = false;

    private fCClassCPackage() {
    }

    public fCClassCPackage(aAClassPackage aAClassPackageVar, zhook.aohoc.aRoot.j jVar) {
        this.g = jVar;
        this.h = aAClassPackageVar;
        this.i = aAClassPackageVar.T;
        this.j = this.i.j;
        this.a = jVar.c;
        y.a("gVarBuffer.init : txtCount=" + this.a);
        this.b = new short[this.a];
        this.c = new short[this.a];
        this.d = new String[this.a];
        System.arraycopy(jVar.e, 0, this.b, 0, this.a);
        System.arraycopy(jVar.f, 0, this.c, 0, this.a);
        this.e = aBridgeA.d.a(this.i.a, this.i.b);
        this.f = this.e.c();
        this.k = new int[this.e.a() * this.e.b()];
        this.e.a(this.k, 0, this.e.a(), 0, 0, this.e.a(), this.e.b());
        for (int i = 0; i < this.k.length; i++) {
            int[] iArr = this.k;
            iArr[i] = iArr[i] & 16777215;
        }
    }

    private fBridgeA e() {
        return aBridgeA.d.a(this.k, this.i.a, this.i.b, true);
    }

    public void a(int i, int i2, int i3) {
        if (this.n) {
            d();
            this.n = false;
        }
        if (this.m) {
            eBridgeA eBridgeAVar = this.i.g;
            this.i.g = this.f;
            this.g.e(i, i2, i3);
            this.i.g = eBridgeAVar;
        }
    }

    public void a(boolean z) {
        this.m = a() || z;
        if (this.m) {
            this.n = true;
        }
    }

    public boolean a() {
        boolean z = false;
        for (int i = 0; i < this.a; i++) {
            if (a(i)) {
                z = true;
            }
        }
        return z;
    }

    public boolean a(int i) {
        b();
        short s = this.c[i];
        short[] sArr = this.b;
        short b = (short) this.h.g.b(s, this.b[i]);
        sArr[i] = b;
        if (b != -1) {
            String str = this.h.g.c[b];
            String str2 = this.l[b];
            this.l[b] = this.h.g.c[b];
            if (str != null ? !str.equals(str2) : str2 != null) {
                return true;
            }
        }
        return false;
    }

    public void b() {
        if (this.h.g.c == null) {
            return;
        }
        int length = this.h.g.c.length;
        if (this.l == null) {
            this.l = new String[length];
        } else if (length > this.l.length) {
            this.l = ag.a(this.l, length, "");
        }
    }

    public void c() {
        this.j.f();
        eBridgeA eBridgeAVar = this.i.g;
        fBridgeA fBridgeAVar = this.e;
        aCClassCPackage aCClassCPackageVar = this.i;
        eBridgeAVar.a(fBridgeAVar, 0, 0, 20);
    }

    public void d() {
        if ( aBridgeA.c.b() != bPlatform.c) {
            this.e.d();
            return;
        }
        this.e = e();
        this.f = this.e.c();
    }
}
