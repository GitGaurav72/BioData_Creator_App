/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Comparable
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package k.b0.x.b.x0.g;

import e.e.a.a.a;

public final class e
implements Comparable<e> {
    public final String k;
    public final boolean l;

    public e(String string, boolean bl) {
        if (string != null) {
            this.k = string;
            this.l = bl;
            return;
        }
        e.b(0);
        throw null;
    }

    public static /* synthetic */ void b(int n2) {
        String string = n2 != 1 && n2 != 2 && n2 != 3 && n2 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        int n3 = n2 != 1 && n2 != 2 && n2 != 3 && n2 != 4 ? 3 : 2;
        Object[] arrobject = new Object[n3];
        arrobject[0] = n2 != 1 && n2 != 2 && n2 != 3 && n2 != 4 ? "name" : "kotlin/reflect/jvm/internal/impl/name/Name";
        arrobject[1] = n2 != 1 ? (n2 != 2 ? (n2 != 3 && n2 != 4 ? "kotlin/reflect/jvm/internal/impl/name/Name" : "asStringStripSpecialMarkers") : "getIdentifier") : "asString";
        switch (n2) {
            default: {
                arrobject[2] = "<init>";
                break;
            }
            case 8: {
                arrobject[2] = "guessByFirstCharacter";
                break;
            }
            case 7: {
                arrobject[2] = "special";
                break;
            }
            case 6: {
                arrobject[2] = "isValidIdentifier";
                break;
            }
            case 5: {
                arrobject[2] = "identifier";
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        Object object = n2 != 1 && n2 != 2 && n2 != 3 && n2 != 4 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
        throw object;
    }

    public static e k(String string) {
        if (string != null) {
            if (string.startsWith("<")) {
                return e.n(string);
            }
            return e.l(string);
        }
        e.b(8);
        throw null;
    }

    public static e l(String string) {
        if (string != null) {
            return new e(string, false);
        }
        e.b(5);
        throw null;
    }

    public static boolean m(String string) {
        if (string != null) {
            if (!string.isEmpty()) {
                if (string.startsWith("<")) {
                    return false;
                }
                for (int i2 = 0; i2 < string.length(); ++i2) {
                    char c2 = string.charAt(i2);
                    if (c2 != '.' && c2 != '/') {
                        if (c2 != '\\') continue;
                        return false;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        e.b(6);
        throw null;
    }

    public static e n(String string) {
        if (string != null) {
            if (string.startsWith("<")) {
                return new e(string, true);
            }
            throw new IllegalArgumentException(a.l((String)"special name must start with '<': ", (String)string));
        }
        e.b(7);
        throw null;
    }

    public int compareTo(Object object) {
        e e2 = (e)object;
        return this.k.compareTo(e2.k);
    }

    public String e() {
        String string = this.k;
        if (string != null) {
            return string;
        }
        e.b(1);
        throw null;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof e)) {
            return false;
        }
        e e2 = (e)object;
        if (this.l != e2.l) {
            return false;
        }
        return this.k.equals((Object)e2.k);
    }

    public String h() {
        if (!this.l) {
            String string = this.e();
            if (string != null) {
                return string;
            }
            e.b(2);
            throw null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("not identifier: ");
        stringBuilder.append((Object)this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public int hashCode() {
        return 31 * this.k.hashCode() + this.l;
    }

    public String toString() {
        return this.k;
    }
}

