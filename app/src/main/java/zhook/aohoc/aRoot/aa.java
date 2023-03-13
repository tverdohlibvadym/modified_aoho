package zhook.aohoc.aRoot;

import zhook.aohoc.aRoot.aPackage.aAClassPackage;

/* loaded from: classes.dex */
public class aa {
    public final Object a = new Object();
    public final Object b = new Object();
    public final Object c = new Object();
    public final Object d = new Object();
    public final Object e = new Object();
    public final Object f = new Object();
    public final Object g = new Object();
    public final Object h = new Object();
    public aAClassPackage i;
    public i j;

    public aa(aAClassPackage aAClassPackageVar) {
        this.i = aAClassPackageVar;
        this.j = aAClassPackageVar.d;
    }

    void a() {
        synchronized (this.h) {
            this.h.notifyAll();
        }
    }

    public void b() {
        synchronized (this.b) {
            this.b.notifyAll();
        }
    }

    public void c() throws InterruptedException {
        synchronized (this.b) {
            if (this.j.a > 0) {
                y.a("****** _waitWhileLoading : BEGIN " + this.j.b + " / " + this.j.a);
                this.b.wait();
                y.a("****** _waitWhileLoading : END " + this.j.b + " / " + this.j.a);
            }
        }
    }

    public void d() {
        synchronized (this.a) {
            this.a.notifyAll();
        }
    }

    public void e() throws InterruptedException {
        synchronized (this.a) {
            this.a.wait();
        }
    }

    public void f() {
        synchronized (this.d) {
            this.d.notifyAll();
        }
    }

    public void g() throws InterruptedException {
        synchronized (this.d) {
            this.d.wait();
        }
    }

    public void h() {
        synchronized (this.e) {
            this.e.notifyAll();
        }
    }

    public void i() throws InterruptedException {
        synchronized (this.e) {
            this.e.wait();
        }
    }

    public void j() {
        synchronized (this.f) {
            this.f.notifyAll();
        }
    }

    public void k() throws InterruptedException {
        synchronized (this.f) {
            this.f.wait();
        }
    }

    public void l() {
        synchronized (this.c) {
            this.c.notifyAll();
        }
    }

    public void m() throws InterruptedException {
        synchronized (this.c) {
            if (this.i.h.s != 0) {
                this.c.wait();
            }
        }
    }

    public void n() {
        h();
        f();
        j();
        d();
        l();
        b();
        a();
    }
}
