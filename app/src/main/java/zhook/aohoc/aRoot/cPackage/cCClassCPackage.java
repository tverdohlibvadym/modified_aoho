package zhook.aohoc.aRoot.cPackage;

/* loaded from: classes.dex */
public class cCClassCPackage {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    private aCClassCPackage v;

    public cCClassCPackage(aCClassCPackage aCClassCPackageVar) {
        this.v = aCClassCPackageVar;
    }

    public void a() {
        this.a = this.o;
        this.b = this.p;
        this.c = this.q;
        this.d = this.r;
        this.e = this.s;
        this.f = this.t;
        this.g = this.u;
    }

    public boolean a(int i, int i2) {
        int i3 = this.p + i;
        int i4 = this.q + i2;
        if (i3 > this.v.e) {
            i3 -= this.v.e;
        }
        if (i4 > this.v.f) {
            i4 -= this.v.f;
        }
        return a(i3, i4, this.r, this.s);
    }

    public boolean a(int i, int i2, int i3, int i4) {
        boolean z = false;
        this.p = i;
        this.q = i2;
        this.t = i + i3;
        this.u = i2 + i4;
        if (zhook.aohoc.aRoot.bPackage.dBClassCPackage.b) {
            if (this.p < 0) {
                this.p = 0;
            }
            if (this.t > this.v.e) {
                this.t = this.v.e;
            }
            if (this.q < 0) {
                this.q = 0;
            }
            if (this.u > this.v.f) {
                this.u = this.v.f;
            }
            this.r = this.t - this.p;
            this.s = this.u - this.q;
        } else {
            this.r = i3;
            this.s = i4;
        }
        if (this.r > 0 && this.s > 0) {
            z = true;
        }
        this.o = z;
        return e();
    }

    public boolean a(int[] iArr) {
        return a(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public void b() {
        this.o = this.a;
        this.p = this.b;
        this.q = this.c;
        this.r = this.d;
        this.s = this.e;
        this.t = this.f;
        this.u = this.g;
        e();
    }

    public boolean b(int i, int i2, int i3, int i4) {
        if (this.o) {
            int i5 = i > this.p ? i : this.p;
            int i6 = i2 > this.q ? i2 : this.q;
            int i7 = i + i3 < this.t ? i + i3 : this.t;
            int i8 = (i2 + i4 < this.u ? i2 + i4 : this.u) - i6;
            if (i7 - i5 > 0 && i8 > 0) {
                return true;
            }
        }
        return false;
    }

    public void c() {
        this.h = this.o;
        this.i = this.p;
        this.j = this.q;
        this.k = this.r;
        this.l = this.s;
        this.m = this.t;
        this.n = this.u;
    }

    public boolean c(int i, int i2, int i3, int i4) {
        if (this.o) {
            int i5 = i > this.p ? i : this.p;
            int i6 = i2 > this.q ? i2 : this.q;
            int i7 = (i + i3 < this.t ? i + i3 : this.t) - i5;
            int i8 = (i2 + i4 < this.u ? i2 + i4 : this.u) - i6;
            if (i7 > 0 && i8 > 0) {
                this.v.g.d(i5, i6, i7, i8);
                return true;
            }
        }
        return false;
    }

    public void d() {
        this.o = this.h;
        this.p = this.i;
        this.q = this.j;
        this.r = this.k;
        this.s = this.l;
        this.t = this.m;
        this.u = this.n;
        e();
    }

    public boolean e() {
        if (this.o) {
            this.v.g.d(this.p, this.q, this.r, this.s);
            return true;
        }
        return false;
    }

    public void f() {
        a(0, 0, this.v.e, this.v.f);
    }
}
