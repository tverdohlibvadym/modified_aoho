package zhook.aohoc.aRoot;

/* loaded from: classes.dex */
public class ab {
    public static String[] a = null;
    public static short[][] b = null;
    public static String[][] c = null;
    private int e;
    private short[] f;
    private String[] g;
    private int h;
    private int i;
    private long j;
    private int k;
    private char m;
    private StringBuffer l = new StringBuffer();
    public int d = 50;

    public ab() {
        a(-1);
        j();
    }

    public void a() {
        if (this.e == -1) {
            g();
            j();
        }
    }

    public synchronized void a(int i) {
        this.e = i;
        if (i == -1) {
            this.f = null;
            this.g = null;
        } else {
            this.f = b[i];
            this.g = c[i];
        }
    }

    public synchronized void a(String str) {
        a(true);
        this.l.setLength(0);
        this.l.append(str);
        this.k = str.length();
    }

    public synchronized void a(String str, int i) {
        this.h = -1;
        this.i = -1;
        this.k = 0;
        this.j = 0L;
        this.m = (char) 0;
        this.l.setLength(0);
        this.l.ensureCapacity(i);
        this.l.append(str);
    }

    public synchronized void a(boolean z) {
        if (this.m != 0) {
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.j);
            if (z || currentTimeMillis > zhook.aohoc.aRoot.bPackage.aBClassCPackage.b) {
                if (this.k < this.l.length() - 1) {
                    this.l.insert(this.k, this.m);
                } else {
                    this.l.append(this.m);
                }
                this.k++;
                this.m = (char) 0;
                this.h = -1;
                this.i = -1;
            }
        }
    }

    public int b() {
        return this.e;
    }

    public synchronized void b(int i) {
        int i2 = 0;
        synchronized (this) {
            if (this.k < this.d) {
                if (this.f == null) {
                    this.m = (char) 0;
                    this.h = -1;
                    this.i = -1;
                    char c2 = (char) i;
                    if (this.g[0].indexOf(c2) == -1) {
                        String str = this.g[1];
                        int length = str.length() / 2;
                        while (true) {
                            if (i2 < length) {
                                if (str.charAt(i2) >= c2 && c2 <= str.charAt(i2 + 1)) {
                                    this.l.append(c2);
                                    this.k++;
                                    break;
                                }
                                i2 += 2;
                            } else {
                                break;
                            }
                        }
                    } else {
                        this.l.append(c2);
                        this.k++;
                    }
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    int i3 = (int) (currentTimeMillis - this.j);
                    if (this.h == -1 || this.f[this.h] != i || i3 > zhook.aohoc.aRoot.bPackage.aBClassCPackage.b) {
                        a(true);
                        this.i = -1;
                        this.h = ag.a((short) i, this.f);
                        if (this.h != -1) {
                            this.i = Math.min(0, this.g[this.h].length() - 1);
                        }
                    } else if (this.i < this.g[this.h].length() - 1) {
                        this.i++;
                    } else {
                        this.i = 0;
                    }
                    if (this.h != -1 && this.i != -1) {
                        this.m = this.g[this.h].charAt(this.i);
                    }
                    if (f().length() == 1) {
                        a(true);
                    }
                    this.j = currentTimeMillis;
                }
            }
        }
    }

    public synchronized void b(String str) {
        a(true);
        this.l.append(str);
        this.k += str.length();
    }

    public String c() {
        a();
        return a[this.e];
    }

    public synchronized void d() {
        a(true);
        if (this.l.length() > 0) {
            this.k--;
            this.l.setLength(this.l.length() - 1);
        }
    }

    public int e() {
        return this.i;
    }

    public synchronized String f() {
        return this.m != 0 ? this.g[this.h] : "";
    }

    public synchronized void g() {
        a(0);
    }

    public synchronized void h() {
        a(((this.e - 1) + c.length) % c.length);
    }

    public synchronized void i() {
        a((this.e + 1) % c.length);
    }

    public synchronized void j() {
        a("", this.l == null ? 10 : this.l.length());
    }

    public void k() {
        a(true);
    }

    public synchronized String l() {
        a(false);
        return this.l.toString() + (this.m == 0 ? "" : "" + this.m);
    }
}
