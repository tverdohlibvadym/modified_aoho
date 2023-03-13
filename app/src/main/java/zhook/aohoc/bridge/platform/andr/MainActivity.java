package zhook.aohoc.bridge.platform.andr;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatActivity;
import zhook.aohoc.bridge.aBridgeA;
import zhook.aohoc.bridge.platform.bPlatform;

/* loaded from: classes.dex */
public class MainActivity extends Activity {
    public static MainActivity a = new MainActivity();
    public static String b = "aoh_revival";


    @SuppressLint("ResourceType")
    private void b() {
        a = this;
        aBridgeA.a(bPlatform.b);
        setContentView(R.layout.main);
        aBridgeA.a().e();
    }

    public int a() {
        return getResources().getConfiguration().orientation;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        requestWindowFeature(2);;
        //setContentView(R.layout.main);

        System.out.println("$$$$$$$$ AOHOActivity : onCreate()");
        if (!isTaskRoot()) {
            Intent intent = getIntent();
            String action = intent.getAction();
            if (intent.hasCategory("android.intent.category.LAUNCHER") && action != null && action.equals("android.intent.action.MAIN")) {
                finish();
                return;
            }
        }
        a = this;
        getWindow().setFlags(1024, 1024);
        b = getString(R.string.app_store);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        System.out.println("$$$$$$$$ AOHOActivity : onDestroy()");
        try {
            if ( aBridgeA.a() != null) {
                aBridgeA.a().a(true);
            }
            super.onDestroy();
        } catch (Exception e) {
            throw new RuntimeException("unable to destroy", e);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        System.out.println("$$$$$$$$ AOHOActivity : onPause()");
        try {
            if ( aBridgeA.a() != null) {
                aBridgeA.a().f();
            }
            super.onPause();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("unable to freeze", e);
        }
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        System.out.println("$$$$$$$$ AOHOActivity : onRestart()");
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        System.out.println("$$$$$$$$ AOHOActivity : onResume()");
        if ( aBridgeA.a() == null) {
            b();
        }
        try {
            if ( aBridgeA.a() != null) {
                aBridgeA.a().g();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("unable to resume", e);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        System.out.println("$$$$$$$$ AOHOActivity : onStop()");
        if ( aBridgeA.a() == null) {
            onDestroy();
        } else {
            super.onStop();
        }
    }
}
