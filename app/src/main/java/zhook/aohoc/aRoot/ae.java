package zhook.aohoc.aRoot;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

import zhook.aohoc.aRoot.aPackage.aAClassPackage;
import zhook.aohoc.aRoot.cPackage.aCClassCPackage;
import zhook.aohoc.aRoot.cPackage.bCClassCPackage;
import zhook.aohoc.aRoot.cPackage.cCClassCPackage;
import zhook.aohoc.aRoot.cPackage.eCClassCPackage;
import zhook.aohoc.aRoot.cPackage.jCClassCPackage;
import zhook.aohoc.bridge.aBridgeA;
import zhook.aohoc.bridge.eBridgeA;
import zhook.aohoc.bridge.fBridgeA;
import zhook.aohoc.bridge.platform.bPlatform;

/* loaded from: classes.dex */
public class ae {
    public static final Object g = new Object();
    public static int h = 0;
    public short[] b;
    public String[] c;
    aAClassPackage f;
    private aCClassCPackage l;
    private bCClassCPackage m;
    private cCClassCPackage n;
    public int a = 0;
    public int d = -1;
    final Hashtable e = new Hashtable();
    private final Vector i = new Vector();
    private final Vector j = new Vector();
    private final Vector k = new Vector();
    private Hashtable o = d();

    public ae(aAClassPackage aAClassPackageVar) {
        this.f = aAClassPackageVar;
        this.l = this.f.T;
        this.m = this.l.i;
        this.n = this.l.j;
    }

    private Hashtable d() {
        return new Hashtable();
    }

    public void a() {
        DataInputStream dataInputStream;
        y.a("run()");
        try {
            synchronized (this.j) {
                dataInputStream = (DataInputStream) this.j.firstElement();
                this.j.removeElement(dataInputStream);
            }
            c(dataInputStream);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(int i) {
        y.a("unloadScript: " + i);
        this.e.remove(new b(i));
    }

    public void a(int i, int i2) throws InterruptedException, IOException {
        int b = this.f.d.b(i, i2);
        this.f.d.h(b);
        this.f.e.c();
        n j = this.f.d.j(b);
        this.f.d.k(b);
        byte[][] bArr = j.e;
        if (bArr != null) {
            for (byte[] bArr2 : bArr) {
                a(bArr2);
            }
        }
    }

    public void a(int i, String str) {
        if (i == 19) {
            y.a("###### VAR_ID=" + i + "=" + str);
        }
        int b = b(i, i);
        if (b == -1) {
            int a = ag.a(this.b);
            if (a <= this.a) {
                this.b = ag.a(this.b, a + 10);
                this.c = ag.a(this.c, a + 10, "");
            }
            b = this.a;
            this.a = b + 1;
            this.b[b] = (short) i;
            this.c[b] = str;
        }
        if (b != -1) {
            this.c[b] = str;
        }
    }

    public void a(DataInputStream dataInputStream) {
        synchronized (this.j) {
            this.j.addElement(dataInputStream);
        }
        this.f.b(4);
    }

    public void a(DataInputStream dataInputStream, int i) throws Throwable {
        byte readByte;
        int parseInt;
        String b;
        byte[] bArr;
        boolean z;
        boolean z2;
        eCClassCPackage eCClassCPackageVar;
        synchronized (g) {
            h++;
        }
        eBridgeA eBridgeAVar2 = this.l.g;
        int i2 = 0;
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (this.f.q && (readByte = dataInputStream.readByte()) != 0) {
            int i4 = i3 + 1;
            switch (readByte) {
                case -2:
                    y.a(dataInputStream.readUTF());
                    break;
                case -1:
                    int readInt = dataInputStream.readInt();
                    if (readInt == -1) {
                        this.f.b(true);
                        return;
                    }
                    dataInputStream.reset();
                    dataInputStream.skipBytes(readInt);
                    i2++;
                    break;
                case 1:
                    if ( aBridgeA.c.b() == bPlatform.b) {
                        dataInputStream.readShort();
                        dataInputStream.readShort();
                        break;
                    } else {
                        this.l.a = dataInputStream.readShort();
                        this.l.b = dataInputStream.readShort();
                        break;
                    }
                case 2:
                    this.f.h.a(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort());
                    break;
                case 3:
                    this.m.a(dataInputStream.readShort(), dataInputStream.readShort());
                    break;
                case 4:
                    this.f.h.a(true);
                    break;
                case 5:
                    this.f.h.a(false);
                    break;
                case 6:
                    this.m.a();
                    eBridgeAVar2 = this.l.g;
                    break;
                case 7:
                    this.l.a();
                    eBridgeAVar2 = this.l.g;
                    break;
                case 8:
                    this.n.f();
                    break;
                case 9:
                    this.n.a(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort());
                    break;
                case 10:
                    this.n.c(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort());
                    break;
                case 11:
                    this.n.e();
                    break;
                case 14:
                    short readShort = dataInputStream.readShort();
                    short readShort2 = dataInputStream.readShort();
                    short readShort3 = dataInputStream.readShort();
                    short readShort4 = dataInputStream.readShort();
                    short readShort5 = dataInputStream.readShort();
                    short readShort6 = dataInputStream.readShort();
                    aCClassCPackage aCClassCPackageVar = this.l;
                    eBridgeAVar2.a(readShort, readShort2, readShort3, readShort4, readShort5, readShort6, 20);
                    break;
                case 15:
                    fBridgeA fBridgeAVar = this.m.a;
                    short readShort7 = dataInputStream.readShort();
                    short readShort8 = dataInputStream.readShort();
                    short readShort9 = dataInputStream.readShort();
                    short readShort10 = dataInputStream.readShort();
                    int readInt2 = dataInputStream.readInt();
                    short readShort11 = dataInputStream.readShort();
                    short readShort12 = dataInputStream.readShort();
                    aCClassCPackage aCClassCPackageVar2 = this.l;
                    eBridgeAVar2.a(fBridgeAVar, readShort7, readShort8, readShort9, readShort10, readInt2, readShort11, readShort12, 20);
                    break;
                case 16:
                    eBridgeAVar2.a(dataInputStream.readInt());
                    break;
                case 17:
                    eBridgeAVar2.b(0);
                    break;
                case 18:
                    eBridgeAVar2.b(1);
                    break;
                case 19:
                    eBridgeAVar2.b(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort());
                    break;
                case 20:
                    eBridgeAVar2.c(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort());
                    break;
                case 22:
                    eBridgeAVar2.c(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort());
                    break;
                case 23:
                    eBridgeAVar2.a(this.n.p, this.n.q, this.n.r, this.n.s);
                    break;
                case 24:
                    eBridgeAVar2.a(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort());
                    break;
                case 25:
                    eBridgeAVar2.a(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort());
                    break;
                case 26:
                    this.l.b(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort());
                    break;
                case 27:
                    eBridgeAVar2.b(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort());
                    break;
                case 28:
                    this.f.b.i.e(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort());
                    break;
                case 29:
                    this.f.g(dataInputStream.readByte()).a(dataInputStream.readUTF(), 0, dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readByte(), dataInputStream.readByte(), 0, this.l.c - 1);
                    break;
                case 40:
                    this.f.h.d(dataInputStream.readByte());
                    break;
                case 41:
                    this.f.h.a(dataInputStream.readByte(), dataInputStream.readByte(), dataInputStream.readUTF(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort());
                    break;
                case 42:
                    try {
                        this.f.h.a(dataInputStream.readInt(), dataInputStream.readByte(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readInt());
                        break;
                    } catch (Throwable th) {
                        th.printStackTrace();
                        throw th;
                    }
                case 43:
                    try {
                        aBridgeA.c.a(dataInputStream.readUTF());
                        break;
                    } catch (Exception e) {
                        e.printStackTrace();
                        break;
                    }
                case 44:
                    this.f.L = ag.c(dataInputStream, dataInputStream.readByte());
                    break;
                case 45:
                    int readInt3 = dataInputStream.readInt();
                    String readUTF = dataInputStream.readUTF();
                    String readUTF2 = dataInputStream.readUTF();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt(readInt3);
                    dataOutputStream.writeUTF(readUTF);
                    dataOutputStream.writeUTF(readUTF2);
                    if ( aBridgeA.c.a(readUTF, readUTF2)) {
                        this.f.b.g.b(50, byteArrayOutputStream.toByteArray());
                        break;
                    } else {
                        this.f.b.g.b(51, byteArrayOutputStream.toByteArray());
                        break;
                    }
                case 46:
                    byte readByte2 = dataInputStream.readByte();
                    y.a("                  MEDIA_CMD=" + ((int) readByte2));
                    switch (readByte2) {
                        case 0:
                            aBridgeA.e.a(dataInputStream.readByte() & 255);
                            continue;
                        case 1:
                        case 2:
                            int readByte3 = dataInputStream.readByte() & 255;
                            if (readByte2 == 1) {
                                parseInt = 65535 & dataInputStream.readShort();
                                b = dataInputStream.readBoolean() ? dataInputStream.readUTF() : null;
                            } else {
                                parseInt = Integer.parseInt(b(this.f.a.t[8]));
                                b = b(this.f.a.t[9]);
                            }
                            int a = this.f.K.a(3, parseInt);
                            if (a != -1) {
                                bArr = this.f.K.b(a, 0);
                            } else {
                                bArr = this.f.S.a(u.c(3, parseInt), 0)[0];
                                if (bArr != null) {
                                    DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(bArr));
                                    dataInputStream2.readUnsignedByte();
                                    dataInputStream2.readUnsignedByte();
                                    dataInputStream2.readShort();
                                    int readInt4 = dataInputStream2.readInt();
                                    dataInputStream2.readInt();
                                    this.f.K.a(3, parseInt, readInt4, bArr, true);
                                }
                            }
                            if (bArr != null) {
                                System.arraycopy(bArr, 12, bArr, 0, bArr.length - 12);
                                aBridgeA.e.a(readByte3, parseInt, ag.d(bArr, bArr.length - 12), b);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            aBridgeA.e.b(dataInputStream.readByte() & 255);
                            continue;
                        case 4:
                            aBridgeA.e.a();
                            continue;
                        case 5:
                            aBridgeA.e.a(dataInputStream.readByte() & 255, dataInputStream.readByte());
                            continue;
                        case 6:
                            aBridgeA.e.a(dataInputStream.readByte() & 255, dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort());
                            continue;
                        case 7:
                            aBridgeA.e.d(dataInputStream.readByte() & 255);
                            continue;
                        case 8:
                            aBridgeA.e.c(dataInputStream.readByte() & 255);
                            continue;
                        case 9:
                            aBridgeA.e.b();
                            continue;
                        case 10:
                            String readUTF3 = dataInputStream.readBoolean() ? dataInputStream.readUTF() : null;
                            String[] a2 = aBridgeA.e.a(readUTF3);
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream2);
                            dataOutputStream2.writeUTF(readUTF3);
                            ag.a(dataOutputStream2, a2);
                            this.f.b.g.a(52, byteArrayOutputStream2.toByteArray());
                            continue;
                        case 11:
                            String readUTF4 = dataInputStream.readBoolean() ? dataInputStream.readUTF() : null;
                            String[] b2 = aBridgeA.e.b(readUTF4);
                            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                            DataOutputStream dataOutputStream3 = new DataOutputStream(byteArrayOutputStream3);
                            dataOutputStream3.writeUTF(readUTF4);
                            ag.a(dataOutputStream3, b2);
                            this.f.b.g.a(53, byteArrayOutputStream3.toByteArray());
                            continue;
                    }
                case 47:
                    byte readByte4 = dataInputStream.readByte();
                    short readShort13 = dataInputStream.readShort();
                    int readInt5 = dataInputStream.readInt();
                    int readInt6 = dataInputStream.readInt();
                    dataInputStream.readByte();
                    int a3 = this.f.K.a(readByte4, readShort13);
                    if (a3 != -1) {
                        z = this.f.K.a(a3) != readInt5;
                    } else {
                        byte[] bArr2 = this.f.S.a(u.c(3, readShort13), readInt5)[0];
                        if (bArr2 != null) {
                            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream(bArr2));
                            dataInputStream3.readUnsignedByte();
                            dataInputStream3.readUnsignedByte();
                            dataInputStream3.readShort();
                            z = (dataInputStream3.readInt() == readInt5 && dataInputStream3.readInt() == readInt6) ? false : true;
                        } else {
                            z = true;
                        }
                    }
                    if (z) {
                        this.f.b.b(readByte4, readShort13, readInt5);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    this.f.S.d("c_");
                    break;
                case 49:
                    int readByte5 = dataInputStream.readByte() & 255;
                    int readShort14 = dataInputStream.readShort() & 65535;
                    int a4 = this.f.K.a(readByte5, readShort14);
                    if (a4 != -1) {
                        this.f.K.b(a4);
                        break;
                    } else {
                        this.f.S.c(u.c(readByte5, readShort14));
                        break;
                    }
                case 50:
                    short readShort15 = dataInputStream.readShort();
                    byte readByte6 = dataInputStream.readByte();
                    boolean z3 = (readByte6 & 2) != 0;
                    boolean z4 = (readByte6 & 1) != 0;
                    boolean z5 = (readByte6 & 4) != 0;
                    boolean z6 = (readByte6 & 8) != 0;
                    boolean z7 = (readByte6 & 16) != 0;
                    eCClassCPackage a5 = this.f.d.a(readShort15);
                    boolean z8 = false;
                    if (!z5 || a5 == null) {
                        z2 = false;
                    } else {
                        try {
                            z8 = this.f.h.ad == a5;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        synchronized (this.f.d.e) {
                            this.f.d.e.removeElement(a5);
                        }
                        z2 = z8;
                    }
                    if (z5 || a5 == null) {
                        eCClassCPackageVar = new eCClassCPackage(this.f, readShort15, z3, z6, z7, dataInputStream);
                    } else {
                        zhook.aohoc.aRoot.cPackage.eCClassCPackage.a(dataInputStream);
                        eCClassCPackageVar = a5;
                    }
                    if (z5 && eCClassCPackageVar != null) {
                        synchronized (this.f.d.e) {
                            this.f.d.e.addElement(eCClassCPackageVar);
                        }
                        if (z2) {
                            this.f.h.ad = eCClassCPackageVar;
                        }
                    }
                    if (z4) {
                        this.f.h.a(eCClassCPackageVar);
                        break;
                    } else {
                        break;
                    }
                case 51:
                    byte readByte7 = dataInputStream.readByte();
                    jCClassCPackage jCClassCPackageVar = this.f.h;
                    eCClassCPackage j2 = jCClassCPackageVar.j();
                    switch (readByte7) {
                        case 4:
                            a(j2.q(), false);
                            continue;
                        case 5:
                            j2.c();
                            continue;
                        case 6:
                            j2.d();
                            continue;
                        case 7:
                            j2.e();
                            continue;
                        case 8:
                            j2.f();
                            continue;
                        case 9:
                            j2.g();
                            continue;
                        case 10:
                            j2.h();
                            continue;
                        case 11:
                            j2.k();
                            continue;
                        case 12:
                            j2.l();
                            continue;
                        case 13:
                            j2.j();
                            continue;
                        case 14:
                            j2.i();
                            continue;
                        case 15:
                            j2.m();
                            continue;
                        case 16:
                            j2.n();
                            continue;
                        case 17:
                            j2.o();
                            continue;
                        case 18:
                            j2.p();
                            continue;
                        case 19:
                            jCClassCPackageVar.i(i);
                            continue;
                        case 20:
                            this.f.a(6);
                            return;
                        case 21:
                            jCClassCPackageVar.r();
                            continue;
                        case 22:
                            jCClassCPackageVar.u();
                            continue;
                        case 24:
                            j2.F();
                            return;
                        case 25:
                            String readUTF5 = dataInputStream.readUTF();
                            jCClassCPackageVar.g.k();
                            String l = jCClassCPackageVar.g.l();
                            String readUTF6 = dataInputStream.readUTF();
                            short readShort16 = dataInputStream.readShort();
                            String readUTF7 = dataInputStream.readUTF();
                            short readShort17 = dataInputStream.readShort();
                            short readShort18 = dataInputStream.readShort();
                            int readInt7 = dataInputStream.readInt();
                            if (j2 != null && j2.m) {
                                jCClassCPackageVar.i(i);
                            }
                            this.f.b.a(null, readUTF5, l, null, readUTF6, readShort16, readUTF7, readShort17, readShort18, readInt7);
                            continue;
                        case 26:
                            jCClassCPackageVar.t();
                            continue;
                        case 27:
                            jCClassCPackageVar.v();
                            continue;
                        case 28:
                            jCClassCPackageVar.s();
                            continue;
                    }
                case 52:
                    this.f.h.a(this.f.d.a(dataInputStream.readShort()));
                    break;
                case 53:
                    this.f.d.b(dataInputStream.readShort());
                    break;
                case 54:
                    this.f.h.ae.b(dataInputStream);
                    break;
                case 55:
                    this.f.h.a(new eCClassCPackage(dataInputStream, this.f));
                    break;
                case 60:
                    this.f.h.b(dataInputStream);
                    break;
                case 61:
                    this.f.h.f(dataInputStream.readByte());
                    break;
                case 68:
                    this.f.h.c(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readByte(), dataInputStream.readInt());
                    break;
                case 69:
                    this.f.h.e(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readByte(), dataInputStream.readInt());
                    break;
                case 70:
                    this.f.e.m();
                    break;
                case 71:
                    this.f.h.b(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort());
                    break;
                case 72:
                    this.f.h.g(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readByte(), dataInputStream.readInt());
                    break;
                case 73:
                    this.f.h.f(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readByte(), dataInputStream.readInt());
                    break;
                case 74:
                    this.f.h.i(dataInputStream.readByte(), dataInputStream.readByte(), dataInputStream.readByte(), dataInputStream.readInt());
                    break;
                case 75:
                    this.f.h.k(dataInputStream.readByte(), dataInputStream.readByte(), dataInputStream.readByte(), dataInputStream.readInt());
                    break;
                case 76:
                    this.f.h.a(dataInputStream.readInt(), dataInputStream.readByte(), dataInputStream.readInt());
                    break;
                case 77:
                    this.f.h.a(dataInputStream.readInt(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readByte(), dataInputStream.readInt());
                    break;
                case 78:
                    this.f.h.c(dataInputStream.readInt(), dataInputStream.readByte(), dataInputStream.readByte(), dataInputStream.readByte(), dataInputStream.readInt());
                    break;
                case 79:
                    this.f.h.e(dataInputStream.readInt(), dataInputStream.readByte(), dataInputStream.readByte(), dataInputStream.readByte(), dataInputStream.readInt());
                    break;
                case 80:
                    int readInt8 = dataInputStream.readInt();
                    while (true) {
                        int c = this.f.h.c(readInt8);
                        if (c == 0) {
                            break;
                        }
                        Thread.sleep(c);
                    }
                    break;
                case 81:
                    this.f.h.a(dataInputStream);
                    break;
                case 83:
                    this.f.h.a(dataInputStream.readInt(), dataInputStream.readByte(), dataInputStream.readByte(), dataInputStream.readByte(), dataInputStream.readByte(), dataInputStream.readByte(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readUTF(), dataInputStream.readUTF(), dataInputStream.readUTF(), dataInputStream.readShort(), dataInputStream.readInt());
                    break;
                case 84:
                    this.f.h.a(ag.d(dataInputStream));
                    break;
                case 90:
                    Thread.yield();
                    this.f.e.g();
                    break;
                case 91:
                    Thread.yield();
                    int readUnsignedByte = dataInputStream.readUnsignedByte();
                    while (this.f.q) {
                        int i5 = readUnsignedByte - 1;
                        if (readUnsignedByte > 0) {
                            this.f.e.g();
                            readUnsignedByte = i5;
                        }
                    }
                    break;
                case 92:
                    Thread.yield();
                    break;
                case 93:
                    j = System.currentTimeMillis();
                    break;
                case 94:
                    this.f.a(dataInputStream.readInt(), j);
                    j = Long.MAX_VALUE;
                    break;
                case 95:
                    int readUnsignedByte2 = dataInputStream.readUnsignedByte();
                    while (this.f.q) {
                        int i6 = readUnsignedByte2 - 1;
                        if (readUnsignedByte2 > 0) {
                            this.f.e.i();
                            readUnsignedByte2 = i6;
                        }
                    }
                    break;
                case 100:
                    this.f.c(i);
                    break;
                case 101:
                    this.f.a(new r(this.f, dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readBoolean(), dataInputStream.readShort()), i);
                    break;
                case 102:
                    this.f.f(-1664090112);
                    break;
                case 103:
                    int readInt9 = dataInputStream.readInt();
                    while (this.f.q && (this.f.i() & readInt9) != readInt9) {
                        this.f.e.k();
                    }
                    break;
                case 104:
                    int readInt10 = dataInputStream.readInt();
                    while (this.f.q && (this.f.i() & readInt10) == 0) {
                        this.f.e.k();
                    }
                    break;
                case 105:
                    int readInt11 = dataInputStream.readInt();
                    int readInt12 = dataInputStream.readInt();
                    while (this.f.q) {
                        int i7 = this.f.i();
                        if ((i7 & readInt11) != readInt11 || (i7 & readInt12) != 0) {
                            this.f.e.k();
                        }
                    }
                    break;
                case 110:
                    j jVar2 = new j(null, dataInputStream, this.f);
                    jVar2.a();
                    if (this.f.b.i != null) {
                        this.f.b.i.c();
                        this.f.b.i = null;
                    }
                    jVar2.b();
                    this.f.b.i = jVar2;
                    break;
                case 111:
                    this.f.e.c();
                    break;
                case 112:
                    this.f.a(dataInputStream.readInt());
                    break;
                case 113:
                    int readInt13 = dataInputStream.readInt();
                    while (this.f.q && this.f.A != readInt13) {
                        this.f.e.e();
                    }
                    break;
                case 114:
                    short readShort19 = dataInputStream.readShort();
                    byte[] bArr3 = new byte[dataInputStream.readInt()];
                    ag.a(dataInputStream, bArr3, (int[]) null);
                    this.f.b.g.a(readShort19, bArr3);
                    break;
                case 115:
                    this.f.b.g.a(dataInputStream.readShort(), this.f.h.j().z());
                    break;
                case 116:
                    short readShort20 = dataInputStream.readShort();
                    int readInt14 = dataInputStream.readInt();
                    byte[] bArr4 = new byte[readInt14 + 8];
                    ag.a(dataInputStream, bArr4, 0, readInt14, null);
                    jCClassCPackage jCClassCPackageVar3 = this.f.h;
                    l lVar = jCClassCPackageVar3.ap;
                    if (lVar != null && lVar.B != 0 && lVar.A != -1) {
                        break;
                    } else {
                        if ( jCClassCPackageVar3.e.k()) {
                            ag.a(jCClassCPackageVar3.G, bArr4, readInt14);
                            ag.a(jCClassCPackageVar3.H, bArr4, readInt14 + 2);
                        } else {
                            ag.a(jCClassCPackageVar3.y, bArr4, readInt14);
                            ag.a(jCClassCPackageVar3.z, bArr4, readInt14 + 2);
                        }
                        l lVar2 = jCClassCPackageVar3.aq;
                        ag.b(lVar2 != null ? lVar2.a : -1, bArr4, readInt14 + 4);
                        this.f.b.g.a(readShort20, bArr4);
                        break;
                    }
                case 117:
                    a(dataInputStream.readShort(), dataInputStream.readInt());
                    break;
                case 118:
                    short readShort21 = dataInputStream.readShort();
                    if (readShort21 == -1) {
                        this.e.clear();
                        break;
                    } else {
                        for (int i8 = 0; i8 < readShort21; i8++) {
                            a(dataInputStream.readShort());
                        }
                        break;
                    }
                case 119:
                    a((int) dataInputStream.readShort(), false);
                    break;
                case 121:
                    int readUnsignedByte3 = dataInputStream.readUnsignedByte();
                    for (int i9 = 0; i9 < readUnsignedByte3; i9++) {
                        short readByte8 = dataInputStream.readByte();
                        String readUTF8 = dataInputStream.readUTF();
                        y.a("@var[" + ((int) readByte8) + "]=" + readUTF8);
                        a(readByte8, readUTF8);
                    }
                    break;
                case 122:
                    this.f.b(dataInputStream);
                    break;
                case 123:
                    this.f.a(dataInputStream);
                    break;
                case 124:
                    this.f.h.c(dataInputStream.readUTF());
                    break;
            }
            eBridgeAVar2 = eBridgeAVar2;
            i2 = i2;
            j = j;
            i3 = i4;
        }
    }

    public void a(byte[] bArr) {
        int a = ag.a(bArr, 0);
        y.a("loadScript: " + a);
        this.e.put(new b(a), bArr);
    }

    public boolean a(int i, boolean z) throws Throwable {
        if (i == -1) {
            return false;
        }
        if ((i & 16384) != 0) {
            this.f.h.a(this.f.d.a(i & 16383));
            return true;
        }
        byte[] bArr = (byte[]) this.e.get(new b(i));
        if (bArr == null) {
            y.a("WARNING: script=NULL script_id=" + i);
            return false;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        if (z) {
            a(dataInputStream);
        } else {
            c(dataInputStream);
        }
        return true;
    }

    public int b(int i, int i2) {
        if (i2 != -1) {
            try {
                if (this.b[i2] == i) {
                    return i2;
                }
            } catch (Throwable th) {
            }
        }
        return ag.a((short) i, this.b);
    }

    public String b(int i) {
        String str;
        int b = b(i, i);
        return (b == -1 || (str = this.c[b]) == null) ? "" : str;
    }

    public void b() {
        synchronized (this.i) {
            if (this.i.size() > 0) {
                return;
            }
            Object obj = null;
            synchronized (this.k) {
                if (this.k.size() > 0 && (this.f.i() & 4194304) != 0) {
                    obj = this.k.firstElement();
                    this.k.removeElement(obj);
                }
            }
            if (obj != null) {
                synchronized (this.i) {
                    this.i.addElement(obj);
                }
                this.f.b(3);
            }
        }
    }

    public void b(DataInputStream dataInputStream) {
        synchronized (this.k) {
            this.k.addElement(dataInputStream);
        }
    }

    public void c() {
        DataInputStream dataInputStream;
        y.a("run()");
        try {
            synchronized (this.i) {
                dataInputStream = (DataInputStream) this.i.firstElement();
            }
            if (dataInputStream != null) {
                c(dataInputStream);
                synchronized (this.i) {
                    this.i.removeElement(dataInputStream);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void c(DataInputStream dataInputStream) throws Throwable {
        a(dataInputStream, dataInputStream.readShort());
    }
}
