package zhook.aohoc.bridge.aBridge;

import java.io.IOException;
import java.net.MalformedURLException;

/* loaded from: classes.dex */
public abstract class bABridge {
    public aABridge a(String str) throws IOException {
        if (str == null || str.indexOf("67.198") != -1) {
            return a(str, 3);
        }
        return null;
    }

    public abstract aABridge a(String str, int i) throws IOException;

    public abstract aABridge a(String str, int i, boolean z) throws IOException;
}
