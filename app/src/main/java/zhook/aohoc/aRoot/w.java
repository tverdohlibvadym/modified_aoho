package zhook.aohoc.aRoot;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;

import zhook.aohoc.aRoot.aPackage.aAClassPackage;

/* loaded from: classes.dex */
public class w implements Runnable {
    public aAClassPackage i;
    public x j;
    private DataInputStream r;
    private DataOutputStream s;
    private int v;
    private Vector w;
    public int a = 0;
    public int[] b = new int[1];
    public int c = 0;
    public int[] d = new int[1];
    public int e = 0;
    public int[] f = new int[1];
    public boolean g = false;
    private final Object n = new Object();
    private final Vector x = new Vector();
    private final Vector y = new Vector();
    private final Vector z = new Vector();
    private final Vector A = new Vector();
    private final Object B = new Object();
    public boolean h = true;
    private int u = 0;
    private int o = 0;
    private Thread p = null;
    private Thread q = null;
    private Object l = new Object();
    private Object m = new Object();
    private int k = 1;
    private int t = 1;

    public w(aAClassPackage aAClassPackageVar, x xVar, DataInputStream dataInputStream, DataOutputStream dataOutputStream) {
        this.i = aAClassPackageVar;
        this.j = xVar;
        this.r = dataInputStream;
        this.s = dataOutputStream;
        b(1);
        b(2);
    }

    private void a(String str) {
        a().a(str);
    }

    private void a(String str, String str2, String str3) {
        a().a(str, str2, str3);
    }

    public static boolean a(int i) {
        return (i & 1) == 1;
    }

    private void b(v vVar) {
        synchronized (this.n) {
            switch (vVar.l()) {
                case 0:
                    this.z.removeElement(vVar);
                    break;
                case 1:
                    this.y.removeElement(vVar);
                    break;
                case 2:
                    this.x.removeElement(vVar);
                    break;
            }
        }
    }

    private void j() throws InterruptedException {
        a("######### _suspendSendThread().synchronized : BEGIN");
        synchronized (this.m) {
            a("######### _suspendSendThread().synchronized : END");
            a("######### _suspendSendThread().wait : BEGIN");
            this.m.wait();
            a("######### _suspendSendThread().wait : END");
        }
    }

    public int a(int i, int i2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
        new DataOutputStream(byteArrayOutputStream).writeInt(i2);
        return a(i, byteArrayOutputStream.toByteArray());
    }

    public int a(int i, int i2, int i3) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeByte(i2);
        dataOutputStream.writeShort(i3);
        return a(i, byteArrayOutputStream.toByteArray());
    }

    public int a(int i, long j) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
        new DataOutputStream(byteArrayOutputStream).writeLong(j);
        return b(i, byteArrayOutputStream.toByteArray());
    }

    public int a(int i, long j, long j2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeLong(j);
        dataOutputStream.writeLong(j2);
        return a(i, byteArrayOutputStream.toByteArray());
    }

    public int a(int i, String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new DataOutputStream(byteArrayOutputStream).writeUTF(str);
        return a(i, byteArrayOutputStream.toByteArray());
    }

    public int a(int i, String str, int i2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        ag.a(dataOutputStream, str);
        dataOutputStream.writeInt(i2);
        return a(i, byteArrayOutputStream.toByteArray());
    }

    public int a(int i, byte[] bArr) {
        return a(i, bArr, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(int r10, byte[] r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zhook.aohoc.a.w.a(int, byte[], boolean):int");
    }

    public int a(int i, String[] strArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeShort(strArr.length);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2].length() > 255) {
                throw new Throwable("sendChunkShortStrings : to long string argument");
            }
            dataOutputStream.writeByte(strArr[i2].length());
            dataOutputStream.write(strArr[i2].getBytes());
        }
        return a(i, byteArrayOutputStream.toByteArray());
    }

    public x a() {
        return this.j;
    }

    public void a(v vVar) throws Throwable {
        if (this.h) {
            if ((vVar.c() & 128) != 0 && vVar.e() > 0) {
                byte[] m = vVar.m();
                int e = vVar.e() - 4;
                int b = ag.b(m, 0);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m);
                byteArrayInputStream.skip(4L);
                byte[] bArr = new byte[b];
                a("UNZIP: " + e + " -> " + b + " (" + (100 - ((e * 100) / b)) + "% )");
                DataInputStream a = ah.a(byteArrayInputStream);
                long currentTimeMillis = System.currentTimeMillis();
                this.g = true;
                this.c = b;
                this.d[0] = 0;
                zhook.aohoc.aRoot.y.a("!!!!!! UNZIP");
                ag.a(a, bArr, this.d);
                this.g = false;
                this.c = 0;
                this.d[0] = 0;
                zhook.aohoc.aRoot.y.a("!!!!!! UNZIP time=" + (System.currentTimeMillis() - currentTimeMillis));
                vVar.b(bArr);
            }
            vVar.a(vVar.b());
            switch (vVar.b()) {
                case 1:
                    DataInputStream n = vVar.n();
                    int readUnsignedShort = n.readUnsignedShort();
                    this.e = readUnsignedShort;
                    this.f[0] = 0;
                    for (int i = 0; i < readUnsignedShort; i++) {
                        int readInt = n.readInt();
                        byte[] bArr2 = new byte[n.readInt()];
                        n.read(bArr2);
                        a(new v(vVar.l(), vVar.a(), readInt, bArr2));
                        this.f[0] = i;
                    }
                    this.e = 0;
                    return;
                case 2:
                    e(vVar.n().readInt());
                    return;
                case 3:
                    e();
                    return;
                case 4:
                    f(vVar.n().readInt());
                    return;
                case 5:
                    DataInputStream n2 = vVar.n();
                    a(n2.readInt(), n2.readInt());
                    return;
                case 6:
                    a(7, vVar.n().readLong());
                    return;
                default:
                    if (a().b()) {
                        this.i.b.a(vVar, true);
                        return;
                    }
                    return;
            }
        }
    }

    protected int b() {
        int i = this.k;
        this.k += 2;
        return i;
    }

    public int b(int i, int i2, int i3) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeShort(i2);
        dataOutputStream.writeShort(i3);
        return a(i, byteArrayOutputStream.toByteArray());
    }

    public int b(int i, byte[] bArr) {
        return a(i, bArr, true);
    }

    protected synchronized void b(int i) {
        while (this.o != 0) {
            Thread.yield();
        }
        this.o = i;
        new Thread(this).start();
        while (this.o != 0) {
            Thread.yield();
        }
    }

    public v c(int i) {
        synchronized (this.n) {
            for (int i2 = 0; i2 < this.x.size(); i2++) {
                v vVar = (v) this.x.elementAt(i2);
                if (vVar.a() == i) {
                    return vVar;
                }
            }
            for (int i3 = 0; i3 < this.y.size(); i3++) {
                v vVar2 = (v) this.y.elementAt(i3);
                if (vVar2.a() == i) {
                    return vVar2;
                }
            }
            for (int i4 = 0; i4 < this.z.size(); i4++) {
                v vVar3 = (v) this.z.elementAt(i4);
                if (vVar3.a() == i) {
                    return vVar3;
                }
            }
            return null;
        }
    }

    public boolean c() {
        return this.w != null;
    }

    public v d(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.A.size()) {
                return null;
            }
            v vVar = (v) this.A.elementAt(i3);
            if (vVar.a() == i) {
                return vVar;
            }
            i2 = i3 + 1;
        }
    }

    public byte[] d() {
        if (this.w.size() == 0) {
            this.w = null;
            return null;
        }
        try {
            a("finalizeSendChunkSequence : begin : " + this.u);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeShort(this.w.size());
            while (this.w.size() > 0) {
                v vVar = (v) this.w.firstElement();
                this.w.removeElement(vVar);
                int d = vVar.d();
                int e = vVar.e();
                dataOutputStream.writeInt(d);
                dataOutputStream.writeInt(e);
                if (e > 0) {
                    dataOutputStream.write(vVar.m());
                }
            }
            this.w = null;
            a("finalizeSendChunkSequence : end");
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            a("" + th, "", "qCon.endSendChunkSequence");
            th.printStackTrace();
            a().c();
            this.w = null;
            return null;
        }
    }

    public void e() {
        a("endSendChunkSequence");
        synchronized (this.B) {
            if (this.u == 0) {
                a("m_vChunkSequence=" + this.w, "", "AOHClientCon.finalizeSendChunkSequence");
                return;
            }
            byte[] d = this.u == 1 ? d() : null;
            this.u--;
            if (d != null) {
                a(this.v | 1, d);
            }
        }
    }

    public void e(int i) {
        a("startSendChunkSequence: a_iModifiers=" + Integer.toHexString(i) + " : " + this.u);
        synchronized (this.B) {
            if (this.u == 0) {
                this.v = i;
                this.w = new Vector();
            }
            this.u++;
        }
    }

    public int f(int i) {
        return a(i, (byte[]) null);
    }

    public void f() {
        a("######### _wakeupAllWaitingForIncomingEvents().synchronized : BEGIN");
        synchronized (this.l) {
            a("######### _wakeupAllWaitingForIncomingEvents().synchronized : END");
            a("######### _wakeupAllWaitingForIncomingEvents().notifyAll : BEGIN");
            this.l.notifyAll();
            a("######### _wakeupAllWaitingForIncomingEvents().notifyAll : END");
        }
    }

    public void g() {
        a("######### _resumeSendThread().synchronized : BEGIN");
        synchronized (this.m) {
            a("######### _resumeSendThread().synchronized : END");
            a("######### _resumeSendThread().notifyAll : BEGIN");
            this.m.notifyAll();
            a("######### _resumeSendThread().notifyAll : END");
        }
    }

    public void h() throws IOException {
        v vVar;
        this.p = Thread.currentThread();
        Thread.yield();
        while (this.h && a().b()) {
            try {
                if (this.A.size() == 0) {
                    this.i.o = System.currentTimeMillis();
                    this.i.f(-536870913);
                }
                int readInt = this.r.readInt();
                this.i.o = System.currentTimeMillis();
                this.i.e(536870912);
                int readInt2 = this.r.readInt();
                if (readInt2 != -1) {
                    v d = d(readInt);
                    if (d == null && readInt2 == 0) {
                        byte readByte = this.r.readByte();
                        if (readByte == 0) {
                        }
                        short readShort = this.r.readShort();
                        int readInt3 = this.r.readInt();
                        this.a = readInt3;
                        this.b[0] = 0;
                        if (readInt3 < 0) {
                            a("negative chunk data steps_remained", "iChunkDataSize=" + readInt3, "qCon.runReceive()");
                            zhook.aohoc.aRoot.y.a("***************** FINALLY RUN RECEIVE");
                            while (this.A.size() > 0) {
                                v vVar2 = (v) this.A.elementAt(0);
                                this.A.removeElement(vVar2);
                                if (a().b()) {
                                    this.i.b.a(vVar2);
                                }
                            }
                            a().c();
                            return;
                        }
                        v vVar3 = new v(readByte, readInt, readShort, readInt3);
                        this.A.addElement(vVar3);
                        vVar = vVar3;
                    } else {
                        vVar = d;
                    }
                    if (vVar != null && readInt2 != vVar.i()) {
                        a("not syncronized chunk data block step", "iDataBlockOffset=" + readInt2 + ", chunk=" + vVar, "qCon.runReceive()");
                        zhook.aohoc.aRoot.y.a("***************** FINALLY RUN RECEIVE");
                        while (this.A.size() > 0) {
                            v vVar4 = (v) this.A.elementAt(0);
                            this.A.removeElement(vVar4);
                            if (a().b()) {
                                this.i.b.a(vVar4);
                            }
                        }
                        a().c();
                        return;
                    }
                    int readUnsignedShort = this.r.readUnsignedShort();
                    if (readUnsignedShort < 0 || readUnsignedShort > 1000) {
                        a("invalid data block steps_remained", "iDataBlockSize=" + readUnsignedShort + ", MAX_DATA_BLOCK_SIZE=1000, chunk=" + vVar, "qCon.runReceive()");
                        zhook.aohoc.aRoot.y.a("***************** FINALLY RUN RECEIVE");
                        while (this.A.size() > 0) {
                            v vVar5 = (v) this.A.elementAt(0);
                            this.A.removeElement(vVar5);
                            if (a().b()) {
                                this.i.b.a(vVar5);
                            }
                        }
                        a().c();
                        return;
                    }
                    byte[] bArr = new byte[readUnsignedShort];
                    this.b[0] = readInt2;
                    ag.a(this.r, bArr, this.b);
                    if (vVar == null) {
                        a("null chunk with DataBlockSize != 0", "dataBlock=" + bArr + ", iDataBlockSize=" + readUnsignedShort + ", chunk=" + vVar, "qCon.runReceive()");
                        zhook.aohoc.aRoot.y.a("***************** FINALLY RUN RECEIVE");
                        while (this.A.size() > 0) {
                            v vVar6 = (v) this.A.elementAt(0);
                            this.A.removeElement(vVar6);
                            if (a().b()) {
                                this.i.b.a(vVar6);
                            }
                        }
                        a().c();
                        return;
                    }
                    if (!vVar.a(bArr)) {
                        a("receive data blocl failed", "dataBlock=" + bArr + ", iDataBlockSize=" + readUnsignedShort + ", chunk=" + vVar, "qCon.runReceive()");
                    }
                    if (vVar.k()) {
                        this.a = 0;
                        this.b[0] = 0;
                        this.A.removeElement(vVar);
                        if (a().b()) {
                            this.i.b.a(vVar);
                        }
                        synchronized (this.n) {
                            this.x.insertElementAt(vVar, 0);
                        }
                    }
                    if (vVar.j() == 0) {
                        this.a = 0;
                        this.b[0] = 0;
                        if (vVar.e() > 100000) {
                        }
                        this.A.removeElement(vVar);
                        a(vVar);
                    }
                } else if (a(readInt)) {
                    v c = c(readInt);
                    b(c);
                    if (a().b()) {
                        this.i.b.c(c);
                    }
                } else {
                    v d2 = d(readInt);
                    this.A.removeElement(d2);
                    if (a().b()) {
                        this.i.b.a(d2);
                    }
                }
            } catch (Throwable ex) {
                throw new RuntimeException(ex);
            }
        }
        zhook.aohoc.aRoot.y.a("***************** FINALLY RUN RECEIVE");
        while (this.A.size() > 0) {
            v vVar7 = (v) this.A.elementAt(0);
            this.A.removeElement(vVar7);
            if (a().b()) {
                this.i.b.a(vVar7);
            }
        }
        a().c();
    }

    public void i() throws IOException, InterruptedException {
        this.q = Thread.currentThread();
        Thread.yield();
        while (this.h && a().b()) {
            try {
                v vVar = null;
                synchronized (this.n) {
                    if ( this.x.size() > 0 ) {
                        vVar = (v) this.x.firstElement();
                    } else if ( this.y.size() > 0 ) {
                        vVar = (v) this.y.firstElement();
                    } else if ( this.z.size() > 0 ) {
                        vVar = (v) this.z.firstElement();
                    }
                }
                if ( vVar == null ) {
                    this.i.o = System.currentTimeMillis();
                    this.i.f(-1073741825);
                    j();
                } else {
                    this.i.o = System.currentTimeMillis();
                    this.i.e(1073741824);
                    if ( vVar.k() ) {
                        b(vVar);
                        this.s.writeInt(vVar.a());
                        this.s.writeInt(-1);
                        if ( a(vVar.a()) && a().b() ) {
                            this.i.b.c(vVar);
                        }
                    } else {
                        this.s.writeInt(vVar.a());
                        this.s.writeInt(vVar.i());
                        if ( vVar.i() == 0 ) {
                            this.s.writeByte(vVar.l());
                            this.s.writeShort(vVar.d());
                            this.s.writeInt(vVar.e());
                        }
                        int f = vVar.f();
                        if ( f == 79 ) {
                        }
                        this.s.writeShort(f);
                        if ( f > 0 ) {
                            this.s.write(vVar.g());
                        }
                        this.s.flush();
                        vVar.h();
                        if ( vVar.j() == 0 ) {
                            b(vVar);
                            if ( a().b() ) {
                                this.i.b.b(vVar);
                            }
                        }
                    }
                }
            } finally {

            }
        }
        zhook.aohoc.aRoot.y.a("***************** FINALLY RUN SEND");
        while (this.x.size() > 0) {
            v vVar2 = (v) this.x.elementAt(0);
            this.x.removeElement(vVar2);
            if (a().b()) {
                this.i.b.c(vVar2);
            }
        }
        while (this.y.size() > 0) {
            v vVar3 = (v) this.y.elementAt(0);
            this.y.removeElement(vVar3);
            if (a().b()) {
                this.i.b.c(vVar3);
            }
        }
        while (this.z.size() > 0) {
            v vVar4 = (v) this.z.elementAt(0);
            this.z.removeElement(vVar4);
            if (a().b()) {
                this.i.b.c(vVar4);
            }
        }
        a().c();
        this.i.a(4);
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = this.o;
        this.o = 0;
        switch (i) {
            case 1:
                try {
                    h();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                return;
            case 2:
                try {
                    i();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                return;
            default:
                return;
        }
    }
}
