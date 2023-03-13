package zhook.aohoc.bRoot;

/* loaded from: classes.dex */
public final class k {
    public byte[] a;
    public int b;
    public int c;
    public long d;
    public byte[] e;
    public int f;
    public int g;
    public long h;
    public String i;
    b j;
    g k;
    int l;
    public long m;

    public int a() {
        if (this.k == null) {
            return -2;
        }
        int b = this.k.b(this);
        this.k = null;
        return b;
    }

    public int a(int i) {
        if (this.k == null) {
            return -2;
        }
        return this.k.b(this, i);
    }

    public int a(int i, int i2, boolean z) {
        this.j = new b();
        b bVar = this.j;
        if (z) {
            i2 = -i2;
        }
        return bVar.a(this, i, i2);
    }

    public int a(int i, boolean z) {
        this.k = new g();
        g gVar = this.k;
        if (z) {
            i = -i;
        }
        return gVar.a(this, i);
    }

    public int a(boolean z) {
        return a(15, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(byte[] bArr, int i, int i2) {
        int i3 = this.c;
        if (i3 > i2) {
            i3 = i2;
        }
        if (i3 == 0) {
            return 0;
        }
        this.c -= i3;
        if (this.j.g == 0) {
            this.m = zhook.aohoc.bRoot.a.a(this.m, this.a, this.b, i3);
        }
        System.arraycopy(this.a, this.b, bArr, i, i3);
        this.b += i3;
        this.d += i3;
        return i3;
    }

    public int b() {
        if (this.j == null) {
            return -2;
        }
        int k = this.j.k();
        this.j = null;
        return k;
    }

    public int b(int i) {
        if (this.j == null) {
            return -2;
        }
        return this.j.a(this, i);
    }

    public int b(int i, boolean z) {
        return a(i, 15, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        int i = this.j.f;
        if (i > this.g) {
            i = this.g;
        }
        if (i == 0) {
            return;
        }
        if (this.j.c.length <= this.j.e || this.e.length <= this.f || this.j.c.length < this.j.e + i || this.e.length < this.f + i) {
            System.out.println(this.j.c.length + ", " + this.j.e + ", " + this.e.length + ", " + this.f + ", " + i);
            System.out.println("avail_out=" + this.g);
        }
        System.arraycopy(this.j.c, this.j.e, this.e, this.f, i);
        this.f += i;
        this.j.e += i;
        this.h += i;
        this.g -= i;
        this.j.f -= i;
        if (this.j.f == 0) {
            this.j.e = 0;
        }
    }

    public void d() {
        this.a = null;
        this.e = null;
        this.i = null;
    }
}
