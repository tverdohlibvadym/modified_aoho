package zhook.aohoc.aRoot;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import zhook.aohoc.bridge.aBridgeA;
import zhook.aohoc.bridge.jBridgeA;

/* loaded from: classes.dex */
public class a {
    public int b;
    public int a = 0;
    public String c = null;
    public String d = null;
    public String e = null;

    public a() {
        this.b = -1;
        this.b = -1;
    }

    public void a(jBridgeA jBridgeAVar, String str) throws IOException {
        this.a = 0;
        this.b = -1;
        this.c = null;
        byte[] bArr = jBridgeAVar.a("aoholu_" + str, 0)[0];
        if (bArr == null) {
            if (zhook.aohoc.aRoot.e.a.equals(str)) {
                try {
                    this.b = Integer.parseInt(aBridgeA.c.b("q-user-id"));
                    this.c = aBridgeA.c.b("q-user-data");
                    return;
                } catch (Throwable th) {
                    this.b = -1;
                    this.c = null;
                    return;
                }
            }
            return;
        }
        this.a = 2;
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            this.b = dataInputStream.readInt();
            this.c = dataInputStream.readUTF();
        } catch (Exception e) {
            this.b = -1;
            this.c = null;
            e.printStackTrace();
        }
    }

    public void b(jBridgeA jBridgeAVar, String str) {
        this.a = 0;
        this.b = -1;
        this.c = null;
        if ( jBridgeAVar == null) {
            return;
        }
        jBridgeAVar.d("aoholu_" + str);
    }
}
