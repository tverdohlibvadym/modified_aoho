package zhook.aohoc.aRoot;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;

import zhook.aohoc.aRoot.aPackage.aAClassPackage;
import zhook.aohoc.aRoot.aPackage.cAClassPackage;
import zhook.aohoc.aRoot.cPackage.dCClassCPackage;
import zhook.aohoc.aRoot.cPackage.eCClassCPackage;
import zhook.aohoc.bridge.aBridgeA;
import zhook.aohoc.bridge.fBridgeA;

/* loaded from: classes.dex */
public class i {
    public aAClassPackage c;
    public cAClassPackage d;
    public int a = 0;
    public int b = 0;
    public final Vector e = new Vector();
    private final Object k = new Object();
    private final int l = 255;
    private fBridgeA[] m = aBridgeA.d.a(255);
    short[] f = ag.b((short[]) null, 255, -1);
    short[] g = ag.b((short[]) null, 255, 0);
    int[] h = new int[255];
    short[] i = new short[255];
    boolean[] j = new boolean[255];
    private final int n = 255;
    private n[] o = new n[255];
    private short[] p = ag.b((short[]) null, 255, -1);
    private short[] q = ag.b((short[]) null, 255, 0);
    private int[] r = new int[255];
    private boolean[] s = new boolean[255];
    private final int t = 32;
    private dCClassCPackage[] u = new dCClassCPackage[32];
    private short[] v = ag.b((short[]) null, 32, -1);
    private short[] w = ag.b((short[]) null, 32, 0);
    private int[] x = new int[32];

    public i(aAClassPackage aAClassPackageVar) {
        this.c = aAClassPackageVar;
        this.d = aAClassPackageVar.b;
    }

    private void b() {
        boolean z = false;
        synchronized (this.c.e.b) {
            this.b++;
            if (this.b == this.a) {
                this.b = 0;
                this.a = 0;
                z = true;
            }
        }
        if (z) {
            this.c.e.b();
        }
        y.a("%%%%%%%%%%%%%%%%%% onLoaded()");
    }

    private void d(int i, int i2) {
    }

    private void e(int i, int i2) {
    }

    public int a(int i, int i2) {
        return a(i, i2, false);
    }

    public int a(int i, int i2, boolean z) {
        int i3;
        boolean z2 = false;
        if (!z) {
            a();
        }
        synchronized (this.k) {
            int d = d(i);
            if (d == -1) {
                i3 = 0;
                while (i3 < 255) {
                    if (this.f[i3] == -1) {
                        this.f[i3] = (short) i;
                        this.h[i3] = i2;
                        break;
                    }
                    i3++;
                }
            }
            i3 = d;
            if (!z) {
                short[] sArr = this.g;
                sArr[i3] = (short) (sArr[i3] + 1);
                z2 = this.h[i3] != i2;
            } else if (!this.j[i3]) {
                this.j[i3] = true;
                short[] sArr2 = this.g;
                sArr2[i3] = (short) (sArr2[i3] + 1);
            }
            if (z2) {
                this.m[i3] = null;
                this.h[i3] = i2;
            }
        }
        return i3;
    }

    public eCClassCPackage a(int i) {
        synchronized (this.e) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                eCClassCPackage eCClassCPackageVar = (eCClassCPackage) this.e.elementAt(i2);
                if ( eCClassCPackageVar.l == i) {
                    return eCClassCPackageVar;
                }
            }
            return null;
        }
    }

    public void a() {
        synchronized (this.c.e.b) {
            this.a++;
        }
    }

    public void a(int i, int i2, int i3, DataInputStream dataInputStream, boolean z) throws Throwable {
        synchronized (this.k) {
            int d = d(i);
            if (d == -1) {
                return;
            }
            if (z) {
                this.h[d] = i2;
            } else {
                e(1, i);
            }
            this.m[d] = null;
            this.m[d] = null;
            short readShort = dataInputStream.readShort();
            if (readShort == 0) {
                byte[] bArr = new byte[i3 - 2];
                ag.a(dataInputStream, bArr, (int[]) null);
                this.m[d] = aBridgeA.d.a(bArr, 0, bArr.length);
            } else {
                short readShort2 = dataInputStream.readShort();
                dataInputStream.readInt();
                this.m[d] = this.m[d(readShort2)];
            }
            this.i[d] = readShort;
            if (!z) {
                b();
            }
        }
    }

    public int b(int i, int i2) {
        return b(i, i2, false);
    }

    public int b(int i, int i2, boolean z) {
        int i3;
        boolean z2 = false;
        if (!z) {
            a();
        }
        synchronized (this.k) {
            int i4 = i(i);
            if (i4 == -1) {
                i3 = 0;
                while (i3 < 255) {
                    if (this.p[i3] == -1) {
                        this.p[i3] = (short) i;
                        this.r[i3] = i2;
                        break;
                    }
                    i3++;
                }
            }
            i3 = i4;
            if (!z) {
                short[] sArr = this.q;
                sArr[i3] = (short) (sArr[i3] + 1);
                z2 = this.r[i3] != i2;
            } else if (!this.s[i3]) {
                this.s[i3] = true;
                short[] sArr2 = this.q;
                sArr2[i3] = (short) (sArr2[i3] + 1);
            }
            if (z2) {
                this.o[i3] = null;
                this.r[i3] = i2;
            }
        }
        return i3;
    }

    public void b(int i) {
        synchronized (this.e) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.e.size()) {
                    break;
                } else if (((eCClassCPackage) this.e.elementAt(i2)).l == i) {
                    this.e.removeElementAt(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
    }

    public void b(int i, int i2, int i3, DataInputStream dataInputStream, boolean z) throws Throwable {
        synchronized (this.k) {
            int i4 = i(i);
            if (i4 == -1) {
                y.a("%%%%%% [PRECACHE POTYPE] id=" + i + " crc32=" + i2 + " size=" + i3);
                i4 = b(i, i2, true);
            } else {
                if (z) {
                    this.r[i4] = i2;
                } else {
                    e(1, i);
                }
                this.o[i4] = null;
            }
            byte[] bArr = new byte[i3];
            ag.a(dataInputStream, bArr, (int[]) null);
            this.o[i4] = new n(this.c, i, i2, ag.a(bArr));
            if (!z) {
                b();
            }
        }
    }

    public int c(int i, int i2) {
        int i3 = 1;
        a();
        int r0 = 0;
        synchronized (this.k) {
            int m = m(i);
            if (m == -1) {
                while (true) {
                    if (r0 >= 32) {
                        r0 = m;
                        break;
                    } else if (this.v[r0] == -1) {
                        this.v[r0] = (short) i;
                        this.x[r0] = i2;
                        break;
                    } else {
                        r0++;
                    }
                }
            } else {
                i3 = this.x[m] != i2 ? 1 : 0;
                r0 = m;
            }
            short[] sArr = this.w;
            sArr[r0] = (short) (sArr[r0] + 1);
            if (i3 != 0) {
                this.u[r0] = null;
                this.x[r0] = i2;
            }
        }
        return r0;
    }

    public void c(int i) throws IOException {
        synchronized (this.k) {
            if (i != -1) {
                if (this.m[i] == null) {
                    d(0, this.f[i]);
                    this.d.b(0, this.f[i], this.h[i]);
                }
            }
            b();
        }
    }

    public void c(int i, int i2, int i3, DataInputStream dataInputStream, boolean z) throws Throwable {
        synchronized (this.k) {
            int m = m(i);
            if (m == -1) {
                y.a("%%%%%% [FAIL LOAD FONT] id=" + i + " crc32=" + i2 + " size=" + i3);
                return;
            }
            if (!z) {
                e(2, i);
            }
            this.u[m] = null;
            dCClassCPackage dCClassCPackageVar = new dCClassCPackage(this.c, m, i, i2);
            dCClassCPackageVar.a(dataInputStream);
            this.u[m] = dCClassCPackageVar;
            if (!z) {
                b();
            }
        }
    }

    public int d(int i) {
        int i2;
        synchronized (this.k) {
            i2 = 0;
            while (true) {
                if (i2 >= 255) {
                    i2 = -1;
                    break;
                } else if (this.f[i2] == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2;
    }

    public fBridgeA e(int i) throws InterruptedException {
        while (this.m[i] == null) {
            if (this.f[i] == -1) {
                return null;
            }
            y.a("lock while image loaded: " + ((int) this.f[i]));
            Thread.yield();
            this.c.e.c();
        }
        return this.m[i];
    }

    public void f(int i) {
        synchronized (this.k) {
            short[] sArr = this.g;
            short s = (short) (sArr[i] - 1);
            sArr[i] = s;
            if (s == 0) {
                this.f[i] = -1;
                this.m[i] = null;
            }
        }
    }

    public int g(int i) {
        return this.i[i];
    }

    public void h(int i) throws IOException {
        synchronized (this.k) {
            if (i != -1) {
                if (this.o[i] == null) {
                    d(1, this.p[i]);
                    this.d.b(2, this.p[i], this.r[i]);
                }
            }
            b();
        }
    }

    public int i(int i) {
        int i2;
        synchronized (this.k) {
            i2 = 0;
            while (true) {
                if (i2 >= 255) {
                    i2 = -1;
                    break;
                } else if (this.p[i2] == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2;
    }

    public n j(int i) throws InterruptedException {
        while (this.o[i] == null) {
            if (this.p[i] == -1) {
                return null;
            }
            y.a("lock while potype loaded: " + ((int) this.p[i]));
            Thread.yield();
            this.c.e.c();
        }
        return this.o[i];
    }

    public void k(int i) {
        synchronized (this.k) {
            short[] sArr = this.q;
            short s = (short) (sArr[i] - 1);
            sArr[i] = s;
            if (s == 0) {
                this.p[i] = -1;
                this.o[i] = null;
            }
        }
    }

    public void l(int i) throws IOException {
        synchronized (this.k) {
            if (i != -1) {
                if (this.u[i] == null) {
                    d(2, this.v[i]);
                    this.d.b(1, this.v[i], this.x[i]);
                }
            }
            b();
        }
    }

    public int m(int i) {
        int i2;
        synchronized (this.k) {
            i2 = 0;
            while (true) {
                if (i2 >= 32) {
                    i2 = -1;
                    break;
                } else if (this.v[i2] == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2;
    }

    public dCClassCPackage n(int i) throws InterruptedException {
        while (this.u[i] == null) {
            if (this.v[i] == -1) {
                return null;
            }
            y.a("lock while font loaded: " + ((int) this.v[i]));
            Thread.yield();
            this.c.e.c();
        }
        return this.u[i];
    }

    public void o(int i) {
        synchronized (this.k) {
            short[] sArr = this.w;
            short s = (short) (sArr[i] - 1);
            sArr[i] = s;
            if (s == 0) {
                this.v[i] = -1;
                this.u[i] = null;
            }
        }
    }
}
