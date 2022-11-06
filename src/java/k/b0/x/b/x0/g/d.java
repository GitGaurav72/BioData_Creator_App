/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 *  java.util.regex.Pattern
 *  k.b0.x.b.x0.g.d$a
 *  k.x.b.l
 */
package k.b0.x.b.x0.g;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import k.b0.x.b.x0.g.c;
import k.b0.x.b.x0.g.d;
import k.b0.x.b.x0.g.e;
import k.x.b.l;
import k.x.c.i;

public final class d {
    public static final e a = e.n("<root>");
    public static final Pattern b = Pattern.compile((String)"\\.");
    public static final l<String, e> c = new a();
    public final String d;
    public transient c e;
    public transient d f;
    public transient e g;

    public d(String string) {
        if (string != null) {
            this.d = string;
            return;
        }
        d.a(2);
        throw null;
    }

    public d(String string, c c2) {
        if (string != null) {
            this.d = string;
            this.e = c2;
            return;
        }
        d.a(0);
        throw null;
    }

    public d(String string, d d2, e e2) {
        if (string != null) {
            this.d = string;
            this.f = d2;
            this.g = e2;
            return;
        }
        d.a(3);
        throw null;
    }

    public static /* synthetic */ void a(int n2) {
        String string;
        int n3;
        IllegalArgumentException illegalArgumentException;
        switch (n2) {
            default: {
                string = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 17: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 17: {
                n3 = 2;
            }
        }
        Object[] arrobject = new Object[n3];
        if (n2 != 1) {
            switch (n2) {
                default: {
                    arrobject[0] = "fqName";
                    break;
                }
                case 16: {
                    arrobject[0] = "shortName";
                    break;
                }
                case 15: {
                    arrobject[0] = "segment";
                    break;
                }
                case 9: {
                    arrobject[0] = "name";
                    break;
                }
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 10: 
                case 11: 
                case 12: 
                case 13: 
                case 14: 
                case 17: {
                    arrobject[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                }
            }
        } else {
            arrobject[0] = "safe";
        }
        switch (n2) {
            default: {
                arrobject[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            }
            case 17: {
                arrobject[1] = "toString";
                break;
            }
            case 14: {
                arrobject[1] = "pathSegments";
                break;
            }
            case 12: 
            case 13: {
                arrobject[1] = "shortNameOrSpecial";
                break;
            }
            case 10: 
            case 11: {
                arrobject[1] = "shortName";
                break;
            }
            case 7: 
            case 8: {
                arrobject[1] = "parent";
                break;
            }
            case 5: 
            case 6: {
                arrobject[1] = "toSafe";
                break;
            }
            case 4: {
                arrobject[1] = "asString";
            }
        }
        switch (n2) {
            default: {
                arrobject[2] = "<init>";
                break;
            }
            case 16: {
                arrobject[2] = "topLevel";
                break;
            }
            case 15: {
                arrobject[2] = "startsWith";
                break;
            }
            case 9: {
                arrobject[2] = "child";
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 17: 
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        switch (n2) {
            default: {
                illegalArgumentException = new IllegalArgumentException(string2);
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 17: {
                illegalArgumentException = new IllegalStateException(string2);
            }
        }
        throw illegalArgumentException;
    }

    public String b() {
        String string = this.d;
        if (string != null) {
            return string;
        }
        d.a(4);
        throw null;
    }

    public d c(e e2) {
        if (e2 != null) {
            String string;
            if (this.e()) {
                string = e2.e();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.d);
                stringBuilder.append(".");
                stringBuilder.append(e2.e());
                string = stringBuilder.toString();
            }
            return new d(string, this, e2);
        }
        d.a(9);
        throw null;
    }

    public final void d() {
        int n2 = this.d.lastIndexOf(46);
        if (n2 >= 0) {
            this.g = e.k(this.d.substring(n2 + 1));
            this.f = new d(this.d.substring(0, n2));
            return;
        }
        this.g = e.k(this.d);
        this.f = c.a.j();
    }

    public boolean e() {
        return this.d.isEmpty();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof d)) {
            return false;
        }
        d d2 = (d)object;
        return this.d.equals((Object)d2.d);
    }

    public boolean f() {
        return this.e != null || this.b().indexOf(60) < 0;
        {
        }
    }

    public List<e> g() {
        List list;
        if (this.e()) {
            list = Collections.emptyList();
        } else {
            String[] arrstring = b.split((CharSequence)this.d);
            l<String, e> l2 = c;
            i.e(arrstring, "<this>");
            i.e(l2, "transform");
            ArrayList arrayList = new ArrayList(arrstring.length);
            for (String string : arrstring) {
                arrayList.add(l2.invoke((Object)string));
            }
            list = arrayList;
        }
        if (list != null) {
            return list;
        }
        d.a(14);
        throw null;
    }

    public e h() {
        e e2 = this.g;
        if (e2 != null) {
            if (e2 != null) {
                return e2;
            }
            d.a(10);
            throw null;
        }
        if (!this.e()) {
            this.d();
            e e3 = this.g;
            if (e3 != null) {
                return e3;
            }
            d.a(11);
            throw null;
        }
        throw new IllegalStateException("root");
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public c i() {
        c c2;
        c c3 = this.e;
        if (c3 != null) {
            if (c3 != null) {
                return c3;
            }
            d.a(5);
            throw null;
        }
        this.e = c2 = new c(this);
        if (c2 != null) {
            return c2;
        }
        d.a(6);
        throw null;
    }

    public String toString() {
        String string = this.e() ? a.e() : this.d;
        if (string != null) {
            return string;
        }
        d.a(17);
        throw null;
    }
}

