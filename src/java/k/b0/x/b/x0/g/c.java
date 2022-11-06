/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Objects
 */
package k.b0.x.b.x0.g;

import java.util.List;
import java.util.Objects;
import k.b0.x.b.x0.g.d;
import k.b0.x.b.x0.g.e;

public final class c {
    public static final c a = new c("");
    public final d b;
    public transient c c;

    public c(String string) {
        if (string != null) {
            this.b = new d(string, this);
            return;
        }
        c.a(1);
        throw null;
    }

    public c(d d2) {
        this.b = d2;
    }

    public c(d d2, c c2) {
        this.b = d2;
        this.c = c2;
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
            case 9: 
            case 10: 
            case 11: {
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
            case 9: 
            case 10: 
            case 11: {
                n3 = 2;
            }
        }
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "names";
                break;
            }
            case 13: {
                arrobject[0] = "shortName";
                break;
            }
            case 12: {
                arrobject[0] = "segment";
                break;
            }
            case 8: {
                arrobject[0] = "name";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 9: 
            case 10: 
            case 11: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            }
            case 1: 
            case 2: 
            case 3: {
                arrobject[0] = "fqName";
            }
        }
        switch (n2) {
            default: {
                arrobject[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            }
            case 11: {
                arrobject[1] = "pathSegments";
                break;
            }
            case 10: {
                arrobject[1] = "shortNameOrSpecial";
                break;
            }
            case 9: {
                arrobject[1] = "shortName";
                break;
            }
            case 6: 
            case 7: {
                arrobject[1] = "parent";
                break;
            }
            case 5: {
                arrobject[1] = "toUnsafe";
                break;
            }
            case 4: {
                arrobject[1] = "asString";
            }
        }
        switch (n2) {
            default: {
                arrobject[2] = "fromSegments";
                break;
            }
            case 13: {
                arrobject[2] = "topLevel";
                break;
            }
            case 12: {
                arrobject[2] = "startsWith";
                break;
            }
            case 8: {
                arrobject[2] = "child";
                break;
            }
            case 1: 
            case 2: 
            case 3: {
                arrobject[2] = "<init>";
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 9: 
            case 10: 
            case 11: 
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
            case 9: 
            case 10: 
            case 11: {
                illegalArgumentException = new IllegalStateException(string2);
            }
        }
        throw illegalArgumentException;
    }

    public static c k(e e2) {
        if (e2 != null) {
            if (e2 != null) {
                return new c(new d(e2.e(), a.j(), e2));
            }
            d.a(16);
            throw null;
        }
        c.a(13);
        throw null;
    }

    public String b() {
        String string = this.b.b();
        if (string != null) {
            return string;
        }
        c.a(4);
        throw null;
    }

    public c c(e e2) {
        if (e2 != null) {
            return new c(this.b.c(e2), this);
        }
        c.a(8);
        throw null;
    }

    public boolean d() {
        return this.b.e();
    }

    public c e() {
        block6 : {
            block8 : {
                block9 : {
                    d d2;
                    c c2;
                    block7 : {
                        c c3 = this.c;
                        if (c3 != null) {
                            if (c3 != null) {
                                return c3;
                            }
                            c.a(6);
                            throw null;
                        }
                        if (this.d()) break block6;
                        d d3 = this.b;
                        d2 = d3.f;
                        if (d2 != null) break block7;
                        if (d3.e()) break block8;
                        d3.d();
                        d2 = d3.f;
                        if (d2 == null) break block9;
                    }
                    this.c = c2 = new c(d2);
                    if (c2 != null) {
                        return c2;
                    }
                    c.a(7);
                    throw null;
                }
                d.a(8);
                throw null;
            }
            throw new IllegalStateException("root");
        }
        throw new IllegalStateException("root");
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        c c2 = (c)object;
        return this.b.equals(c2.b);
    }

    public List<e> f() {
        List<e> list = this.b.g();
        if (list != null) {
            return list;
        }
        c.a(11);
        throw null;
    }

    public e g() {
        e e2 = this.b.h();
        if (e2 != null) {
            return e2;
        }
        c.a(9);
        throw null;
    }

    public e h() {
        d d2 = this.b;
        if (d2.e()) {
            e e2 = d.a;
            if (e2 != null) {
                return e2;
            }
            d.a(12);
            throw null;
        }
        e e3 = d2.h();
        if (e3 != null) {
            return e3;
        }
        d.a(13);
        throw null;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public boolean i(e e2) {
        if (e2 != null) {
            d d2 = this.b;
            Objects.requireNonNull((Object)d2);
            if (e2 != null) {
                if (d2.e()) {
                    return false;
                }
                int n2 = d2.d.indexOf(46);
                String string = d2.d;
                String string2 = e2.e();
                if (n2 == -1) {
                    n2 = d2.d.length();
                }
                return string.regionMatches(0, string2, 0, n2);
            }
            d.a(15);
            throw null;
        }
        c.a(12);
        throw null;
    }

    public d j() {
        d d2 = this.b;
        if (d2 != null) {
            return d2;
        }
        c.a(5);
        throw null;
    }

    public String toString() {
        return this.b.toString();
    }
}

