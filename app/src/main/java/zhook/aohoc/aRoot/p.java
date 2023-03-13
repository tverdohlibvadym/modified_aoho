package zhook.aohoc.aRoot;

/* loaded from: classes.dex */
public class p {
    final StringBuffer a = new StringBuffer();
    public int b;
    public short[] c;
    public short[] d;
    public int[] e;

    public static int a(int i, int i2, int i3, int i4, int i5) {
        return (65535 & i) | ((i2 << 16) & 983040) | ((i3 << 20) & 15728640) | ((i4 << 24) & 15728640) | ((i5 << 26) & 201326592);
    }

    public int a(String str) {
        if (str == null) {
            return -1;
        }
        int indexOf = this.a.toString().indexOf(str);
        if (indexOf == -1) {
            indexOf = this.a.length();
            this.a.append(str);
        }
        if (indexOf > 65535) {
            y.b("to big parsed text");
            return -1;
        }
        return indexOf;
    }

    public String a(int i) {
        return this.c[i] == -1 ? "" : this.a.toString().substring(this.c[i], this.d[i]);
    }

    public void a() {
        this.c = ag.a(this.c, this.b);
        this.d = ag.a(this.d, this.b);
        this.e = ag.a(this.e, this.b);
    }

    public void a(String str, int i, int i2, int i3, int i4, int i5) {
        int a = a(str);
        int length = a != -1 ? str.length() + a : -1;
        this.c = ag.a(a, this.c, this.b, 256);
        this.d = ag.a(length, this.d, this.b, 256);
        this.e = ag.a(a(i, i2, i3, i4, i5), this.e, this.b, 256);
        this.b++;
    }
}
