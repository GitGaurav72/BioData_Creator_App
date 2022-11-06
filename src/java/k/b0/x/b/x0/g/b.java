/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package k.b0.x.b.x0.g;

import e.e.a.a.a;
import k.b0.x.b.x0.g.c;
import k.b0.x.b.x0.g.e;

/*
 * Exception performing whole class analysis ignored.
 */
public final class b {
    public final c a;
    public final c b;
    public final boolean c;

    public b(c c2, c c3, boolean bl) {
        if (c2 != null) {
            this.a = c2;
            this.b = c3;
            this.c = bl;
            return;
        }
        b.a(1);
        throw null;
    }

    public b(c c2, e e2) {
        if (c2 != null) {
            if (e2 != null) {
                this(c2, c.k(e2), false);
                return;
            }
            b.a(4);
            throw null;
        }
        b.a(3);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static /* synthetic */ void a(int var0) {
        if (var0 != 5 && var0 != 6 && var0 != 7 && var0 != 9) {
            switch (var0) {
                default: {
                    var1_1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    ** break;
                }
                case 13: 
                case 14: 
                case 15: 
                case 16: 
            }
        }
        var1_1 = "@NotNull method %s.%s must not return null";
lbl8: // 2 sources:
        if (var0 != 5 && var0 != 6 && var0 != 7 && var0 != 9) {
            switch (var0) {
                default: {
                    var2_2 = 3;
                    ** break;
                }
                case 13: 
                case 14: 
                case 15: 
                case 16: 
            }
        }
        var2_2 = 2;
lbl15: // 2 sources:
        var3_3 = new Object[var2_2];
        switch (var0) {
            default: {
                var3_3[0] = "topLevelFqName";
                ** break;
            }
            case 11: 
            case 12: {
                var3_3[0] = "string";
                ** break;
            }
            case 10: {
                var3_3[0] = "segment";
                ** break;
            }
            case 8: {
                var3_3[0] = "name";
                ** break;
            }
            case 5: 
            case 6: 
            case 7: 
            case 9: 
            case 13: 
            case 14: 
            case 15: 
            case 16: {
                var3_3[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                ** break;
            }
            case 4: {
                var3_3[0] = "topLevelName";
                ** break;
            }
            case 2: {
                var3_3[0] = "relativeClassName";
                ** break;
            }
            case 1: 
            case 3: 
        }
        var3_3[0] = "packageFqName";
lbl40: // 8 sources:
        if (var0 != 5) {
            if (var0 != 6) {
                if (var0 != 7) {
                    if (var0 != 9) {
                        switch (var0) {
                            default: {
                                var3_3[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                                ** break;
                            }
                            case 15: 
                            case 16: {
                                var3_3[1] = "asFqNameString";
                                ** break;
                            }
                            case 13: 
                            case 14: 
                        }
                        var3_3[1] = "asString";
                        ** break;
lbl54: // 3 sources:
                    } else {
                        var3_3[1] = "asSingleFqName";
                    }
                } else {
                    var3_3[1] = "getShortClassName";
                }
            } else {
                var3_3[1] = "getRelativeClassName";
            }
        } else {
            var3_3[1] = "getPackageFqName";
        }
        switch (var0) {
            default: {
                var3_3[2] = "topLevel";
                break;
            }
            case 11: 
            case 12: {
                var3_3[2] = "fromString";
                break;
            }
            case 10: {
                var3_3[2] = "startsWith";
                break;
            }
            case 8: {
                var3_3[2] = "createNestedClassId";
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                var3_3[2] = "<init>";
            }
            case 5: 
            case 6: 
            case 7: 
            case 9: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
        }
        var4_4 = String.format((String)var1_1, (Object[])var3_3);
        if (var0 != 5 && var0 != 6 && var0 != 7 && var0 != 9) {
            switch (var0) {
                default: {
                    var5_5 = new IllegalArgumentException(var4_4);
                    throw var5_5;
                }
                case 13: 
                case 14: 
                case 15: 
                case 16: 
            }
        }
        var5_5 = new IllegalStateException(var4_4);
        throw var5_5;
    }

    public static b e(String string) {
        return b.f(string, false);
    }

    public static b f(String string, boolean bl) {
        if (string != null) {
            String string2;
            int n2 = string.lastIndexOf("/");
            if (n2 == -1) {
                string2 = "";
            } else {
                String string3 = string.substring(0, n2).replace('/', '.');
                string = string.substring(n2 + 1);
                string2 = string3;
            }
            return new b(new c(string2), new c(string), bl);
        }
        b.a(12);
        throw null;
    }

    public static b l(c c2) {
        if (c2 != null) {
            return new b(c2.e(), c2.g());
        }
        b.a(0);
        throw null;
    }

    public c b() {
        if (this.a.d()) {
            c c2 = this.b;
            if (c2 != null) {
                return c2;
            }
            b.a(9);
            throw null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.b());
        stringBuilder.append(".");
        stringBuilder.append(this.b.b());
        return new c(stringBuilder.toString());
    }

    public String c() {
        if (this.a.d()) {
            String string = this.b.b();
            if (string != null) {
                return string;
            }
            b.a(13);
            throw null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.b().replace('.', '/'));
        stringBuilder.append("/");
        stringBuilder.append(this.b.b());
        String string = stringBuilder.toString();
        if (string != null) {
            return string;
        }
        b.a(14);
        throw null;
    }

    public b d(e e2) {
        if (e2 != null) {
            return new b(this.h(), this.b.c(e2), this.c);
        }
        b.a(8);
        throw null;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (b.class != object.getClass()) {
                return false;
            }
            b b2 = (b)object;
            return this.a.equals(b2.a) && this.b.equals(b2.b) && this.c == b2.c;
        }
        return false;
    }

    public b g() {
        c c2 = this.b.e();
        if (c2.d()) {
            return null;
        }
        return new b(this.h(), c2, this.c);
    }

    public c h() {
        c c2 = this.a;
        if (c2 != null) {
            return c2;
        }
        b.a(5);
        throw null;
    }

    public int hashCode() {
        return 31 * (31 * this.a.hashCode() + this.b.hashCode()) + Boolean.valueOf((boolean)this.c).hashCode();
    }

    public c i() {
        c c2 = this.b;
        if (c2 != null) {
            return c2;
        }
        b.a(6);
        throw null;
    }

    public e j() {
        e e2 = this.b.g();
        if (e2 != null) {
            return e2;
        }
        b.a(7);
        throw null;
    }

    public boolean k() {
        return true ^ this.b.e().d();
    }

    public String toString() {
        if (this.a.d()) {
            StringBuilder stringBuilder = a.t((String)"/");
            stringBuilder.append(this.c());
            return stringBuilder.toString();
        }
        return this.c();
    }
}

