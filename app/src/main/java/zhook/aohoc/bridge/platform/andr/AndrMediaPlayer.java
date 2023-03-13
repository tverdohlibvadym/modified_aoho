package zhook.aohoc.bridge.platform.andr;

import zhook.aohoc.aRoot.ag;
import zhook.aohoc.bridge.iBridgeA;

/* loaded from: classes.dex */
public class AndrMediaPlayer extends iBridgeA {
    @Override // zhook.aohoc.bridge.i
    public void a() {
        for (int i = 0; i < this.a.length; i++) {
            b(i);
        }
    }

    @Override // zhook.aohoc.bridge.i
    public void a(int i) {
        a();
        this.a = new Object[i];
        this.b = ag.b((int[]) null, i, -1);
    }

    @Override // zhook.aohoc.bridge.i
    public void a(int i, int i2) {
    }

    @Override // zhook.aohoc.bridge.i
    public void a(int i, int i2, byte[] bArr, String str) {
    }

    @Override // zhook.aohoc.bridge.i
    public boolean a(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // zhook.aohoc.bridge.i
    public String[] a(String str) {
        return null;
    }

    @Override // zhook.aohoc.bridge.i
    public void b() {
        for (int i = 0; i < this.a.length; i++) {
            c(i);
        }
    }

    @Override // zhook.aohoc.bridge.i
    public void b(int i) {
    }

    @Override // zhook.aohoc.bridge.i
    public String[] b(String str) {
        return null;
    }

    @Override // zhook.aohoc.bridge.i
    public void c(int i) {
    }

    @Override // zhook.aohoc.bridge.i
    public void d(int i) {
    }
}
