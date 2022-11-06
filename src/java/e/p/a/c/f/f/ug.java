/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.util.Log
 *  e.p.a.c.b.a
 *  e.p.a.c.c.p.a
 *  e.p.a.c.c.p.d
 *  java.lang.Object
 *  java.lang.String
 */
package e.p.a.c.f.f;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import e.p.a.c.c.p.a;
import e.p.a.c.c.p.d;

public final class ug {
    public final String a;
    public final String b;

    public ug(Context context, String string) {
        byte[] arrby;
        block2 : {
            e.p.a.c.b.a.t((String)string);
            this.a = string;
            try {
                arrby = a.a((Context)context, (String)string);
                if (arrby != null) break block2;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                Log.e((String)"FBA-PackageInfo", (String)"no pkg: ".concat(String.valueOf((Object)string)));
                this.b = null;
                return;
            }
            Log.e((String)"FBA-PackageInfo", (String)"single cert required: ".concat(String.valueOf((Object)string)));
            this.b = null;
            return;
        }
        this.b = d.a((byte[])arrby, (boolean)false);
    }
}

