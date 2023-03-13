package zhook.aohoc.bridge.platform.andr;

/* loaded from: classes.dex */
public class AndrAppManager extends zhook.aohoc.bridge.aBridgeA {
    @Override // zhook.aohoc.bridge.a
    public void b() {
    }

    @Override // zhook.aohoc.bridge.a
    public int c() {
        if ( aAndr.aAndr == null || aAndr.aAndr.getWidth() <= 0) {
            return 0;
        }
        if (this.j <= 0) {
            this.j = aAndr.aAndr.getWidth();
        }
        return MainActivity.a.a() == 2 ? this.k : this.j;
    }

    @Override // zhook.aohoc.bridge.a
    public int d() {
        if ( aAndr.aAndr == null || aAndr.aAndr.getHeight() <= 0) {
            return 0;
        }
        if (this.k <= 0) {
            this.k = aAndr.aAndr.getHeight();
        }
        return MainActivity.a.a() == 2 ? this.j : this.k;
    }
}
