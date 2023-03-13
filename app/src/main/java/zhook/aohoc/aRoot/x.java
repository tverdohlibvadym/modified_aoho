package zhook.aohoc.aRoot;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import zhook.aohoc.aRoot.aPackage.aAClassPackage;
import zhook.aohoc.aRoot.cPackage.aCClassCPackage;
import zhook.aohoc.bridge.aBridge.fABridge;
import zhook.aohoc.bridge.aBridgeA;

/* loaded from: classes.dex */
public class x implements Runnable {
    aAClassPackage aAClassPackage;
    private aCClassCPackage c;
    private String d;
    private String e;
    private fABridge fABridge;
    private DataOutputStream g;
    private DataInputStream h;
    private w i;
    private Thread j;
    private String k = "\r\n";
    int b = -1;

    public x(aAClassPackage aAClassPackageVar, String str, String str2) {
        this.aAClassPackage = aAClassPackageVar;
        this.c = this.aAClassPackage.T;
        this.aAClassPackage.b.h = this;
        this.d = str;
        this.e = str2;
        Thread thread = new Thread(this);
        this.j = thread;
        thread.start();
    }

    public w a() {
        return this.i;
    }

    public void a(String str) {
        y.a(str);
    }

    public void a(String str, String str2, String str3) {
        y.b("[error] " + str + " [fields] " + str2 + " [context] " + str3);
    }

    public boolean b() {
        return this.aAClassPackage.q && this.fABridge != null;
    }

    public void c() {
        if (this.g != null) {
            try {
                this.g.close();
            } catch (Throwable th) {
            }
        }
        this.g = null;
        if (this.h != null) {
            try {
                this.h.close();
            } catch (Throwable th2) {
            }
        }
        this.h = null;
        if (this.fABridge != null) {
            try {
                this.fABridge.a();
            } catch (Throwable th3) {
            }
        }
        this.fABridge = null;
    }

    public boolean d() throws IOException {
        ag.a(this.g, aBridgeA.c.a());
        this.g.writeInt(70);
        this.g.writeShort(this.c.c);
        this.g.writeShort(this.c.d);
        ag.a(this.g, this.d);
        this.g.writeUTF("" + System.getProperty("microedition.platform"));
        this.g.writeUTF("");
        this.g.writeUTF("delay=" + this.fABridge.a((byte) 0) + " keepalive=" + this.fABridge.a((byte) 2) + " linger=" + this.fABridge.a((byte) 1) + " rcvbuf=" + this.fABridge.a((byte) 3) + " sndbuf=" + this.fABridge.a((byte) 4));
        this.g.flush();
        Thread.yield();
        String e = ag.e(this.h);
        a("received url: " + e);
        if (e.length() == 0) {
            return true;
        }
        aBridgeA.c.a(e);
        this.aAClassPackage.b(true);
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                this.fABridge = (fABridge) ag.a(this.d, 3, true);
            } finally {
                y.a("qCon.run FINALLY : m_thread = null;");
                this.j = null;
            }
        } catch (SecurityException e) {
            return;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.fABridge == null && this.e != null) {
            this.fABridge = (fABridge) ag.a(this.e, 3, true);
        }
        if (this.fABridge != null) {
            try {
                this.h = new DataInputStream(this.fABridge.c());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            try {
                this.g = new DataOutputStream(this.fABridge.d());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            zhook.aohoc.aRoot.aPackage.dAClassPackage.p = false;
            try {
                if (d()) {
                    this.i = new w(this.aAClassPackage, this, this.h, this.g);
                    this.aAClassPackage.a(2);
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        } else {
            this.aAClassPackage.a(4);
        }
    }
}
