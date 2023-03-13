package zhook.aohoc.aRoot.cPackage;

import java.io.IOException;
import java.lang.reflect.Array;

import zhook.aohoc.aRoot.aPackage.aAClassPackage;
import zhook.aohoc.aRoot.ag;
import zhook.aohoc.aRoot.n;

/* loaded from: classes.dex */
public class hCClassCPackage {
    int A;
    int B;
    int C;
    int D;
    int E;
    int F;
    int G;
    boolean H;
    aAClassPackage I;
    private boolean J;
    private int K;
    private int L;
    private int M;
    private int N;
    private short[] O;
    private short[] P;
    private short[] Q;
    private iCClassCPackage R;
    private byte[] S;
    private int T;
    private int U;
    private aCClassCPackage V;
    private bCClassCPackage W;
    private cCClassCPackage X;
    private gCClassCPackage Y;
    public int a;
    public int b;
    public byte[][] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int[] k;
    public int[] l;
    public int[] m;
    short[] n;
    short[] o;
    short[] p;
    byte[] q;
    int r;
    int[] s;
    short[] t;
    short[] u;
    short[] v;
    zhook.aohoc.aRoot.j w;
    int z;
    String x = "";
    String y = "";
    private int Z = -1;

    public hCClassCPackage(aAClassPackage aAClassPackageVar, iCClassCPackage iCClassCPackageVar, n nVar, int i) {
        this.I = aAClassPackageVar;
        this.V = this.I.T;
        this.W = this.V.i;
        this.X = this.V.j;
        this.Y = this.V.k;
        this.G = i;
        this.R = iCClassCPackageVar;
        this.w = nVar.c;
        this.a = nVar.e[0][0];
        this.b = nVar.e[0][1];
        this.c = (byte[][]) Array.newInstance(Byte.TYPE, this.b, this.a);
        for (int i2 = 0; i2 < this.b; i2++) {
            System.arraycopy(nVar.e[1], this.a * i2, this.c[i2], 0, this.a);
        }
        this.S = nVar.e[2];
        this.K = nVar.e[0][2];
        this.L = nVar.e[0][3];
        this.J = this.K * this.L > 0;
        this.M = nVar.e[0][4];
        if (this.M > 0) {
            this.n = new short[this.M];
            System.arraycopy(nVar.d, 0, this.n, 0, this.M);
            this.o = nVar.f[0];
            this.p = nVar.f[1];
            int i3 = this.K * this.L;
            if (i3 > 1) {
                this.T = Integer.MAX_VALUE;
                this.U = Integer.MAX_VALUE;
                for (int i4 = i3 - 1; i4 > 0; i4--) {
                    int abs = Math.abs(this.o[i4] - this.o[i4 - 1]);
                    int abs2 = Math.abs(this.o[i4] - this.o[i4 - 1]);
                    if (this.T > abs) {
                        this.T = abs;
                    }
                    if (this.U > abs2) {
                        this.U = abs2;
                    }
                }
            }
        }
        this.N = nVar.e[0][5];
        if (this.N > 0) {
            this.O = new short[this.N];
            System.arraycopy(nVar.d, this.M, this.O, 0, this.N);
            this.P = nVar.f[2];
            this.Q = nVar.f[3];
        }
        this.r = nVar.e[0][6];
        if (this.r > 0) {
            this.t = new short[this.r];
            System.arraycopy(nVar.d, this.M + this.N, this.t, 0, this.r);
            this.u = nVar.f[4];
            this.v = nVar.f[5];
            this.s = new int[this.r];
            for (int i5 = 0; i5 < this.r; i5++) {
                this.s[i5] = e(i5);
            }
        }
        this.q = nVar.e[3];
        this.d = this.R == null ? 0 : this.R.a();
        this.e = this.R == null ? 0 : this.R.b();
        this.f = 0;
        this.g = 0;
        this.z = nVar.e[0][7];
        this.A = nVar.e[0][8];
        this.B = nVar.e[0][9];
        this.C = nVar.e[0][10];
        this.D = nVar.e[0][11];
        this.E = nVar.e[0][12];
        this.F = nVar.e[0][13];
    }

    public int a(int i) {
        return this.o[i];
    }

    public int a(int i, int i2) {
        return this.c[i2][i] & 255;
    }

    public void a() {
        this.w.a();
        this.R.g.a();
    }

    public void a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = (i3 - i) + 1;
        int i11 = (i4 - i2) + 1;
        int i12 = this.f;
        int i13 = this.g;
        this.f = i;
        this.g = i2;
        if (this.W.d) {
            j();
            return;
        }
        int i14 = i - i12;
        int i15 = i2 - i13;
        if (i14 == 0 && i15 == 0) {
            return;
        }
        if (Math.abs(i14) >= i10 || Math.abs(i15) >= i11) {
            j();
            return;
        }
        int i16 = this.d * i14;
        int i17 = i15 * this.e;
        this.W.c(i16, i17);
        int i18 = this.W.e;
        int i19 = this.W.f;
        int i20 = this.W.g;
        int i21 = this.W.h;
        int i22 = i20 / this.d;
        int i23 = i21 / this.e;
        int i24 = i22 - i10;
        int i25 = i23 - i11;
        boolean z = i16 != 0;
        boolean z2 = i17 != 0;
        this.h = null;
        this.i = null;
        this.k = null;
        this.l = null;
        int i26 = i * this.d;
        int i27 = i2 * this.e;
        if (z) {
            if (i14 > 0) {
                i7 = ag.a(i18 - i16, i20);
                i9 = i24 + 1 + (i3 - i14);
                i8 = i3 + i24 + 1;
            } else if (i14 < 0) {
                i8 = i - i14;
                i7 = i18;
                i9 = i;
            } else {
                i7 = i18;
                i8 = i3;
                i9 = i;
            }
            int i28 = i23 + i2;
            int i29 = (i8 - i9) * this.d;
            int i30 = (i28 - i2) * this.e;
            this.h = ag.a(this.d * i9, this.e * i2, i29, i30);
            this.j = ag.a((this.d * i9) - i26, (this.e * i2) - i27, i29, i30);
            this.i = ag.a(i7, 0, i29, i21);
            b(i9, i2, i8, i28, i7, i19);
        }
        if (z2) {
            if (i15 > 0) {
                i19 = ag.a(i19 - i17, i21);
                i5 = i4 + i25 + 1;
                i6 = (i4 - i15) + i25 + 1;
            } else if (i15 < 0) {
                i5 = i2 - i15;
                i6 = i2;
            } else {
                i5 = i4;
                i6 = i2;
            }
            int i31 = i + i22;
            int i32 = (i31 - i) * this.d;
            int i33 = (i5 - i6) * this.e;
            this.k = ag.a(this.d * i, this.e * i6, i32, i33);
            this.m = ag.a((this.d * i) - i26, (this.e * i6) - i27, i32, i33);
            this.l = ag.a(0, i19, i20, i33);
            b(i, i6, i31, i5, i18, i19);
        }
        if (this.i != null) {
            this.Y.b = this.i;
            this.Y.a = this.j;
            this.X.a(this.j);
            this.I.h.q();
            this.X.a(this.j);
            b(-i26, -i27);
        }
        if (this.l != null) {
            this.Y.b = this.l;
            this.Y.a = this.m;
            this.X.a(this.m);
            this.I.h.q();
            this.X.a(this.m);
            b(-i26, -i27);
        }
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6) throws InterruptedException {
        int i7 = this.d;
        int i8 = this.e;
        while (i2 < i4) {
            int i9 = i;
            int i10 = i5;
            while (i9 < i3) {
                this.R.a(this.c[i2][i9] & 255, i10, i6);
                i9++;
                i10 += i7;
            }
            i2++;
            i6 += i8;
        }
    }

    public int b(int i) {
        return this.p[i];
    }

    public int b(int i, int i2, int i3, int i4) {
        int i5 = 0;
        int i6 = -1;
        try {
            if (this.Z > 0) {
                int abs = Math.abs(i - this.o[this.Z]);
                int abs2 = Math.abs(i2 - this.p[this.Z]);
                if (abs <= this.T / 2 && abs2 <= this.U / 2) {
                    return this.Z;
                }
            }
            if (i4 > 0) {
                int abs3 = Math.abs(i - this.o[i4]);
                int abs4 = Math.abs(i2 - this.p[i4]);
                if (abs3 <= this.T / 2 && abs4 <= this.U / 2) {
                    this.Z = i4;
                    return i4;
                }
            }
            if (i3 > 0) {
                int abs5 = Math.abs(i - this.o[i3]);
                int abs6 = Math.abs(i2 - this.p[i3]);
                if (abs5 <= this.T / 2 && abs6 <= this.U / 2) {
                    this.Z = i3;
                    return i3;
                }
            }
            if (k()) {
                int i7 = Integer.MAX_VALUE;
                int length = this.o.length;
                int i8 = 0;
                while (i8 < length) {
                    int i9 = i - this.o[i8];
                    int i10 = i9 < 0 ? -i9 : i9;
                    int i11 = i2 - this.p[i8];
                    if (i11 < 0) {
                        i11 = -i11;
                    }
                    if (i10 <= this.T / 2) {
                        if (i11 > this.U / 2) {
                            i5 = i6;
                        } else {
                            int i12 = i11 + i10;
                            if (i12 < i7) {
                                i7 = i12;
                                i5 = i8;
                            }
                        }
                        i8++;
                        i6 = i5;
                    }
                    i5 = i6;
                    i8++;
                    i6 = i5;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.Z = i6;
        return i6;
    }

    public void b() throws IOException {
        this.w.b();
        this.R.g.b();
    }

    public void b(int i, int i2) {
        for (int i3 = 0; i3 < this.N; i3++) {
            this.w.e(this.O[i3], this.P[i3] + i, this.Q[i3] + i2);
        }
    }

    public void b(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 > this.a) {
            i3 = this.a;
        }
        if (i4 > this.b) {
            i4 = this.b;
        }
        int i7 = this.d;
        int i8 = this.e;
        int a = this.W.a.a();
        int b = this.W.a.b();
        if (i3 - i >= 10 && i4 - i2 >= 10) {
            this.V.a(0);
            this.V.b();
        }
        int i9 = i6;
        while (i2 < i4) {
            if (i9 >= b) {
                i9 -= b;
            }
            int i10 = i;
            int i11 = i5;
            while (i10 < i3) {
                if (i11 >= a) {
                    i11 -= a;
                }
                if (i10 >= 0 && i2 >= 0) {
                    try {
                        this.R.a(this.c[i2][i10] & 255, i11, i9);
                    } catch (Throwable th) {
                        zhook.aohoc.aRoot.y.a("invalid_tile: x=" + i10 + " y=" + i2);
                    }
                }
                i10++;
                i11 += i7;
            }
            i2++;
            i9 += i8;
        }
    }

    public int c(int i) {
        return i % this.K;
    }

    public int c(int i, int i2) {
        return this.o[(this.K * i2) + i];
    }

    public void c() {
        this.R.g.c();
        this.w.c();
    }

    public int d() {
        return this.d;
    }

    public int d(int i) {
        return i / this.K;
    }

    public int d(int i, int i2) {
        return this.p[(this.K * i2) + i];
    }

    public int e() {
        return this.e;
    }

    public int e(int i) {
        return (65535 - this.u[i]) + (this.v[i] << 16);
    }

    public int e(int i, int i2) {
        return this.S[n().a(a(i, i2))];
    }

    public int f() {
        return this.a;
    }

    public int f(int i, int i2) {
        return this.S[0];
    }

    public int g() {
        return this.b;
    }

    public int h() {
        return this.a * this.d;
    }

    public int i() {
        return this.b * this.e;
    }

    public void j() {
        this.W.e %= this.d;
        this.W.f %= this.e;
        int i = this.W.g;
        int i2 = this.W.h;
        int i3 = i / this.d;
        int i4 = i2 / this.e;
        int i5 = this.f;
        int i6 = this.g;
        int i7 = i5 + i3;
        int i8 = i4 + i6;
        try {
            b(i5, i6, i7, i8, 0, 0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.W.d = false;
        int i9 = (i7 - i5) * this.d;
        int i10 = (i8 - i6) * this.e;
        this.h = ag.a(i5 * this.d, i6 * this.e, i9, i10);
        this.i = ag.a(0, 0, i9, i10);
        this.j = this.i;
        this.k = null;
        this.l = null;
        this.m = null;
        this.Y.a = this.j;
        this.Y.b = this.i;
        this.X.a(this.i);
        this.I.h.q();
        this.X.a(this.i);
        b(-this.h[0], -this.h[1]);
    }

    public boolean k() {
        return this.J;
    }

    public int l() {
        return this.K;
    }

    public int m() {
        return this.L;
    }

    public iCClassCPackage n() {
        return this.R;
    }
}
