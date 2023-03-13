package zhook.aohoc.aRoot;

import java.io.DataInputStream;
import java.io.OutputStream;

import zhook.aohoc.aRoot.aPackage.cAClassPackage;
import zhook.aohoc.bridge.aBridge.cABridge;
import zhook.aohoc.bridge.aBridgeA;

/* loaded from: classes.dex */
public class o implements Runnable {
    public String a;
    public String b;
    public cAClassPackage cAClassPackage;
    public int d;
    public int e;

    public o(String str, String str2, cAClassPackage cAClassPackageVar, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.d = i;
        this.e = i2;
        this.cAClassPackage = cAClassPackageVar;
        new Thread(this).start();
    }

    @Override // java.lang.Runnable
    public void run() {
        OutputStream outputStream;
        cABridge cABridgeVar;
        DataInputStream dataInputStream = null;
        try {
            try {
                cABridge cABridgeVar2 = (cABridge) aBridgeA.f.a(this.a);
                try {
                    cABridgeVar2.a("POST");
                    cABridgeVar2.a("Content-Type", "application/x-www-form-urlencoded");
                    OutputStream d = cABridgeVar2.d();
                    try {
                        d.write(this.b.getBytes());
                        StringBuffer stringBuffer = new StringBuffer();
                        dataInputStream = cABridgeVar2.b();
                        while (true) {
                            int read = dataInputStream.read();
                            if (read == -1) {
                                break;
                            }
                            stringBuffer.append((char) read);
                        }
                        String stringBuffer2 = stringBuffer.toString();
                        System.out.println("received: " + stringBuffer2);
                        if (this.cAClassPackage.b == this && stringBuffer2.length() > 0) {
                            this.cAClassPackage.a(zhook.aohoc.aRoot.e.a(stringBuffer2));
                            this.cAClassPackage.aAClassPackage.a(this.d);
                            this.cAClassPackage.a(this.cAClassPackage.e, true);
                        }
                        if (dataInputStream != null) {
                            dataInputStream.close();
                        }
                        if (d != null) {
                            d.close();
                        }
                        if ( cABridgeVar2 != null) {
                            cABridgeVar2.a();
                        }
                    } catch (Throwable th) {
                        outputStream = d;
                        cABridgeVar = cABridgeVar2;
                        th = th;
                        if (dataInputStream != null) {
                            dataInputStream.close();
                        }
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if ( cABridgeVar != null) {
                            cABridgeVar.a();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    cABridgeVar = cABridgeVar2;
                    outputStream = null;
                }
            } catch (Throwable th3) {
                outputStream = null;
                cABridgeVar = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.cAClassPackage.aAClassPackage.a(this.e);
        }
    }
}
