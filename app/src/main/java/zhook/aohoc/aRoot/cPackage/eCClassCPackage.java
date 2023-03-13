package zhook.aohoc.aRoot.cPackage;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import zhook.aohoc.aRoot.aPackage.aAClassPackage;
import zhook.aohoc.aRoot.aPackage.cAClassPackage;
import zhook.aohoc.aRoot.l;
import zhook.aohoc.aRoot.n;
import zhook.aohoc.aRoot.p;
import zhook.aohoc.aRoot.r;
import zhook.aohoc.bridge.aBridgeA;

/* loaded from: classes.dex */
public class eCClassCPackage {
    public static int a = 4;
    public static int b = 3;
    public static int c = 2130112;
    public static int d = 12632096;
    public static int e = 1;
    public static int f = 3;
    public static int g = 2;
    public static int h = 4;
    String A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    int G;
    int H;
    int I;
    int J;
    int K;
    int L;
    int M;
    String N;
    String O;
    String P;
    public aAClassPackage Q;
    public cAClassPackage R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private int Z;
    private short[] aA;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private p an;
    private int ao;
    private p[] ap;
    private short[] aq;
    private int ar;
    private int as;
    private boolean at;
    private int au;
    private int av;
    private aCClassCPackage aw;
    private bCClassCPackage ax;
    private cCClassCPackage ay;
    private boolean az;
    boolean i;
    boolean j;
    int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public n p;
    public n q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    int z;

    public eCClassCPackage(DataInputStream dataInputStream, aAClassPackage aAClassPackageVar) throws Throwable {
        this.A = "";
        this.ar = -1;
        this.as = -1;
        this.K = 1;
        this.L = 1;
        this.M = 0;
        this.N = "";
        this.O = "";
        this.P = "";
        this.aA = new short[4];
        this.Q = aAClassPackageVar;
        this.R = aAClassPackageVar.b;
        this.aw = this.Q.T;
        this.ax = this.aw.i;
        this.ay = this.aw.j;
        this.S = 0;
        this.l = dataInputStream.readShort();
        byte readByte = dataInputStream.readByte();
        zhook.aohoc.aRoot.y.a("");
        zhook.aohoc.aRoot.y.a("          CREATE FORM : BEGIN form_id=" + this.l);
        zhook.aohoc.aRoot.y.a("");
        zhook.aohoc.aRoot.y.a("form_id=" + this.l);
        this.n = (readByte & 1) != 0;
        this.o = (readByte & 4) != 0;
        this.m = (readByte & 2) != 0;
        this.i = (readByte & 16) != 0;
        this.j = (readByte & 8) != 0;
        this.B = dataInputStream.readShort();
        this.A = dataInputStream.readUTF();
        this.J = dataInputStream.readInt();
        this.I = dataInputStream.readInt();
        this.p = new n(aAClassPackageVar, this.T, this.U, dataInputStream);
        this.q = new n(aAClassPackageVar, this.T, this.U, dataInputStream);
        this.C = this.p.e[zhook.aohoc.aRoot.bPackage.cBClassCPackage.C][zhook.aohoc.aRoot.bPackage.cBClassCPackage.z];
        this.s = zhook.aohoc.aRoot.ag.a(this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.R]) / 4;
        this.t = zhook.aohoc.aRoot.ag.a(this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.S]) / 4;
        this.u = zhook.aohoc.aRoot.ag.a(this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.T]) / 2;
        this.w = zhook.aohoc.aRoot.ag.a(this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.U]) / 4;
        this.x = zhook.aohoc.aRoot.ag.a(this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.V]) / 4;
        this.y = zhook.aohoc.aRoot.ag.a(this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.W]) / 2;
        this.Z = Math.max(Math.max(this.s, this.t), this.u);
        zhook.aohoc.aRoot.y.a("");
        zhook.aohoc.aRoot.y.a("          CREATE FORM : END");
        zhook.aohoc.aRoot.y.a("");
    }

    public eCClassCPackage(aAClassPackage aAClassPackageVar, int i, boolean z, boolean z2, boolean z3, DataInputStream dataInputStream) throws IOException, InterruptedException {
        this.A = "";
        this.ar = -1;
        this.as = -1;
        this.K = 1;
        this.L = 1;
        this.M = 0;
        this.N = "";
        this.O = "";
        this.P = "";
        this.aA = new short[4];
        this.Q = aAClassPackageVar;
        this.R = aAClassPackageVar.b;
        this.aw = this.Q.T;
        this.ax = this.aw.i;
        this.ay = this.aw.j;
        this.S = 0;
        if (i == 55) {
        }
        this.l = i;
        zhook.aohoc.aRoot.y.a("");
        zhook.aohoc.aRoot.y.a("          CREATE FORM : BEGIN form_id=" + this.l);
        zhook.aohoc.aRoot.y.a("");
        zhook.aohoc.aRoot.y.a("form_id=" + this.l);
        this.m = z;
        this.j = z2;
        this.i = z3;
        this.T = dataInputStream.readUnsignedShort();
        this.U = dataInputStream.readInt();
        this.W = dataInputStream.readUnsignedShort();
        this.X = dataInputStream.readInt();
        this.B = dataInputStream.readShort();
        this.A = dataInputStream.readUTF();
        this.J = dataInputStream.readInt();
        this.I = dataInputStream.readInt();
        this.V = this.Q.d.b(this.T, this.U);
        this.Y = this.Q.d.b(this.W, this.X);
        this.R.g.e(128);
        try {
            this.Q.d.h(this.V);
            this.Q.d.h(this.Y);
            this.R.g.e();
            this.Q.e.c();
            this.p = this.Q.d.j(this.V);
            this.Q.d.k(this.V);
            this.q = this.Q.d.j(this.Y);
            this.Q.d.k(this.Y);
            this.C = this.p.e[zhook.aohoc.aRoot.bPackage.cBClassCPackage.C][zhook.aohoc.aRoot.bPackage.cBClassCPackage.z];
            this.s = zhook.aohoc.aRoot.ag.a(this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.R]) / 4;
            this.t = zhook.aohoc.aRoot.ag.a(this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.S]) / 4;
            this.u = zhook.aohoc.aRoot.ag.a(this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.T]) / 2;
            this.w = zhook.aohoc.aRoot.ag.a(this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.U]) / 4;
            this.x = zhook.aohoc.aRoot.ag.a(this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.V]) / 4;
            this.y = zhook.aohoc.aRoot.ag.a(this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.W]) / 2;
            this.Z = Math.max(Math.max(this.s, this.t), this.u);
            zhook.aohoc.aRoot.y.a("");
            zhook.aohoc.aRoot.y.a("          CREATE FORM : END");
            zhook.aohoc.aRoot.y.a("");
        } catch (Throwable th) {
            this.R.g.e();
            throw th;
        }
    }

    private void G() {
        short s = this.p.d[zhook.aohoc.aRoot.bPackage.cBClassCPackage.n];
        if (s != -1 && (s & 57344) == 24576) {
            this.ar = this.p.c.a(s & 8191, 0, true, true, true);
        }
        short s2 = this.p.d[zhook.aohoc.aRoot.bPackage.cBClassCPackage.b];
        if (s2 == -1 || (s2 & 57344) != 24576) {
            return;
        }
        this.as = this.p.c.a(s2 & 8191, 0, true, true, true);
    }

    private void H() throws InterruptedException {
        try {
            this.Q.g.a(0, this.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.p][zhook.aohoc.aRoot.bPackage.bBClassCPackage.w]);
            this.Q.g.a(1, this.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.p][zhook.aohoc.aRoot.bPackage.bBClassCPackage.y]);
            zhook.aohoc.aRoot.y.a("title=" + this.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.p][zhook.aohoc.aRoot.bPackage.bBClassCPackage.w]);
            zhook.aohoc.aRoot.y.a("header=" + this.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.p][zhook.aohoc.aRoot.bPackage.bBClassCPackage.y]);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.ax.a();
        this.ay.f();
        if (this.p.d[zhook.aohoc.aRoot.bPackage.cBClassCPackage.a] != -1) {
            this.p.c.e(this.p.d[zhook.aohoc.aRoot.bPackage.cBClassCPackage.a], 0, 0);
        } else {
            this.p.c.e(this.p.d[zhook.aohoc.aRoot.bPackage.cBClassCPackage.b], 0, 0);
        }
        this.ax.a();
        W();
        X();
        r();
        s();
        x();
        V();
        t();
        T();
        u();
        P();
        U();
        this.ax.d = false;
    }

    private void I() {
        this.q.c.e(this.q.f[zhook.aohoc.aRoot.bPackage.bBClassCPackage.j][zhook.aohoc.aRoot.bPackage.bBClassCPackage.g], 0, this.aw.b);
        this.q.c.e(this.q.f[zhook.aohoc.aRoot.bPackage.bBClassCPackage.j][zhook.aohoc.aRoot.bPackage.bBClassCPackage.h], this.aw.a, this.aw.b);
    }

    private void J() {
        int[] iArr = this.q.g[zhook.aohoc.aRoot.bPackage.bBClassCPackage.a];
        short[] sArr = this.q.f[zhook.aohoc.aRoot.bPackage.bBClassCPackage.k];
        int a2 = zhook.aohoc.aRoot.ag.a(sArr);
        this.Q.c(-1);
        for (int i = 0; i < a2; i++) {
            this.Q.a(new r(this.Q, iArr[i], 1048576, false, sArr[i]), -1);
        }
    }

    private synchronized void K() {
        zhook.aohoc.aRoot.y.a("form_id=" + this.l);
        if (this.l == 55) {
        }
        this.r = this.q.f[zhook.aohoc.aRoot.bPackage.bBClassCPackage.j][zhook.aohoc.aRoot.bPackage.bBClassCPackage.c];
        this.v = this.q.f[zhook.aohoc.aRoot.bPackage.bBClassCPackage.j][zhook.aohoc.aRoot.bPackage.bBClassCPackage.d];
        this.z = this.q.f[zhook.aohoc.aRoot.bPackage.bBClassCPackage.j][zhook.aohoc.aRoot.bPackage.bBClassCPackage.e];
        zhook.aohoc.aRoot.y.a("iItemCount=" + this.r);
        zhook.aohoc.aRoot.y.a("iFieldCount=" + this.v);
        if (this.C > 0) {
            this.D = ((this.r + this.C) - 1) / this.C;
            this.E = ((this.Z + this.C) - 1) / this.C;
            this.F = this.C * this.D;
        } else {
            this.C = 1;
            this.D = this.r;
            this.E = this.Z;
            this.F = this.r;
        }
        if (this.r < this.Z && this.p.d[zhook.aohoc.aRoot.bPackage.cBClassCPackage.a] != -1) {
            if (this.p.e[zhook.aohoc.aRoot.bPackage.cBClassCPackage.C][zhook.aohoc.aRoot.bPackage.cBClassCPackage.A] == 2) {
                this.M = this.Z - this.r;
            } else if (this.p.e[zhook.aohoc.aRoot.bPackage.cBClassCPackage.C][zhook.aohoc.aRoot.bPackage.cBClassCPackage.A] == 1) {
                this.M = (this.Z - this.r) / 2;
            }
        }
    }

    private void L() throws InterruptedException {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        if (zhook.aohoc.aRoot.ag.b(this.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.r]) == 0) {
            this.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.r] = null;
        }
        dCClassCPackage b2 = b(zhook.aohoc.aRoot.bPackage.cBClassCPackage.ad);
        this.ag = b2.e();
        short s = this.p.d[zhook.aohoc.aRoot.bPackage.cBClassCPackage.j];
        if (s != -1) {
            short[] sArr = this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.M];
            i2 = (sArr[2] - 2) - (a * 4);
            i = (sArr[3] - 2) - (b * 2);
        } else {
            i = 0;
            i2 = 0;
        }
        short s2 = this.p.d[zhook.aohoc.aRoot.bPackage.cBClassCPackage.l];
        if (s2 != -1) {
            short[] sArr2 = this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.O];
            i4 = sArr2[2] - (a * 4);
            i3 = sArr2[3] - (b * 2);
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (!this.j) {
            this.ah = 0;
            this.ai = 0;
            this.aj = 0;
            this.ak = 0;
            this.al = 0;
            this.am = 0;
        }
        if (s != -1) {
            this.aj = i / this.ag;
            if (this.j) {
                this.aj++;
            }
        }
        if (s2 != -1) {
            this.am = i3 / this.ag;
        }
        if (!this.j && (str = this.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.p][zhook.aohoc.aRoot.bPackage.bBClassCPackage.z]) != null && str.length() > 0) {
            this.an = b2.a(str, 0, i2, 2000);
            this.ai = this.an.b;
            this.ao = 0;
            for (int i5 = 0; i5 < this.an.b - 1; i5++) {
                this.ao = Math.max(this.ao, b2.a(this.an.a(i5), 0));
            }
        }
        String[] strArr = this.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.s];
        if (strArr == null || strArr.length <= 0) {
            this.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.s] = null;
            return;
        }
        this.ap = new p[this.r];
        this.aq = new short[this.r];
        for (int i6 = 0; i6 < this.r; i6++) {
            this.ap[i6] = b2.a(strArr[i6], 0, i4, 2000);
            int i7 = 0;
            for (int i8 = 0; i8 < this.ap[i6].b; i8++) {
                i7 = Math.max(i7, b2.a(this.ap[i6].a(i8), 0));
            }
            this.aq[i6] = (short) i7;
        }
    }

    private synchronized void M() {
        int i;
        char charAt;
        int i2 = 0;
        synchronized (this) {
            if (this.I > 0) {
                String[] strArr = this.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.r];
                if (strArr != null) {
                    String str = strArr[this.B];
                    while (true) {
                        i = i2;
                        if (i >= str.length() - 1 || ((charAt = str.charAt(i)) >= '0' && charAt <= '9')) {
                            break;
                        }
                        i2 = i + 1;
                    }
                    this.N = i > 0 ? str.substring(0, i) : "";
                    String substring = str.substring(i);
                    int length = substring.length();
                    while (length > 0) {
                        char charAt2 = substring.charAt(length - 1);
                        if (charAt2 >= '0' && charAt2 <= '9') {
                            break;
                        }
                        length--;
                    }
                    this.O = length < substring.length() ? substring.substring(length) : "";
                    String substring2 = substring.substring(0, length);
                    if (substring2.length() == 0) {
                        this.H = 0;
                    } else {
                        this.H = Integer.parseInt(substring2);
                    }
                    this.J = zhook.aohoc.aRoot.ag.a(this.J, 0, this.I);
                    this.G = this.J * this.H;
                }
            } else {
                this.I = 0;
            }
        }
    }

    private void N() {
        if (this.j || this.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.s] == null) {
            return;
        }
        this.ak = 0;
        if (this.B < this.r) {
            this.al = this.ap[this.B].b;
        } else {
            this.al = 0;
        }
    }

    private void O() {
        this.aa = zhook.aohoc.aRoot.ag.a(this.B - ((this.s - 1) / 2), 0, Math.max(0, this.r - this.s));
        this.ab = zhook.aohoc.aRoot.ag.a(this.aa + this.s, this.aa, this.r);
        this.ac = zhook.aohoc.aRoot.ag.a(this.B - ((this.t - 1) / 2), 0, Math.max(0, this.r - this.t));
        this.ad = zhook.aohoc.aRoot.ag.a(this.ac + this.t, this.ac, this.r);
        this.ae = zhook.aohoc.aRoot.ag.a(this.B - ((this.u - 1) / 2), 0, Math.max(0, this.r - this.u));
        this.af = zhook.aohoc.aRoot.ag.a(this.ae + this.u, this.ae, this.r);
    }

    private void P() {
        if (this.r <= this.Z) {
            S();
        }
        Q();
        R();
    }

    private void Q() {
        if (this.s == 1) {
            e(this.B);
            return;
        }
        for (int i = this.aa; i < this.ab; i++) {
            if (i == this.B) {
                e(i);
            } else {
                d(i);
            }
        }
    }

    private void R() {
        if (this.t == 1) {
            g(this.B);
            return;
        }
        for (int i = this.ac; i < this.ad; i++) {
            if (i == this.B) {
                g(i);
            } else {
                f(i);
            }
        }
    }

    private void S() {
        if (this.u == 1) {
            h(this.B);
            return;
        }
        for (int i = this.ae; i < this.af; i++) {
            h(i);
        }
    }

    private void T() {
        for (int i = 0; i < this.v; i++) {
            i(i);
            j(i);
            k(i);
        }
    }

    private void U() {
        int i = 0;
        short s = this.p.d[zhook.aohoc.aRoot.bPackage.cBClassCPackage.u];
        if (s != -1) {
            short[] sArr = this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.Q];
            short s2 = sArr[0];
            short s3 = sArr[1];
            short s4 = sArr[2];
            short s5 = sArr[3];
            this.ay.f();
            this.p.c.e(s, s2 - this.p.c.b(s), s3 - this.p.c.c(s));
            if (this.D <= 1 || this.D <= this.E) {
                return;
            }
            if (this.t == this.Z) {
                i = this.ac / this.C;
            } else if (this.s == this.Z) {
                i = this.aa / this.C;
            } else if (this.u == this.Z) {
                i = this.ae / this.C;
            }
            this.aw.a(c);
            this.ay.f();
            if (s4 < s5) {
                int i2 = e + s2;
                int i3 = s4 - f;
                int i4 = (this.E * s5) / this.D;
                this.aw.a(i2, ((i * (s5 - i4)) / (this.D - this.E)) + s3, i3, i4);
                return;
            }
            int i5 = g + s3;
            int i6 = s5 - h;
            int i7 = (this.E * s4) / this.D;
            this.aw.a(((i * (s4 - i7)) / (this.D - this.E)) + s2, i5, i7, i6);
        }
    }

    private void V() {
        short s = this.p.d[zhook.aohoc.aRoot.bPackage.cBClassCPackage.h];
        if (s != -1) {
            short[] sArr = this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.K];
            short s2 = sArr[0];
            short s3 = sArr[1];
            short s4 = sArr[2];
            short s5 = sArr[3];
            this.ay.f();
            this.p.c.e(s, (-this.p.c.b(s)) + s2, (-this.p.c.c(s)) + s3);
            if (this.I > 0) {
                int i = this.I;
                this.aw.a(d);
                this.ay.f();
                if (s4 < s5) {
                    this.aw.a(s2 + e, s3, s4 - f, ((s5 - 0) * this.J) / i);
                    return;
                }
                int i2 = s3 + g;
                int i3 = s5 - h;
                this.aw.a(s2, i2, ((s4 - 0) * this.J) / i, i3);
            }
        }
    }

    private void W() {
        a(zhook.aohoc.aRoot.bPackage.bBClassCPackage.C, zhook.aohoc.aRoot.bPackage.bBClassCPackage.w, 0, 0, zhook.aohoc.aRoot.bPackage.cBClassCPackage.d, zhook.aohoc.aRoot.bPackage.cBClassCPackage.G, zhook.aohoc.aRoot.bPackage.cBClassCPackage.Y, zhook.aohoc.aRoot.bPackage.bBClassCPackage.p, zhook.aohoc.aRoot.bPackage.cBClassCPackage.al);
    }

    private void X() {
        a(zhook.aohoc.aRoot.bPackage.bBClassCPackage.C, zhook.aohoc.aRoot.bPackage.bBClassCPackage.x, 0, 0, zhook.aohoc.aRoot.bPackage.cBClassCPackage.e, zhook.aohoc.aRoot.bPackage.cBClassCPackage.H, zhook.aohoc.aRoot.bPackage.cBClassCPackage.Z, zhook.aohoc.aRoot.bPackage.bBClassCPackage.p, zhook.aohoc.aRoot.bPackage.cBClassCPackage.am);
    }

    private void a(int i, int i2, int i3, int i4, int i5, int i6) {
        short s;
        if (i2 < i) {
            short[] sArr = this.q.f[i5];
            if (zhook.aohoc.aRoot.ag.a(sArr) == 0 || (s = sArr[i2]) == -1) {
                return;
            }
            short[] sArr2 = this.p.f[i6];
            zhook.aohoc.aRoot.j jVar = this.q.c;
            int i7 = (sArr2.length > 2 ? (i2 - i3) * 2 : 0) + (i4 * 2);
            jVar.e(s, (sArr2[i7] - jVar.e(s)) - (jVar.i(s) / 2), (sArr2[i7 + 1] - jVar.f(s)) - (jVar.j(s) / 2));
        }
    }

    private void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        short s;
        try {
            this.ax.a();
            this.ay.f();
            if (this.p.d == null || (s = this.p.d[i5]) == -1) {
                return;
            }
            short[] sArr = this.p.f[i6];
            dCClassCPackage g2 = this.Q.g(this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.F][i7]);
            String[] strArr = this.q.h[i8];
            if (strArr == null || strArr.length == 0) {
                return;
            }
            byte b2 = this.p.e[zhook.aohoc.aRoot.bPackage.cBClassCPackage.D][i9];
            int i10 = b2 & 3;
            int i11 = b2 >> 2;
            int i12 = (sArr.length > 4 ? (i2 - i3) * 4 : 0) + (i4 * 4);
            short s2 = sArr[i12];
            short s3 = sArr[i12 + 1];
            short s4 = sArr[i12 + 2];
            short s5 = sArr[i12 + 3];
            this.ay.f();
            this.p.c.e(s, s2, s3);
            if (i2 < i) {
                int i13 = s2 + (s4 >>> i10);
                int i14 = s3 + (s5 >>> i11);
                if (i2 < i) {
                    g2.a(strArr[i2], 0, i13, i14, i10, i11, s2, s2 + s4);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(DataInputStream dataInputStream) throws IOException {
        dataInputStream.readUnsignedShort();
        dataInputStream.readInt();
        dataInputStream.readUnsignedShort();
        dataInputStream.readInt();
        dataInputStream.readShort();
        dataInputStream.readUTF();
        dataInputStream.readInt();
        dataInputStream.readInt();
    }

    private dCClassCPackage b(int i) throws InterruptedException {
        return this.Q.g(this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.F][i]);
    }

    private void b(int i, int i2, int i3, int i4, int i5, int i6) {
        short s = this.p.d[i];
        if (s != -1) {
            short[] sArr = this.p.f[i2];
            short s2 = sArr[0];
            short s3 = sArr[1];
            short s4 = sArr[2];
            short s5 = sArr[3];
            this.ay.f();
            this.p.c.e(s, s2 - this.p.c.b(s), s3 - this.p.c.c(s));
            int i7 = i3 / i6;
            int i8 = i4 / i6;
            if (i8 <= 1 || i8 <= i5) {
                return;
            }
            this.aw.a(c);
            this.ay.f();
            if (s4 < s5) {
                int i9 = (s5 * i5) / i8;
                this.aw.a(s2 + e, ((i7 * (s5 - i9)) / (i8 - i5)) + s3, s4 - f, i9);
                return;
            }
            int i10 = (s4 * i5) / i8;
            this.aw.a(((i7 * (s4 - i10)) / (i8 - i5)) + s2, s3 + g, i10, s5 - h);
        }
    }

    private synchronized void c(int i) throws InterruptedException {
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        synchronized (this) {
            if (this.r > 1 && i >= 0 && this.B != i) {
                int i3 = this.B;
                this.ax.a();
                if (this.s == this.Z) {
                    boolean z5 = i >= this.aa && i < this.ab;
                    if (z5) {
                        d(i3);
                        e(i);
                        z2 = z5;
                        z = false;
                        i2 = i;
                    } else if (i < i3) {
                        this.aa = zhook.aohoc.aRoot.ag.a(i - (i % this.C), 0, this.F);
                        this.ab = zhook.aohoc.aRoot.ag.a(this.aa + this.s, this.aa, this.F);
                        z = true;
                        i2 = i3;
                        z2 = z5;
                    } else if (i > i3) {
                        this.ab = zhook.aohoc.aRoot.ag.a((this.C - (i % this.C)) + i, 0, this.F);
                        this.aa = zhook.aohoc.aRoot.ag.a(this.ab - this.s, 0, this.ab);
                        z = true;
                        i2 = i3;
                        z2 = z5;
                    } else {
                        z = false;
                        i2 = i3;
                        z2 = z5;
                    }
                } else {
                    int i4 = i - ((this.s - 1) / 2);
                    this.aa = zhook.aohoc.aRoot.ag.a(i4 - (i4 % this.C), 0, this.F);
                    this.ab = zhook.aohoc.aRoot.ag.a(this.aa + this.s, this.aa, this.aa + this.s);
                    z = true;
                    i2 = i3;
                    z2 = false;
                }
                if (this.t == this.Z) {
                    if (i >= this.ac && i < this.ad) {
                        if (z2) {
                            f(this.B);
                            g(i);
                            z3 = false;
                        } else {
                            f(i2);
                            g(i);
                            z3 = false;
                        }
                    } else if (i < i2) {
                        this.ac = zhook.aohoc.aRoot.ag.a(i - (i % this.C), 0, this.F);
                        this.ad = zhook.aohoc.aRoot.ag.a(this.ac + this.t, this.ac, this.F);
                        z3 = true;
                    } else if (i > i2) {
                        this.ad = zhook.aohoc.aRoot.ag.a((this.C - (i % this.C)) + i, 0, this.F);
                        this.ac = zhook.aohoc.aRoot.ag.a(this.ad - this.t, 0, this.ad);
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    int i5 = i - ((this.t - 1) / 2);
                    this.ac = zhook.aohoc.aRoot.ag.a(i5 - (i5 % this.C), 0, this.F);
                    this.ad = zhook.aohoc.aRoot.ag.a(this.ac + this.t, this.ac, this.ac + this.t);
                    z3 = true;
                }
                if (this.u == this.Z) {
                    if (!(i >= this.ae && i < this.af)) {
                        if (i < i2) {
                            this.ae = zhook.aohoc.aRoot.ag.a(i - (i % this.C), 0, this.F);
                            this.af = zhook.aohoc.aRoot.ag.a(this.ae + this.u, this.ae, this.F);
                            if (this.r <= this.Z) {
                                z4 = true;
                            }
                        } else if (i > i2) {
                            this.af = zhook.aohoc.aRoot.ag.a((this.C - (i % this.C)) + i, 0, this.F);
                            this.ae = zhook.aohoc.aRoot.ag.a(this.af - this.u, 0, this.af);
                            if (this.r <= this.Z) {
                                z4 = true;
                            }
                        }
                    }
                } else {
                    int i6 = i - ((this.u - 1) / 2);
                    this.ae = zhook.aohoc.aRoot.ag.a(i6 - (i6 % this.C), 0, this.F);
                    this.af = zhook.aohoc.aRoot.ag.a(this.ae + this.u, this.ae, this.ae + this.u);
                    if (this.r <= this.Z) {
                        z4 = true;
                    }
                }
                this.B = i;
                if (z) {
                    Q();
                }
                if (z3) {
                    R();
                }
                if (z4) {
                    S();
                }
                M();
                s();
                t();
                N();
                u();
            }
        }
    }

    private void d(int i) {
        if (this.s > 1) {
            a(this.r, i, this.aa, this.M, zhook.aohoc.aRoot.bPackage.cBClassCPackage.r, zhook.aohoc.aRoot.bPackage.cBClassCPackage.R, zhook.aohoc.aRoot.bPackage.cBClassCPackage.ae, zhook.aohoc.aRoot.bPackage.bBClassCPackage.q, zhook.aohoc.aRoot.bPackage.cBClassCPackage.ar);
        }
    }

    private void e(int i) {
        if (this.s > 0) {
            a(this.r, i, this.aa, this.M, zhook.aohoc.aRoot.bPackage.cBClassCPackage.s, zhook.aohoc.aRoot.bPackage.cBClassCPackage.R, zhook.aohoc.aRoot.bPackage.cBClassCPackage.af, zhook.aohoc.aRoot.bPackage.bBClassCPackage.q, zhook.aohoc.aRoot.bPackage.cBClassCPackage.ar);
        }
    }

    private void f(int i) {
        if (this.t > 1) {
            a(this.r, i, this.ac, this.M, zhook.aohoc.aRoot.bPackage.cBClassCPackage.o, zhook.aohoc.aRoot.bPackage.cBClassCPackage.S, zhook.aohoc.aRoot.bPackage.cBClassCPackage.ag, zhook.aohoc.aRoot.bPackage.bBClassCPackage.r, zhook.aohoc.aRoot.bPackage.cBClassCPackage.as);
        }
    }

    private void g(int i) {
        if (this.t > 0) {
            a(this.r, i, this.ac, this.M, zhook.aohoc.aRoot.bPackage.cBClassCPackage.p, zhook.aohoc.aRoot.bPackage.cBClassCPackage.S, zhook.aohoc.aRoot.bPackage.cBClassCPackage.ah, zhook.aohoc.aRoot.bPackage.bBClassCPackage.r, zhook.aohoc.aRoot.bPackage.cBClassCPackage.as);
        }
    }

    private void h(int i) {
        if (this.u > 0) {
            a(this.r, i, this.ae, this.M, zhook.aohoc.aRoot.bPackage.bBClassCPackage.m, zhook.aohoc.aRoot.bPackage.cBClassCPackage.T);
        }
    }

    private void i(int i) {
        if (this.w > 0) {
            a(this.v, i, 0, 0, zhook.aohoc.aRoot.bPackage.cBClassCPackage.w, zhook.aohoc.aRoot.bPackage.cBClassCPackage.U, zhook.aohoc.aRoot.bPackage.cBClassCPackage.ai, zhook.aohoc.aRoot.bPackage.bBClassCPackage.t, zhook.aohoc.aRoot.bPackage.cBClassCPackage.at);
        }
    }

    private void j(int i) {
        if (this.x > 0) {
            a(this.v, i, 0, 0, zhook.aohoc.aRoot.bPackage.cBClassCPackage.v, zhook.aohoc.aRoot.bPackage.cBClassCPackage.V, zhook.aohoc.aRoot.bPackage.cBClassCPackage.aj, zhook.aohoc.aRoot.bPackage.bBClassCPackage.u, zhook.aohoc.aRoot.bPackage.cBClassCPackage.au);
        }
    }

    private void k(int i) {
        if (this.y > 0) {
            a(this.v, i, 0, 0, zhook.aohoc.aRoot.bPackage.bBClassCPackage.n, zhook.aohoc.aRoot.bPackage.cBClassCPackage.W);
        }
    }

    private void l(int i) {
        short s;
        if (this.r == 0 || (s = this.p.d[zhook.aohoc.aRoot.bPackage.cBClassCPackage.n]) == -1) {
            return;
        }
        this.aw.a();
        this.ay.f();
        short[] sArr = null;
        int i2 = 0;
        if (this.t > 0 && this.t == this.Z) {
            sArr = this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.S];
            i2 = (this.M * 4) + ((i - this.ac) * 4);
        } else if (this.s > 0 && this.s == this.Z) {
            sArr = this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.R];
            i2 = (this.M * 4) + ((i - this.aa) * 4);
        } else if (this.u > 0 && this.u == this.Z) {
            sArr = this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.T];
            i2 = (this.M * 2) + ((i - this.ae) * 2);
        }
        if (sArr != null) {
            this.at = true;
            this.au = sArr[i2];
            this.av = sArr[i2 + 1];
            if (this.ar == -1) {
                this.p.c.e(s, this.au, this.av);
                return;
            }
            this.ar = zhook.aohoc.aRoot.j.n(this.ar);
            this.p.c.f(this.ar, this.au, this.av);
        }
    }

    public synchronized void A() {
        zhook.aohoc.aRoot.y.a("");
        zhook.aohoc.aRoot.y.a("          REGISTER FORM : BEGIN form_id=" + this.l);
        zhook.aohoc.aRoot.y.a("");
        this.p.c.a();
        this.q.c.a();
        this.S = 1;
        zhook.aohoc.aRoot.y.a("");
        zhook.aohoc.aRoot.y.a("          REGISTER FORM : END form_id=" + this.l);
        zhook.aohoc.aRoot.y.a("");
    }

    public synchronized void B() {
        this.S = 4;
        zhook.aohoc.aRoot.y.a("");
        zhook.aohoc.aRoot.y.a("          UNREGISTER FORM : BEGIN form_id=" + this.l);
        zhook.aohoc.aRoot.y.a("");
        this.p.c.c();
        this.q.c.c();
        zhook.aohoc.aRoot.y.a("");
        zhook.aohoc.aRoot.y.a("          UNREGISTER FORM : END form_id=" + this.l);
        zhook.aohoc.aRoot.y.a("");
    }

    public synchronized void C() throws IOException, InterruptedException {
        this.az = false;
        zhook.aohoc.aRoot.y.a("");
        zhook.aohoc.aRoot.y.a("          ACTIVATE FORM : BEGIN form_id=" + this.l);
        zhook.aohoc.aRoot.y.a("");
        this.R.g.e(0);
        this.p.c.b();
        this.q.c.b();
        this.R.g.e();
        this.Q.e.c();
        this.S = 2;
        zhook.aohoc.aRoot.y.a("");
        zhook.aohoc.aRoot.y.a("          ACTIVATE FORM : END form_id=" + this.l);
        zhook.aohoc.aRoot.y.a("");
    }

    public synchronized void D() throws InterruptedException {
        zhook.aohoc.aRoot.y.a("");
        zhook.aohoc.aRoot.y.a("          DEACTIVATE FORM : BEGIN form_id=" + this.l);
        zhook.aohoc.aRoot.y.a("");
        if (!this.az) {
            H();
            if (this.r > this.Z) {
                S();
            }
        }
        this.S = 1;
        zhook.aohoc.aRoot.y.a("");
        zhook.aohoc.aRoot.y.a("          DEACTIVATE END : BEGIN form_id=" + this.l);
        zhook.aohoc.aRoot.y.a("");
    }

    public void E() throws InterruptedException {
        this.az = true;
        D();
        B();
    }

    public void F() {
        aBridgeA.c.a(this.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.r][this.B]);
        this.Q.b(true);
    }

    public int a(int i, int i2, String str, p pVar, int i3, int i4, int i5, int i6) throws InterruptedException {
        int[] iArr;
        int[] iArr2;
        int i7;
        int i8;
        int d2;
        this.ax.a();
        this.ay.f();
        short s = this.p.d[i];
        if (s == -1) {
            return 1;
        }
        short[] sArr = this.p.f[i2];
        dCClassCPackage g2 = this.Q.g(this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.F][zhook.aohoc.aRoot.bPackage.cBClassCPackage.ad]);
        int i9 = this.p.e[zhook.aohoc.aRoot.bPackage.cBClassCPackage.D][zhook.aohoc.aRoot.bPackage.cBClassCPackage.aq];
        int i10 = this.j ? 0 : i9 & 3;
        int i11 = i9 >> 2;
        short s2 = sArr[0];
        short s3 = sArr[1];
        short s4 = sArr[2];
        short s5 = sArr[3];
        this.ax.a();
        this.ay.f();
        this.p.c.e(s, s2, s3);
        if (str == null || str == null || str.length() <= 0) {
            return 1;
        }
        int i12 = i5 > i6 ? 0 : (i6 - i5) * this.ag;
        boolean z = str.charAt(0) == 11;
        if (z) {
            int charAt = str.charAt(1);
            int[] iArr3 = new int[charAt];
            int[] iArr4 = new int[charAt];
            for (int i13 = 0; i13 < charAt; i13++) {
                char charAt2 = str.charAt(i13 + 2);
                iArr3[i13] = ((byte) charAt2) + (s4 >>> zhook.aohoc.aRoot.cPackage.dCClassCPackage.a[(charAt2 >>> '\f') & 3]) + s2;
                iArr4[i13] = (charAt2 >>> '\b') & 3;
            }
            i12 /= charAt;
            iArr = iArr4;
            iArr2 = iArr3;
            i7 = charAt;
            i3 = s4;
        } else {
            iArr = null;
            iArr2 = null;
            i7 = 1;
        }
        int min = i4 + (Math.min(i5 / i7, i6) * i7);
        if (!z) {
            if (this.j) {
                i8 = s2 + a;
                d2 = b + s3;
            } else {
                i8 = ((s4 - i3) / 2) + 2 + s2;
                d2 = (i12 >>> i11) + ((s5 - (this.ag * i6)) / 2) + (g2.d() / 2) + s3;
            }
            int i14 = d2;
            while (i4 < min) {
                String a2 = pVar.a(i4);
                g2.a(a2, 0, i8 + (this.j ? 0 : (i3 - g2.a(a2, 0)) >> i10), i14, 0, 0, s2 + a, s2 + s4, pVar.e[i4], true);
                i14 += this.ag;
                i4++;
            }
            return i7;
        }
        int i15 = 0;
        int i16 = s3;
        while (true) {
            int i17 = i15;
            if (i4 >= min) {
                return i7;
            }
            String a3 = pVar.a(i4);
            g2.e = true;
            g2.a(a3, 0, iArr2[i17], i16, iArr[i17], 0, s2, s2 + s4);
            i15 = i17 + 1;
            if (i15 == i7) {
                i15 = 0;
                i16 += this.ag;
            }
            i4++;
            i16 = i16;
        }
    }

    public int a(int i, int i2, String str, short[] sArr, int i3, int i4, int i5, int i6) throws InterruptedException {
        int[] iArr;
        int[] iArr2;
        int i7;
        int i8;
        int i9;
        this.ax.a();
        this.ay.f();
        short s = this.p.d[i];
        if (s == -1) {
            return 1;
        }
        short[] sArr2 = this.p.f[i2];
        dCClassCPackage g2 = this.Q.g(this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.F][zhook.aohoc.aRoot.bPackage.cBClassCPackage.ad]);
        int i10 = this.p.e[zhook.aohoc.aRoot.bPackage.cBClassCPackage.D][zhook.aohoc.aRoot.bPackage.cBClassCPackage.aq];
        int i11 = this.j ? 0 : i10 & 3;
        int i12 = i10 >> 2;
        short s2 = sArr2[0];
        short s3 = sArr2[1];
        short s4 = sArr2[2];
        short s5 = sArr2[3];
        this.ax.a();
        this.ay.f();
        this.p.c.e(s, s2, s3);
        if (str == null || str == null || str.length() <= 0) {
            return 1;
        }
        int i13 = i5 > i6 ? 0 : (i6 - i5) * this.ag;
        boolean z = str.charAt(0) == 11;
        if (z) {
            int charAt = str.charAt(1);
            int[] iArr3 = new int[charAt];
            int[] iArr4 = new int[charAt];
            for (int i14 = 0; i14 < charAt; i14++) {
                char charAt2 = str.charAt(i14 + 2);
                iArr3[i14] = ((byte) charAt2) + (s4 >>> zhook.aohoc.aRoot.cPackage.dCClassCPackage.a[(charAt2 >>> '\f') & 3]) + s2;
                iArr4[i14] = (charAt2 >>> '\b') & 3;
            }
            i13 /= charAt;
            iArr = iArr4;
            iArr2 = iArr3;
            i7 = charAt;
            i3 = s4;
        } else {
            iArr = null;
            iArr2 = null;
            i7 = 1;
        }
        int min = i4 + (Math.min(i5 / i7, i6) * i7);
        if (!z) {
            int d2 = (g2.d() / 2) + s3;
            if (this.j) {
                i8 = a + s2;
                i9 = d2;
            } else {
                i9 = (i13 >>> i12) + ((s5 - (this.ag * i6)) / 2) + d2;
                i8 = ((s4 - i3) / 2) + s2;
            }
            int i15 = i9;
            while (i4 < min) {
                String substring = str.substring(sArr[i4], sArr[i4 + 1]);
                g2.a(substring, 0, (this.j ? 0 : (i3 - g2.a(substring, 0)) >>> i11) + i8, i15, 0, 0, s2, s2 + s4);
                i15 += this.ag;
                i4++;
            }
            return i7;
        }
        int i16 = 0;
        int i17 = s3;
        while (true) {
            int i18 = i16;
            if (i4 >= min) {
                return i7;
            }
            String substring2 = str.substring(sArr[i4], sArr[i4 + 1]);
            g2.e = true;
            g2.a(substring2, 0, iArr2[i18], i17, iArr[i18], 0, s2, s2 + s4);
            i16 = i18 + 1;
            if (i16 == i7) {
                i16 = 0;
                i17 += this.ag;
            }
            i4++;
            i17 = i17;
        }
    }

    public synchronized void a() throws InterruptedException {
        this.Q.h.b(true);
        this.Q.P = this.p.c;
        K();
        L();
        N();
        G();
        O();
        M();
        J();
        this.S = 3;
        this.Q.h.a("");
        this.Q.h.b(this.P);
    }

    public void a(int i) throws InterruptedException {
        switch (i) {
            case 13:
                j();
                return;
            case 14:
                i();
                return;
            case 15:
                m();
                return;
            case 16:
                n();
                return;
            case 17:
                o();
                return;
            case 18:
                p();
                return;
            default:
                return;
        }
    }

    public boolean a(int i, int i2) throws InterruptedException {
        short[] sArr;
        int i3;
        short[] sArr2;
        if (a(i, i2, zhook.aohoc.aRoot.bPackage.cBClassCPackage.N, false, 15, 16) || a(i, i2, zhook.aohoc.aRoot.bPackage.cBClassCPackage.M, true, 15, 16) || a(i, i2, zhook.aohoc.aRoot.bPackage.cBClassCPackage.K, false, 14, 13) || a(i, i2, zhook.aohoc.aRoot.bPackage.cBClassCPackage.J, false, 14, 13)) {
            return true;
        }
        if (this.r > 0) {
            short[] sArr3 = this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.Q];
            if (sArr3 != null && sArr3.length >= 4 && zhook.aohoc.aRoot.ag.b(i, i2, sArr3, 0)) {
                int i4 = i - sArr3[0];
                int i5 = i2 - sArr3[1];
                short s = sArr3[2];
                short s2 = sArr3[3];
                if (s > s2) {
                    if (i4 <= s / 2) {
                        c();
                    } else {
                        d();
                    }
                } else if (i5 <= s2 / 2) {
                    if (this.C > 1) {
                        g();
                    } else {
                        c();
                    }
                } else if (this.C > 1) {
                    h();
                } else {
                    d();
                }
                return true;
            } else if (a(i, i2, zhook.aohoc.aRoot.bPackage.cBClassCPackage.P, false, 17, 18) || a(i, i2, zhook.aohoc.aRoot.bPackage.cBClassCPackage.O, true, 17, 18)) {
                return true;
            } else {
                int i6 = -1;
                short[] sArr4 = this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.S];
                if (sArr4 != null && sArr4.length >= this.t * 4) {
                    int i7 = this.M * 4;
                    int i8 = this.t - this.M;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= i8) {
                            break;
                        } else if (zhook.aohoc.aRoot.ag.b(i, i2, sArr4, i7)) {
                            i6 = this.ac + i9;
                            break;
                        } else {
                            i7 += 4;
                            i9++;
                        }
                    }
                }
                if (i6 == -1 && (sArr2 = this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.R]) != null && sArr2.length >= this.s * 4) {
                    int i10 = this.M * 4;
                    int i11 = this.s - this.M;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= i11) {
                            break;
                        } else if (zhook.aohoc.aRoot.ag.b(i, i2, sArr2, i10)) {
                            i6 = this.aa + i12;
                            break;
                        } else {
                            i10 += 4;
                            i12++;
                        }
                    }
                }
                if (i6 == -1 && (sArr = this.p.f[zhook.aohoc.aRoot.bPackage.cBClassCPackage.T]) != null && sArr.length >= this.u * 2) {
                    int i13 = this.M * 2;
                    int i14 = this.u - this.M;
                    int i15 = i13;
                    int i16 = 0;
                    int i17 = 0;
                    while (i17 < i14 && this.ae + i17 < this.r) {
                        short s3 = this.q.f[zhook.aohoc.aRoot.bPackage.bBClassCPackage.m][this.ae + i17];
                        int i18 = this.q.c.i(s3);
                        int j = this.q.c.j(s3);
                        int abs = Math.abs(sArr[i15] - i);
                        int abs2 = Math.abs(sArr[i15 + 1] - i2);
                        if (abs <= (i18 + 1) / 2 && abs2 <= (j + 1) / 2) {
                            int i19 = abs + abs2;
                            if (i6 == -1 || i19 < i16) {
                                i3 = this.ae + i17;
                                i16 = i19;
                                i15 += 2;
                                i17++;
                                i6 = i3;
                            }
                        }
                        i3 = i6;
                        i15 += 2;
                        i17++;
                        i6 = i3;
                    }
                }
                if (i6 != -1) {
                    if (i6 == this.B) {
                        try {
                            this.Q.g.a(q(), true);
                            Thread.yield();
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    } else {
                        c(i6);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public boolean a(int i, int i2, int i3, boolean z, int i4, int i5) throws InterruptedException {
        short[] sArr = this.p.f[i3];
        if (sArr != null && sArr.length >= 4) {
            short s = sArr[2];
            short s2 = sArr[3];
            if (!z) {
                System.arraycopy(sArr, 0, this.aA, 0, 4);
                sArr = this.aA;
                sArr[0] = (short) (sArr[0] - 4);
                sArr[2] = (short) (sArr[2] + 8);
                sArr[1] = (short) (sArr[1] - 4);
                sArr[3] = (short) (sArr[3] + 8);
            }
            if (zhook.aohoc.aRoot.ag.b(i, i2, sArr, 0)) {
                int i6 = i - sArr[0];
                int i7 = i2 - sArr[1];
                if (z || s2 > s) {
                    if (i7 <= s2 / 2) {
                        a(i4);
                    } else {
                        a(i5);
                    }
                } else if (i6 <= s / 2) {
                    a(i4);
                } else {
                    a(i5);
                }
                return true;
            }
        }
        return false;
    }

    public void b() throws InterruptedException {
        synchronized (this) {
            if (this.S == 2) {
                a();
            }
            if (this.S != 3) {
                return;
            }
            boolean z = this.ax.d;
            if (z) {
                this.k = -1;
                H();
            }
            if (this.j) {
                zhook.aohoc.aRoot.h hVar = this.Q.a.v;
                if (z || this.k != hVar.a) {
                    this.ah = 0;
                    this.ai = hVar.c != null ? hVar.c.length - 1 : 0;
                    a(zhook.aohoc.aRoot.bPackage.cBClassCPackage.j, zhook.aohoc.aRoot.bPackage.cBClassCPackage.M, hVar.b, hVar.c, this.Q.a.s, this.ah, this.ai, this.aj);
                    this.k = hVar.a;
                }
            }
            this.aw.a();
            this.ay.f();
            this.ax.b(0, 0);
            eCClassCPackage eCClassCPackageVar = this.Q.h.ad;
            if (this.m && eCClassCPackageVar != null) {
                if (!eCClassCPackageVar.j) {
                }
                eCClassCPackageVar.p.c.e(eCClassCPackageVar.p.d[zhook.aohoc.aRoot.bPackage.cBClassCPackage.c], 0, 0);
            }
            if (!this.j) {
                if (this.r > this.Z) {
                    S();
                }
                V();
                x();
                y();
                U();
            }
            if (this.as != -1) {
                this.as = zhook.aohoc.aRoot.j.n(this.as);
                this.p.c.f(this.as, 0, 0);
            } else {
                this.p.c.e(this.p.d[zhook.aohoc.aRoot.bPackage.cBClassCPackage.c], 0, 0);
            }
            I();
            l(this.B);
        }
    }

    public synchronized void b(DataInputStream dataInputStream) throws IOException, InterruptedException {
        short readShort = dataInputStream.readShort();
        short readShort2 = dataInputStream.readShort();
        for (int i = 0; i < readShort2; i++) {
            short readShort3 = dataInputStream.readShort();
            byte readByte = dataInputStream.readByte();
            if ((readByte & 1) != 0) {
                this.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.q][readShort3] = dataInputStream.readUTF();
            }
            if ((readByte & 2) != 0) {
                this.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.r][readShort3] = dataInputStream.readUTF();
            }
            if ((readByte & 4) != 0) {
                this.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.s][readShort3] = dataInputStream.readUTF();
            }
            if ((readByte & 8) != 0) {
                this.q.f[zhook.aohoc.aRoot.bPackage.bBClassCPackage.m][readShort3] = dataInputStream.readShort();
            }
            if ((readByte & 16) != 0) {
                this.q.f[zhook.aohoc.aRoot.bPackage.bBClassCPackage.l][readShort3] = dataInputStream.readShort();
            }
        }
        if (readShort >= 0) {
            this.ax.d = true;
            a();
        }
    }

    public synchronized void c() throws InterruptedException {
        if (this.B > 0) {
            c(this.B - 1);
        } else if (this.Q.f.k()) {
            c(this.r - 1);
        }
    }

    public synchronized void d() throws InterruptedException {
        if (this.B < this.r - 1) {
            c(this.B + 1);
        } else if (this.Q.f.k()) {
            c(0);
        }
    }

    public synchronized void e() throws InterruptedException {
        if (this.r != 0 && this.C > 1 && this.Z > 0) {
            int i = this.B % this.C;
            int i2 = this.B / this.C;
            if (i > 0) {
                c((i + (i2 * this.C)) - 1);
            } else if (this.Q.f.k()) {
                if (this.D > 1 || this.r > this.C) {
                    c(((this.C * i2) + this.C) - 1);
                } else {
                    c(this.r - 1);
                }
            }
        }
    }

    public synchronized void f() throws InterruptedException {
        if (this.r != 0 && this.C > 1 && this.Z > 0) {
            int i = this.B % this.C;
            int i2 = this.B / this.C;
            if (i < this.C - 1 && (this.D > 1 || i < this.r - 1)) {
                c(i + (i2 * this.C) + 1);
            } else if (this.Q.f.k()) {
                c((this.C * i2) + 0);
            }
        }
    }

    public synchronized void g() throws InterruptedException {
        if (this.r != 0 && this.C > 1 && this.Z > 0) {
            int i = this.B % this.C;
            int i2 = this.B / this.C;
            if (i2 > 0) {
                c(i + ((i2 - 1) * this.C));
            } else if (this.Q.f.k()) {
                c(i + ((this.D - 1) * this.C));
            }
        }
    }

    public synchronized void h() throws InterruptedException {
        if (this.r != 0 && this.C > 1 && this.Z > 0) {
            int i = this.B % this.C;
            int i2 = this.B / this.C;
            if (i2 < this.D - 1) {
                c(i + ((i2 + 1) * this.C));
            } else if (this.Q.f.k()) {
                c(i + (this.C * 0));
            }
        }
    }

    public synchronized void i() {
        if (this.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.r] != null) {
            if (this.J > 0) {
                this.J--;
            } else if (this.Q.f.k()) {
                this.J = this.I;
            }
            this.G = this.J * this.H;
            s();
            t();
        }
    }

    public synchronized void j() {
        if (this.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.r] != null) {
            if (this.J < this.I) {
                this.J++;
            } else if (this.Q.f.k()) {
                this.J = 0;
            }
            this.G = this.J * this.H;
            s();
            t();
        }
    }

    public synchronized void k() {
        String[] strArr = this.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.r];
        if (strArr != null && this.A.length() + strArr[this.B].length() < this.z) {
            this.A += strArr[this.B];
            s();
        }
    }

    public synchronized void l() {
        if (this.A.length() > 0) {
            this.A = this.A.substring(0, this.A.length() - 1);
            s();
        }
    }

    public synchronized void m() throws InterruptedException {
        int i = this.ai / this.K;
        if (i > 0 && i > this.aj) {
            int i2 = this.ah;
            this.ah = Math.max(this.ah - this.K, 0);
            if (i2 != this.ah) {
                u();
            } else if (this.Q.f.k()) {
                this.ah = this.ai - (this.aj * this.K);
                u();
            }
        }
    }

    public synchronized void n() throws InterruptedException {
        int i = this.ai / this.K;
        if (i > 0 && i > this.aj) {
            int i2 = this.ah;
            this.ah = Math.min(this.ah + this.K, this.ai - (this.aj * this.K));
            if (i2 != this.ah) {
                u();
            } else if (this.Q.f.k()) {
                this.ah = 0;
                u();
            }
        }
    }

    public synchronized void o() throws InterruptedException {
        int i = this.al / this.L;
        if (i > 0 && i > this.am) {
            int i2 = this.ak;
            this.ak = Math.max(this.ak - this.L, 0);
            if (i2 != this.ak) {
                u();
            } else if (this.Q.f.k()) {
                this.ak = this.al - (this.am * this.L);
                u();
            }
        }
    }

    public synchronized void p() throws InterruptedException {
        int i = this.al / this.L;
        if (i > 0 && i > this.am) {
            int i2 = this.ak;
            this.ak = Math.min(this.ak + this.L, this.al - (this.am * this.L));
            if (i2 != this.ak) {
                u();
            } else if (this.Q.f.k()) {
                this.ak = 0;
                u();
            }
        }
    }

    public synchronized int q() {
        short[] sArr;
        sArr = this.q.f[zhook.aohoc.aRoot.bPackage.bBClassCPackage.l];
        return (sArr == null || sArr.length == 0) ? (short) -1 : sArr[this.B];
    }

    public void r() {
        a(zhook.aohoc.aRoot.bPackage.bBClassCPackage.C, zhook.aohoc.aRoot.bPackage.bBClassCPackage.y, 0, 0, zhook.aohoc.aRoot.bPackage.cBClassCPackage.f, zhook.aohoc.aRoot.bPackage.cBClassCPackage.I, zhook.aohoc.aRoot.bPackage.cBClassCPackage.aa, zhook.aohoc.aRoot.bPackage.bBClassCPackage.p, zhook.aohoc.aRoot.bPackage.cBClassCPackage.an);
    }

    public void s() {
        this.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.p][zhook.aohoc.aRoot.bPackage.bBClassCPackage.A] = this.I > 0 ? "" + this.J : this.A;
        a(zhook.aohoc.aRoot.bPackage.bBClassCPackage.C, zhook.aohoc.aRoot.bPackage.bBClassCPackage.A, 0, 0, zhook.aohoc.aRoot.bPackage.cBClassCPackage.g, zhook.aohoc.aRoot.bPackage.cBClassCPackage.J, zhook.aohoc.aRoot.bPackage.cBClassCPackage.ab, zhook.aohoc.aRoot.bPackage.bBClassCPackage.p, zhook.aohoc.aRoot.bPackage.cBClassCPackage.ao);
    }

    public void t() {
        if (this.I > 0) {
            this.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.p][zhook.aohoc.aRoot.bPackage.bBClassCPackage.B] = "" + this.N + this.G + this.O;
            a(zhook.aohoc.aRoot.bPackage.bBClassCPackage.C, zhook.aohoc.aRoot.bPackage.bBClassCPackage.B, 0, 0, zhook.aohoc.aRoot.bPackage.cBClassCPackage.i, zhook.aohoc.aRoot.bPackage.cBClassCPackage.L, zhook.aohoc.aRoot.bPackage.cBClassCPackage.ac, zhook.aohoc.aRoot.bPackage.bBClassCPackage.p, zhook.aohoc.aRoot.bPackage.cBClassCPackage.ap);
        }
    }

    public void u() throws InterruptedException {
        v();
        w();
    }

    public void v() throws InterruptedException {
        String str = this.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.p][zhook.aohoc.aRoot.bPackage.bBClassCPackage.z];
        if (this.an != null) {
            this.K = a(zhook.aohoc.aRoot.bPackage.cBClassCPackage.j, zhook.aohoc.aRoot.bPackage.cBClassCPackage.M, str, this.an, this.ao, this.ah, this.ai, this.aj);
        }
    }

    public void w() throws InterruptedException {
        if (this.r == 0) {
            return;
        }
        String[] strArr = this.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.s];
        if (!(this.B >= 0 && this.B < this.r) || this.ap == null) {
            this.L = a(zhook.aohoc.aRoot.bPackage.cBClassCPackage.l, zhook.aohoc.aRoot.bPackage.cBClassCPackage.O, (String) null, (short[]) null, 0, this.ak, this.al, this.am);
        } else {
            this.L = a(zhook.aohoc.aRoot.bPackage.cBClassCPackage.l, zhook.aohoc.aRoot.bPackage.cBClassCPackage.O, strArr[this.B], this.ap[this.B], this.aq[this.B], this.ak, this.al, this.am);
        }
    }

    public void x() {
        b(zhook.aohoc.aRoot.bPackage.cBClassCPackage.k, zhook.aohoc.aRoot.bPackage.cBClassCPackage.N, this.ah, this.ai, this.aj, this.K);
    }

    public void y() {
        b(zhook.aohoc.aRoot.bPackage.cBClassCPackage.m, zhook.aohoc.aRoot.bPackage.cBClassCPackage.P, this.ak, this.al, this.am, this.L);
    }

    public synchronized byte[] z() throws IOException {
        byte[] byteArray;
        synchronized (this) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeShort(this.l);
            dataOutputStream.writeShort(this.B);
            dataOutputStream.writeInt(this.J);
            dataOutputStream.writeUTF(this.A);
            dataOutputStream.writeInt(this.Q.i());
            dataOutputStream.writeInt(this.Q.f.e());
            dataOutputStream.writeInt(this.Q.f.g());
            dataOutputStream.writeInt(this.Q.f.a());
            dataOutputStream.writeChar(this.Q.f.b());
            dataOutputStream.writeChar(this.Q.f.c());
            dataOutputStream.writeChar(this.Q.f.d());
            jCClassCPackage jCClassCPackageVar = this.Q.h;
            hCClassCPackage hCClassCPackageVar = jCClassCPackageVar.e;
            if ( hCClassCPackageVar == null) {
                dataOutputStream.writeShort(-1);
                dataOutputStream.writeShort(-1);
            } else if ( hCClassCPackageVar.k()) {
                dataOutputStream.writeShort(jCClassCPackageVar.G);
                dataOutputStream.writeShort(jCClassCPackageVar.H);
            } else {
                dataOutputStream.writeShort(jCClassCPackageVar.y);
                dataOutputStream.writeShort(jCClassCPackageVar.z);
            }
            l lVar = jCClassCPackageVar.ap;
            dataOutputStream.writeInt(lVar == null ? -1 : lVar.a);
            l lVar2 = jCClassCPackageVar.ar;
            dataOutputStream.writeInt(lVar2 != null ? lVar2.a : -1);
            eCClassCPackage g2 = jCClassCPackageVar.g();
            if (g2 == null) {
                dataOutputStream.writeInt(-1);
                dataOutputStream.writeShort(-1);
            } else {
                dataOutputStream.writeInt(g2.l);
                dataOutputStream.writeShort(g2.B);
            }
            byteArray = byteArrayOutputStream.toByteArray();
        }
        return byteArray;
    }
}
