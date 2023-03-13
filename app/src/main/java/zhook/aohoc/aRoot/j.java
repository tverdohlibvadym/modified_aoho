package zhook.aohoc.aRoot;

import java.io.DataInputStream;
import java.io.IOException;

import zhook.aohoc.aRoot.aPackage.aAClassPackage;
import zhook.aohoc.aRoot.aPackage.cAClassPackage;
import zhook.aohoc.aRoot.cPackage.aCClassCPackage;
import zhook.aohoc.aRoot.cPackage.cCClassCPackage;
import zhook.aohoc.aRoot.cPackage.dCClassCPackage;
import zhook.aohoc.aRoot.cPackage.fCClassCPackage;
import zhook.aohoc.aRoot.cPackage.gCClassCPackage;
import zhook.aohoc.bridge.aBridgeA;
import zhook.aohoc.bridge.eBridgeA;
import zhook.aohoc.bridge.fBridgeA;
import zhook.aohoc.bridge.platform.bPlatform;

/* loaded from: classes.dex */
public class j {
    public static int a;
    private int[] A;
    private int B;
    private byte[] C;
    private short[] D;
    private short[] E;
    private short[] F;
    private short[] G;
    private short[] H;
    private short[] I;
    private short[] J;
    private short[] K;
    private short[] L;
    private short[] M;
    private short[] N;
    private short[] O;
    private short[] P;
    private short[] Q;
    private short[] R;
    private short[] S;
    private short[] T;
    private short[] U;
    private short[] V;
    private aAClassPackage W;
    private cAClassPackage X;
    private i Y;
    private aCClassCPackage Z;
    private cCClassCPackage aa;
    private gCClassCPackage ab;
    public n b;
    public int c;
    public String[] d;
    public short[] e;
    public short[] f;
    public short[] g;
    public short[] h;
    public byte[] i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;
    int n = 0;
    public fCClassCPackage o;
    private int p;
    private short[] q;
    private short[] r;
    private int[] s;
    private int t;
    private short[] u;
    private short[] v;
    private int[] w;
    private int x;
    private short[] y;
    private short[] z;

    public j(n nVar, DataInputStream dataInputStream, aAClassPackage aAClassPackageVar) throws Throwable {
        this.b = nVar;
        this.W = aAClassPackageVar;
        this.X = this.W.b;
        this.Y = this.W.d;
        this.Z = this.W.T;
        this.aa = this.Z.j;
        this.ab = this.Z.k;
        byte readByte = dataInputStream.readByte();
        if ((readByte & 1) != 0) {
            this.c = dataInputStream.readShort();
            this.e = new short[this.c];
            this.f = ag.c(dataInputStream, this.c);
            this.g = ag.c(dataInputStream, this.c);
            this.h = ag.c(dataInputStream, this.c);
            this.i = ag.a(dataInputStream, this.c);
            this.d = ag.e(dataInputStream, this.c);
        }
        if ((readByte & 2) != 0) {
            this.p = dataInputStream.readShort();
            this.q = ag.b(this.q, this.p, -1);
            this.r = ag.c(dataInputStream, this.p);
            this.s = ag.d(dataInputStream, this.p);
        }
        if ((readByte & 32) != 0) {
            this.t = dataInputStream.readShort();
            this.u = ag.b(this.u, this.t, -1);
            this.v = ag.c(dataInputStream, this.t);
            this.w = ag.d(dataInputStream, this.t);
        }
        if ((readByte & 64) != 0) {
            this.x = dataInputStream.readShort();
            this.y = ag.b(this.y, this.x, -1);
            this.z = ag.c(dataInputStream, this.x);
            this.A = ag.d(dataInputStream, this.x);
        }
        if ((readByte & 4) != 0) {
            this.B = dataInputStream.readShort();
            if (this.p > 255) {
                this.D = ag.c(dataInputStream, this.B);
            } else if (this.p > 1) {
                this.C = ag.a(dataInputStream, this.B);
            }
            this.E = ag.c(dataInputStream, this.B);
            this.F = ag.c(dataInputStream, this.B);
            this.G = ag.c(dataInputStream, this.B);
            this.H = ag.c(dataInputStream, this.B);
        }
        if ((readByte & 8) != 0) {
            this.j = dataInputStream.readShort();
            if (this.j > 0) {
                this.I = ag.c(dataInputStream, this.j + 1);
                this.k = this.I[this.j];
                if (this.k > 0) {
                    this.J = ag.c(dataInputStream, this.k);
                    this.K = ag.c(dataInputStream, this.k);
                    this.L = ag.c(dataInputStream, this.k);
                }
            }
        }
        if ((readByte & 16) != 0) {
            this.l = dataInputStream.readShort();
            if (this.l > 0) {
                this.Q = ag.c(dataInputStream, this.l + 1);
                this.m = this.Q[this.l];
                if (this.m > 0) {
                    this.R = ag.c(dataInputStream, this.m);
                }
            }
        }
        this.M = ag.b(this.M, this.j, 32767);
        this.N = ag.a(this.N, this.j);
        this.O = ag.a(this.O, this.j);
        this.P = ag.a(this.P, this.j);
        this.S = ag.b(this.S, this.l, 32767);
        this.T = ag.a(this.T, this.l);
        this.U = ag.a(this.U, this.l);
        this.V = ag.a(this.V, this.l);
        for (int i = 0; i < this.j; i++) {
            o(i);
        }
        for (int i2 = 0; i2 < this.l; i2++) {
            p(i2);
        }
        zhook.aohoc.aRoot.y.a("dataset_info :  potype_id: " + (this.b == null ? "null" : "" + this.b.a) + " m_animCount=" + this.l + " m_animPartCount=" + this.m);
    }

    public static int a(int i, int i2) {
        return ((-16711681) & i) | ((i2 << 16) & 16711680);
    }

    public static int n(int i) {
        int i2 = 0;
        if ((i & 8192) == 0) {
            return i;
        }
        int i3 = ((i & 16711680) >>> 16) + 1;
        if (i3 >= (((-16777216) & i) >>> 24)) {
            if (!((i & 16384) != 0)) {
                return i;
            }
        } else {
            i2 = i3;
        }
        return ((-16711681) & i) | ((i2 << 16) & 16711680);
    }

    private void o(int i) {
        int i2 = -32768;
        int i3 = 32767;
        if (this.M[i] != Short.MAX_VALUE) {
            return;
        }
        short s = this.I[i];
        short s2 = this.I[i + 1];
        int i4 = 32767;
        int i5 = -32768;
        for (int i6 = s; i6 < s2; i6++) {
            short s3 = this.J[i6];
            short s4 = this.K[i6];
            short s5 = this.L[i6];
            int i7 = s3 & 8191;
            switch (s3 & 57344) {
                case 8192:
                    i4 = Math.min(i4, (int) s4);
                    i3 = Math.min(i3, (int) s5);
                    i2 = Math.max(i2, this.G[i7] + s4);
                    i5 = Math.max(i5, this.H[i7] + s5);
                    break;
                case 16384:
                    o(i7);
                    i4 = Math.min(i4, this.M[i7] + s4);
                    i3 = Math.min(i3, this.N[i7] + s5);
                    i2 = Math.max(i2, this.O[i7] + s4);
                    i5 = Math.max(i5, this.P[i7] + s5);
                    break;
                case 24576:
                    p(i7);
                    i4 = Math.min(i4, this.S[i7] + s4);
                    i3 = Math.min(i3, this.T[i7] + s5);
                    i2 = Math.max(i2, this.U[i7] + s4);
                    i5 = Math.max(i5, this.V[i7] + s5);
                    break;
                case 32768:
                    i4 = Math.min(i4, (int) s4);
                    i3 = Math.min(i3, (int) s5);
                    i2 = Math.max(i2, this.g[i7] + s4);
                    i5 = Math.max(i5, this.h[i7] + s5);
                    break;
            }
        }
        this.M[i] = (short) i4;
        this.N[i] = (short) i3;
        this.O[i] = (short) i2;
        this.P[i] = (short) i5;
    }

    private void p(int i) {
        int i2 = -32768;
        int i3 = 32767;
        if (this.S[i] != Short.MAX_VALUE) {
            return;
        }
        short s = this.Q[i];
        short s2 = this.Q[i + 1];
        int i4 = 32767;
        int i5 = -32768;
        for (int i6 = s; i6 < s2; i6++) {
            short s3 = this.R[i6];
            int i7 = s3 & 8191;
            switch (s3 & 57344) {
                case 8192:
                    i4 = Math.min(i4, 0);
                    i3 = Math.min(i3, 0);
                    i2 = Math.max(i2, (int) this.G[i7]);
                    i5 = Math.max(i5, (int) this.H[i7]);
                    break;
                case 16384:
                    o(i7);
                    i4 = Math.min(i4, (int) this.M[i7]);
                    i3 = Math.min(i3, (int) this.N[i7]);
                    i2 = Math.max(i2, (int) this.O[i7]);
                    i5 = Math.max(i5, (int) this.P[i7]);
                    break;
                case 24576:
                    p(i7);
                    i4 = Math.min(i4, (int) this.S[i7]);
                    i3 = Math.min(i3, (int) this.T[i7]);
                    i2 = Math.max(i2, (int) this.U[i7]);
                    i5 = Math.max(i5, (int) this.V[i7]);
                    break;
                case 32768:
                    i4 = Math.min(i4, 0);
                    i3 = Math.min(i3, 0);
                    i2 = Math.max(i2, (int) this.g[i7]);
                    i5 = Math.max(i5, (int) this.h[i7]);
                    break;
            }
        }
        this.S[i] = (short) i4;
        this.T[i] = (short) i3;
        this.U[i] = (short) i2;
        this.V[i] = (short) i5;
    }

    public int a(int i, int i2, boolean z, boolean z2, boolean z3) {
        return (z3 ? 8192 : 0) | (z2 ? 4096 : 0) | ((i2 << 16) & 16711680) | (i & 4095) | ((d(i) << 24) & (-16777216)) | (z ? 16384 : 0);
    }

    public final void a() {
        this.n++;
        for (int i = 0; i < this.p; i++) {
            this.q[i] = (short) this.Y.a(this.r[i], this.s[i]);
        }
        for (int i2 = 0; i2 < this.x; i2++) {
            this.y[i2] = (short) this.Y.b(this.z[i2], this.A[i2]);
        }
        for (int i3 = 0; i3 < this.t; i3++) {
            this.u[i3] = (short) this.Y.c(this.v[i3], this.w[i3]);
        }
    }

    public final void a(int i) {
        if (this.y[i] != -1) {
            this.Y.k(this.y[i]);
            this.y[i] = -1;
        }
    }

    public final void a(int i, int i2, int i3) {
        try {
            short s = this.q[i];
            fBridgeA e = this.Y.e(s);
            int a2 = e.a();
            int b = e.b();
            if (this.aa.c(0, 0, a2, b)) {
                int g = this.Y.g(s);
                if (g == 0) {
                    eBridgeA eBridgeAVar = this.Z.g;
                    aCClassCPackage aCClassCPackageVar = this.Z;
                    eBridgeAVar.a(e, i2, i3, 20);
                } else {
                    eBridgeA eBridgeAVar2 = this.Z.g;
                    aCClassCPackage aCClassCPackageVar2 = this.Z;
                    eBridgeAVar2.a(e, 0, 0, a2, b, g, i2, i3, 20);
                }
            }
        } catch (Throwable th) {
            zhook.aohoc.aRoot.y.a("iImage=" + i);
            th.printStackTrace();
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        if (i == -1) {
            return;
        }
        try {
            e(this.R[this.Q[i] + i2], i3, i4);
        } catch (Throwable th) {
            zhook.aohoc.aRoot.y.a("iAnim=" + i);
            th.printStackTrace();
        }
    }

    public final int b(int i) {
        if ((57344 & i) != 16384) {
            return 0;
        }
        return this.M[i & 8191];
    }

    public final void b() throws IOException {
        if (this.X.g != null) {
            this.X.g.e(0);
        }
        for (int i = 0; i < this.p; i++) {
            try {
                this.Y.c(this.q[i]);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } finally {
                if (this.X.g != null) {
                    this.X.g.e();
                }
            }
        }
        for (int i2 = 0; i2 < this.t; i2++) {
            this.Y.l(this.u[i2]);
        }
        for (int i3 = 0; i3 < this.x; i3++) {
            this.Y.h(this.y[i3]);
        }
    }

    public final void b(int i, int i2, int i3) {
        String str;
        int i4 = 2;
        try {
            short s = this.g[i];
            short s2 = this.h[i];
            this.aa.c();
            if (this.aa.a(i2, i3, s, s2)) {
                short s3 = this.f[i];
                short[] sArr = this.e;
                short b = (short) this.W.g.b(s3, this.e[i]);
                sArr[i] = b;
                if (b != -1) {
                    String str2 = this.W.g.c[b];
                    int i5 = (this.i[i] >>> 4) & 3;
                    int i6 = (this.i[i] >>> 6) & 3;
                    dCClassCPackage l = this.W.P.l(this.i[i] & 15);
                    if (s3 == this.W.g.d) {
                        String str3 = str2 + (char) 2;
                        String str4 = ((((int) (System.currentTimeMillis() / 250)) & 1) == 1 ? str3 + (char) 21 : str3 + (char) 20) + "|";
                        if (l.a(str4, 0) > s) {
                            str = str4;
                        } else {
                            i4 = 0;
                            str = str4;
                        }
                    } else {
                        i4 = i5;
                        str = str2;
                    }
                    if ( aBridgeA.c.b() == bPlatform.b && this.W.h.aH != null && this.W.h.aH.c == this) {
                        l.a(str, 0, (s >>> zhook.aohoc.aRoot.cPackage.dCClassCPackage.a[i4]) + i2, (s2 >>> zhook.aohoc.aRoot.cPackage.dCClassCPackage.a[i6]) + i3, i4, i6, i2, i2 + s, false);
                    } else {
                        l.a(str, 0, (s >>> zhook.aohoc.aRoot.cPackage.dCClassCPackage.a[i4]) + i2, (s2 >>> zhook.aohoc.aRoot.cPackage.dCClassCPackage.a[i6]) + i3, i4, i6, i2, i2 + s);
                    }
                }
            }
            this.aa.d();
        } catch (Throwable th) {
            zhook.aohoc.aRoot.y.a("iText=" + i);
            th.printStackTrace();
        }
    }

    public final int c(int i) {
        if ((57344 & i) != 16384) {
            return 0;
        }
        return this.N[i & 8191];
    }

    public final void c() {
        this.n--;
        if (this.n < 0) {
            zhook.aohoc.aRoot.y.a("AHTUNG !!!!!!!!!!! cDataSet.unregister");
            return;
        }
        for (int i = 0; i < this.p; i++) {
            this.Y.f(this.q[i]);
        }
        for (int i2 = 0; i2 < this.t; i2++) {
            this.Y.o(this.u[i2]);
        }
        for (int i3 = 0; i3 < this.x; i3++) {
            a(i3);
        }
    }

    public final void c(int i, int i2, int i3) {
        try {
            short s = this.q[this.C != null ? this.C[i] : this.D != null ? this.D[i] : (short) 0];
            this.ab.a(this.Y.e(s), this.E[i], this.F[i], this.G[i], this.H[i], i2, i3, this.Y.g(s));
        } catch (Throwable th) {
            zhook.aohoc.aRoot.y.a("iSub=" + i);
            th.printStackTrace();
        }
    }

    public int d(int i) {
        try {
            return this.Q[i + 1] - this.Q[i];
        } catch (Exception e) {
            zhook.aohoc.aRoot.y.a("getAnimLength : " + i + " potype_id: " + (this.b == null ? "null" : "" + this.b.a) + " m_animCount=" + this.l + " m_animPartCount=" + this.m);
            e.printStackTrace();
            return 0;
        }
    }

    public final void d(int i, int i2, int i3) {
        if (i == -1) {
            return;
        }
        try {
            short s = this.I[i];
            short s2 = this.I[i + 1];
            if (this.aa.c(this.M[i] + i2, this.N[i] + i3, this.O[i] - this.M[i], this.P[i] - this.N[i])) {
                for (int i4 = s; i4 < s2; i4++) {
                    e(this.J[i4], this.K[i4] + i2, this.L[i4] + i3);
                }
            }
        } catch (Throwable th) {
            zhook.aohoc.aRoot.y.a("iFrame=" + i);
            th.printStackTrace();
        }
    }

    public int e(int i) {
        if (i == -1) {
            return 0;
        }
        int i2 = i & 8191;
        switch (57344 & i) {
            case 16384:
                return this.M[i2];
            case 24576:
                return this.S[i2];
            default:
                return 0;
        }
    }

    public void e(int i, int i2, int i3) {
        if (i == -1) {
            return;
        }
        int i4 = i & 8191;
        switch (57344 & i) {
            case 0:
                a(i4, i2, i3);
                return;
            case 8192:
                c(i4, i2, i3);
                return;
            case 16384:
                d(i4, i2, i3);
                return;
            case 24576:
                int d = d(i4);
                if (d > 0) {
                    a(i4, (((this.X.aAClassPackage.D + a) * ((a & 3) + 6)) / 8) % d, i2, i3);
                    return;
                } else {
                    zhook.aohoc.aRoot.y.a("EMPTY ANIMATION: gid=" + Integer.toHexString(i));
                    return;
                }
            case 32768:
                b(i4, i2, i3);
                return;
            default:
                return;
        }
    }

    public int f(int i) {
        if (i == -1) {
            return 0;
        }
        int i2 = i & 8191;
        switch (57344 & i) {
            case 16384:
                return this.N[i2];
            case 24576:
                return this.T[i2];
            default:
                return 0;
        }
    }

    public void f(int i, int i2, int i3) {
        if ((i & 4096) == 0) {
            return;
        }
        a(i & 4095, (16711680 & i) >>> 16, i2, i3);
    }

    public int g(int i) {
        if (i == -1) {
            return 0;
        }
        int i2 = i & 8191;
        switch (57344 & i) {
            case 8192:
                return this.G[i2];
            case 16384:
                return this.O[i2];
            case 24576:
                return this.U[i2];
            case 32768:
                return this.g[i2];
            default:
                return 0;
        }
    }

    public int h(int i) {
        if (i == -1) {
            return 0;
        }
        int i2 = i & 8191;
        switch (57344 & i) {
            case 8192:
                return this.H[i2];
            case 16384:
                return this.P[i2];
            case 24576:
                return this.V[i2];
            case 32768:
                return this.h[i2];
            default:
                return 0;
        }
    }

    public int i(int i) {
        return g(i) - e(i);
    }

    public int j(int i) {
        return h(i) - f(i);
    }

    public fBridgeA k(int i) throws InterruptedException {
        return this.Y.e(this.q[i]);
    }

    public dCClassCPackage l(int i) throws InterruptedException {
        try {
            if (i >= this.u.length) {
                i = 4;
            }
            return this.Y.n(this.u[i]);
        } catch (Exception e) {
            e.printStackTrace();
            return this.Y.n(this.u[i]);
        }
    }

    public n m(int i) throws InterruptedException {
        return this.Y.j(this.y[i]);
    }
}
