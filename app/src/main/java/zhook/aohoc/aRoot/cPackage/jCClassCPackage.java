package zhook.aohoc.aRoot.cPackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;

import zhook.aohoc.aRoot.aPackage.aAClassPackage;
import zhook.aohoc.aRoot.aPackage.cAClassPackage;
import zhook.aohoc.aRoot.ab;
import zhook.aohoc.aRoot.l;
import zhook.aohoc.aRoot.m;
import zhook.aohoc.aRoot.n;
import zhook.aohoc.aRoot.s;
import zhook.aohoc.aRoot.t;
import zhook.aohoc.aRoot.z;

/* loaded from: classes.dex */
public class jCClassCPackage {
    public static boolean c = false;
    static final int[] d = {0, 2, 2, 3, 4, 6, 6, 7, 8, 10, 10, 12, 12, 14, 14, 15, 16, 18, 18, 19};
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    int J;
    int K;
    int L;
    int M;
    int N;
    int O;
    int R;
    int S;
    int T;
    int U;
    int V;
    int W;
    int X;
    int Y;
    int Z;
    aAClassPackage aAClassPackage;
    int aA;
    int aB;
    int aC;
    public n aF;
    public n aG;
    public n aH;
    public byte[] aJ;
    private aCClassCPackage aCClassCPackageR;
    private bCClassCPackage aS;
    private cCClassCPackage aT;
    private zhook.aohoc.aRoot.j aV;
    int aa;
    boolean ab;
    public eCClassCPackage ae;
    public int af;
    boolean ag;
    int ah;
    int ai;
    int aj;
    int ak;
    byte[] al;
    byte[] am;
    t an;
    public l aq;
    public l ar;
    dCClassCPackage ay;
    int az;
    cAClassPackage b;
    public hCClassCPackage e;
    public boolean f;
    int h;
    int i;
    int j;
    int k;
    int l;
    int m;
    int n;
    int o;
    int p;
    int q;
    boolean r;
    public int s;
    public int t;
    public int u;
    public long v;
    public int w;
    public int x;
    public int y;
    public int z;
    public ab g = new ab();
    private String aK = "";
    private String aL = "";
    private int aM = -1;
    private String aN = "";
    private String aO = "";
    private int aP = -1;
    public int I = -1;
    int[] P = new int[17];
    int[] Q = new int[17];
    int ac = 1000;
    public eCClassCPackage ad = null;
    public m ao = new m();
    public l ap = null;
    final Vector as = new Vector();
    final Vector at = new Vector();
    int au = -1;
    int av = -1;
    int aw = -1;
    int ax = -1;
    public int aD = 0;
    private final Object aQ = new Object();
    private int aU = -1;
    boolean aE = false;
    private int aW = 0;
    public boolean aI = false;
    private final Object aX = new Object();
    private int aY = -1;

    public jCClassCPackage(aAClassPackage aAClassPackageVar) {
        this.aAClassPackage = aAClassPackageVar;
        this.b = this.aAClassPackage.b;
        this.aCClassCPackageR = this.aAClassPackage.T;
        this.aS = this.aCClassCPackageR.i;
        this.aT = this.aCClassCPackageR.j;
    }

    private void A() {
        if (this.e == null) {
            this.w = 0;
            this.x = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 0;
            this.W = 0;
            this.X = 0;
            this.Y = 0;
            this.Z = 0;
            this.aa = 0;
            return;
        }
        this.S = z();
        if (this.e.h() < this.p) {
            this.T = (-(this.p - this.e.h())) / 2;
        } else {
            this.R = y();
            this.T = zhook.aohoc.aRoot.ag.a(-this.R, 0, this.l);
        }
        this.U = zhook.aohoc.aRoot.ag.a(-this.S, 0, this.m);
        this.V = zhook.aohoc.aRoot.ag.a(this.T + this.p, 0, this.l);
        this.W = zhook.aohoc.aRoot.ag.a(this.U + this.q, 0, this.m);
        this.X = this.T / this.h;
        this.Y = this.U / this.i;
        this.Z = ((this.V + this.h) - 1) / this.h;
        this.aa = ((this.W + this.i) - 1) / this.i;
    }

    private void B() {
        this.aS.a();
        this.aT.f();
        this.e.a(this.X, this.Y, this.Z, this.aa);
    }

    private void C() {
        if (this.ap == null) {
            this.P[16] = -10000;
            this.Q[16] = -10000;
            return;
        }
        this.P[16] = this.n + (this.ap.k - this.T);
        this.Q[16] = this.o + (this.ap.l - this.U);
    }

    private void D() {
        for (int size = this.as.size() - 1; size >= 0; size--) {
            if (!((z) this.as.elementAt(size)).a()) {
                this.as.removeElementAt(size);
            }
        }
        for (int size2 = this.at.size() - 1; size2 >= 0; size2--) {
            if (!((s) this.at.elementAt(size2)).a()) {
                this.at.removeElementAt(size2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f A[Catch: Throwable -> 0x01fa, TryCatch #0 {Throwable -> 0x01fa, blocks: (B:17:0x003f, B:19:0x0047, B:22:0x0057, B:23:0x0059, B:24:0x005c, B:26:0x0062, B:28:0x0066, B:30:0x006f, B:31:0x0072, B:33:0x0076, B:35:0x007e, B:36:0x0081, B:38:0x0085, B:39:0x0088, B:41:0x008e, B:43:0x0094, B:48:0x00a3, B:79:0x0147, B:21:0x004b), top: B:128:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076 A[Catch: Throwable -> 0x01fa, TryCatch #0 {Throwable -> 0x01fa, blocks: (B:17:0x003f, B:19:0x0047, B:22:0x0057, B:23:0x0059, B:24:0x005c, B:26:0x0062, B:28:0x0066, B:30:0x006f, B:31:0x0072, B:33:0x0076, B:35:0x007e, B:36:0x0081, B:38:0x0085, B:39:0x0088, B:41:0x008e, B:43:0x0094, B:48:0x00a3, B:79:0x0147, B:21:0x004b), top: B:128:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085 A[Catch: Throwable -> 0x01fa, TryCatch #0 {Throwable -> 0x01fa, blocks: (B:17:0x003f, B:19:0x0047, B:22:0x0057, B:23:0x0059, B:24:0x005c, B:26:0x0062, B:28:0x0066, B:30:0x006f, B:31:0x0072, B:33:0x0076, B:35:0x007e, B:36:0x0081, B:38:0x0085, B:39:0x0088, B:41:0x008e, B:43:0x0094, B:48:0x00a3, B:79:0x0147, B:21:0x004b), top: B:128:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean E() {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zhook.aohoc.a.c.j.E():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void F() {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zhook.aohoc.a.c.j.F():void");
    }

    private void G() {
        this.aT.a(this.n, this.o, this.p, this.q);
        for (int i = 0; i < this.as.size(); i++) {
            ((z) this.as.elementAt(i)).a(this.P[0], this.Q[0]);
        }
        for (int i2 = 0; i2 < this.at.size(); i2++) {
            ((s) this.at.elementAt(i2)).a(this.P[0], this.Q[0]);
        }
    }

    private void H() {
        this.aCClassCPackageR.a();
        this.aT.f();
        this.aCClassCPackageR.a(0);
        this.aCClassCPackageR.b();
        this.aT.a(this.n, this.o, this.p, this.q);
        if (this.e == null || !this.r) {
            return;
        }
        if (this.ab) {
            if (this.aS.d) {
                this.e.j();
            }
            this.aS.b(this.n - (this.T % this.h), this.o - (this.U % this.i));
        } else if (this.h * this.m == 0) {
            return;
        } else {
            try {
                this.e.a(this.X, this.Y, this.Z, this.aa, this.n, this.o);
            } catch (Throwable th) {
                zhook.aohoc.aRoot.y.a("m_map._drawRegion");
                th.printStackTrace();
            }
        }
        try {
            a(this.aH.g[this.aW], false);
        } catch (Throwable th2) {
            zhook.aohoc.aRoot.y.a("drawPosGidSet(_back_loc_gids)");
            th2.printStackTrace();
        }
        try {
            I();
        } catch (Throwable th3) {
            zhook.aohoc.aRoot.y.a("drawObjPaths()");
            th3.printStackTrace();
        }
        try {
            o();
        } catch (Throwable th4) {
            zhook.aohoc.aRoot.y.a("drawObjs()");
            th4.printStackTrace();
        }
        this.aCClassCPackageR.a();
        G();
        try {
            a(this.aH.g[this.aW + 1], true);
        } catch (Throwable th5) {
            zhook.aohoc.aRoot.y.a("drawPosGidSet(_fore_loc_gids)");
            th5.printStackTrace();
        }
    }

    private void I() {
        byte[] bArr;
        if (this.e.k() || this.h < 16) {
            return;
        }
        int i = this.h;
        int i2 = this.i;
        int i3 = this.P[0];
        int i4 = this.Q[0];
        zhook.aohoc.aRoot.j jVar = this.aG.c;
        short[] sArr = this.aG.d;
        int[] iArr = {-i, i, 0, 0};
        int[] iArr2 = {0, 0, -i2, i2};
        if (this.ap == null || (bArr = this.ap.y) == null || zhook.aohoc.aRoot.ad.a(bArr) <= 0) {
            return;
        }
        int c2 = i3 + (zhook.aohoc.aRoot.ad.c(bArr) * i) + (i / 2);
        int d2 = (zhook.aohoc.aRoot.ad.d(bArr) * i2) + i4 + (i2 / 2);
        short s = sArr.length > 5 ? sArr[5] : (short) -1;
        short s2 = sArr.length > 4 ? sArr[4] : (short) -2;
        int i5 = 4;
        int b = zhook.aohoc.aRoot.ad.b(bArr);
        int a = zhook.aohoc.aRoot.ad.a(bArr);
        int i6 = d2;
        int i7 = c2;
        int i8 = b;
        while (i8 < a) {
            zhook.aohoc.aRoot.j.a = i8;
            int a2 = zhook.aohoc.aRoot.ad.a(bArr, i8);
            short s3 = (i8 > 0 || s == -1) ? sArr[a2] : s;
            if (s3 != -1) {
                jVar.e(s3, i7, i6);
            }
            i7 += iArr[a2];
            i6 += iArr2[a2];
            i8++;
            i5 = a2;
        }
        if (b < a) {
            if (s2 == -2) {
                s2 = sArr[i5];
            }
            if (s2 != -1) {
                jVar.e(s2, i7, i6);
            }
        }
    }

    private void J() {
        int e = 0;
        if (this.aAClassPackage.g.c != null) {
            byte b = this.aAClassPackage.a.t[0];
            byte b2 = this.aAClassPackage.a.t[1];
            byte b3 = this.aAClassPackage.a.t[2];
            this.aAClassPackage.g.a(b, this.g.c());
            this.aAClassPackage.g.a(b3, this.aAClassPackage.a.q);
            String f = this.g.f();
            if (this.g.e() != -1) {
                f = f.substring(0, e) + '\b' + f.charAt(e) + (char) 0 + f.substring(e + 1);
            }
            this.aAClassPackage.g.a(b2, f);
            this.aAClassPackage.g.a(this.aAClassPackage.g.d, this.g.l());
        }
    }

    private void K() {
        if (this.f) {
            int i = this.aAClassPackage.i();
            if ((32768 & i) != 0) {
                this.aAClassPackage.f(-1664090112);
                this.g.d();
            } else if ((131072 & i) != 0) {
                this.aAClassPackage.f(-1664090112);
                this.g.h();
            } else if ((i & 262144) != 0) {
                this.aAClassPackage.f(-1664090112);
                this.g.i();
            } else {
                int f = this.aAClassPackage.f.f();
                if (f != 0) {
                    this.g.b(f);
                }
            }
            J();
        }
    }

    private void a(l lVar) {
        this.ap = lVar;
        this.al = null;
        if (this.e == null) {
            return;
        }
        if (this.ap != null) {
            if (!this.e.k()) {
                e(this.ap.m, this.ap.n);
            } else if (this.am != null) {
                f(this.ap.o, this.ap.p);
            }
        }
        if (this.ar != this.ap || this.ap == null) {
            return;
        }
        b(this.ap.i);
        a(this.ap.h);
    }

    private void e(int i, int i2) {
        this.aj = -1;
        this.ak = -1;
        this.al = null;
        byte[] bArr = this.e.q;
        if (bArr == null) {
            return;
        }
        this.aj = i;
        this.ak = i2;
        int i3 = this.j;
        int i4 = i3 * this.k;
        this.al = new byte[i4];
        int i5 = (i2 * i3) + i;
        short[] sArr = new short[i4];
        sArr[0] = (short) i5;
        sArr[1] = -1;
        short[] sArr2 = new short[i4];
        byte[] bArr2 = this.al;
        this.aJ = new byte[]{-1, 1, (byte) (-i3), (byte) i3, (byte) ((-1) - i3), (byte) (1 - i3), (byte) (i3 - 1), (byte) (i3 + 1)};
        byte b = (byte) (i5 < 0 ? 0 : 127);
        for (int i6 = 0; i6 < i4; i6++) {
            bArr2[i6] = b;
        }
        if (i5 >= 0) {
            bArr2[i5] = (byte) (bArr2[i5] & 128);
            int i7 = 1;
            int length = this.am == null ? 127 : this.am.length;
            short[] sArr3 = sArr2;
            int i8 = 1;
            int i9 = 0;
            while (i7 < i4 && i8 > 0 && i9 <= length) {
                int i10 = i9 + 1;
                int i11 = 0;
                i8 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    short s = sArr[i11];
                    if (s != -1) {
                        byte b2 = bArr[s];
                        int i13 = 0;
                        while (true) {
                            int i14 = i13;
                            if (i14 < 8) {
                                if (((1 << i14) & b2) != 0) {
                                    int i15 = s + this.aJ[i14];
                                    byte b3 = bArr2[i15];
                                    if (i10 < (b3 & Byte.MAX_VALUE)) {
                                        int i16 = b3 & 128;
                                        bArr2[i15] = (byte) ((i10 & 127) | i16);
                                        i7++;
                                        if (i16 == 0) {
                                            sArr3[i8] = (short) i15;
                                            i8++;
                                        }
                                    }
                                }
                                i13 = i14 + 1;
                            }
                        }
                    }
                }
            }
        }
    }

    private void f(int i, int i2) {
        int i3;
        this.aj = i;
        this.ak = i2;
        this.al = null;
        byte[] bArr = this.e.q;
        if (bArr == null) {
            return;
        }
        int i4 = this.ah;
        int i5 = i4 * this.ai;
        this.al = new byte[i5];
        int i6 = i + (i2 * i4);
        short[] sArr = new short[i5];
        sArr[0] = (short) i6;
        sArr[1] = -1;
        short[] sArr2 = new short[i5];
        byte[] bArr2 = this.al;
        this.aJ = new byte[]{-1, 1, (byte) (-i4), (byte) i4, (byte) ((-1) - i4), (byte) (1 - i4), (byte) (i4 - 1), (byte) (i4 + 1)};
        byte b = (byte) (i6 < 0 ? 0 : 127);
        for (int i7 = 0; i7 < i5; i7++) {
            bArr2[i7] = b;
        }
        if (i6 >= 0) {
            for (l lVar = this.ao.b; lVar != null; lVar = lVar.F) {
                if ((lVar.b & 1) == 0 && (i3 = lVar.o + (lVar.p * i4)) >= 0) {
                    bArr2[i3] = (byte) (bArr2[i3] | 128);
                }
            }
            bArr2[i6] = (byte) (bArr2[i6] & 128);
            int i8 = 1;
            int length = this.am.length;
            short[] sArr3 = sArr2;
            int i9 = 1;
            int i10 = 0;
            while (i8 < i5 && i9 > 0 && i10 <= length) {
                int i11 = i10 + 1;
                int i12 = 0;
                i9 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    short s = sArr[i12];
                    if (s != -1) {
                        byte b2 = bArr[s];
                        int i14 = 0;
                        while (true) {
                            int i15 = i14;
                            if (i15 < 8) {
                                if (((1 << i15) & b2) != 0) {
                                    int i16 = s + this.aJ[i15];
                                    byte b3 = bArr2[i16];
                                    if (i11 < (b3 & Byte.MAX_VALUE)) {
                                        int i17 = b3 & 128;
                                        bArr2[i16] = (byte) ((i11 & 127) | i17);
                                        i8++;
                                        if (i17 == 0) {
                                            sArr3[i9] = (short) i16;
                                            i9++;
                                        }
                                    }
                                }
                                i14 = i15 + 1;
                            }
                        }
                    }
                }
            }
        }
    }

    private int j(int i) {
        return this.l > this.p ? -zhook.aohoc.aRoot.ag.a(i - (this.p / 2), 0, (this.l - this.p) - 1) : (this.p - this.l) / 2;
    }

    private int k(int i) {
        return this.m > this.q ? -zhook.aohoc.aRoot.ag.a(i - (this.q / 2), 0, (this.m - this.q) - 1) : (this.q - this.m) / 2;
    }

    private l l(int i) {
        for (l lVar = this.ao.c; lVar != null; lVar = lVar.E) {
            if (i == lVar.a) {
                return lVar;
            }
        }
        return null;
    }

    private void w() {
        boolean z = false;
        this.P[7] = 0;
        this.Q[7] = 0;
        this.P[8] = this.aCClassCPackageR.c / 2;
        this.Q[8] = 0;
        this.P[9] = this.aCClassCPackageR.c;
        this.Q[9] = 0;
        this.P[10] = 0;
        this.Q[10] = this.aCClassCPackageR.d / 2;
        this.P[11] = this.aCClassCPackageR.c / 2;
        this.Q[11] = this.aCClassCPackageR.d / 2;
        this.P[12] = this.aCClassCPackageR.c;
        this.Q[12] = this.aCClassCPackageR.d / 2;
        this.P[13] = 0;
        this.Q[13] = this.aCClassCPackageR.d;
        this.P[14] = this.aCClassCPackageR.c / 2;
        this.Q[14] = this.aCClassCPackageR.d;
        this.P[15] = this.aCClassCPackageR.c;
        this.Q[15] = this.aCClassCPackageR.d;
        this.G = 0;
        this.H = 0;
        if (this.ah > 0 && this.ai > 0) {
            z = true;
        }
        this.ag = z;
        x();
    }

    private void x() {
        this.am = null;
        this.r = false;
        if (this.e == null) {
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.l = 0;
            this.m = 0;
            this.aS.i = 0;
            this.aS.j = 0;
            this.al = null;
            this.ah = 0;
            this.ai = 0;
            return;
        }
        this.h = this.e.d();
        this.i = this.e.e();
        this.j = this.e.f();
        this.k = this.e.g();
        this.l = this.e.h();
        this.m = this.e.i();
        this.ah = this.e.l();
        this.ai = this.e.m();
        this.aS.i = this.h;
        this.aS.j = this.i;
        this.al = new byte[this.ah * this.ai];
    }

    private int y() {
        return j(this.w);
    }

    private int z() {
        return k(this.x);
    }

    public int a() {
        switch (this.s) {
            case 1:
                return this.E;
            default:
                return this.w;
        }
    }

    public l a(int i) {
        switch (i) {
            case -8:
                return b(16);
            case -7:
                return b(8);
            case -6:
                return b(128);
            case -5:
                return b(64);
            case -4:
                return b(32);
            case -3:
                return null;
            case -2:
                return this.ap;
            default:
                return l(i);
        }
    }

    public void a(int i, int i2) {
        try {
            if (this.e == null) {
                return;
            }
            this.w = zhook.aohoc.aRoot.ag.a(i, this.L, this.N - 1);
            this.x = zhook.aohoc.aRoot.ag.a(i2, this.M, this.O - 1);
            this.y = this.w / this.h;
            this.z = this.x / this.i;
            d();
            A();
            this.P[0] = this.n - this.T;
            this.Q[0] = this.o - this.U;
            this.P[4] = this.n + (this.w - this.T);
            this.Q[4] = this.o + (this.x - this.U);
            this.P[3] = this.n + (((this.w - (this.w % this.h)) + (this.h / 2)) - this.T);
            this.Q[3] = this.o + (((this.x - (this.x % this.i)) + (this.i / 2)) - this.U);
            this.P[2] = this.n + (this.E - this.T);
            this.Q[2] = this.o + (this.F - this.U);
            this.P[1] = this.n + (((this.E - (this.E % this.h)) + (this.h / 2)) - this.T);
            this.Q[1] = this.o + (((this.F - (this.F % this.i)) + (this.i / 2)) - this.U);
            C();
            if (this.e.k()) {
                int b = this.e.b(i, i2, this.J, this.K);
                this.I = b;
                if (b != -1) {
                    this.G = this.e.c(b);
                    this.H = this.e.d(b);
                    this.P[6] = this.n + (this.e.a(b) - this.T);
                    this.Q[6] = (this.e.b(b) - this.U) + this.o;
                } else {
                    this.P[6] = -1000;
                    this.Q[6] = -1000;
                }
            }
            if (this.ar == null) {
                c();
                if (this.an != null && this.e.k() && this.I != -1 && this.an.b(this.I) != 0) {
                    if (this.aN != null && this.aN.length() > 0) {
                        b(this.aN);
                    }
                    if (this.aO != null && this.aO.length() > 0) {
                        a(this.aO);
                    }
                }
            }
            if (this.ab) {
                B();
            }
            this.r = true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(int i, int i2, int i3) {
        m();
        try {
            b(i, i2, i3);
        } finally {
            n();
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        m();
        try {
            this.n = i;
            this.o = i2;
            this.p = i3;
            this.q = i4;
            this.P[5] = this.n;
            this.Q[5] = this.o;
        } finally {
            n();
        }
    }

    public void a(int i, int i2, int i3, int i4, int i5) {
        m();
        try {
            b(i, i2, i3, i4, i5);
        } finally {
            n();
        }
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        zhook.aohoc.aRoot.j jVar;
        short s;
        m();
        try {
            if (i == -1) {
                jVar = this.b.i;
                s = (short) (i2 | 24576);
            } else {
                l a = a(i);
                if (a == null) {
                    return;
                }
                jVar = a.j.c;
                s = a.j.d[i2];
            }
            this.at.addElement(new s(this.aAClassPackage, jVar, s, i3, i4, i5, i6, i7));
        } finally {
            n();
        }
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, int i9, int i10) {
        m();
        try {
            this.ao.b(a(i));
            int b = this.aAClassPackage.d.b(i9, i10);
            this.aAClassPackage.d.h(b);
            n j = this.aAClassPackage.d.j(b);
            j.c.a();
            this.aAClassPackage.d.k(b);
            j.c.b();
            this.aAClassPackage.e.c();
            l lVar = new l(i, i2, i3, i6, str, str2, str3, j, i7, i8, i7 / this.h, i8 / this.i, 0, 0, i4, i5);
            this.ao.a(lVar);
            if (this.w == lVar.k && this.x == lVar.l) {
                d();
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        } finally {
            n();
        }
    }

    public void a(int i, int i2, String str, int i3, int i4, int i5, int i6, int i7) throws InterruptedException {
        m();
        try {
            this.as.addElement(new z(this.aAClassPackage, this.aAClassPackage.g(i), i2, str, i3, i4, i5, i6, i7));
        } finally {
            n();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v26, types: [int] */
    public void a(DataInputStream dataInputStream) throws IOException {
        boolean z;
        int b;
        m();
        boolean z2 = false;
        try {
            int readInt = dataInputStream.readInt();
            l a = a(readInt);
            if (dataInputStream.readBoolean()) {
                String readUTF = dataInputStream.readUTF();
                this.aK = readUTF;
                switch (this.af) {
                    case 1:
                        if (this.e != null) {
                            this.e.y = readUTF;
                            break;
                        }
                        break;
                    case 2:
                        if (this.ae != null) {
                            this.ae.P = readUTF;
                        }
                        b(readUTF);
                        break;
                }
            }
            if (dataInputStream.readBoolean()) {
                String readUTF2 = dataInputStream.readUTF();
                this.aL = readUTF2;
                switch (this.af) {
                    case 1:
                        if (this.e != null) {
                            this.e.x = readUTF2;
                            break;
                        }
                        break;
                }
            }
            byte readByte = dataInputStream.readByte();
            if (readByte != -2) {
                this.aM = readByte;
            }
            if (dataInputStream.readBoolean()) {
                this.aN = dataInputStream.readUTF();
            }
            if (dataInputStream.readBoolean()) {
                this.aO = dataInputStream.readUTF();
            }
            byte readByte2 = dataInputStream.readByte();
            if (readByte2 != -2) {
                this.aP = readByte2;
            }
            boolean z3 = this.am != null;
            int readByte3 = dataInputStream.readByte();
            if (readByte3 > 0) {
                this.am = new byte[readByte3];
                zhook.aohoc.aRoot.ag.a(dataInputStream, this.am, (int[]) null);
                int readUnsignedShort = dataInputStream.readUnsignedShort();
                if (readUnsignedShort > 0) {
                    this.an = new t();
                    this.an.a(this.e.l() * this.e.m());
                    this.an.a(zhook.aohoc.aRoot.ag.a(dataInputStream, readUnsignedShort));
                } else {
                    this.an = null;
                }
                this.aS.d = true;
                z = true;
            } else {
                if (readByte3 == 0) {
                    if (this.am != null) {
                        this.aS.d = true;
                    }
                    this.am = null;
                    this.an = null;
                }
                z = false;
            }
            short readShort = dataInputStream.readShort();
            for (short s = 0; s < readShort; s++) {
                int readInt2 = dataInputStream.readInt();
                int readUnsignedShort2 = dataInputStream.readUnsignedShort();
                l a2 = a(readInt2);
                l lVar = a2 == null ? new l() : a2;
                if ((readUnsignedShort2 & 1) != 0) {
                    lVar.c = dataInputStream.readByte();
                    lVar.z = -1;
                }
                if ((readUnsignedShort2 & 2048) != 0) {
                    lVar.d = dataInputStream.readByte();
                }
                if ((readUnsignedShort2 & 4096) != 0) {
                    lVar.e = dataInputStream.readByte();
                }
                if ((readUnsignedShort2 & 2) != 0) {
                    lVar.b = dataInputStream.readByte();
                }
                if ((readUnsignedShort2 & 4) != 0) {
                    lVar.g = dataInputStream.readUTF();
                }
                if ((readUnsignedShort2 & 8) != 0) {
                    lVar.h = dataInputStream.readUTF();
                }
                if ((readUnsignedShort2 & 16) != 0) {
                    lVar.i = dataInputStream.readUTF();
                }
                if ((readUnsignedShort2 & 32) != 0) {
                    lVar.f = dataInputStream.readByte();
                }
                if ((readUnsignedShort2 & 64) != 0) {
                    lVar.k = dataInputStream.readShort();
                    lVar.l = dataInputStream.readShort();
                    lVar.m = (byte) (lVar.k / this.h);
                    lVar.n = (byte) (lVar.l / this.i);
                    if (this.e.k() && (b = this.e.b(lVar.k, lVar.l, 0, 0)) != -1) {
                        lVar.o = this.e.a(b);
                        lVar.p = this.e.b(b);
                    }
                    if (lVar != null) {
                        this.ao.c(lVar);
                    }
                }
                if ((readUnsignedShort2 & 256) != 0) {
                    byte[] b2 = zhook.aohoc.aRoot.ag.b(dataInputStream);
                    if (b2 != null && b2.length == 0) {
                        b2 = null;
                    }
                    lVar.y = b2;
                }
                if ((readUnsignedShort2 & 512) != 0) {
                }
                if ((readUnsignedShort2 & 1024) != 0) {
                    lVar.A = dataInputStream.readShort();
                }
                if (this.ar == lVar && lVar != null) {
                    b(lVar.i);
                    a(lVar.h);
                }
            }
            if (readInt != -1) {
                a(a);
            }
            p();
            if (z || z3) {
                B();
                z2 = true;
            }
            if (z2) {
                Thread.yield();
            }
        } catch (Throwable ex) {
            throw new RuntimeException(ex);
        } finally {
            n();
        }
    }

    public void a(String str) {
        int indexOf;
        String str2 = null;
        if (str != null && (indexOf = str.indexOf(10)) != -1) {
            str2 = str.substring(indexOf + 1);
            str = str.substring(0, indexOf);
        }
        this.aAClassPackage.g.a(this.au, str);
        this.aAClassPackage.g.a(this.av, str2);
    }

    public void a(String str, String str2) {
        this.aK = str;
        this.aL = str2;
    }

    public void a(eCClassCPackage eCClassCPackageVar) {
        m();
        try {
            b(eCClassCPackageVar);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        } finally {
            n();
        }
    }

    public void a(boolean z) {
        m();
        try {
            b(z);
        } finally {
            n();
        }
    }

    public void a(int[] iArr) {
        m();
        for (int i : iArr) {
            try {
                l a = a(i);
                if (a != null) {
                    a.D = true;
                }
            } finally {
                n();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int[] r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zhook.aohoc.a.c.j.a(int[], boolean):void");
    }

    public int b() {
        switch (this.s) {
            case 1:
                return this.F;
            default:
                return this.x;
        }
    }

    public l b(int i) {
        l lVar = this.ar;
        if (lVar == null) {
            lVar = this.aq;
        }
        if (lVar == null) {
            lVar = this.ao.b;
        }
        if (lVar != null) {
            l lVar2 = lVar;
            while (lVar2 != null) {
                lVar2 = lVar2.F;
                if (lVar2 == null) {
                    lVar2 = this.ao.b;
                }
                if (lVar2 != null) {
                    int i2 = lVar2.b;
                    if ((i2 & 1) == 0 && (i2 & i) != 0) {
                        return lVar2;
                    }
                }
                if (lVar2 == lVar) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public void b(int i, int i2, int i3) {
        l b;
        l lVar = null;
        switch (i) {
            case -6:
                b = b(128);
                break;
            case -5:
                b = b(64);
                break;
            case -4:
                b = b(32);
                break;
            case -3:
            case -2:
                b = this.ap;
                break;
            case -1:
                this.s = 0;
                this.aq = null;
                return;
            default:
                b = a(i);
                break;
        }
        if (b == null) {
            return;
        }
        int i4 = b.a;
        int i5 = (this.h / 2) + (b.m * this.h);
        int i6 = (b.n * this.i) + (this.i / 2);
        if (this.e.k()) {
            this.G = b.o;
            this.H = b.p;
        }
        switch (i) {
            case -3:
                if (b.y != null) {
                    i5 += zhook.aohoc.aRoot.ad.f(b.y) * this.h;
                    i6 += zhook.aohoc.aRoot.ad.g(b.y) * this.i;
                    break;
                } else {
                    return;
                }
            default:
                lVar = b;
                break;
        }
        this.aq = lVar;
        if (!(lVar != null && Math.abs(this.y - b.m) + Math.abs(this.z - b.n) > 1)) {
            i3 = 0;
        }
        h(i5, i6, i2, i3);
    }

    public void b(int i, int i2, int i3, int i4) {
        m();
        try {
            this.L = i;
            this.M = i2;
            this.N = i3;
            this.O = i4;
        } finally {
            n();
        }
    }

    public void b(int i, int i2, int i3, int i4, int i5) {
        l a = a(i);
        if (a == null) {
            return;
        }
        a.B = (byte) i4;
        a.r = this.aAClassPackage.w;
        a.t = i5;
        a.k = a.w;
        a.l = a.x;
        a.u = a.k;
        a.v = a.l;
        a.w = i2;
        a.x = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v66, types: [int] */
    public void b(DataInputStream dataInputStream) {
        m();
        try {
            b((eCClassCPackage) null);
            this.I = -1;
            this.ap = null;
            this.ar = null;
            this.aq = null;
            this.s = 0;
            byte readByte = dataInputStream.readByte();
            this.ac = dataInputStream.readInt();
            this.au = dataInputStream.readUnsignedByte();
            this.av = dataInputStream.readUnsignedByte();
            this.aw = dataInputStream.readUnsignedByte();
            this.ax = dataInputStream.readUnsignedByte();
            this.aAClassPackage.g.a(this.au, "");
            this.aAClassPackage.g.a(this.aw, "");
            n nVar = new n(this.aAClassPackage, -1, 0, dataInputStream);
            nVar.c.a();
            if (this.aV != null) {
                this.aV.c();
                this.aV = null;
                this.aF = null;
                this.aG = null;
                this.aH = null;
            }
            nVar.c.b();
            this.aAClassPackage.e.c();
            this.aV = nVar.c;
            this.aAClassPackage.P = this.aV;
            n m = this.aV.m(nVar.e[zhook.aohoc.aRoot.bPackage.eBClassCPackage.a][zhook.aohoc.aRoot.bPackage.eBClassCPackage.n]);
            m.c.a();
            if (this.aF != null) {
                this.aF.c.c();
            }
            this.aF = m;
            n m2 = this.aV.m(nVar.e[zhook.aohoc.aRoot.bPackage.eBClassCPackage.a][zhook.aohoc.aRoot.bPackage.eBClassCPackage.o]);
            m2.c.a();
            if (this.aG != null) {
                this.aG.c.c();
            }
            this.aG = m2;
            n m3 = this.aV.m(nVar.e[zhook.aohoc.aRoot.bPackage.eBClassCPackage.a][zhook.aohoc.aRoot.bPackage.eBClassCPackage.m]);
            m3.c.a();
            if (this.aH != null) {
                this.aH.c.c();
            }
            this.aH = m3;
            hCClassCPackage hCClassCPackageVar = new hCClassCPackage(this.aAClassPackage, new iCClassCPackage(this.aV.m(nVar.e[zhook.aohoc.aRoot.bPackage.eBClassCPackage.a][zhook.aohoc.aRoot.bPackage.eBClassCPackage.l])), this.aV.m(nVar.e[zhook.aohoc.aRoot.bPackage.eBClassCPackage.a][zhook.aohoc.aRoot.bPackage.eBClassCPackage.k]), readByte);
            hCClassCPackageVar.H = nVar.f[zhook.aohoc.aRoot.bPackage.eBClassCPackage.q][zhook.aohoc.aRoot.bPackage.eBClassCPackage.A] != 0;
            hCClassCPackageVar.a();
            if (this.e != null) {
                this.e.c();
                this.e = null;
            }
            this.e = hCClassCPackageVar;
            byte[] bArr = nVar.e[zhook.aohoc.aRoot.bPackage.eBClassCPackage.b];
            for (byte b : bArr) {
                this.aV.m(b).c.a();
            }
            for (l lVar = this.ao.b; lVar != null; lVar = lVar.F) {
                lVar.j.c.c();
            }
            this.ao.a();
            this.b.g.e(0);
            this.e.b();
            this.aF.c.b();
            this.aG.c.b();
            this.aH.c.b();
            for (byte b2 : bArr) {
                this.aV.m(b2).c.b();
            }
            this.b.g.e();
            this.aAClassPackage.e.c();
            w();
            short s = nVar.f[zhook.aohoc.aRoot.bPackage.eBClassCPackage.q][zhook.aohoc.aRoot.bPackage.eBClassCPackage.v];
            short s2 = nVar.f[zhook.aohoc.aRoot.bPackage.eBClassCPackage.q][zhook.aohoc.aRoot.bPackage.eBClassCPackage.y];
            short s3 = nVar.f[zhook.aohoc.aRoot.bPackage.eBClassCPackage.q][zhook.aohoc.aRoot.bPackage.eBClassCPackage.z];
            this.ay = this.aAClassPackage.g(nVar.f[zhook.aohoc.aRoot.bPackage.eBClassCPackage.q][zhook.aohoc.aRoot.bPackage.eBClassCPackage.x]);
            this.az = zhook.aohoc.aRoot.cPackage.dCClassCPackage.a[2 - (s2 & 3)];
            this.aA = zhook.aohoc.aRoot.cPackage.dCClassCPackage.a[2 - ((s2 >>> 2) & 3)];
            this.aB = (2 - s3) & 3;
            this.aC = (2 - (s3 >>> 2)) & 3;
            boolean z = nVar.e[zhook.aohoc.aRoot.bPackage.eBClassCPackage.c] != null && nVar.e[zhook.aohoc.aRoot.bPackage.eBClassCPackage.c].length > 0;
            short s4 = nVar.f[zhook.aohoc.aRoot.bPackage.eBClassCPackage.q][zhook.aohoc.aRoot.bPackage.eBClassCPackage.w];
            short s5 = 0;
            l lVar2 = null;
            while (s5 < s) {
                byte b3 = -1;
                byte b4 = -1;
                if (nVar.e.length > zhook.aohoc.aRoot.bPackage.eBClassCPackage.i && nVar.e[zhook.aohoc.aRoot.bPackage.eBClassCPackage.i] != null) {
                    b3 = nVar.e[zhook.aohoc.aRoot.bPackage.eBClassCPackage.i][s5];
                }
                if (nVar.e.length > zhook.aohoc.aRoot.bPackage.eBClassCPackage.h && nVar.e[zhook.aohoc.aRoot.bPackage.eBClassCPackage.h] != null) {
                    b4 = nVar.e[zhook.aohoc.aRoot.bPackage.eBClassCPackage.h][s5];
                }
                l lVar3 = new l(nVar.g[zhook.aohoc.aRoot.bPackage.eBClassCPackage.C][s5], nVar.e[zhook.aohoc.aRoot.bPackage.eBClassCPackage.e][s5], nVar.e[zhook.aohoc.aRoot.bPackage.eBClassCPackage.f][s5], nVar.e[zhook.aohoc.aRoot.bPackage.eBClassCPackage.g][s5], nVar.h[zhook.aohoc.aRoot.bPackage.eBClassCPackage.E][s5], nVar.h[zhook.aohoc.aRoot.bPackage.eBClassCPackage.F][s5], nVar.h[zhook.aohoc.aRoot.bPackage.eBClassCPackage.G][s5], this.aV.m(bArr[s5]), nVar.f[zhook.aohoc.aRoot.bPackage.eBClassCPackage.r][s5], nVar.f[zhook.aohoc.aRoot.bPackage.eBClassCPackage.s][s5], nVar.f[zhook.aohoc.aRoot.bPackage.eBClassCPackage.r][s5] / this.h, nVar.f[zhook.aohoc.aRoot.bPackage.eBClassCPackage.s][s5] / this.i, z ? nVar.e[zhook.aohoc.aRoot.bPackage.eBClassCPackage.c][s5] : (byte) 0, z ? nVar.e[zhook.aohoc.aRoot.bPackage.eBClassCPackage.d][s5] : (byte) 0, b3, b4);
                l lVar4 = s5 == s4 ? lVar3 : lVar2;
                lVar3.b();
                this.ao.a(lVar3, this.ao.c, null);
                s5++;
                lVar2 = lVar4;
            }
            if ( hCClassCPackageVar != null) {
                e(1);
            }
            a(hCClassCPackageVar.y, hCClassCPackageVar.x);
            c();
            a(lVar2);
            if (lVar2 == null) {
                a(hCClassCPackageVar.h() / 2, hCClassCPackageVar.i() / 2);
            } else {
                b(-2, 0, 0);
            }
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        } catch (Throwable ex) {
            throw new RuntimeException(ex);
        } finally {
            n();
        }
    }

    public void b(String str) {
        int indexOf;
        String str2 = null;
        if (str != null && (indexOf = str.indexOf(10)) != -1) {
            str2 = str.substring(indexOf + 1);
            str = str.substring(0, indexOf);
        }
        this.aAClassPackage.g.a(this.aw, str);
        this.aAClassPackage.g.a(this.ax, str2);
    }

    public void b(eCClassCPackage eCClassCPackageVar) throws IOException, InterruptedException {
        boolean z = true;
        boolean z2 = false;
        boolean z3 = h() == 1;
        e(0);
        this.aS.b();
        if (z3 && eCClassCPackageVar != null && eCClassCPackageVar.m) {
            this.aI = true;
            this.aS.d = true;
            this.aS.e = 0;
            this.aS.f = 0;
            this.aS.a();
            this.aT.f();
            this.aCClassCPackageR.b(0);
            this.aT.a(this.n, this.o, this.p, this.q);
            this.e.b(this.X, this.Y, this.Z, this.aa, this.n - (this.T % this.h), this.o - (this.U % this.i));
            this.aT.a(this.n, this.o, this.p, this.q);
            this.e.b(this.n - this.T, this.o - this.U);
            this.aT.f();
            a(this.aH.g[this.aW], false);
            I();
            o();
            G();
            a(this.aH.g[this.aW + 1], true);
        }
        if ( eCClassCPackageVar == null) {
            if (this.ad != null) {
                this.ad.E();
                this.ad = null;
            }
        } else if ( eCClassCPackageVar.m) {
            if ((this.ae == null || this.ae.m) ? false : true) {
                this.ad = this.ae;
            } else {
                z = false;
            }
            z2 = z;
        } else if ( eCClassCPackageVar.i && this.ad != null) {
            this.ad.E();
            this.ad = null;
        }
        if (this.ae != null) {
            this.ae.D();
        }
        if ( eCClassCPackageVar != null) {
            eCClassCPackageVar.A();
        }
        if (this.ae != null) {
            this.ae.B();
        }
        if ( eCClassCPackageVar != null) {
            eCClassCPackageVar.C();
        }
        this.ae = eCClassCPackageVar;
        if (this.ae != null) {
            e(2);
        }
        if (z2) {
            this.ad.A();
            this.ad.C();
        }
    }

    public void b(boolean z) {
        this.ab = z;
        this.aS.b();
    }

    public boolean b(int i, int i2) {
        if (zhook.aohoc.aRoot.ag.a(i, i2, this.aAClassPackage.N, 0)) {
            this.aAClassPackage.e(4096);
            return true;
        } else if (zhook.aohoc.aRoot.ag.a(i, i2, this.aAClassPackage.N, 4)) {
            this.aAClassPackage.e(8192);
            return true;
        } else {
            return false;
        }
    }

    public int c(int i) {
        l a = a(i);
        if (a == null || a.B == 0) {
            return 0;
        }
        int i2 = a.r;
        int i3 = this.aAClassPackage.w;
        int i4 = a.t;
        return i4 - zhook.aohoc.aRoot.ag.a(i3 - i2, 0, i4);
    }

    public void c() {
        b(this.aK);
        a(this.aL);
    }

    public void c(int i, int i2, int i3, int i4) {
        m();
        try {
            d(i, i2, i3, i4);
        } finally {
            n();
        }
    }

    public void c(int i, int i2, int i3, int i4, int i5) {
        m();
        try {
            d(i, i2, i3, i4, i5);
        } finally {
            n();
        }
    }

    public void c(String str) {
        try {
            this.g.b(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean c(int i, int i2) {
        short s = this.aAClassPackage.N[2];
        short s2 = this.aAClassPackage.N[4];
        short s3 = this.aAClassPackage.N[1];
        short s4 = this.aAClassPackage.N[3];
        return (i < s2) && (i >= s) && i2 >= s3 && i2 < s4;
    }

    void d() {
        l lVar = null;
        int i = this.y;
        int i2 = this.z;
        if (this.e.H || (i > 0 && i < this.j - 1 && i2 > 0 && i2 < this.k - 1)) {
            l lVar2 = this.ao.b;
            while (true) {
                if (lVar2 != null) {
                    if ((lVar2.b & 1) == 0 && lVar2.k == this.w && lVar2.l == this.x) {
                        b(lVar2.i);
                        a(lVar2.h);
                        lVar = lVar2;
                        break;
                    }
                    lVar2 = lVar2.F;
                } else {
                    break;
                }
            }
        }
        if (this.ar != lVar) {
            this.ar = lVar;
            p();
        }
    }

    public void d(int i) {
        m();
        try {
            e(i);
        } finally {
            n();
        }
    }

    public void d(int i, int i2, int i3, int i4) {
        h((this.h * i) + (this.h / 2), (this.i * i2) + (this.i / 2), i3, i4);
    }

    public void d(int i, int i2, int i3, int i4, int i5) {
        l a = a(i);
        if (a != null) {
            int a2 = zhook.aohoc.aRoot.ag.a(i2, 0, this.ah - 1);
            int a3 = zhook.aohoc.aRoot.ag.a(i3, 0, this.ai - 1);
            a.o = a2;
            a.p = a3;
            b(i, this.e.c(a2, a3), this.e.d(a2, a3), i4, i5);
        }
    }

    public boolean d(int i, int i2) throws InterruptedException {
        if (this.af == 1) {
            if (b(i, i2)) {
                return true;
            }
            int i3 = this.n;
            int i4 = this.o;
            int i5 = this.p + i3;
            int i6 = this.q + i4;
            if (i >= i3 && i < i5 && i2 >= i4 && i2 < i6) {
                int i7 = (i - this.n) + this.T;
                int i8 = (i2 - this.o) + this.U;
                int i9 = this.aAClassPackage.V;
                if ((507904 & i9) != 0) {
                    if (this.e.k()) {
                        int b = this.e.b(i7, i8, -1, -1);
                        if (b != -1) {
                            if (this.I != b) {
                                i(this.e.c(b), this.e.d(b), 1, 333);
                                return true;
                            } else if ((i9 & 16384) == 0 || this.aAClassPackage.L == null || this.aAClassPackage.L.length < 3) {
                                return true;
                            } else {
                                try {
                                    this.aAClassPackage.g.a((int) this.aAClassPackage.L[2], true);
                                    return true;
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                    int i10 = i7 / this.h;
                    int i11 = i8 / this.i;
                    if (this.y != i10 || this.z != i11) {
                        c(i10, i11, 1, 333);
                        return true;
                    } else if ((i9 & 16384) == 0 || this.aAClassPackage.L == null || this.aAClassPackage.L.length < 3) {
                        return true;
                    } else {
                        try {
                            this.aAClassPackage.g.a((int) this.aAClassPackage.L[2], true);
                            return true;
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                            return true;
                        }
                    }
                }
                return true;
            } else if (c(i, i2) && this.aAClassPackage.L != null && this.aAClassPackage.L.length >= 4) {
                try {
                    this.aAClassPackage.g.a((int) this.aAClassPackage.L[3], true);
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
            }
        } else if (this.af == 2) {
            eCClassCPackage eCClassCPackageVar = this.ae;
            if ( eCClassCPackageVar == null) {
                return false;
            }
            if (b(i, i2)) {
                return true;
            }
            if (c(i, i2) && this.aAClassPackage.L != null && this.aAClassPackage.L.length >= 5) {
                short s = this.aAClassPackage.L[3];
                short s2 = this.aAClassPackage.L[4];
                if ((s & 16384) != 0) {
                    if ( eCClassCPackageVar.l == (s & 16383) && s2 != -1) {
                        try {
                            this.aAClassPackage.g.a((int) s2, true);
                            return true;
                        } catch (Throwable th4) {
                            th4.printStackTrace();
                        }
                    }
                }
            }
            if ( eCClassCPackageVar.a(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public void e() {
        if (this.aD != 0) {
            return;
        }
        if (!g(2)) {
            this.aAClassPackage.e(4194304);
            return;
        }
        try {
            D();
            switch (this.af) {
                case 1:
                    F();
                    break;
                default:
                    this.aAClassPackage.e(4194304);
                    break;
            }
            K();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        synchronized (this.aQ) {
            this.aD = 0;
        }
    }

    public void e(int i) {
        if (this.aV != null) {
            this.aAClassPackage.P = this.aV;
        }
        zhook.aohoc.aRoot.y.a("@@@@@@@@@@@@@@@@@@@@@ SET_VIEW_MODE=" + i);
        this.af = i;
        i();
        switch (i) {
            case 2:
                if (this.ae == null || !this.ae.j) {
                    return;
                }
                r();
                return;
            default:
                return;
        }
    }

    public void e(int i, int i2, int i3, int i4) {
        m();
        try {
            d((this.E / this.h) + i, (this.F / this.i) + i2, i3, i4);
        } finally {
            n();
        }
    }

    public void e(int i, int i2, int i3, int i4, int i5) {
        m();
        try {
            l a = a(i);
            if (a != null) {
                d(i, a.o + i2, a.p + i3, i4, i5);
            }
        } finally {
            n();
        }
    }

    public void f() {
        if (this.aD != 0) {
            return;
        }
        if (!g(1)) {
            this.aAClassPackage.e(4194304);
            return;
        }
        try {
            switch (this.af) {
                case 1:
                    H();
                    break;
                case 2:
                    if (this.ae != null) {
                        this.ae.b();
                    }
                    this.aCClassCPackageR.a();
                    G();
                    this.aT.f();
                    break;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        synchronized (this.aQ) {
            this.aD = 0;
        }
    }

    public void f(int i) {
        m();
        try {
            this.aW = i * 2;
        } finally {
            n();
        }
    }

    public void f(int i, int i2, int i3, int i4) {
        m();
        try {
            h(a() + i, b() + i2, i3, i4);
        } finally {
            n();
        }
    }

    public eCClassCPackage g() {
        return this.ad;
    }

    public void g(int i, int i2, int i3, int i4) {
        m();
        try {
            h(i, i2, i3, i4);
        } finally {
            n();
        }
    }

    public boolean g(int i) {
        boolean z;
        synchronized (this.aQ) {
            if (this.aD == 0) {
                this.aD = i;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public int h() {
        return this.af;
    }

    public void h(int i) {
        while (true) {
            synchronized (this.aQ) {
                if (this.aD == 0) {
                    this.aD = i;
                    return;
                }
            }
            Thread.yield();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void h(int i, int i2, int i3, int i4) {
        boolean z;
        int a = zhook.aohoc.aRoot.ag.a(i, this.L, this.N - 1);
        int a2 = zhook.aohoc.aRoot.ag.a(i2, this.M, this.O - 1);
        if (this.ac == 0) {
            i4 = 0;
            i3 = 0;
        } else if (i4 > 0) {
            i4 = (this.ac * i4) / 1000;
        }
        switch (i3) {
            case 0:
                this.s = i3;
                this.E = a;
                this.F = a2;
                this.u = 0;
                this.C = this.w;
                this.D = this.x;
                a(a, a2);
                return;
            case 1:
            case 3:
                break;
            case 2:
                this.s = i3;
                if (this.ao.a > 0 && this.ah > 0) {
                    this.G = this.aq.o;
                    this.H = this.aq.p;
                }
                if (i4 == 0) {
                    return;
                }
                break;
            default:
                return;
        }
        if (this.s == 0) {
            this.A = this.w;
            this.B = this.x;
            z = false;
        } else {
            int i5 = this.E;
            this.C = i5;
            this.A = i5;
            this.w = i5;
            int i6 = this.F;
            this.D = i6;
            this.B = i6;
            this.x = i6;
            z = true;
        }
        this.t = i4;
        this.E = a;
        this.F = a2;
        this.u = 0;
        this.C = this.w;
        this.D = this.x;
        if (this.A == this.E && this.B == this.F) {
            this.aAClassPackage.f(-2097153);
        } else {
            this.aAClassPackage.e(2097152);
        }
        if (z) {
            this.v = this.aAClassPackage.w;
        } else {
            this.v = Long.MAX_VALUE;
        }
        boolean z2 = j(this.A) != j(this.E);
        boolean z3 = k(this.B) != j(this.F);
        if (i3 != 3 || z2 || z3) {
            this.s = i3;
            return;
        }
        this.s = 0;
        a(a, a2);
    }

    public void i() {
        s();
        this.as.removeAllElements();
        this.at.removeAllElements();
        this.aAClassPackage.e();
        b(true);
    }

    public void i(int i) throws Throwable {
        int i2;
        m();
        try {
            if (this.af != 1) {
                if (this.ad == null || this.ad == this.ae) {
                    b((eCClassCPackage) null);
                    e(1);
                } else {
                    b(this.ad);
                }
                if (this.af == 1) {
                    this.aS.d = true;
                    this.aI = true;
                    a(this.w, this.x);
                    this.aAClassPackage.d(i);
                }
            }
            synchronized (this.aX) {
                i2 = this.aY;
                this.aY = -1;
            }
            if (i2 != -1) {
                this.aAClassPackage.g.a(i2, true);
            }
        } finally {
            n();
        }
    }

    public void i(int i, int i2, int i3, int i4) {
        m();
        try {
            j(i, i2, i3, i4);
        } finally {
            n();
        }
    }

    public eCClassCPackage j() {
        return this.ae;
    }

    public void j(int i, int i2, int i3, int i4) {
        this.J = this.G + (this.H * this.ah);
        this.G = zhook.aohoc.aRoot.ag.a(i, 0, this.ah - 1);
        this.H = zhook.aohoc.aRoot.ag.a(i2, 0, this.ai - 1);
        this.K = this.G + (this.H * this.ah);
        h(this.e.c(this.G, this.H), this.e.d(this.H, this.H), i3, i4);
    }

    public void k(int i, int i2, int i3, int i4) {
        m();
        try {
            j(this.G + i, this.H + i2, i3, i4);
        } finally {
            n();
        }
    }

    public boolean k() {
        return this.aD == 0;
    }

    public boolean l() {
        return this.aD == 3;
    }

    public void m() {
        h(3);
    }

    public void n() {
        synchronized (this.aQ) {
            this.aD = 0;
        }
    }

    public void o() {
        int i;
        l lVar;
        int i2;
        int i3;
        int i4;
        int i5 = this.ao.a;
        int i6 = this.e.r;
        int i7 = i5 + i6;
        if (i7 > 0) {
            this.aT.a(this.n, this.o, this.p, this.q);
            int i8 = this.P[0];
            int i9 = this.Q[0];
            hCClassCPackage hCClassCPackageVar = this.e;
            zhook.aohoc.aRoot.j jVar = hCClassCPackageVar.w;
            int[] iArr = hCClassCPackageVar.s;
            short[] sArr = hCClassCPackageVar.t;
            short[] sArr2 = hCClassCPackageVar.u;
            short[] sArr3 = hCClassCPackageVar.v;
            l lVar2 = this.ao.b;
            int i10 = lVar2 != null ? lVar2.q : Integer.MAX_VALUE;
            int i11 = 0;
            int i12 = 0;
            int i13 = 1;
            int e = i6 > 0 ? hCClassCPackageVar.e(0) : Integer.MAX_VALUE;
            while (i12 < i7) {
                zhook.aohoc.aRoot.j.a = i12;
                if (e < i10) {
                    try {
                        jVar.e(sArr[i11], sArr2[i11] + i8, sArr3[i11] + i9);
                        i11++;
                        int i14 = i11 < i6 ? iArr[i11] : Integer.MAX_VALUE;
                        i4 = i11;
                        i = i10;
                        lVar = lVar2;
                        int i15 = i14;
                        i2 = i13;
                        i3 = i15;
                    } catch (Throwable th) {
                        int i16 = i11;
                        th.printStackTrace();
                        zhook.aohoc.aRoot.y.a("***0");
                        i = i10;
                        lVar = lVar2;
                        i2 = i13;
                        i3 = e;
                        i4 = i16;
                    }
                } else {
                    if (lVar2 != null) {
                        try {
                            zhook.aohoc.aRoot.j jVar2 = lVar2.j.c;
                            int i17 = lVar2.k + i8;
                            int i18 = lVar2.l + i9;
                            if (lVar2.d != -1) {
                                jVar2.e(lVar2.j.d[lVar2.d], i17, i18);
                            }
                            int i19 = (!c || d.length <= lVar2.c) ? lVar2.c : lVar2.c == -1 ? -1 : d[lVar2.c];
                            if (i19 != -1) {
                                short s = lVar2.j.d[i19];
                                if (((lVar2.b & 2) != 0) && (57344 & s) == 24576) {
                                    int i20 = lVar2.z;
                                    int i21 = s & 8191;
                                    if (i20 < 0) {
                                        i20 = 0;
                                    }
                                    jVar2.a(i21, i20, i17, i18);
                                } else {
                                    jVar2.e(s, i17, i18);
                                }
                            }
                            if (lVar2.e != -1) {
                                jVar2.e(lVar2.j.d[lVar2.e], i17, i18);
                            }
                            lVar2 = lVar2.F;
                            i13++;
                        } catch (Throwable th2) {
                            i2 = i13;
                            th2.printStackTrace();
                            int i22 = e;
                            i4 = i11;
                            i = i10;
                            lVar = lVar2;
                            i3 = i22;
                        }
                    } else {
                        zhook.aohoc.aRoot.y.a("null obj " + i13 + " / " + i5);
                    }
                    lVar = lVar2;
                    int i23 = e;
                    i4 = i11;
                    i = lVar2 != null ? lVar2.q : Integer.MAX_VALUE;
                    i2 = i13;
                    i3 = i23;
                }
                i12++;
                lVar2 = lVar;
                i10 = i;
                i11 = i4;
                e = i3;
                i13 = i2;
            }
            for (l lVar3 = this.ao.b; lVar3 != null; lVar3 = lVar3.F) {
                int i24 = lVar3.c;
                if (i24 != -1) {
                    short s2 = lVar3.j.d[i24];
                    int i25 = lVar3.k + i8;
                    int i26 = lVar3.l + i9;
                    zhook.aohoc.aRoot.j jVar3 = lVar3.j.c;
                    if (this.ay != null) {
                        int i27 = (jVar3.i(s2) >>> this.az) + i25 + jVar3.e(s2);
                        int f = jVar3.f(s2) + i26 + (jVar3.j(s2) >>> this.aA);
                        this.ay.a(lVar3.g, 0, i27, f, this.aB, this.aC, i27, f);
                    }
                }
            }
        }
    }

    void p() {
        if (this.ar != null) {
            b(this.ar.i);
            a(this.ar.h);
            return;
        }
        b(this.aK);
        a(this.aL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        short s;
        t tVar = this.an;
        boolean z = (this.am == null || this.al == null) ? false : true;
        if (this.e.k() && z) {
            int i = this.h * (-this.e.f);
            int i2 = this.i * (-this.e.g);
            short[] sArr = this.e.o;
            short[] sArr2 = this.e.p;
            int i3 = this.ai * this.ah;
            for (int i4 = 0; i4 < i3; i4++) {
                if (z && (tVar == null || tVar.b(i4) != 0)) {
                    int i5 = this.al[i4] & 255;
                    if ((i5 & 128) == 0) {
                        byte b = i5 < this.am.length ? this.am[i5] : (byte) -1;
                        if (b != -1) {
                            s = this.e.n[b];
                            this.e.w.e(s, sArr[i4] + i, sArr2[i4] + i2);
                        }
                    }
                }
                s = -1;
                this.e.w.e(s, sArr[i4] + i, sArr2[i4] + i2);
            }
        }
    }

    public void r() {
        if (this.g.b() == -1) {
            this.g.g();
            this.g.j();
        }
        this.f = true;
        if (this.aAClassPackage.a.t != null) {
            this.g.a(this.aAClassPackage.g.b(this.aAClassPackage.a.t[3]));
        }
    }

    public void s() {
        J();
        this.f = false;
    }

    public void t() {
        this.g.j();
        J();
    }

    public void u() {
        boolean z = h() == 2 && this.ae != null && this.ae.j;
        if (z && this.g.l().length() == 0) {
            return;
        }
        try {
            this.b.g.a(30, this.g.l());
            this.g.j();
            J();
            if (z) {
                return;
            }
            s();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void v() {
        try {
            c(this.ae.q.h[zhook.aohoc.aRoot.bPackage.bBClassCPackage.r][this.ae.B]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
