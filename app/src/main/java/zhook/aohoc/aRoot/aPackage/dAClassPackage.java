package zhook.aohoc.aRoot.aPackage;

import zhook.aohoc.aRoot.ag;
import zhook.aohoc.aRoot.cPackage.aCClassCPackage;
import zhook.aohoc.aRoot.cPackage.cCClassCPackage;
import zhook.aohoc.aRoot.cPackage.jCClassCPackage;
import zhook.aohoc.aRoot.k;
import zhook.aohoc.aRoot.q;
import zhook.aohoc.bridge.aBridgeA;
import zhook.aohoc.bridge.bBridgeA;
import zhook.aohoc.bridge.eBridgeA;
import zhook.aohoc.bridge.fBridgeA;
import zhook.aohoc.bridge.jBridgeA;

/* loaded from: classes.dex */
public class dAClassPackage {
    public static boolean p = true;
    private fBridgeA C;
    private fBridgeA D;
    private fBridgeA E;
    private fBridgeA fBridgeA;
    private fBridgeA G;
    private aCClassCPackage I;
    private cCClassCPackage J;
    public fBridgeA a;
    public fBridgeA b;
    public fBridgeA c;
    aAClassPackage d;
    cAClassPackage e;
    String h;
    String i;
    q j;
    public int[] k;
    int l;
    int m;
    String q;
    String r;
    private final int B = 10;
    private int H = -1;
    int f = -1;
    int g = -1;
    public zhook.aohoc.aRoot.d n = new zhook.aohoc.aRoot.d();
    String o = "header";
    int s = 0;
    int[] t = {0, 0, 0, 0, 0, 0, 0};
    int[] u = {131072, 262144, 32768, 65536, 16384, 4096, 8192};
    int[] v = {zhook.aohoc.aRoot.f.Q, zhook.aohoc.aRoot.f.R, zhook.aohoc.aRoot.f.S, zhook.aohoc.aRoot.f.T, zhook.aohoc.aRoot.f.U, zhook.aohoc.aRoot.f.V, zhook.aohoc.aRoot.f.W};
    int[] w = {zhook.aohoc.aRoot.f.J, zhook.aohoc.aRoot.f.K, zhook.aohoc.aRoot.f.L, zhook.aohoc.aRoot.f.M, zhook.aohoc.aRoot.f.N, zhook.aohoc.aRoot.f.O, zhook.aohoc.aRoot.f.P};
    int[] x = {55, 57, 48, 42, 35};
    public boolean y = false;
    private int K = 0;
    int z = 0;
    int A = 0;

    public dAClassPackage(aAClassPackage aAClassPackageVar) {
        this.d = aAClassPackageVar;
        this.e = aAClassPackageVar.b;
        this.I = this.d.T;
        this.J = this.I.j;
    }

    private void A() {
        if (this.fBridgeA == null || !this.y) {
            this.fBridgeA = zhook.aohoc.aRoot.cPackage.gCClassCPackage.a("/logo.png");
        }
    }

    private void B() {
        fBridgeA a;
        if ((this.G == null || !this.y) && (a = zhook.aohoc.aRoot.cPackage.gCClassCPackage.a("/line.png")) != null) {
            int a2 = a.a();
            this.G = aBridgeA.d.a(this.I.c, a.b());
            eBridgeA c = this.G.c();
            for (int i = 0; i < this.I.c; i += a2) {
                aCClassCPackage aCClassCPackageVar = this.I;
                c.a(a, i, 0, 20);
            }
        }
    }

    private int C() {
        bBridgeA a = this.I.h.a();
        if (a == null) {
            return 0;
        }
        return a.a();
    }

    private int D() {
        if (this.fBridgeA == null) {
            return 0;
        }
        return this.fBridgeA.b();
    }

    private int E() {
        if (this.G == null) {
            return 0;
        }
        return this.G.b();
    }

    private int F() {
        return (int) ((C() * 1.2f) + 0.5f);
    }

    private int G() {
        return D() + E() + F() + 1;
    }

    private void H() {
        this.d.h.f();
    }

    private void I() {
        f();
        g();
        h();
    }

    private void a(String str, int i, int i2, int[] iArr) {
        this.f = i;
        this.g = i2;
        this.k = iArr;
        bBridgeA a = this.I.h.a();
        int a2 = a.a();
        this.l = 0;
        this.m = 0;
        if (str == null) {
            this.j = null;
            return;
        }
        this.j = new q();
        this.j.a(str, a, this.I.c - 8);
        this.m = Math.max(0, this.j.b - ((((((this.I.d - ((a2 * 3) / 2)) - 1) - 4) + a2) - 1) / a2));
    }

    private void b(boolean z) {
        bBridgeA a = this.I.h.a();
        int a2 = a.a();
        int i = (this.I.c / 2) - 2;
        int i2 = (int) ((a2 * 1.5f) + 0.5f);
        int i3 = this.I.d - i2;
        int i4 = ((int) (((i2 - a2) / 2.0f) + 0.5f)) + i3;
        if (z) {
            this.I.a(-2105209);
            this.I.g.a(0, i3, i, i2);
            this.I.a(-14014971);
            this.I.g.a(0, i3 + 1, i - 1, i2 - 1);
            int i5 = i + 4;
            this.I.a(-2105209);
            this.I.g.a(i5, i3, i, i2);
            this.I.a(-14014971);
            this.I.g.a(i5 + 1, i3 + 1, i - 1, i2 - 1);
        }
        if (this.h != null) {
            this.I.a(-2105209);
            eBridgeA eBridgeAVar = this.I.g;
            String str = this.h;
            aCClassCPackage aCClassCPackageVar = this.I;
            eBridgeAVar.a(str, 5, i4, 20);
        }
        if (this.i != null) {
            int a3 = (this.I.c - 5) - a.a(this.i);
            this.I.a(-2105209);
            eBridgeA eBridgeAVar2 = this.I.g;
            String str2 = this.i;
            aCClassCPackage aCClassCPackageVar2 = this.I;
            eBridgeAVar2.a(str2, a3, i4, 20);
        }
    }

    private void n() {
        this.j = null;
        this.l = 0;
        this.m = 0;
        this.f = -1;
        this.g = -1;
        this.k = null;
        this.n.a();
    }

    private void o() {
        this.o = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.ac);
        this.h = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.d);
        this.i = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.ae);
        zhook.aohoc.aRoot.e[] eVarArr = this.e.c;
        jBridgeA jBridgeAVar = this.d.S;
        if (eVarArr != null) {
            for (int i = 0; i < eVarArr.length; i++) {
                zhook.aohoc.aRoot.e eVar = eVarArr[i];
                this.n.a(new zhook.aohoc.aRoot.c(this.I, eVar.f(), eVar.a() ? eVar.h() + "" : "offline"));
                String str = this.e.e;
                if (str != null && str.length() != 0) {
                    if (eVar.e().equals(str)) {
                        this.n.b(i);
                    }
                    if ( jBridgeAVar != null && jBridgeAVar.b("aoholu_" + eVar.e())) {
                        this.n.a(i);
                    }
                }
            }
        }
        a("", 9, 30, (int[]) null);
    }

    private void p() {
        this.h = null;
        this.i = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.f);
        a(zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.ad), -1, 9, (int[]) null);
    }

    private void q() {
        this.h = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.d);
        this.i = null;
        this.o = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.s);
        for (int i = 0; i < zhook.aohoc.aRoot.f.ah.length; i++) {
            this.n.a(new zhook.aohoc.aRoot.c(this.I, zhook.aohoc.aRoot.f.ah[i], ""));
            String str = this.d.a.l;
            if (str != null && str.length() != 0 && zhook.aohoc.aRoot.f.ai.length > i && str.equals(zhook.aohoc.aRoot.f.ai[i])) {
                this.n.b(i);
                this.n.a(i);
            }
        }
        a("", 9, -1, (int[]) null);
    }

    private void r() {
        this.K = 0;
        this.d.f.g();
        s();
    }

    private void s() {
        this.h = null;
        this.i = null;
        this.o = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.Y);
        String str = "";
        if (this.s > 0) {
            for (int i = 0; i < this.s; i++) {
                str = str + zhook.aohoc.aRoot.f.b(this.v[i]) + ":  " + this.t[i] + "  '" + this.d.Q.b(this.t[i]) + "'\n";
            }
            str = str + "\n";
        }
        if (this.K != 0) {
            str = str + zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.X) + "\n\n";
        }
        a((str + zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.m) + "\n") + zhook.aohoc.aRoot.f.b(this.w[this.s]), -1, -1, (int[]) null);
        this.l = this.m;
    }

    private void t() {
        int g = this.d.f.g();
        if (g != 0) {
            if (ag.a(g, this.x) != -1) {
                this.K = g;
                s();
                return;
            }
            this.K = 0;
            int[] iArr = this.t;
            int i = this.s;
            this.s = i + 1;
            iArr[i] = g;
            if (this.s < this.t.length) {
                s();
                return;
            }
            this.d.f.a(this.t, this.u);
            this.d.a(21);
        }
    }

    private void u() {
        int c = this.d.f.c(4096);
        int c2 = this.d.f.c(8192);
        int c3 = this.d.f.c(16384);
        int c4 = this.d.f.c(32768);
        int c5 = this.d.f.c(65536);
        int c6 = this.d.f.c(131072);
        int c7 = this.d.f.c(262144);
        if (c6 == 0 || c7 == 0 || c4 == 0 || c5 == 0 || c3 == 0) {
            k kVar = new k();
            this.d.Q.a(kVar);
            if (c6 == 0) {
                c6 = kVar.a;
            }
            if (c7 == 0) {
                c7 = kVar.b;
            }
            if (c4 == 0) {
                c4 = kVar.c;
            }
            if (c5 == 0) {
                c5 = kVar.d;
            }
            if (c3 == 0) {
                c3 = kVar.e;
            }
        }
        this.t[0] = c6;
        this.t[1] = c7;
        this.t[2] = c4;
        this.t[3] = c5;
        this.t[4] = c3;
        this.t[5] = c;
        this.t[6] = c2;
        this.h = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.d);
        this.i = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.i);
        this.o = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.Y);
        for (int i = 0; i < this.t.length; i++) {
            this.n.a(new zhook.aohoc.aRoot.c(this.I, zhook.aohoc.aRoot.f.b(this.v[i]), this.t[i] + "  '" + this.d.Q.b(this.t[i]) + "'"));
        }
        a("", 9, 22, (int[]) null);
    }

    private void v() {
        switch (this.d.a.d.a) {
            case 3:
            case 4:
                this.i = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.g);
                break;
            default:
                this.i = null;
                break;
        }
        this.h = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.c);
        a(this.q + "\n\n" + this.r, 9, 24, (int[]) null);
    }

    private void w() {
        int i;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5 = 1;
        if (zhook.aohoc.aRoot.bPackage.dBClassCPackage.i) {
            this.i = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.n);
            i = 10;
        } else {
            this.i = null;
            i = -1;
        }
        this.h = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.b);
        this.o = "";
        String g = this.e.g();
        if (g == null || g.length() == 0) {
            g = this.e.e;
        }
        if (g != null && g.length() > 0) {
            this.o = g;
        }
        int f = this.e.f();
        if (this.e.d == null) {
            this.i = null;
            this.o = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.ag);
            iArr = null;
            i5 = 0;
            i2 = -1;
        } else if (this.d.a.d.b != -1) {
            int[] a = ag.a(10, (int[]) null, 0, 10);
            this.n.a(new zhook.aohoc.aRoot.c(this.I, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.n), ""));
            int[] a2 = ag.a(13, a, 1, 10);
            this.n.a(new zhook.aohoc.aRoot.c(this.I, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.q), ""));
            i5 = 2;
            i2 = i;
            iArr = a2;
        } else {
            if (zhook.aohoc.aRoot.bPackage.dBClassCPackage.i && f == 0) {
                iArr = ag.a(12, (int[]) null, 0, 10);
                this.n.a(new zhook.aohoc.aRoot.c(this.I, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.p), ""));
            } else {
                iArr = null;
                i5 = 0;
            }
            if (zhook.aohoc.aRoot.bPackage.dBClassCPackage.h) {
                iArr = ag.a(11, iArr, i5, 10);
                this.n.a(new zhook.aohoc.aRoot.c(this.I, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.o), ""));
                i5++;
            }
            if (zhook.aohoc.aRoot.bPackage.dBClassCPackage.j && f == 0) {
                iArr = ag.a(10, iArr, i5, 10);
                this.n.a(new zhook.aohoc.aRoot.c(this.I, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.af), ""));
                i5++;
            }
            this.i = null;
            i2 = -1;
        }
        if ("http://194.67.198.77/adm/man/slist.asp" != null && "http://194.67.198.77/adm/man/slist.asp".length() > 0) {
            iArr = ag.a(30, iArr, i5, 10);
            this.n.a(new zhook.aohoc.aRoot.c(this.I, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.ac), ""));
            i5++;
        }
        int i6 = i5 + 1;
        int[] a3 = ag.a(8, iArr, i5, 10);
        this.n.a(new zhook.aohoc.aRoot.c(this.I, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.s), ""));
        if (zhook.aohoc.aRoot.bPackage.dBClassCPackage.k) {
            i3 = i6 + 1;
            a3 = ag.a(16, a3, i6, 10);
            this.n.a(new zhook.aohoc.aRoot.c(this.I, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.u), ""));
        } else {
            i3 = i6;
        }
        int i7 = i3 + 1;
        int[] a4 = ag.a(21, a3, i3, 10);
        this.n.a(new zhook.aohoc.aRoot.c(this.I, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.t), ""));
        if (this.d.a.d.b == -1 || !zhook.aohoc.aRoot.bPackage.dBClassCPackage.l) {
            i4 = i7;
        } else {
            a4 = ag.a(60, a4, i7, 10);
            this.n.a(new zhook.aohoc.aRoot.c(this.I, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.r), ""));
            i4 = i7 + 1;
        }
        a("", -2, i2, ag.a(a4, i4));
    }

    private void x() {
        if (this.d.A == 50) {
            this.h = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.c);
            this.i = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.b);
            a((String) null, 9, -2, (int[]) null);
        } else if (this.d.A == 1 || this.d.A == 50 || this.d.A == 51) {
            this.h = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.f);
            this.i = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.b);
            a((String) null, 9, -2, (int[]) null);
        } else {
            this.h = null;
            this.i = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.b);
            a((String) null, -1, -2, (int[]) null);
        }
    }

    private void y() {
        this.h = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.g);
        this.i = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.c);
        String str = "" + zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.v);
        if (p) {
            str = str + zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.w);
        }
        a(str + ag.a(zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.x), "%1", this.d.a.c), 6, 9, (int[]) null);
    }

    private void z() {
        fBridgeA a;
        if ((this.E == null || !this.y) && (a = zhook.aohoc.aRoot.cPackage.gCClassCPackage.a("/bkg.png")) != null) {
            this.E = aBridgeA.d.a(this.I.c, this.I.d);
            eBridgeA c = this.E.c();
            int a2 = a.a();
            int b = a.b();
            for (int i = 0; i < this.I.d; i += b) {
                for (int i2 = 0; i2 < this.I.c; i2 += a2) {
                    aCClassCPackage aCClassCPackageVar = this.I;
                    c.a(a, i2, i, 20);
                }
            }
        }
    }

    public int a(int i, int i2) {
        if (i2 >= this.I.d - i()) {
            if (i <= this.I.c / 2) {
                this.d.e(4096);
            } else {
                this.d.e(8192);
            }
            return -1;
        }
        return this.n.a(i, i2);
    }

    public void a() {
        zhook.aohoc.aRoot.y.a(">> appVisual.postinitialize() : BEGIN");
        if (this.y) {
            return;
        }
        try {
            this.n.g = this.d.T;
            z();
            B();
            A();
            if (this.a == null) {
                this.a = zhook.aohoc.aRoot.cPackage.gCClassCPackage.a("/toloop1.png");
            }
            if (this.b == null) {
                this.b = zhook.aohoc.aRoot.cPackage.gCClassCPackage.a("/toloop2.png");
            }
            if (this.c == null) {
                this.c = zhook.aohoc.aRoot.cPackage.gCClassCPackage.a("/orient.png");
            }
            int G = (this.I.d > 160 ? 8 : 2) + G();
            this.n.a(0, G, this.I.c, this.I.d - (i() + G));
            this.n.c();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.y = true;
        zhook.aohoc.aRoot.y.a(">> appVisual.postinitialize() : END");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(int i, int i2, int i3) {
        switch (i) {
            case 1:
            case 2:
            case 50:
            case 51:
                c();
                return;
            case 3:
                H();
                return;
            case 22:
                t();
                break;
        }
        if (this.j != null) {
            a(true);
        }
    }

    public void a(int i, int i2, int i3, int i4) {
    }

    public void a(boolean z) {
        b();
        int a = this.I.h.a().a();
        if (this.j != null) {
            this.I.a();
            this.J.f();
            this.I.b(0);
            int i = 4;
            int i2 = (this.I.d - ((a * 3) / 2)) - 1;
            int i3 = i2 - 4;
            if (this.m > 0) {
                this.I.a(3170352);
                this.I.a(this.I.c - 2, 4, 2, i3);
                int i4 = ((((i3 + a) - 1) / a) * i3) / this.j.b;
                this.I.a(5283920);
                this.I.a(this.I.c - 2, (((i3 - i4) * this.l) / this.m) + 4, 2, i4);
            }
            this.I.a(16777215);
            int i5 = this.l;
            while (true) {
                int i6 = i5;
                if (i6 >= this.j.b || i > i2 - a) {
                    break;
                }
                short s = this.j.c[i6];
                short s2 = this.j.d[i6];
                if (s < s2) {
                    this.I.a(16777215);
                    aCClassCPackage aCClassCPackageVar = this.I;
                    this.I.g.a(this.j.a, s, s2 - s, 3, i, 20);
                    i += a;
                } else {
                    i += a / 3;
                }
                i5 = i6 + 1;
            }
        }
        m();
        b(z);
    }

    public void b() {
        if (this.d.C >= 2) {
            int i = this.d.i();
            if ((1048576 & i) == 0) {
                if (this.m > 0 && this.l > 0 && (131072 & i) != 0) {
                    this.l = Math.max(0, this.l - 1);
                }
                if (this.m > 0 && this.l < this.m && (262144 & i) != 0) {
                    this.l = Math.min(this.m, this.l + 1);
                }
                this.n.a(this.d);
                int c = this.n.c(i);
                if (this.k != null && c != -1 && c < this.k.length) {
                    this.d.a(this.k[c]);
                } else if ((i & 5120) != 0) {
                    if (this.f != -1) {
                        this.d.a(this.f);
                    }
                } else if ((i & 10240) == 0 || this.g == -1) {
                } else {
                    this.d.a(this.g);
                }
            }
        }
    }

    public void b(int i, int i2, int i3, int i4) {
        n();
        switch (i) {
            case 1:
            case 50:
            case 51:
                x();
                this.C = zhook.aohoc.aRoot.cPackage.gCClassCPackage.a("/title.jpg");
                this.D = zhook.aohoc.aRoot.cPackage.gCClassCPackage.a("/progress.png");
                this.H = zhook.aohoc.aRoot.f.aa;
                if (i == 50) {
                    this.H = zhook.aohoc.aRoot.f.a;
                    return;
                }
                return;
            case 2:
                this.d.a.b = null;
                x();
                this.H = zhook.aohoc.aRoot.f.Z;
                return;
            case 3:
                this.C = null;
                this.H = -1;
                return;
            case 4:
                if (this.d.a.b != null) {
                    y();
                    this.H = -1;
                    return;
                }
                return;
            case 8:
                q();
                return;
            case 9:
                w();
                return;
            case 21:
                u();
                return;
            case 22:
                this.s = 0;
                r();
                return;
            case 25:
                v();
                return;
            case 30:
                p();
                return;
            case 31:
                o();
                return;
            default:
                return;
        }
    }

    public int c(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 == 0) {
            i2 = 1;
        } else {
            i5 = i;
        }
        int a = this.D.a();
        int b = this.D.b();
        int i6 = (this.I.a - a) / 2;
        int i7 = b + i4;
        this.I.h.d(0, 0, this.I.a, this.I.b);
        this.I.h.a(0);
        this.I.h.a(i6, i7, a, 4);
        if (i2 > 0) {
            this.I.h.a(i3);
            this.I.h.a(i6, i7 + 1, (i5 * a) / i2, 2);
        }
        return 4;
    }

    public void c() {
        jCClassCPackage jCClassCPackageVar = this.d.h;
        if ( jCClassCPackageVar.k() && jCClassCPackageVar.g(1)) {
            try {
                this.I.a();
                this.J.f();
                this.I.b(0);
                if (this.C != null) {
                    this.J.f();
                    aCClassCPackage aCClassCPackageVar = this.I;
                    this.I.g.a(this.C, (this.I.a - this.C.a()) / 2, (this.I.d - this.C.b()) / 2, 20);
                }
                if (this.H != -1) {
                    String b = zhook.aohoc.aRoot.f.b(this.H);
                    this.J.f();
                    int a = this.I.g.a().a(b);
                    this.I.g.a(16777215);
                    aCClassCPackage aCClassCPackageVar2 = this.I;
                    this.I.g.a(b, ((this.I.a - a) / 2) + ((((int) System.currentTimeMillis()) / 100) & 1), 9, 20);
                }
                d();
            } finally {
                jCClassCPackageVar.n();
            }
        }
    }

    public void d() {
        this.I.a();
        this.J.f();
        bBridgeA a = this.I.g.a();
        int a2 = a.a();
        int a3 = (this.I.c - a.a("0.70")) / 2;
        int i = this.I.d - (a2 * 2);
        this.I.g.a(6316080);
        aCClassCPackage aCClassCPackageVar = this.I;
        this.I.g.a("0.70", a3 - 1, i, 20);
        aCClassCPackage aCClassCPackageVar2 = this.I;
        this.I.g.a("0.70", a3 + 1, i, 20);
        this.I.g.a(8421440);
        eBridgeA eBridgeAVar = this.I.g;
        aCClassCPackage aCClassCPackageVar3 = this.I;
        eBridgeAVar.a("0.70", a3, i, 20);
        a(false);
    }

    public void e() {
        if (this.E == null) {
            return;
        }
        this.I.a();
        this.J.f();
        eBridgeA eBridgeAVar = this.I.g;
        fBridgeA fBridgeAVar = this.E;
        aCClassCPackage aCClassCPackageVar = this.I;
        eBridgeAVar.a(fBridgeAVar, 0, 0, 20);
    }

    public void f() {
        if (this.fBridgeA == null) {
            return;
        }
        this.I.a();
        int a = this.fBridgeA.a();
        int b = this.fBridgeA.b();
        this.I.g.a(0);
        this.I.g.a(0, 0, this.I.c, b);
        eBridgeA eBridgeAVar = this.I.g;
        fBridgeA fBridgeAVar = this.fBridgeA;
        aCClassCPackage aCClassCPackageVar = this.I;
        eBridgeAVar.a(fBridgeAVar, (this.I.c - a) / 2, 0, 20);
    }

    public void g() {
        this.I.a();
        this.J.f();
        int D = D();
        eBridgeA eBridgeAVar = this.I.g;
        fBridgeA fBridgeAVar = this.G;
        aCClassCPackage aCClassCPackageVar = this.I;
        eBridgeAVar.a(fBridgeAVar, 0, D, 20);
    }

    public void h() {
        int C = C();
        int i = this.I.c;
        int F = F();
        int D = D() + 0 + E();
        this.I.a();
        this.I.g.a(-14014971);
        this.I.g.a(0, D, i, F);
        this.I.g.a(-2105209);
        this.I.g.b(0, D + F, i, D + F);
        if (this.o == null || this.o.length() <= 0) {
            return;
        }
        int a = this.I.g.a().a(this.o);
        int i2 = ((int) (((F - C) / 2.0f) + 0.5f)) + D;
        aCClassCPackage aCClassCPackageVar = this.I;
        this.I.g.a(this.o, (i - a) / 2, i2, 20);
    }

    public int i() {
        return (int) ((C() * 1.5f) + 0.5f);
    }

    public void j() {
        if (this.D != null) {
            int a = this.D.a();
            int b = this.D.b();
            int i = (this.I.a - a) / 2;
            this.I.h.d(i, -1, a, b + 2);
            this.I.h.a(0);
            int i2 = this.z;
            this.z = i2 + 1;
            int i3 = i2 % a;
            aCClassCPackage aCClassCPackageVar = this.I;
            this.I.h.a(this.D, i + i3, 0, 20);
            aCClassCPackage aCClassCPackageVar2 = this.I;
            this.I.h.a(this.D, i - (a - i3), 0, 20);
        }
    }

    public void k() {
        if (this.d.A == 1 || this.d.A == 2 || this.c == null) {
            return;
        }
        this.I.h.d(0, 0, this.c.a(), this.c.b());
        this.I.h.a(0);
        eBridgeA eBridgeAVar = this.I.h;
        fBridgeA fBridgeAVar = this.c;
        aCClassCPackage aCClassCPackageVar = this.I;
        eBridgeAVar.a(fBridgeAVar, 0, 0, 20);
    }

    public void l() {
        if (this.d.A == 1 || this.d.A == 2) {
            return;
        }
        fBridgeA fBridgeAVar = null;
        if (this.d.Q.g == 0) {
            fBridgeAVar = this.b;
        } else if (this.d.Q.g == 1) {
            fBridgeAVar = this.a;
        }
        if ( fBridgeAVar != null) {
            int a = fBridgeAVar.a();
            int b = fBridgeAVar.b();
            int i = this.I.a - a;
            this.I.h.d(i, 0, a, b);
            this.I.h.a(0);
            eBridgeA eBridgeAVar = this.I.h;
            aCClassCPackage aCClassCPackageVar = this.I;
            eBridgeAVar.a(fBridgeAVar, i, 0, 20);
        }
    }

    public void m() {
        if (this.n == null || this.n.b()) {
            return;
        }
        this.I.a();
        this.J.f();
        this.I.b(0);
        e();
        I();
        this.J.f();
        this.n.d();
    }
}
