package zhook.aohoc.aRoot.aPackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Vector;
import zhook.aohoc.aRoot.aa;
import zhook.aohoc.aRoot.ac;
import zhook.aohoc.aRoot.ae;
import zhook.aohoc.aRoot.ag;
import zhook.aohoc.aRoot.cPackage.aCClassCPackage;
import zhook.aohoc.aRoot.cPackage.dCClassCPackage;
import zhook.aohoc.aRoot.cPackage.jCClassCPackage;
import zhook.aohoc.aRoot.i;
import zhook.aohoc.aRoot.j;
import zhook.aohoc.aRoot.r;
import zhook.aohoc.aRoot.u;
import zhook.aohoc.bridge.aBridgeA;
import zhook.aohoc.bridge.cBridgeA;
import zhook.aohoc.bridge.hBridgeA;
import zhook.aohoc.bridge.jBridgeA;
import zhook.aohoc.bridge.platform.aPlatform;

/* loaded from: classes.dex */
public class aAClassPackage {
    public static int i = 20000;
    public static int j = 10000;
    public static int k = 3000;
    public static int l = 10000;
    public int A;
    public int B;
    public int C;
    public u K;
    public short[] L;
    public short[] N;
    public j P;
    public cBridgeA Q;
    public hBridgeA R;
    public int W;
    private long Z;
    private long aa;
    private boolean ab;
    private int ac;
    public i d;
    public aa e;
    public ac f;
    public ae g;
    public long m;
    public long n;
    public long o;
    int s;
    int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public boolean p = false;
    public int D = 0;
    private int ad = 0;
    public int E = 0;
    public final Object F = new Object();
    public final Object G = new Object();
    public final Object H = new Object();
    public Vector I = new Vector();
    public Vector J = new Vector();
    public long M = System.currentTimeMillis();
    public boolean O = false;
    public int U = 0;
    public int V = 0;
    private boolean ae = false;
    public int X = -1;
    public int Y = 0;
    public boolean q = true;
    public boolean r = true;
    public aCClassCPackage T = new aCClassCPackage();
    public bAClassPackage a = new bAClassPackage();
    public cAClassPackage b = new cAClassPackage(this);
    public dAClassPackage c = new dAClassPackage(this);
    public jCClassCPackage h = new jCClassCPackage(this);
    public jBridgeA S = (jBridgeA) aBridgeA.b.a(aPlatform.i);

    public aAClassPackage(cBridgeA cBridgeAVar) {
        this.Q = cBridgeAVar;
        this.S.a(this);
        this.R = (hBridgeA) aBridgeA.b.a(aPlatform.h);
        this.R.a(this);
    }

    public void a(int i2) {
        synchronized (this.F) {
            this.z = i2;
        }
        Thread.yield();
    }

    public void a(long j2, long j3) {
        zhook.aohoc.aRoot.y.a("");
        zhook.aohoc.aRoot.y.a(" Zz.... SLEEP: " + j2);
        zhook.aohoc.aRoot.y.a("");
        try {
            if (j3 == Long.MAX_VALUE) {
                Thread.sleep(j2);
            } else {
                long max = Math.max(0L, j2 - (System.currentTimeMillis() - j3));
                if (max > 0) {
                    Thread.sleep(max);
                }
            }
            zhook.aohoc.aRoot.y.a("");
            zhook.aohoc.aRoot.y.a(" ...zZ WAKEUP: " + j2);
            zhook.aohoc.aRoot.y.a("");
        } catch (Throwable th) {
        }
    }

    public void a(DataInputStream dataInputStream) throws Throwable {
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        zhook.aohoc.aRoot.ab.a = ag.e(dataInputStream, readUnsignedByte);
        zhook.aohoc.aRoot.ab.b = new short[][]{new short[readUnsignedByte]};
        zhook.aohoc.aRoot.ab.c = new String[][]{new String[readUnsignedByte]};
        for (int i2 = 0; i2 < readUnsignedByte; i2++) {
            int readUnsignedByte2 = dataInputStream.readUnsignedByte();
            zhook.aohoc.aRoot.ab.b[i2] = ag.c(dataInputStream, readUnsignedByte2);
            zhook.aohoc.aRoot.ab.c[i2] = ag.e(dataInputStream, readUnsignedByte2);
        }
        this.a.q = dataInputStream.readUTF();
        this.a.r = dataInputStream.readUnsignedByte();
        this.a.s = dataInputStream.readUnsignedShort();
        this.a.t = ag.a(dataInputStream, dataInputStream.readUnsignedByte());
        if (this.a.t.length > 9) {
            int i3 = this.a.t[9];
            if (this.a.t.length > i3 + 9) {
                this.a.u = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    this.a.u[i4] = this.a.t[i4 + 10];
                }
            }
        }
        this.Y = dataInputStream.readShort();
        this.g.d = this.a.t[3];
        this.X = this.a.t[6];
        this.N = ag.c(dataInputStream);
    }

    public void a(r rVar, int i2) {
        synchronized (this.J) {
            if (this.W != i2) {
            }
            this.J.addElement(rVar);
            this.V |= rVar.c;
            if (i2 != -1) {
                if (this.ae) {
                    this.I.removeAllElements();
                    this.ae = false;
                }
                this.I.addElement(rVar);
            }
            zhook.aohoc.aRoot.y.a("!@#* add(" + i2 + ") : " + h());
        }
    }

    public boolean a() {
        return this.O;
    }

    public boolean a(boolean z) {
        boolean z2 = false;
        try {
            this.d = new i(this);
            this.e = new aa(this);
            this.f = new ac(this);
            this.g = new ae(this);
            this.ab = true;
            this.w = 0;
            this.Z = Long.MAX_VALUE;
            this.aa = Long.MAX_VALUE;
            this.n = Long.MAX_VALUE;
            this.m = Long.MAX_VALUE;
            this.o = Long.MAX_VALUE;
            synchronized (this.H) {
                this.s = 0;
                this.t = 0;
            }
            this.y = -1;
            this.A = -1;
            this.b.e();
            zhook.aohoc.aRoot.y.a("changeMap keys module");
            this.f.i();
            String[] a = ag.a(ag.b("langs.txt"), '\n');
            assert a != null;
            String str = a[0];
            int length = (a.length - 1) / 2;
            String[] strArr = new String[length];
            String[] strArr2 = new String[length];
            for (int i2 = 0; i2 < length; i2++) {
                strArr[i2] = a[(i2 * 2) + 1];
                strArr2[i2] = a[(i2 * 2) + 1 + 1];
            }
            zhook.aohoc.aRoot.f.ai = strArr;
            zhook.aohoc.aRoot.f.ah = strArr2;
            if (ag.a(str, zhook.aohoc.aRoot.f.ai) != -1) {
                this.a.l = str;
            }
            this.a.a = aBridgeA.c.b("MIDlet-Jar-Size");
            this.a.c = aBridgeA.c.b("q-support-site");
            if (this.a.c == null) {
                this.a.c = "http://support.aoh-revival.ru/";
            }
            String upperCase = ("" + aBridgeA.c.b("q-lang")).toUpperCase();
            if (ag.a(upperCase, zhook.aohoc.aRoot.f.ai) != -1) {
                this.a.l = upperCase;
            }
            byte[] bArr = this.S.a("aoholang", 0)[0];
            if (bArr != null) {
                this.a.l = new String(bArr);
            }
            if (this.a.l != null) {
                f.a(ag.a(this.a.l, zhook.aohoc.aRoot.f.ai));
            }
            this.a.j = aBridgeA.c.b("q-device-brand");
            this.a.k = aBridgeA.c.b("q-device-model");
            this.a.e = aBridgeA.c.b("q-partner-id");
            if (this.a.d.b == -1 && this.a.d.a != 2) {
                byte[] bArr2 = this.S.a("aoholu", 0)[0];
                if (bArr2 != null) {
                    this.a.d.a = 2;
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr2));
                    this.a.d.b = dataInputStream.readInt();
                    this.a.d.c = dataInputStream.readUTF();
                } else {
                    this.a.d.a = 0;
                    String b = aBridgeA.c.b("q-user-id");
                    if (b != null) {
                        this.a.d.b = Integer.parseInt(b);
                        this.a.d.c = aBridgeA.c.b("q-user-data");
                    }
                }
            }
            this.K = new u(this);
            if (this.a.d.b != -1 && this.a.d.c != null) {
                z2 = true;
            }
            if (this.a.l == null) {
                a(8);
                return true;
            } else if (z2 && this.a.d.a == 0) {
                if (z) {
                    a(9);
                    return true;
                }
                a(50);
                return true;
            } else if (this.a.d.a != 1 && this.a.d.a != 0) {
                if (this.a.d.a == 1) {
                    this.a.d.a = 10;
                }
                if (z) {
                    a(9);
                    return true;
                }
                a(50);
                return true;
            } else if (!z2 || this.a.d.a == 0) {
                a(9);
                return true;
            } else if (z) {
                a(9);
                return true;
            } else {
                a(51);
                return true;
            }
        } catch (Throwable th) {
            b(true);
            th.printStackTrace();
            return false;
        }
    }

    public void b() {
        synchronized (this.H) {
            this.s = 0;
            this.t = 0;
        }
        this.q = true;
        this.r = false;
    }

    public void b(int i2) {
        zhook.aohoc.aRoot.y.a("newTask : BEGIN");
        while (true) {
            Thread.yield();
            synchronized (this.Q.s()) {
                if (this.Q.t() == 0) {
                    this.Q.d(i2);
                    new Thread(this.Q).start();
                    zhook.aohoc.aRoot.y.a("newTask : END");
                    return;
                }
            }
        }
    }

    public void b(DataInputStream dataInputStream) throws IOException {
        String str;
        String str2;
        short[] sArr = null;
        int i2 = -1;
        boolean readBoolean = dataInputStream.readBoolean();
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        short[] c = ag.c(dataInputStream, dataInputStream.readUnsignedByte());
        if (readBoolean) {
            j();
        }
        if (readUTF.length() > 0) {
            zhook.aohoc.aRoot.y.a("CHAT RECEIVED: " + readUTF);
            int i3 = this.a.r;
            int length = c.length - 1;
            if (this.a.v.b == null || length == i3) {
                sArr = c;
                str = readUTF;
            } else {
                int length2 = this.a.v.c.length - 1;
                int i4 = length + length2;
                int max = Math.max(i4 - i3, 0);
                if (max <= 0) {
                    i3 = i4;
                }
                short[] sArr2 = new short[i3 + 1];
                int i5 = length2 - max;
                System.arraycopy(this.a.v.c, max, sArr2, 0, i5 + 1);
                System.arraycopy(c, 1, sArr2, i5 + 1, length);
                short s = sArr2[0];
                String str3 = this.a.v.b.substring(s) + readUTF;
                for (int i6 = 0; i6 <= i5; i6++) {
                    sArr2[i6] = (short) (sArr2[i6] - s);
                }
                short s2 = sArr2[i5];
                for (int i7 = i5 + 1; i7 < i3 + 1; i7++) {
                    sArr2[i7] = (short) (sArr2[i7] + s2);
                }
                sArr = sArr2;
                str = str3;
            }
            String str4 = "";
            if (this.a.u == null || this.T.b < 400) {
                if (sArr != null) {
                    int length3 = sArr.length - 2;
                    while (true) {
                        if (length3 < 0) {
                            length3 = -1;
                            break;
                        } else if (str.charAt(sArr[length3]) == '\f') {
                            str4 = str.substring(sArr[length3], sArr[length3 + 1]);
                            break;
                        } else {
                            length3--;
                        }
                    }
                    for (int i8 = length3 - 1; i8 >= 0; i8--) {
                        if (str.charAt(sArr[i8]) == '\f') {
                            str2 = str.substring(sArr[i8], sArr[i8 + 1]);
                            break;
                        }
                    }
                }
                str2 = str4;
                str4 = "";
                this.g.a(this.a.t[4], str2);
                this.g.a(this.a.t[5], str4);
            } else {
                int length4 = this.a.u.length - 1;
                for (int length5 = sArr.length - 2; length5 >= 0 && length4 >= 0; length5--) {
                    if (str.charAt(sArr[length5]) == '\f') {
                        this.g.a(this.a.u[length4], str.substring(sArr[length5], sArr[length5 + 1]));
                        length4--;
                    }
                }
                while (length4 >= 0) {
                    this.g.a(this.a.u[length4], "");
                    length4--;
                }
            }
            zhook.aohoc.aRoot.y.a("CHAT RESULT: " + str);
            i2 = readInt;
        } else {
            str = null;
        }
        this.a.v = new zhook.aohoc.aRoot.h(i2, str, sArr);
    }

    public void b(boolean z) {
        if (this.q) {
            this.q = false;
            this.Q.c(false);
            if (this.b != null) {
                this.b.a();
            }
            this.T.h = null;
            this.R = null;
            if (z) {
                this.Q.k();
            }
            zhook.aohoc.aRoot.y.a("");
            zhook.aohoc.aRoot.y.a("---------------------------------------------");
            zhook.aohoc.aRoot.y.a("terminate()");
            zhook.aohoc.aRoot.y.a("---------------------------------------------");
            zhook.aohoc.aRoot.y.a("");
        }
    }

    public void c() {
        synchronized (this.H) {
            this.s = 0;
            this.t = 0;
        }
        this.r = true;
    }

    public void c(int i2) {
        synchronized (this.J) {
            zhook.aohoc.aRoot.y.a("!@#* reset(" + i2 + ") : " + h());
            this.W = i2;
            this.J.removeAllElements();
            this.V = 0;
            if (i2 != -1) {
                this.ae = true;
            }
        }
    }

    public void d() {
        int i2 = 0;
        String str = null;
        if (this.q) {
            int i3 = i();
            if ((67108865 & i3) == 67108865) {
                this.s &= -67108866;
                this.t &= -67108866;
                a(6);
            } else if ((i3 & 67109888) == 67109888) {
                this.s &= -67109889;
                this.t &= -67109889;
                c.y= !c.y;
            }
            long currentTimeMillis = System.currentTimeMillis();
            int i4 = (int) (currentTimeMillis - this.M);
            if (this.X != -1 && i4 >= 2000) {
                Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
                int i5 = (calendar.get(11) + ((this.Y + calendar.get(12)) / 60)) % 24;
                String substring = ("00" + ((i2 + (this.Y % 60)) % 60)).substring(str.length() - 2);
                int i6 = this.U;
                this.U = i6 + 1;
                this.g.a(this.X, (i6 & 1) == 0 ? "\u0002\u0015" + i5 + ":" + substring : "\u0002\u0015" + i5 + "\u0014:\u0015" + substring);
                this.M = currentTimeMillis;
            }
        }
        this.v++;
        synchronized (this.H) {
            if (this.Z > this.aa) {
                this.t &= -268435457;
                if (this.Z - this.aa >= i) {
                    this.t |= 268435456;
                }
            }
            if (this.Z > this.n) {
                this.t &= -134217729;
                if (this.Z - this.n >= j) {
                    this.t |= 134217728;
                }
                if (this.Z > this.m) {
                    this.t &= -67108865;
                    if (this.Z - this.m >= k) {
                        this.t |= 67108864;
                    }
                }
            }
            if (this.Z > this.o) {
                this.t &= Integer.MAX_VALUE;
                if (this.Z - this.o >= l) {
                    this.t |= Integer.MIN_VALUE;
                }
            }
            this.ac = this.s;
            this.s = this.t;
            if (this.ac != this.s) {
                this.e.j();
            }
            if ((this.s & 1664090111) != 0) {
                this.aa = this.Z;
            }
            if ((this.s & 1036287) == 0) {
                this.m = Long.MAX_VALUE;
            }
            if (b.d.a() ) {
                this.t = 0;
            }
            if ((this.s & 1036287) == 0) {
                this.s &= -1048577;
                this.f.j();
            } else if (this.f.l() > 0) {
                this.s |= 1048576;
            } else {
                this.s &= -1048577;
            }
        }
        jCClassCPackage jCClassCPackageVar = this.h;
        g();
        if ( jCClassCPackageVar != null && !jCClassCPackageVar.l()) {
            synchronized (this.J) {
                int i7 = i();
                if ((i7 & 16384) != 0) {
                }
                if ((i7 & 4096) != 0) {
                }
                if ((i7 & 8192) != 0) {
                }
                for (int i8 = 0; i8 < this.J.size(); i8++) {
                    r rVar = (r) this.J.elementAt(i8);
                    if (rVar.a(i7) && (!this.h.f || (425984 & i7) == 0)) {
                        rVar.a();
                        break;
                    }
                }
            }
        }
        this.g.b();
        this.f.h();
    }

    public void d(int i2) {
        synchronized (this.J) {
            this.W = i2;
            this.V = 0;
            this.J.removeAllElements();
            for (int i3 = 0; i3 < this.I.size(); i3++) {
                r rVar = (r) this.I.elementAt(i3);
                this.J.addElement(rVar);
                this.V = rVar.c | this.V;
            }
            zhook.aohoc.aRoot.y.a("!@#* restore(" + i2 + ") : " + h());
        }
    }

    public void e() {
        this.t &= -536870912;
        this.s &= -536870912;
        this.f.h();
        this.C = 0;
        this.B = 0;
        this.aa = this.Z;
        this.n = this.Z;
        this.m = Long.MAX_VALUE;
        this.ad = this.w;
        this.E = 75;
    }

    public void e(int i2) {
        synchronized (this.H) {
            this.t |= i2;
        }
    }

    public void f() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.Z < currentTimeMillis && !this.r) {
            int i2 = (int) (currentTimeMillis - this.Z);
            if (this.A == 3 && i2 > zhook.aohoc.aRoot.bPackage.aBClassCPackage.f) {
                i2 = zhook.aohoc.aRoot.bPackage.aBClassCPackage.f;
            }
            this.w += i2;
            if (this.C > 0) {
                this.B = i2 + this.B;
            }
        }
        this.Z = currentTimeMillis;
    }

    public void f(int i2) {
        synchronized (this.H) {
            this.t &= i2;
        }
    }

    public dCClassCPackage g(int i2) throws InterruptedException {
        if (this.P != null) {
            return this.P.l(i2);
        }
        if (this.b.i != null) {
            return this.b.i.l(i2);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
        r6.y = r6.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000a, code lost:
        r1 = r6.A;
        r2 = r6.C;
        r3 = r6.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r6.A <= 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g() {
        /*
            r6 = this;
            r5 = -1
            boolean r0 = r6.r
            if (r0 == 0) goto L2f
        L5:
            return
        L6:
            r2 = -1
            r6.z = r2     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7f
            int r1 = r6.A
            int r2 = r6.C
            int r3 = r6.B
            int r4 = r6.A
            if (r4 <= 0) goto L18
            int r4 = r6.A
            r6.y = r4
        L18:
            r6.A = r0
            r6.e()
            r4 = 1
            r6.ab = r4
            zhook.aohoc.a.a.d r4 = r6.c
            r4.a(r0, r1, r2, r3)
            zhook.aohoc.a.a.c r4 = r6.b
            r4.a(r0, r1, r2, r3)
            zhook.aohoc.a.a.d r4 = r6.c
            r4.b(r0, r1, r2, r3)
        L2f:
            java.lang.Object r1 = r6.F
            monitor-enter(r1)
            int r0 = r6.z     // Catch: java.lang.Throwable -> L7f
            if (r0 != r5) goto L6
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7f
            zhook.aohoc.a.a.c r0 = r6.b
            int r1 = r6.A
            int r2 = r6.C
            int r3 = r6.B
            r0.a(r1, r2, r3)
            int r0 = r6.E
            if (r0 <= 0) goto L5d
            int r0 = r6.w
            int r1 = r6.ad
            int r0 = r0 - r1
            int r1 = r6.E
            if (r0 <= r1) goto L5d
            int r0 = r6.D
            int r0 = r0 + 1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            r6.D = r0
            int r0 = r6.w
            r6.ad = r0
        L5d:
            zhook.aohoc.a.a.d r0 = r6.c
            int r1 = r6.A
            int r2 = r6.C
            int r3 = r6.B
            r0.a(r1, r2, r3)
            int r0 = r6.u
            int r0 = r0 + 1
            r6.u = r0
            zhook.aohoc.a.aa r0 = r6.e
            r0.f()
            int r0 = r6.C
            int r0 = r0 + 1
            r6.C = r0
            zhook.aohoc.a.aa r0 = r6.e
            r0.h()
            goto L5
        L7f:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zhook.aohoc.a.a.a.g():void");
    }

    public String h() {
        int i2 = 0;
        String str = "";
        while (true) {
            int i3 = i2;
            if (i3 >= this.J.size()) {
                return str;
            }
            r rVar = (r) this.J.elementAt(i3);
            str = str + " " + ag.a(rVar.c) + ":" + rVar.e;
            i2 = i3 + 1;
        }
    }

    public int i() {
        int i2;
        synchronized (this.H) {
            i2 = this.s;
        }
        return i2;
    }

    public void j() {
        this.a.v = new zhook.aohoc.aRoot.h();
        this.g.a(this.a.t[4], "");
        this.g.a(this.a.t[5], "");
        if (this.a.u == null || this.T.b < 400) {
            this.g.a(this.a.t[4], "");
            this.g.a(this.a.t[5], "");
            return;
        }
        for (int i2 = 0; i2 < this.a.u.length; i2++) {
            this.g.a(this.a.u[i2], "");
        }
    }

    public String k() {
        try {
            return "" + System.getProperty("wireless.messaging.sms.smsc");
        } catch (Throwable th) {
            return "";
        }
    }

    public String l() {
        try {
            return "" + System.getProperty("wireless.messaging.mms.mmsc");
        } catch (Throwable th) {
            return "";
        }
    }

    public String m() {
        return System.getProperty("bluetooth.api.version") != null ? "" : "";
    }
}
