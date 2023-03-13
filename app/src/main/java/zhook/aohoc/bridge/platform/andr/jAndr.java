package zhook.aohoc.bridge.platform.andr;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class jAndr extends Handler {
    private final WeakReference a;

    public jAndr(AndrInputProcessor andrInputProcessor) {
        this.a = new WeakReference(andrInputProcessor);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        AndrInputProcessor andrInputProcessor = (AndrInputProcessor) this.a.get();
        if (andrInputProcessor != null) {
            andrInputProcessor.a(andrInputProcessor.p, andrInputProcessor.q, andrInputProcessor.r, andrInputProcessor.t, andrInputProcessor.s, andrInputProcessor.u, andrInputProcessor.v, andrInputProcessor.w, andrInputProcessor.x);
            super.handleMessage(message);
        }
    }
}
