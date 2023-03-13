package zhook.aohoc.bridge.platform.andr;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import zhook.aohoc.bridge.aBridge.cABridge;

/* loaded from: classes.dex */
public class dAndr implements cABridge {
    public HttpURLConnection a;
    public URL b;
    private boolean c;

    public dAndr(String str) {
        try {
            this.b = new URL(str);
            this.a = (HttpURLConnection) this.b.openConnection();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        this.a.setDoOutput(true);
        this.a.setDoInput(true);
        this.a.setUseCaches(false);
        this.c = false;
    }

    @Override // zhook.aohoc.bridge.a.c, zhook.aohoc.bridge.a.a
    public void a() {
        this.a.disconnect();
    }

    @Override // zhook.aohoc.bridge.a.c
    public void a(String str) throws ProtocolException {
        this.a.setRequestMethod(str);
    }

    @Override // zhook.aohoc.bridge.a.c
    public void a(String str, String str2) {
        this.a.setRequestProperty(str, str2);
        if ("content-length".equalsIgnoreCase(str)) {
            try {
                this.a.setFixedLengthStreamingMode(Integer.parseInt(str2));
            } catch (NumberFormatException e) {
            }
        }
    }

    @Override // zhook.aohoc.bridge.a.d
    public DataInputStream b() throws IOException {
        return new DataInputStream(c());
    }

    @Override // zhook.aohoc.bridge.a.d
    public InputStream c() throws IOException {
        if (!this.c) {
            this.a.connect();
        }
        return this.a.getInputStream();
    }

    @Override // zhook.aohoc.bridge.a.e
    public OutputStream d() throws IOException {
        if (!this.c) {
            this.a.connect();
        }
        return this.a.getOutputStream();
    }
}
