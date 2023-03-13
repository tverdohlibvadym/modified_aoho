package zhook.aohoc.aRoot;

/* loaded from: classes.dex */
public class m {
    public int a = 0;
    public l b;
    public l c;

    public void a() {
        this.a = 0;
        this.b = null;
        this.c = null;
    }

    public void a(l lVar) {
        l lVar2;
        l lVar3 = null;
        if (lVar == null) {
            return;
        }
        lVar.b();
        int i = lVar.q;
        l lVar4 = this.b;
        while (true) {
            if (lVar4 == null) {
                lVar2 = null;
                break;
            } else if (lVar4.q >= i) {
                lVar3 = lVar4.E;
                lVar2 = lVar4;
                break;
            } else {
                lVar4 = lVar4.F;
            }
        }
        if (lVar4 == null) {
            lVar3 = this.c;
        }
        a(lVar, lVar3, lVar2);
    }

    public void a(l lVar, l lVar2, l lVar3) {
        if (lVar == null) {
            return;
        }
        if (lVar2 != null) {
            lVar2.F = lVar;
        } else {
            this.b = lVar;
        }
        if (lVar3 != null) {
            lVar3.E = lVar;
        } else {
            this.c = lVar;
        }
        lVar.E = lVar2;
        lVar.F = lVar3;
        this.a++;
    }

    public void b(l lVar) {
        if (lVar == null) {
            return;
        }
        l lVar2 = lVar.E;
        l lVar3 = lVar.F;
        if (lVar2 != null) {
            lVar2.F = lVar3;
        } else {
            this.b = lVar3;
        }
        if (lVar3 != null) {
            lVar3.E = lVar2;
        } else {
            this.c = lVar2;
        }
        this.a--;
        lVar.E = null;
        lVar.F = null;
    }

    public void c(l lVar) {
        boolean z = false;
        if (lVar == null) {
            return;
        }
        l lVar2 = lVar.E;
        l lVar3 = lVar.F;
        lVar.b();
        int i = lVar.q;
        boolean z2 = lVar2 == null || lVar2.q <= i;
        if (lVar3 == null || lVar3.q >= i) {
            z = true;
        }
        if (z2 && z) {
            return;
        }
        b(lVar);
        if (z2) {
            while (lVar3 != null && lVar3.q < i) {
                lVar2 = lVar3;
                lVar3 = lVar3.F;
            }
            a(lVar, lVar2, lVar3);
            return;
        }
        while (lVar2 != null && lVar2.q > i) {
            l lVar4 = lVar2;
            lVar2 = lVar2.E;
            lVar3 = lVar4;
        }
        a(lVar, lVar2, lVar3);
    }
}
