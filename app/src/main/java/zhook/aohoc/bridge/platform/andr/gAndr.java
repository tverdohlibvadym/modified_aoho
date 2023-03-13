package zhook.aohoc.bridge.platform.andr;

import android.content.DialogInterface;
import android.widget.EditText;
import zhook.aohoc.aRoot.aPackage.aAClassPackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class gAndr implements DialogInterface.OnClickListener {
    final /* synthetic */ EditText a;
    final /* synthetic */ AndrInputProcessor b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gAndr(AndrInputProcessor andrInputProcessor, EditText editText) {
        this.b = andrInputProcessor;
        this.a = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        aAClassPackage aAClassPackageVar;
        aAClassPackage aAClassPackageVar2;
        aAClassPackageVar = this.b.aAClassPackage;
        aAClassPackageVar.Q.a(this.a.getText().toString());
        try {
            aAClassPackageVar2 = this.b.aAClassPackage;
            aAClassPackageVar2.Q.a(0);
            this.b.c();
        } catch (Throwable th) {
        }
        this.b.o = false;
    }
}
