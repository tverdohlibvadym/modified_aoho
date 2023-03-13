package zhook.aohoc.bridge.platform.andr;

import android.content.DialogInterface;
import zhook.aohoc.aRoot.aPackage.aAClassPackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class hAndr implements DialogInterface.OnClickListener {
    final /* synthetic */ AndrInputProcessor a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public hAndr(AndrInputProcessor andrInputProcessor) {
        this.a = andrInputProcessor;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        aAClassPackage aAClassPackageVar;
        aAClassPackage aAClassPackageVar2;
        aAClassPackageVar = this.a.aAClassPackage;
        aAClassPackageVar.Q.a("");
        try {
            aAClassPackageVar2 = this.a.aAClassPackage;
            aAClassPackageVar2.Q.a(1);
            this.a.c();
        } catch (Throwable th) {
        }
        this.a.o = false;
    }
}
