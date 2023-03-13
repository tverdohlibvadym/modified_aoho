package zhook.aohoc.aRoot;

import zhook.aohoc.aRoot.aPackage.aAClassPackage;

/* loaded from: classes.dex */
public class s {
    j a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    aAClassPackage j;
    private int k;
    private int l = 0;

    public s(aAClassPackage aAClassPackageVar, j jVar, int i, int i2, int i3, int i4, int i5, int i6) {
        this.j = aAClassPackageVar;
        this.a = jVar;
        this.c = this.a.a(i & 8191, 0, false, true, true);
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.k = i6;
        this.h = this.d;
        this.i = this.e;
    }

    public void a(int i, int i2) {
        this.a.f(this.c, this.h + i, this.i + i2);
    }

    public boolean a() {
        if ((this.c & 8192) == 0) {
            return false;
        }
        if (this.l == 0) {
            this.l = this.j.w;
        }
        if (this.k > 0) {
            int i = this.j.w - this.l;
            if (i > this.k) {
                i = this.k;
            }
            this.h = ((this.d * (this.k - i)) + (this.f * i)) / this.k;
            this.i = ((this.e * (this.k - i)) + (this.g * i)) / this.k;
            if (i >= this.k) {
                this.k = 0;
            }
        }
        if (this.b != this.j.D) {
            int n = zhook.aohoc.aRoot.j.n(this.c);
            if (n == this.c) {
                n = this.k == 0 ? n & (-8193) : zhook.aohoc.aRoot.j.a(n, 0);
            }
            this.c = n;
            this.b = this.j.D;
        }
        return true;
    }
}
