package zhook.aohoc.aRoot;

/* loaded from: classes.dex */
public class l {
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public l E;
    public l F;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g;
    public String h;
    public String i;
    public n j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public byte[] y;
    public int z;

    public l() {
        this.d = -1;
        this.e = -1;
        this.z = -1;
        this.A = -1;
        this.B = 0;
    }

    public l(int i, int i2, int i3, int i4, String str, String str2, String str3, n nVar, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.d = -1;
        this.e = -1;
        this.z = -1;
        this.A = -1;
        this.B = 0;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.f = i4;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = nVar;
        this.k = i5;
        this.l = i6;
        this.m = i7;
        this.n = i8;
        this.o = i9;
        this.p = i10;
        int i13 = this.k;
        this.u = i13;
        this.w = i13;
        int i14 = this.l;
        this.v = i14;
        this.x = i14;
        this.d = i12;
        this.e = i11;
    }

    public int a() {
        return (65535 - this.k) + 1 + (this.l << 16);
    }

    public void b() {
        this.q = a();
    }
}
