package zhook.aohoc.bRoot;

/* loaded from: classes.dex */
public final class b {
    private static final c[] af = new c[10];
    private static int ag = a();
    private static final String[] ah = {"need dictionary", "stream end", "", "file error", "stream error", "data error", "insufficient memory", "buffer error", "incompatible version", ""};
    int A;
    int B;
    int C;
    int D;
    int E;
    int F;
    int G;
    int H;
    int I;
    int J;
    int S;
    int T;
    int V;
    int W;
    int X;
    int Y;
    int Z;
    k a;
    int aa;
    int ab;
    int ac;
    short ad;
    int ae;
    int b;
    byte[] c;
    int d;
    int e;
    int f;
    int g;
    byte h;
    byte i;
    int j;
    int k;
    int l;
    int m;
    byte[] n;
    int o;
    short[] p;
    short[] q;
    int r;
    int s;
    int t;
    int u;
    int v;
    int w;
    int x;
    int y;
    int z;
    l N = new l();
    l O = new l();
    l P = new l();
    short[] Q = new short[16];
    int[] R = new int[573];
    byte[] U = new byte[573];
    short[] K = new short[1146];
    short[] L = new short[122];
    short[] M = new short[78];

    static int a() {
        af[0] = new c(0, 0, 0, 0, 0);
        af[1] = new c(4, 4, 8, 4, 1);
        af[2] = new c(4, 5, 16, 8, 1);
        af[3] = new c(4, 6, 32, 32, 1);
        af[4] = new c(4, 4, 16, 16, 2);
        af[5] = new c(8, 16, 32, 32, 2);
        af[6] = new c(8, 16, 128, 128, 2);
        af[7] = new c(8, 32, 128, 256, 2);
        af[8] = new c(32, 128, 258, 1024, 2);
        af[9] = new c(32, 258, 258, 4096, 2);
        return 0;
    }

    static boolean a(short[] sArr, int i, int i2, byte[] bArr) {
        short s = sArr[i * 2];
        short s2 = sArr[i2 * 2];
        return s < s2 || (s == s2 && bArr[i] <= bArr[i2]);
    }

    int a(k kVar) {
        kVar.h = 0L;
        kVar.d = 0L;
        kVar.i = null;
        kVar.l = 2;
        this.f = 0;
        this.e = 0;
        if (this.g < 0) {
            this.g = 0;
        }
        this.b = this.g != 0 ? 113 : 42;
        kVar.m = zhook.aohoc.bRoot.a.a(0L, null, 0, 0);
        this.j = 0;
        c();
        b();
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(k kVar, int i) {
        int e;
        if (i > 4 || i < 0) {
            return -2;
        }
        if (kVar.e == null || ((kVar.a == null && kVar.c != 0) || (this.b == 666 && i != 4))) {
            kVar.i = ah[4];
            return -2;
        } else if (kVar.g == 0) {
            kVar.i = ah[7];
            return -5;
        } else {
            this.a = kVar;
            int i2 = this.j;
            this.j = i;
            if (this.b == 42) {
                int i3 = (((this.l - 8) << 4) + 8) << 8;
                int i4 = ((this.G - 1) & 255) >> 1;
                if (i4 > 3) {
                    i4 = 3;
                }
                int i5 = (i4 << 6) | i3;
                if (this.A != 0) {
                    i5 |= 32;
                }
                this.b = 113;
                b(i5 + (31 - (i5 % 31)));
                if (this.A != 0) {
                    b((int) (kVar.m >>> 16));
                    b((int) (kVar.m & 65535));
                }
                kVar.m = zhook.aohoc.bRoot.a.a(0L, null, 0, 0);
            }
            if (this.f != 0) {
                kVar.c();
                if (kVar.g == 0) {
                    this.j = -1;
                    return 0;
                }
            } else if (kVar.c == 0 && i <= i2 && i != 4) {
                kVar.i = ah[7];
                return -5;
            }
            if (this.b == 666 && kVar.c != 0) {
                kVar.i = ah[7];
                return -5;
            }
            if (kVar.c != 0 || this.C != 0 || (i != 0 && this.b != 666)) {
                switch (af[this.G].e) {
                    case 0:
                        e = c(i);
                        break;
                    case 1:
                        e = d(i);
                        break;
                    case 2:
                        e = e(i);
                        break;
                    default:
                        e = -1;
                        break;
                }
                if (e == 2 || e == 3) {
                    this.b = 666;
                }
                if (e == 0 || e == 2) {
                    if (kVar.g == 0) {
                        this.j = -1;
                        return 0;
                    }
                    return 0;
                } else if (e == 1) {
                    if (i == 1) {
                        f();
                    } else {
                        b(0, 0, false);
                        if (i == 3) {
                            for (int i6 = 0; i6 < this.s; i6++) {
                                this.q[i6] = 0;
                            }
                        }
                    }
                    kVar.c();
                    if (kVar.g == 0) {
                        this.j = -1;
                        return 0;
                    }
                }
            }
            if (i == 4) {
                if (this.g != 0) {
                    return 1;
                }
                b((int) (kVar.m >>> 16));
                b((int) (kVar.m & 65535));
                kVar.c();
                this.g = -1;
                return this.f == 0 ? 1 : 0;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(k kVar, int i, int i2) {
        return a(kVar, i, 8, i2, 8, 0);
    }

    int a(k kVar, int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        kVar.i = null;
        if (i == -1) {
            i = 6;
        }
        if (i3 < 0) {
            i3 = -i3;
            i6 = 1;
        }
        if (i4 < 1 || i4 > 9 || i2 != 8 || i3 < 9 || i3 > 15 || i < 0 || i > 9 || i5 < 0 || i5 > 2) {
            return -2;
        }
        kVar.j = this;
        this.g = i6;
        this.l = i3;
        this.k = 1 << this.l;
        this.m = this.k - 1;
        this.t = i4 + 7;
        this.s = 1 << this.t;
        this.u = this.s - 1;
        this.v = ((this.t + 3) - 1) / 3;
        this.n = new byte[this.k * 2];
        this.p = new short[this.k];
        this.q = new short[this.s];
        this.W = 1 << (i4 + 6);
        this.c = new byte[this.W * 4];
        this.d = this.W * 4;
        this.Y = this.W / 2;
        this.V = this.W * 3;
        this.G = i;
        this.H = i5;
        this.i = (byte) i2;
        return a(kVar);
    }

    final void a(byte b) {
        byte[] bArr = this.c;
        int i = this.f;
        this.f = i + 1;
        bArr[i] = b;
    }

    final void a(int i) {
        a((byte) i);
        a((byte) (i >>> 8));
    }

    void a(int i, int i2) {
        if (this.ae <= 16 - i2) {
            this.ad = (short) (this.ad | ((i << this.ae) & 65535));
            this.ae += i2;
            return;
        }
        this.ad = (short) (this.ad | ((i << this.ae) & 65535));
        a(this.ad);
        this.ad = (short) (i >>> (16 - this.ae));
        this.ae += i2 - 16;
    }

    void a(int i, int i2, int i3) {
        a(i - 257, 5);
        a(i2 - 1, 5);
        a(i3 - 4, 4);
        for (int i4 = 0; i4 < i3; i4++) {
            a(this.M[(zhook.aohoc.bRoot.l.d[i4] * 2) + 1], 3);
        }
        c(this.K, i - 1);
        c(this.L, i2 - 1);
    }

    void a(int i, int i2, boolean z) {
        i();
        this.ac = 8;
        if (z) {
            a((short) i2);
            a((short) (i2 ^ (-1)));
        }
        a(this.n, i, i2);
    }

    final void a(int i, short[] sArr) {
        int i2 = i * 2;
        a(sArr[i2] & 65535, sArr[i2 + 1] & 65535);
    }

    void a(boolean z) {
        c(this.w >= 0 ? this.w : -1, this.A - this.w, z);
        this.w = this.A;
        this.a.c();
    }

    final void a(byte[] bArr, int i, int i2) {
        System.arraycopy(bArr, i, this.c, this.f, i2);
        this.f += i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(short[] sArr, int i) {
        int i2 = this.R[i];
        int i3 = i << 1;
        while (i3 <= this.S) {
            int i4 = (i3 >= this.S || !a(sArr, this.R[i3 + 1], this.R[i3], this.U)) ? i3 : i3 + 1;
            if (a(sArr, i2, this.R[i4], this.U)) {
                break;
            }
            this.R[i] = this.R[i4];
            i3 = i4 << 1;
            i = i4;
        }
        this.R[i] = i2;
    }

    void a(short[] sArr, short[] sArr2) {
        int i = 0;
        if (this.X == 0) {
            a(256, sArr);
            this.ac = sArr[513];
        }
        do {
            int i2 = ((this.c[this.Y + (i * 2)] << 8) & 65280) | (this.c[this.Y + (i * 2) + 1] & 255);
            int i3 = this.c[this.V + i] & 255;
            i++;
            if (i2 == 0) {
                a(i3, sArr);
            } else {
                byte b = zhook.aohoc.bRoot.l.f[i3];
                a(b + 256 + 1, sArr);
                int i4 = zhook.aohoc.bRoot.l.a[b];
                if (i4 != 0) {
                    a(i3 - zhook.aohoc.bRoot.l.g[b], i4);
                }
                int i5 = i2 - 1;
                int a = zhook.aohoc.bRoot.l.a(i5);
                a(a, sArr2);
                int i6 = zhook.aohoc.bRoot.l.b[a];
                if (i6 != 0) {
                    a(i5 - zhook.aohoc.bRoot.l.h[a], i6);
                }
            }
        } while (i < this.X);
        a(256, sArr);
        this.ac = sArr[513];
    }

    void b() {
        this.o = this.k * 2;
        this.q[this.s - 1] = 0;
        for (int i = 0; i < this.s - 1; i++) {
            this.q[i] = 0;
        }
        this.F = af[this.G].b;
        this.I = af[this.G].a;
        this.J = af[this.G].c;
        this.E = af[this.G].d;
        this.A = 0;
        this.w = 0;
        this.C = 0;
        this.D = 2;
        this.x = 2;
        this.z = 0;
        this.r = 0;
    }

    final void b(int i) {
        a((byte) (i >> 8));
        a((byte) i);
    }

    void b(int i, int i2, boolean z) {
        a((z ? 1 : 0) + 0, 3);
        a(i, i2, true);
    }

    void b(short[] sArr, int i) {
        int i2;
        int i3;
        short s = -1;
        short s2 = sArr[1];
        if (s2 == 0) {
            i3 = 138;
            i2 = 3;
        } else {
            i2 = 4;
            i3 = 7;
        }
        sArr[((i + 1) * 2) + 1] = -1;
        int i4 = 0;
        int i5 = 0;
        while (i5 <= i) {
            short s3 = sArr[((i5 + 1) * 2) + 1];
            i4++;
            if (i4 >= i3 || s2 != s3) {
                if (i4 < i2) {
                    short[] sArr2 = this.M;
                    int i6 = s2 * 2;
                    sArr2[i6] = (short) (i4 + sArr2[i6]);
                } else if (s2 != 0) {
                    if (s2 != s) {
                        short[] sArr3 = this.M;
                        int i7 = s2 * 2;
                        sArr3[i7] = (short) (sArr3[i7] + 1);
                    }
                    short[] sArr4 = this.M;
                    sArr4[32] = (short) (sArr4[32] + 1);
                } else if (i4 <= 10) {
                    short[] sArr5 = this.M;
                    sArr5[34] = (short) (sArr5[34] + 1);
                } else {
                    short[] sArr6 = this.M;
                    sArr6[36] = (short) (sArr6[36] + 1);
                }
                if (s3 == 0) {
                    i3 = 138;
                    i4 = 0;
                    s = s2;
                    i2 = 3;
                } else if (s2 == s3) {
                    i3 = 6;
                    i4 = 0;
                    s = s2;
                    i2 = 3;
                } else {
                    i2 = 4;
                    i3 = 7;
                    i4 = 0;
                    s = s2;
                }
            }
            i5++;
            s2 = s3;
        }
    }

    boolean b(int i, int i2) {
        this.c[this.Y + (this.X * 2)] = (byte) (i >>> 8);
        this.c[this.Y + (this.X * 2) + 1] = (byte) i;
        this.c[this.V + this.X] = (byte) i2;
        this.X++;
        if (i == 0) {
            short[] sArr = this.K;
            int i3 = i2 * 2;
            sArr[i3] = (short) (sArr[i3] + 1);
        } else {
            this.ab++;
            short[] sArr2 = this.K;
            int i4 = (zhook.aohoc.bRoot.l.f[i2] + 256 + 1) * 2;
            sArr2[i4] = (short) (sArr2[i4] + 1);
            short[] sArr3 = this.L;
            int a = zhook.aohoc.bRoot.l.a(i - 1) * 2;
            sArr3[a] = (short) (sArr3[a] + 1);
        }
        if ((this.X & 8191) == 0 && this.G > 2) {
            int i5 = this.X * 8;
            int i6 = this.A - this.w;
            for (int i7 = 0; i7 < 30; i7++) {
                i5 = (int) (i5 + (this.L[i7 * 2] * (5 + zhook.aohoc.bRoot.l.b[i7])));
            }
            int i8 = i5 >>> 3;
            if (this.ab < this.X / 2 && i8 < i6 / 2) {
                return true;
            }
        }
        return this.X == this.W + (-1);
    }

    int c(int i) {
        int i2 = 65535 > this.d + (-5) ? this.d - 5 : 65535;
        while (true) {
            if (this.C <= 1) {
                j();
                if (this.C == 0 && i == 0) {
                    return 0;
                }
                if (this.C == 0) {
                    a(i == 4);
                    if (this.a.g == 0) {
                        return i == 4 ? 2 : 0;
                    }
                    return i == 4 ? 3 : 1;
                }
            }
            this.A += this.C;
            this.C = 0;
            int i3 = this.w + i2;
            if (this.A == 0 || this.A >= i3) {
                this.C = this.A - i3;
                this.A = i3;
                a(false);
                if (this.a.g == 0) {
                    return 0;
                }
            }
            if (this.A - this.w >= this.k - 262) {
                a(false);
                if (this.a.g == 0) {
                    return 0;
                }
            }
        }
    }

    void c() {
        this.N.i = this.K;
        this.N.k = zhook.aohoc.bRoot.j.c;
        this.O.i = this.L;
        this.O.k = zhook.aohoc.bRoot.j.d;
        this.P.i = this.M;
        this.P.k = zhook.aohoc.bRoot.j.e;
        this.ad = (short) 0;
        this.ae = 0;
        this.ac = 8;
        d();
    }

    void c(int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        if (this.G > 0) {
            if (this.h == 2) {
                g();
            }
            this.N.b(this);
            this.O.b(this);
            i5 = e();
            i4 = ((this.Z + 3) + 7) >>> 3;
            i3 = ((this.aa + 3) + 7) >>> 3;
            if (i3 <= i4) {
                i4 = i3;
            }
        } else {
            int i6 = i2 + 5;
            i3 = i6;
            i4 = i6;
            i5 = 0;
        }
        if (i2 + 4 <= i4 && i != -1) {
            b(i, i2, z);
        } else if (i3 == i4) {
            a((z ? 1 : 0) + 2, 3);
            a(zhook.aohoc.bRoot.j.a, zhook.aohoc.bRoot.j.b);
        } else {
            a((z ? 1 : 0) + 4, 3);
            a(this.N.j + 1, this.O.j + 1, i5 + 1);
            a(this.K, this.L);
        }
        d();
        if (z) {
            i();
        }
    }

    void c(short[] sArr, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        short s = -1;
        short s2 = sArr[1];
        if (s2 == 0) {
            i2 = 3;
            i3 = 138;
        } else {
            i2 = 4;
            i3 = 7;
        }
        int i7 = i3;
        int i8 = 0;
        int i9 = i2;
        int i10 = 0;
        while (i8 <= i) {
            short s3 = sArr[((i8 + 1) * 2) + 1];
            int i11 = i10 + 1;
            if (i11 >= i7 || s2 != s3) {
                if (i11 < i9) {
                    do {
                        a(s2, this.M);
                        i11--;
                    } while (i11 != 0);
                } else if (s2 != 0) {
                    if (s2 != s) {
                        a(s2, this.M);
                        i11--;
                    }
                    a(16, this.M);
                    a(i11 - 3, 2);
                } else if (i11 <= 10) {
                    a(17, this.M);
                    a(i11 - 3, 3);
                } else {
                    a(18, this.M);
                    a(i11 - 11, 7);
                }
                if (s3 == 0) {
                    i4 = 3;
                    i5 = 138;
                    i6 = 0;
                    s = s2;
                } else if (s2 == s3) {
                    i5 = 6;
                    i6 = 0;
                    s = s2;
                    i4 = 3;
                } else {
                    i4 = 4;
                    i5 = 7;
                    i6 = 0;
                    s = s2;
                }
            } else {
                int i12 = i9;
                i5 = i7;
                i6 = i11;
                i4 = i12;
            }
            i8++;
            s2 = s3;
            int i13 = i6;
            i7 = i5;
            i9 = i4;
            i10 = i13;
        }
    }

    int d(int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5 = 0;
        while (true) {
            if (this.C < 262) {
                j();
                if (this.C < 262 && i == 0) {
                    return 0;
                }
                if (this.C == 0) {
                    a(i == 4);
                    if (this.a.g == 0) {
                        return i == 4 ? 2 : 0;
                    }
                    return i == 4 ? 3 : 1;
                }
            }
            if (this.C >= 3) {
                this.r = ((this.r << this.v) ^ (this.n[this.A + 2] & 255)) & this.u;
                i2 = this.q[this.r] & 65535;
                this.p[this.A & this.m] = this.q[this.r];
                this.q[this.r] = (short) this.A;
            } else {
                i2 = i5;
            }
            if (i2 != 0 && ((this.A - i2) & 65535) <= this.k - 262 && this.H != 2) {
                this.x = f(i2);
            }
            if (this.x >= 3) {
                boolean b = b(this.A - this.B, this.x - 3);
                this.C -= this.x;
                if (this.x > this.F || this.C < 3) {
                    this.A += this.x;
                    this.x = 0;
                    this.r = this.n[this.A] & 255;
                    this.r = ((this.r << this.v) ^ (this.n[this.A + 1] & 255)) & this.u;
                    i5 = i2;
                    z = b;
                } else {
                    this.x--;
                    do {
                        this.A++;
                        this.r = ((this.r << this.v) ^ (this.n[this.A + 2] & 255)) & this.u;
                        i3 = this.q[this.r] & 65535;
                        this.p[this.A & this.m] = this.q[this.r];
                        this.q[this.r] = (short) this.A;
                        i4 = this.x - 1;
                        this.x = i4;
                    } while (i4 != 0);
                    this.A++;
                    i5 = i3;
                    z = b;
                }
            } else {
                boolean b2 = b(0, this.n[this.A] & 255);
                this.C--;
                this.A++;
                i5 = i2;
                z = b2;
            }
            if (z) {
                a(false);
                if (this.a.g == 0) {
                    return 0;
                }
            }
        }
    }

    void d() {
        for (int i = 0; i < 286; i++) {
            this.K[i * 2] = 0;
        }
        for (int i2 = 0; i2 < 30; i2++) {
            this.L[i2 * 2] = 0;
        }
        for (int i3 = 0; i3 < 19; i3++) {
            this.M[i3 * 2] = 0;
        }
        this.K[512] = 1;
        this.aa = 0;
        this.Z = 0;
        this.ab = 0;
        this.X = 0;
    }

    int e() {
        b(this.K, this.N.j);
        b(this.L, this.O.j);
        this.P.b(this);
        int i = 18;
        while (i >= 3 && this.M[(zhook.aohoc.bRoot.l.d[i] * 2) + 1] == 0) {
            i--;
        }
        this.Z += ((i + 1) * 3) + 5 + 5 + 4;
        return i;
    }

    int e(int i) {
        int i2;
        int i3 = 0;
        while (true) {
            if (this.C < 262) {
                j();
                if (this.C < 262 && i == 0) {
                    return 0;
                }
                if (this.C == 0) {
                    if (this.z != 0) {
                        b(0, this.n[this.A - 1] & 255);
                        this.z = 0;
                    }
                    a(i == 4);
                    if (this.a.g == 0) {
                        return i == 4 ? 2 : 0;
                    }
                    return i == 4 ? 3 : 1;
                }
            }
            if (this.C >= 3) {
                this.r = ((this.r << this.v) ^ (this.n[this.A + 2] & 255)) & this.u;
                i3 = this.q[this.r] & 65535;
                this.p[this.A & this.m] = this.q[this.r];
                this.q[this.r] = (short) this.A;
            }
            this.D = this.x;
            this.y = this.B;
            this.x = 2;
            if (i3 != 0 && this.D < this.F && ((this.A - i3) & 65535) <= this.k - 262) {
                if (this.H != 2) {
                    this.x = f(i3);
                }
                if (this.x <= 5 && (this.H == 1 || (this.x == 3 && this.A - this.B > 4096))) {
                    this.x = 2;
                }
            }
            if (this.D >= 3 && this.x <= this.D) {
                int i4 = (this.A + this.C) - 3;
                boolean b = b((this.A - 1) - this.y, this.D - 3);
                this.C -= this.D - 1;
                this.D -= 2;
                do {
                    int i5 = this.A + 1;
                    this.A = i5;
                    if (i5 <= i4) {
                        this.r = ((this.r << this.v) ^ (this.n[this.A + 2] & 255)) & this.u;
                        i3 = this.q[this.r] & 65535;
                        this.p[this.A & this.m] = this.q[this.r];
                        this.q[this.r] = (short) this.A;
                    }
                    i2 = this.D - 1;
                    this.D = i2;
                } while (i2 != 0);
                this.z = 0;
                this.x = 2;
                this.A++;
                if (b) {
                    a(false);
                    if (this.a.g == 0) {
                        return 0;
                    }
                } else {
                    continue;
                }
            } else if (this.z != 0) {
                if (b(0, this.n[this.A - 1] & 255)) {
                    a(false);
                }
                this.A++;
                this.C--;
                if (this.a.g == 0) {
                    return 0;
                }
            } else {
                this.z = 1;
                this.A++;
                this.C--;
            }
        }
    }

    int f(int i) {
        byte b;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b2;
        int i6 = this.E;
        int i7 = this.A;
        int i8 = this.D;
        int i9 = this.A > this.k + (-262) ? this.A - (this.k - 262) : 0;
        int i10 = this.J;
        int i11 = this.m;
        int i12 = this.A + 258;
        byte b3 = this.n[(i7 + i8) - 1];
        byte b4 = this.n[i7 + i8];
        if (this.D >= this.I) {
            i6 >>= 2;
        }
        if (i10 > this.C) {
            b = b3;
            i2 = this.C;
            i3 = i8;
            i4 = i7;
            i5 = i6;
            b2 = b4;
        } else {
            b = b3;
            i2 = i10;
            i3 = i8;
            i4 = i7;
            i5 = i6;
            b2 = b4;
        }
        while (true) {
            if (this.n[i + i3] == b2 && this.n[(i + i3) - 1] == b && this.n[i] == this.n[i4]) {
                int i13 = i + 1;
                if (this.n[i13] == this.n[i4 + 1]) {
                    int i14 = i4 + 2;
                    int i15 = i13 + 1;
                    do {
                        i14++;
                        int i16 = i15 + 1;
                        if (this.n[i14] != this.n[i16]) {
                            break;
                        }
                        i14++;
                        int i17 = i16 + 1;
                        if (this.n[i14] != this.n[i17]) {
                            break;
                        }
                        i14++;
                        int i18 = i17 + 1;
                        if (this.n[i14] != this.n[i18]) {
                            break;
                        }
                        i14++;
                        int i19 = i18 + 1;
                        if (this.n[i14] != this.n[i19]) {
                            break;
                        }
                        i14++;
                        int i20 = i19 + 1;
                        if (this.n[i14] != this.n[i20]) {
                            break;
                        }
                        i14++;
                        int i21 = i20 + 1;
                        if (this.n[i14] != this.n[i21]) {
                            break;
                        }
                        i14++;
                        int i22 = i21 + 1;
                        if (this.n[i14] != this.n[i22]) {
                            break;
                        }
                        i14++;
                        i15 = i22 + 1;
                        if (this.n[i14] != this.n[i15]) {
                            break;
                        }
                    } while (i14 < i12);
                    int i23 = 258 - (i12 - i14);
                    int i24 = i12 - 258;
                    if (i23 > i3) {
                        this.B = i;
                        if (i23 >= i2) {
                            i3 = i23;
                            break;
                        }
                        b = this.n[(i24 + i23) - 1];
                        b2 = this.n[i24 + i23];
                        i3 = i23;
                        i4 = i24;
                    } else {
                        i4 = i24;
                    }
                }
            }
            i = this.p[i & i11] & 65535;
            if (i > i9) {
                i5--;
                if (i5 == 0) {
                    break;
                }
            } else {
                break;
            }
        }
        return i3 <= this.C ? i3 : this.C;
    }

    void f() {
        a(2, 3);
        a(256, zhook.aohoc.bRoot.j.a);
        h();
        if (((this.ac + 1) + 10) - this.ae < 9) {
            a(2, 3);
            a(256, zhook.aohoc.bRoot.j.a);
            h();
        }
        this.ac = 7;
    }

    void g() {
        int i = 0;
        int i2 = 0;
        while (i2 < 7) {
            i += this.K[i2 * 2];
            i2++;
        }
        int i3 = 0;
        while (i2 < 128) {
            i3 += this.K[i2 * 2];
            i2++;
        }
        while (i2 < 256) {
            i += this.K[i2 * 2];
            i2++;
        }
        this.h = (byte) (i <= (i3 >>> 2) ? 1 : 0);
    }

    void h() {
        if (this.ae == 16) {
            a(this.ad);
            this.ad = (short) 0;
            this.ae = 0;
        } else if (this.ae >= 8) {
            a((byte) this.ad);
            this.ad = (short) (this.ad >>> 8);
            this.ae -= 8;
        }
    }

    void i() {
        if (this.ae > 8) {
            a(this.ad);
        } else if (this.ae > 0) {
            a((byte) this.ad);
        }
        this.ad = (short) 0;
        this.ae = 0;
    }

    void j() {
        int i;
        do {
            int i2 = (this.o - this.C) - this.A;
            if (i2 == 0 && this.A == 0 && this.C == 0) {
                i = this.k;
            } else if (i2 == -1) {
                i = i2 - 1;
            } else if (this.A >= (this.k + this.k) - 262) {
                System.arraycopy(this.n, this.k, this.n, 0, this.k);
                this.B -= this.k;
                this.A -= this.k;
                this.w -= this.k;
                int i3 = this.s;
                int i4 = i3;
                do {
                    i3--;
                    int i5 = this.q[i3] & 65535;
                    this.q[i3] = i5 >= this.k ? (short) (i5 - this.k) : (short) 0;
                    i4--;
                } while (i4 != 0);
                int i6 = this.k;
                int i7 = i6;
                do {
                    i6--;
                    int i8 = this.p[i6] & 65535;
                    this.p[i6] = i8 >= this.k ? (short) (i8 - this.k) : (short) 0;
                    i7--;
                } while (i7 != 0);
                i = this.k + i2;
            } else {
                i = i2;
            }
            if (this.a.c == 0) {
                return;
            }
            this.C = this.a.a(this.n, this.A + this.C, i) + this.C;
            if (this.C >= 3) {
                this.r = this.n[this.A] & 255;
                this.r = ((this.r << this.v) ^ (this.n[this.A + 1] & 255)) & this.u;
            }
            if (this.C >= 262) {
                return;
            }
        } while (this.a.c != 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        if (this.b == 42 || this.b == 113 || this.b == 666) {
            this.c = null;
            this.q = null;
            this.p = null;
            this.n = null;
            return this.b == 113 ? -3 : 0;
        }
        return -2;
    }
}
