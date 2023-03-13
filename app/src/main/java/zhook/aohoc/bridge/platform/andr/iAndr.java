package zhook.aohoc.bridge.platform.andr;

import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class iAndr implements DialogInterface.OnClickListener {
    final /* synthetic */ AndrInputProcessor a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public iAndr(AndrInputProcessor andrInputProcessor) {
        this.a = andrInputProcessor;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
    }
}
