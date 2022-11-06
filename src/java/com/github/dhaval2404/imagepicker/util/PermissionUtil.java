/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  androidx.core.content.ContextCompat
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  k.x.c.i
 *  kotlin.Metadata
 */
package com.github.dhaval2404.imagepicker.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import k.x.c.i;
import kotlin.Metadata;

@Metadata(bv={1, 0, 3}, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\r\u0010\b\u00a8\u0006\u0010"}, d2={"Lcom/github/dhaval2404/imagepicker/util/PermissionUtil;", "", "Landroid/content/Context;", "context", "", "permission", "", "hasPermission", "(Landroid/content/Context;Ljava/lang/String;)Z", "", "permissions", "isPermissionGranted", "(Landroid/content/Context;[Ljava/lang/String;)Z", "isPermissionInManifest", "<init>", "()V", "imagepicker_release"}, k=1, mv={1, 4, 0})
public final class PermissionUtil {
    public static final PermissionUtil INSTANCE = new PermissionUtil();

    private PermissionUtil() {
    }

    private final boolean hasPermission(Context context, String string2) {
        return ContextCompat.checkSelfPermission((Context)context, (String)string2) == 0;
    }

    public final boolean isPermissionGranted(Context context, String[] arrstring) {
        i.f((Object)context, (String)"context");
        i.f((Object)arrstring, (String)"permissions");
        ArrayList arrayList = new ArrayList();
        int n2 = arrstring.length;
        for (int k = 0; k < n2; ++k) {
            String string2 = arrstring[k];
            if (!INSTANCE.hasPermission(context, string2)) continue;
            arrayList.add((Object)string2);
        }
        int n3 = arrayList.size();
        int n4 = arrstring.length;
        boolean bl = false;
        if (n3 == n4) {
            bl = true;
        }
        return bl;
    }

    public final boolean isPermissionInManifest(Context context, String string2) {
        boolean bl;
        i.f((Object)context, (String)"context");
        i.f((Object)string2, (String)"permission");
        String[] arrstring = context.getPackageManager().getPackageInfo((String)context.getPackageName(), (int)4096).requestedPermissions;
        boolean bl2 = arrstring == null || (bl = arrstring.length == 0);
        if (bl2) {
            return false;
        }
        int n2 = arrstring.length;
        for (int k = 0; k < n2; ++k) {
            if (!i.a((Object)arrstring[k], (Object)string2)) continue;
            return true;
        }
        return false;
    }
}

