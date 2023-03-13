package zhook.aohoc.bridge.platform.andr;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import zhook.aohoc.bridge.aBridge.aABridge;
import zhook.aohoc.bridge.aBridge.dABridge;
import zhook.aohoc.bridge.aBridge.eABridge;
import zhook.aohoc.bridge.aBridge.gABridge;

/* loaded from: classes.dex */
public class lAndr implements aABridge, dABridge, eABridge, gABridge {
    protected URLConnection a;

    public lAndr(String str) throws IOException {
        this(new URL(str));
    }

    public lAndr(URL url) throws IOException {
        this(url.openConnection());
    }

    public lAndr(URLConnection uRLConnection) {
        this.a = uRLConnection;
    }

    @Override // zhook.aohoc.bridge.a.a
    public void a() {
        this.a = null;
    }

    @Override // zhook.aohoc.bridge.a.d
    public DataInputStream b() throws IOException {
        return new DataInputStream(c());
    }

    @Override // zhook.aohoc.bridge.a.d
    public InputStream c() throws IOException {
        return this.a.getInputStream();
    }

    @Override // zhook.aohoc.bridge.a.e
    public OutputStream d() throws IOException {
        return this.a.getOutputStream();
    }
}
