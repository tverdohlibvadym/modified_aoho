package zhook.aohoc.aRoot;

/* loaded from: classes.dex */
public class b {
    int a;

    public b(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        return this.a == obj.hashCode();
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return "" + this.a;
    }
}
