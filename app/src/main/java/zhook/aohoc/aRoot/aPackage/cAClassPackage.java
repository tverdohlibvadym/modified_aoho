package zhook.aohoc.aRoot.aPackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import zhook.aohoc.aRoot.ag;
import zhook.aohoc.aRoot.cPackage.aCClassCPackage;
import zhook.aohoc.aRoot.e;
import zhook.aohoc.aRoot.j;
import zhook.aohoc.aRoot.o;
import zhook.aohoc.aRoot.u;
import zhook.aohoc.aRoot.v;
import zhook.aohoc.aRoot.w;
import zhook.aohoc.aRoot.x;
import zhook.aohoc.aRoot.y;
import zhook.aohoc.bridge.aBridgeA;

/* loaded from: classes.dex */
public class cAClassPackage {
    public aAClassPackage aAClassPackage;
    public o b;
    public e[] c;
    public e d;
    public String e;
    public x f;
    public w g;
    public x h;
    public j i;
    public String j;
    private aCClassCPackage n;
    private Vector m = new Vector();
    public int k = 0;
    public x l = null;

    public cAClassPackage(aAClassPackage aAClassPackageVar) {
        this.aAClassPackage = aAClassPackageVar;
        this.n = this.aAClassPackage.T;
    }

    private void a(DataInputStream dataInputStream) throws Throwable {
        this.g.a(24, ag.a(ag.g(dataInputStream)));
    }

    private void a(byte[] bArr, boolean z, boolean z2) throws IOException {
        boolean z3 = false;
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        int readUnsignedByte2 = dataInputStream.readUnsignedByte();
        short readShort = dataInputStream.readShort();
        int readInt = dataInputStream.readInt();
        int readInt2 = dataInputStream.readInt();
        boolean z4 = (readUnsignedByte & 1) == 1;
        if (!z && (readUnsignedByte & 2) == 2) {
            z3 = true;
        }
        if (!z) {
            y.a("");
            y.a("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            y.a("");
            y.a("          LOADED FILE: type=" + readUnsignedByte2 + " id=" + ((int) readShort) + " crc32=" + readInt + " steps_remained=" + readInt2 + " CACHE=" + z4 + " PRECACHE=" + z3);
            y.a("");
            y.a("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            y.a("");
        }
        if (!z && !z2 && z4) {
            this.aAClassPackage.K.a(readUnsignedByte2, readShort, readInt, bArr, z2);
        }
        try {
            switch (readUnsignedByte2) {
                case 0:
                    this.aAClassPackage.d.a(readShort, readInt, readInt2, dataInputStream, z3);
                    break;
                case 1:
                    this.aAClassPackage.d.c(readShort, readInt, readInt2, dataInputStream, z3);
                    break;
                case 2:
                    this.aAClassPackage.d.b(readShort, readInt, readInt2, dataInputStream, z3);
                    break;
                default:
                    return;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            if (z) {
                b(readUnsignedByte2, readShort, readInt);
            } else {
                this.aAClassPackage.b(true);
            }
        }
    }

    private String[] a(String[] strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            try {
                strArr2[i] = "" + aBridgeA.c.b(strArr[i]);
            } catch (Throwable th) {
                strArr2[i] = th.toString();
            }
        }
        return strArr2;
    }

    private void b(DataInputStream dataInputStream) throws Throwable {
        this.g.a(25, a(ag.g(dataInputStream)));
    }

    private void c(DataInputStream dataInputStream) {
        try {
            int readInt = dataInputStream.readInt();
            String readUTF = dataInputStream.readUTF();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(readInt);
            dataOutputStream.writeUTF(readUTF);
            this.aAClassPackage.S.a("aoholu_" + this.e, byteArrayOutputStream.toByteArray(), 0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void d(DataInputStream dataInputStream) {
        try {
            this.aAClassPackage.a.d.b = -1;
            this.aAClassPackage.a.d.c = null;
            this.aAClassPackage.c.q = dataInputStream.readUTF();
            this.aAClassPackage.c.r = dataInputStream.readUTF();
            this.aAClassPackage.a(25);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void e(DataInputStream dataInputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(this.aAClassPackage.a.d.a);
            dataOutputStream.writeUTF("" + this.aAClassPackage.a.e);
            dataOutputStream.writeUTF("" + this.aAClassPackage.a.l);
            dataOutputStream.writeUTF(this.aAClassPackage.k());
            dataOutputStream.writeUTF(this.aAClassPackage.l());
            dataOutputStream.writeUTF(this.aAClassPackage.m());
            switch (this.aAClassPackage.a.d.a) {
                case 0:
                    dataOutputStream.writeInt(this.aAClassPackage.a.d.b);
                    dataOutputStream.writeUTF(this.aAClassPackage.a.d.c);
                    break;
                case 1:
                default:
                    return;
                case 2:
                    dataOutputStream.writeInt(this.aAClassPackage.a.d.b);
                    dataOutputStream.writeUTF(this.aAClassPackage.a.d.c == null ? "" : this.aAClassPackage.a.d.c);
                    break;
                case 3:
                    dataOutputStream.writeUTF(this.aAClassPackage.a.d.d);
                    dataOutputStream.writeUTF(this.aAClassPackage.a.d.e);
                    dataOutputStream.writeUTF(this.aAClassPackage.a.g);
                    dataOutputStream.writeUTF(this.aAClassPackage.a.h);
                    dataOutputStream.writeUTF(this.aAClassPackage.a.i);
                    break;
                case 4:
                    dataOutputStream.writeUTF(this.aAClassPackage.a.d.d);
                    dataOutputStream.writeUTF(this.aAClassPackage.a.d.e);
                    break;
                case 5:
                    dataOutputStream.writeInt(this.aAClassPackage.a.d.b);
                    dataOutputStream.writeUTF(this.aAClassPackage.a.d.c == null ? "" : this.aAClassPackage.a.d.c);
                    dataOutputStream.writeUTF(this.aAClassPackage.a.f);
                    break;
            }
            this.g.a(60, byteArrayOutputStream.toByteArray());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void f(DataInputStream dataInputStream) throws IOException {
        String e = ag.e(dataInputStream);
        this.g.a(26, e, this.aAClassPackage.S.b(e) ? 1 : 0);
    }

    private void g(DataInputStream dataInputStream) throws IOException {
        Calendar calendar = Calendar.getInstance();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        Date time = calendar.getTime();
        dataOutputStream.writeLong(System.currentTimeMillis());
        dataOutputStream.writeLong(time.getTime());
        dataOutputStream.writeInt(calendar.getTimeZone().getRawOffset());
        dataOutputStream.writeUTF(calendar.getTimeZone().getID());
        dataOutputStream.writeUTF(time.toString());
        this.g.a(27, byteArrayOutputStream.toByteArray());
    }

    private void h(DataInputStream dataInputStream) throws IOException {
        int i = 0;
        if (this.aAClassPackage != null && this.aAClassPackage.Q != null) {
            i = this.aAClassPackage.Q.l;
        }
        this.g.a(64, i ^ 777);
    }

    private void i() throws IOException {
        this.g.b(20, this.n.c, this.n.d);
    }

    private void i(DataInputStream dataInputStream) throws IOException {
        this.g.a(64, 123457052);
    }

    private void j() throws Throwable {
        this.g.a(23, m());
    }

    private void k() throws IOException {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        this.g.a(21, runtime.totalMemory(), runtime.freeMemory());
    }

    private void l() throws IOException {
        this.g.a(22, this.aAClassPackage.S.a());
    }

    private String[] m() {
        String[] b = aBridgeA.e.b((String) null);
        if (b == null) {
            return null;
        }
        String[] strArr = new String[b.length];
        for (int i = 0; i < b.length; i++) {
            String str = b[i];
            strArr[i] = str + "," + ag.a(aBridgeA.e.a(str), ',');
        }
        return strArr;
    }

    public void a() {
        x xVar = this.f;
        w wVar = this.g;
        this.h = null;
        this.f = null;
        this.g = null;
        try {
            this.aAClassPackage.e.n();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.l != null) {
            try {
                this.l.c();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
                if (this.l.a() != null) {
                    this.l.a().h = false;
                    try {
                        this.l.a().f();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    try {
                        this.l.a().g();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        this.l = null;
        if (wVar != null) {
            try {
                wVar.h = false;
                try {
                    wVar.f();
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
                try {
                    wVar.g();
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        if (xVar != null) {
            try {
                xVar.c();
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public void a(int i) {
        switch (i) {
            case 1:
                try {
                    y.a("opening url: " + this.aAClassPackage.a.n);
                    aBridgeA.c.a(this.aAClassPackage.a.n);
                    y.a("opened url: " + this.aAClassPackage.a.n);
                    return;
                } catch (Throwable th) {
                    y.a("error opening url: " + this.aAClassPackage.a.n);
                    th.printStackTrace();
                    return;
                }
            case 2:
                y.a("sending sms: url=" + this.aAClassPackage.a.o + " text=" + this.aAClassPackage.a.p);
                if ( aBridgeA.c.a(this.aAClassPackage.a.o, this.aAClassPackage.a.p)) {
                    y.a("OK sending sms: url=" + this.aAClassPackage.a.o + " text=" + this.aAClassPackage.a.p);
                    return;
                } else {
                    y.a("ERROR sending sms: url=" + this.aAClassPackage.a.o + " text=" + this.aAClassPackage.a.p);
                    return;
                }
            case 3:
                this.aAClassPackage.g.c();
                return;
            case 4:
                this.aAClassPackage.g.a();
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(int i, int i2, int i3) throws IOException {
        int c;
        this.aAClassPackage.h.e();
        switch (i) {
            case 1:
                if (this.l != null) {
                    if ((this.aAClassPackage.i() & 10240) != 0) {
                        this.aAClassPackage.b(true);
                        break;
                    }
                } else if (this.aAClassPackage.C >= 5 && this.aAClassPackage.B >= 500 && ((this.n.c > 0 && this.n.d > 0) || this.aAClassPackage.B > 3000)) {
                    this.l = new x(this.aAClassPackage, this.aAClassPackage.a.m, null);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                c();
                return;
            case 8:
                if (this.aAClassPackage.C < 2 || (c = this.aAClassPackage.c.n.c(this.aAClassPackage.i())) == -1 || c >= zhook.aohoc.aRoot.f.ai.length) {
                    return;
                }
                this.aAClassPackage.a.l = zhook.aohoc.aRoot.f.ai[c];
                zhook.aohoc.aRoot.f.a(c);
                this.aAClassPackage.S.a("aoholang", zhook.aohoc.aRoot.f.ai[c].getBytes(), 0);
                this.aAClassPackage.a(9);
                return;
            case 30:
                if (this.aAClassPackage.v < 2 || this.aAClassPackage.B <= 5000) {
                    return;
                }
                this.b = null;
                this.aAClassPackage.a(31);
                return;
            case 31:
                if (this.aAClassPackage.C >= 2) {
                    int h = h();
                    int c2 = this.aAClassPackage.c.n.c(this.aAClassPackage.i());
                    if (c2 == -1 || c2 >= h) {
                        return;
                    }
                    a(b(c2));
                    this.aAClassPackage.a(9);
                    return;
                }
                return;
            case 50:
                if (this.aAClassPackage.B < 2500 || this.aAClassPackage.C <= 10 || this.aAClassPackage.z != -1) {
                    return;
                }
                this.aAClassPackage.a(1);
                return;
            case 51:
                if (this.aAClassPackage.B < 1000 || this.aAClassPackage.C <= 10 || this.aAClassPackage.z != -1) {
                    return;
                }
                this.aAClassPackage.a(10);
                return;
            default:
                return;
        }
        if (this.aAClassPackage.v < 2 || (this.aAClassPackage.i() & 10240) == 0) {
            return;
        }
        this.aAClassPackage.b(true);
    }

    public void a(int i, int i2, int i3, int i4) {
        System.gc();
        switch (i) {
            case -2:
                this.aAClassPackage.b(true);
                break;
            case 1:
                this.aAClassPackage.E = 1;
                this.l = null;
                break;
            case 2:
                a(this.h);
                this.aAClassPackage.E = 1;
                this.k++;
                break;
            case 4:
                if (this.aAClassPackage.a.b == null) {
                    this.aAClassPackage.a.b = this.e;
                    this.aAClassPackage.x = this.aAClassPackage.y;
                    this.aAClassPackage.a(32);
                    break;
                }
                break;
            case 6:
                b();
                break;
            case 9:
                x xVar = this.l;
                if (xVar != null) {
                    xVar.c();
                    break;
                }
                break;
            case 10:
                this.aAClassPackage.a.d.a = 2;
                this.aAClassPackage.a(1);
                break;
            case 11:
                this.j = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.o);
                this.aAClassPackage.a.d.a = 4;
                this.aAClassPackage.a(14);
                break;
            case 12:
                this.j = zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.p);
                this.aAClassPackage.a.d.a = 3;
                this.aAClassPackage.a(14);
                break;
            case 13:
                a(this.j, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.A), "", zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.C), zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.i), -1, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.f), -1, 20, 0);
                break;
            case 14:
                a(this.j, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.y), "", zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.z), zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.e), -1, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.f), -1, 20, 0);
                break;
            case 15:
                a(this.j, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.B), "", zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.C), zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.e), -1, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.f), -1, 20, 0);
                break;
            case 16:
                try {
                    aBridgeA.c.a(this.aAClassPackage.a.c);
                    this.aAClassPackage.b(true);
                    break;
                } catch (Throwable th) {
                    break;
                }
            case 18:
                a(this.j, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.D), "", zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.E), zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.e), -1, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.f), -1, 20, 1);
                break;
            case 19:
                a(this.j, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.F), "", zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.G), zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.e), -1, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.f), -1, 30, 2);
                break;
            case 20:
                a(this.j, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.H), "", zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.I), zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.e), -1, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.f), -1, 20, 0);
                break;
            case 24:
                switch (this.aAClassPackage.a.d.a) {
                    case 3:
                        this.aAClassPackage.a(12);
                        break;
                    case 4:
                        this.aAClassPackage.a(11);
                        break;
                }
            case 26:
                a(this.j, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.B), "", "", zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.e), -1, zhook.aohoc.aRoot.f.b(zhook.aohoc.aRoot.f.f), -1, 20, 0);
                break;
            case 30:
                if ("http://194.67.198.77/adm/man/slist.asp" == null) {
                    this.b = new o("http://194.67.198.77/adm/man/slist.asp", "level=0", this, 31, 9);
                    break;
                } else {
                    this.aAClassPackage.a(9);
                    break;
                }
            case 32:
                if ("http://194.67.198.77/adm/man/slist.asp" == null) {
                    this.b = new o("http://194.67.198.77/adm/man/slist.asp", "level=0", this, this.aAClassPackage.x, 31);
                    break;
                } else {
                    this.aAClassPackage.a(9);
                    break;
                }
            case 60:
                try {
                    if (this.e != null && !this.e.equals("")) {
                        this.aAClassPackage.a.d.b(this.aAClassPackage.S, this.e);
                        this.aAClassPackage.a(9);
                        break;
                    }
                } catch (Throwable th2) {
                    break;
                }
                break;
        }
        this.aAClassPackage.e.d();
    }

    public void a(String str) throws IOException {
        a(str, false);
    }

    public void a(String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, int i3, int i4) {
        this.aAClassPackage.R.a(str, str2, str3, str4, str5, i, str6, i2, i3, i4);
    }

    public void a(String str, boolean z) throws IOException {
        if (str != this.e || this.e == null || !this.e.equals(str) || z) {
            int h = h();
            for (int i = 0; i < h; i++) {
                if (b(i).equals(str)) {
                    this.d = this.c[i];
                    this.e = str;
                    if (this.d == null) {
                        return;
                    }
                    this.aAClassPackage.a.d.a(this.aAClassPackage.S, this.e);
                    try {
                        this.aAClassPackage.a.m = this.d.d();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    this.d.a(this.aAClassPackage.S);
                }
            }
        }
    }

    public void a(v vVar) {
    }

    public void a(v vVar, boolean z) {
        y.a("");
        y.a("              RECEIVED CHUNK: " + vVar);
        y.a("");
        try {
            DataInputStream n = vVar.n();
            switch (vVar.b()) {
                case 11:
                    a(vVar.m(), false, false);
                    break;
                case 12:
                    y.a("CT_LOAD_SCRIPT");
                    this.aAClassPackage.g.a(vVar.m());
                    break;
                case 14:
                    y.a("CT_QUERY_SCRIPT");
                    this.aAClassPackage.g.a(n);
                    break;
                case 15:
                    y.a("CT_QUERY_VIEW_IDLE_SCRIPT");
                    this.aAClassPackage.g.b(n);
                    break;
                case 20:
                    i();
                    break;
                case 21:
                    k();
                    break;
                case 22:
                    l();
                    break;
                case 23:
                    j();
                    break;
                case 24:
                    a(n);
                    break;
                case 25:
                    b(n);
                    break;
                case 26:
                    f(n);
                    break;
                case 27:
                    g(n);
                    break;
                case 60:
                    e(n);
                    break;
                case 61:
                    c(n);
                    break;
                case 62:
                    d(n);
                    break;
                case 64:
                    h(n);
                    break;
                case 65:
                    i(n);
                    break;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(x xVar) {
        this.f = xVar;
        this.g = xVar.a();
    }

    public void a(e[] eVarArr) throws IOException {
        if (eVarArr == null || this.c == eVarArr) {
            return;
        }
        this.c = eVarArr;
        a(this.e);
    }

    public String b(int i) {
        if (i == -1) {
            return null;
        }
        return this.c[i].e();
    }

    public void b() {
        if (this.aAClassPackage.q) {
            try {
                this.aAClassPackage.Q.d(false);
                a();
                this.aAClassPackage.R = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.aAClassPackage.Q.b();
        }
    }

    public void b(int i, int i2, int i3) throws IOException {
        y.a("              QueryLoadFile: type=" + i + " id=" + i2 + " crc32=" + i3);
        try {
            u uVar = this.aAClassPackage.K;
            int a = uVar.a(i, i2);
            if (a != -1) {
                byte[] bArr = null;
                if (a != -1) {
                    if (uVar.a(a) == i3) {
                        bArr = uVar.b(a, i3);
                    } else {
                        y.a("cache_ver: " + uVar.a(a) + "  need_ver=" + i3 + "  [delete]");
                    }
                    if (bArr != null) {
                        byte b = bArr[1];
                        int a2 = ag.a(bArr, 2);
                        int b2 = ag.b(bArr, 4);
                        if (b == i && a2 == i2 && b2 == i3) {
                            a(bArr, true, false);
                            return;
                        }
                    }
                }
            } else {
                byte[] bArr2 = this.aAClassPackage.S.a(u.c(i, i2), i3)[0];
                if (bArr2 != null && bArr2.length >= 12) {
                    byte b3 = bArr2[1];
                    int a3 = ag.a(bArr2, 2);
                    int b4 = ag.b(bArr2, 4);
                    int b5 = ag.b(bArr2, 8);
                    if (b3 == i && a3 == i2 && b4 == i3) {
                        a(bArr2, true, true);
                        return;
                    }
                    y.a("");
                    y.a("          ===============================================================");
                    y.a("          *** [NOT REMOVED CACHE ITEM] ***");
                    y.a("          type=" + ((int) b3) + " id=" + a3 + " crc32=" + b4 + " size=" + b5);
                    y.a("          ===============================================================");
                    y.a("");
                    this.aAClassPackage.S.c(u.c(i, i2));
                }
            }
        } catch (Throwable th) {
            y.a("mark #1");
            th.printStackTrace();
        }
        this.g.a(11, i, i2);
    }

    public void b(v vVar) {
    }

    public void c() {
        while (this.m.size() > 0) {
            v vVar = (v) this.m.firstElement();
            this.m.removeElementAt(0);
            vVar.n();
            try {
                vVar.b();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void c(v vVar) {
    }

    public void d() {
        this.aAClassPackage.R.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        try {
            String b = aBridgeA.c.b("q-server-default");
            if (b != null && b.length() > 0) {
                zhook.aohoc.aRoot.e.a = b;
            }
            byte[] bArr = this.aAClassPackage.S.a("aohosn", 0)[0];
            if (bArr == null) {
                this.aAClassPackage.b.c = zhook.aohoc.aRoot.e.a(zhook.aohoc.aRoot.e.b);
                this.aAClassPackage.b.a(zhook.aohoc.aRoot.e.a);
                return;
            }
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
            String readUTF = dataInputStream.readUTF();
            String readUTF2 = dataInputStream.readUTF();
            System.out.println("app.init() load server info : " + readUTF2);
            this.aAClassPackage.b.c = zhook.aohoc.aRoot.e.a(readUTF2);
            this.aAClassPackage.b.a(readUTF);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public int f() {
        if (this.d == null) {
            return Integer.MAX_VALUE;
        }
        return this.d.g();
    }

    public String g() {
        return this.d == null ? "" : this.d.f();
    }

    public int h() {
        if (this.c == null) {
            return 0;
        }
        return this.c.length;
    }
}
