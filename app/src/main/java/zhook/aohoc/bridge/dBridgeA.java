package zhook.aohoc.bridge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class dBridgeA implements Runnable {
    final /* synthetic */ cBridgeA a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dBridgeA(cBridgeA cBridgeAVar) {
        this.a = cBridgeAVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j;
        long j2;
        while (this.a.k) {
            try {
                j = this.a.x;
                if (j == -1) {
                    this.a.x = System.currentTimeMillis();
                }
                long currentTimeMillis = System.currentTimeMillis();
                j2 = this.a.x;
                long j3 = currentTimeMillis - j2;
                this.a.x = currentTimeMillis;
                if (j3 >= 0) {
                    if (j3 >= 2500) {
                        this.a.l++;
                    }
                    Thread.sleep(1000L);
                }
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
