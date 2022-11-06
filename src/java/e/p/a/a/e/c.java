/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  e.g.a.p.j
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Set
 *  java.util.regex.Pattern
 */
package e.p.a.a.e;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.g.a.p.j;
import e.p.a.a.a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public final class c {
    public static final String a = j.x((String)"hts/frbslgiggolai.o/0clgbthfra=snpoo", (String)"tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
    public static final String b = j.x((String)"hts/frbslgigp.ogepscmv/ieo/eaybtho", (String)"tp:/ieaeogn-agolai.o/1frlglgc/aclg");
    public static final String c = j.x((String)"AzSCki82AwsLzKd5O8zo", (String)"IayckHiZRO1EFl1aGoK");
    public static final Set<a> d;
    @NonNull
    public final String e;
    @Nullable
    public final String f;

    public static {
        Object[] arrobject = new a[]{new a("proto"), new a("json")};
        d = Collections.unmodifiableSet((Set)new HashSet((Collection)Arrays.asList((Object[])arrobject)));
    }

    public c(@NonNull String string, @Nullable String string2) {
        this.e = string;
        this.f = string2;
    }

    @NonNull
    public static c a(@NonNull byte[] arrby) {
        String string = new String(arrby, Charset.forName((String)"UTF-8"));
        if (string.startsWith("1$")) {
            String[] arrstring = string.substring(2).split(Pattern.quote((String)"\\"), 2);
            if (arrstring.length == 2) {
                String string2 = arrstring[0];
                if (!string2.isEmpty()) {
                    String string3 = arrstring[1];
                    if (string3.isEmpty()) {
                        string3 = null;
                    }
                    return new c(string2, string3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Nullable
    public byte[] b() {
        String string = this.f;
        if (string == null && this.e == null) {
            return null;
        }
        Object[] arrobject = new Object[4];
        arrobject[0] = "1$";
        arrobject[1] = this.e;
        arrobject[2] = "\\";
        if (string == null) {
            string = "";
        }
        arrobject[3] = string;
        return String.format((String)"%s%s%s%s", (Object[])arrobject).getBytes(Charset.forName((String)"UTF-8"));
    }
}

