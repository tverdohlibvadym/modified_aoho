package zhook.aohoc.aRoot;

import java.util.Vector;

import zhook.aohoc.aRoot.aPackage.aAClassPackage;
import zhook.aohoc.aRoot.cPackage.aCClassCPackage;

/* loaded from: classes.dex */
public final class d {
    public aCClassCPackage g;
    private int j;
    private int k;
    public int a = 0;
    public int b = 0;
    private int h = 0;
    private int i = 0;
    private Vector l = new Vector();
    public int c = 0;
    public int d = 0;
    public int e = 0;
    private int m = 0;
    boolean f = false;

    private void f() {
        b(Math.min(this.e, this.c + 1));
    }

    private void g() {
        b(Math.max(0, this.c - 1));
    }

    private void h() {
        if (this.e <= 0 || this.d >= this.e || this.e >= this.l.size() - 1) {
            return;
        }
        this.d = Math.min(this.e, this.d + 1);
        this.e = Math.max(this.d, this.e + 1);
        f();
    }

    private void i() {
        if (this.e <= 0 || this.d <= 0) {
            return;
        }
        this.d = Math.max(0, this.d - 1);
        this.e = Math.max(this.d, this.e - 1);
        g();
    }

    private void j() {
        if (this.f && this.i > 0 && this.k > 0) {
            this.g.a();
            this.g.a(-12237273);
            this.g.g.a(this.g.c - 4, this.b, 4, this.i);
            float f = (this.i / this.k) * this.i;
            float f2 = 0.0f;
            for (int i = 0; i < this.d; i++) {
                f2 += ((c) this.l.elementAt(i)).b + 2;
            }
            float f3 = f2 > 0.0f ? (this.i - f) * (f2 / (this.k - this.i)) : 0.0f;
            this.g.a(-2105209);
            this.g.g.a(this.g.c - 4, (int) (this.b + f3), 4, (int) f);
        }
    }

    public int a(int i, int i2) {
        if (this.l == null || this.l.isEmpty()) {
            return -1;
        }
        int i3 = this.b;
        int i4 = this.d;
        while (i4 <= this.e) {
            int i5 = i3 + ((c) this.l.elementAt(i4)).b;
            if (i4 != this.e) {
                i5 += 2;
            }
            if (i2 >= i3 && i2 < i5) {
                return i4;
            }
            i4++;
            i3 = i5;
        }
        return -1;
    }

    public void a() {
        this.l.removeAllElements();
        this.j = 0;
        this.k = 0;
        this.d = 0;
        this.e = 0;
        this.c = 0;
        this.m = 0;
        this.f = false;
    }

    public void a(int i) {
        if (i == -1 || i >= this.l.size()) {
            return;
        }
        ((c) this.l.elementAt(i)).j = true;
    }

    public void a(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.h = i3;
        this.i = i4;
    }

    public void a(int i, boolean z) {
        if (i == -1 || i >= this.l.size()) {
            return;
        }
        if (z) {
            ((c) this.l.elementAt(i)).i = true;
            if (this.c == i) {
                return;
            }
            ((c) this.l.elementAt(this.c)).i = false;
        }
        this.c = i;
    }

    public void a(aAClassPackage aAClassPackageVar) {
        if ( aAClassPackageVar == null) {
            return;
        }
        int i = aAClassPackageVar.i();
        if ((1048576 & i) == 0) {
            if ((131072 & i) != 0 || (i & 4) != 0) {
                if (this.c == -1 || this.c <= this.d) {
                    i();
                } else {
                    g();
                }
            }
            if ((262144 & i) == 0 && (i & 256) == 0) {
                return;
            }
            if (this.c == -1 || this.c >= this.e) {
                h();
            } else {
                f();
            }
        }
    }

    public void a(c cVar) {
        if (cVar == null) {
            return;
        }
        this.l.addElement(cVar);
        boolean z = this.l.size() == 1;
        this.k += cVar.b;
        if (!z) {
            this.k += 2;
        }
        cVar.i = z;
        if (this.k < this.i) {
            this.m++;
            this.e = this.l.size() - 1;
        } else {
            this.f = true;
        }
        c();
    }

    public void b(int i) {
        a(i, true);
    }

    public boolean b() {
        return this.l.isEmpty();
    }

    public int c(int i) {
        if (!((i & 16384) == 0 && (i & 32) == 0) && e()) {
            return this.c;
        }
        return -1;
    }

    public void c() {
        this.j = this.f ? (this.g.c - 4) - 2 : this.g.c;
        this.h = this.j;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.l.size()) {
                return;
            }
            c cVar = (c) this.l.elementAt(i2);
            if (cVar != null) {
                cVar.a(this.j);
            }
            i = i2 + 1;
        }
    }

    public void d() {
        if (this.l == null || this.l.isEmpty()) {
            return;
        }
        int i = this.b;
        int i2 = this.d;
        int i3 = i;
        while (true) {
            int i4 = i2;
            if (i4 > this.e) {
                j();
                return;
            }
            c cVar = (c) this.l.elementAt(i4);
            if (cVar != null) {
                cVar.a(this.a, i3);
                i3 += cVar.b + 2;
            }
            i2 = i4 + 1;
        }
    }

    public boolean e() {
        return this.c != -1 && this.c < this.l.size();
    }
}
