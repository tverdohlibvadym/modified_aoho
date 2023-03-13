package zhook.aohoc.bridge.platform.andr;

import java.io.IOException;
import java.net.MalformedURLException;

import zhook.aohoc.bridge.aBridge.aABridge;
import zhook.aohoc.bridge.aBridge.bABridge;

/* loaded from: classes.dex */
public class AndrConnector extends bABridge {
    @Override // zhook.aohoc.bridge.a.b
    public aABridge a(String str, int i) throws IOException {
        return str.startsWith("http:") ? new dAndr(str) : str.startsWith("socket:") ? new kAndr(str) : new lAndr(str);
    }

    @Override // zhook.aohoc.bridge.a.b
    public aABridge a(String str, int i, boolean z) throws IOException {
        return a(str, i);
    }
}
