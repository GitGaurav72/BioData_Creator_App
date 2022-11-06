/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.e.a.a.a
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.InetAddress
 *  java.net.InetSocketAddress
 *  java.net.Proxy
 *  java.net.Proxy$Type
 *  java.net.Socket
 *  java.net.SocketAddress
 *  java.net.SocketException
 *  java.net.UnknownHostException
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.NoSuchElementException
 *  java.util.Objects
 *  java.util.Set
 *  java.util.concurrent.ConcurrentLinkedQueue
 *  k.s.i
 *  m.m0.g.e
 *  m.m0.g.i
 *  m.m0.g.j$a
 *  m.m0.j.u
 *  m.t
 *  m.u
 *  m.z
 */
package m.m0.g;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import m.a;
import m.c0;
import m.f;
import m.k0;
import m.l;
import m.m0.c;
import m.m0.g.e;
import m.m0.g.i;
import m.m0.g.j;
import m.m0.g.k;
import m.m0.g.m;
import m.m0.j.b;
import m.t;
import m.u;
import m.z;

public final class d {
    public m.a a;
    public m b;
    public int c;
    public int d;
    public int e;
    public k0 f;
    public final j g;
    public final a h;
    public final e i;
    public final u j;

    public d(j j2, a a2, e e2, u u2) {
        k.x.c.i.e(j2, "connectionPool");
        k.x.c.i.e(a2, "address");
        k.x.c.i.e((Object)e2, "call");
        k.x.c.i.e((Object)u2, "eventListener");
        this.g = j2;
        this.h = a2;
        this.i = e2;
        this.j = u2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final i a(int var1_1, int var2_2, int var3_3, int var4_4, boolean var5_5, boolean var6_6) {
        while (this.i.w == false) {
            block41 : {
                block42 : {
                    block37 : {
                        block40 : {
                            block39 : {
                                block38 : {
                                    block35 : {
                                        block36 : {
                                            var7_7 = this.i.q;
                                            var8_8 = 1;
                                            if (var7_7 == null) break block35;
                                            var87_54 = var7_7;
                                            // MONITORENTER : var87_54
                                            var82_50 /* !! */  = var7_7.i != false || this.b(var7_7.q.a.a) == false ? this.i.l() : null;
                                            // MONITOREXIT : var87_54
                                            if (this.i.q == null) break block36;
                                            var83_51 = 0;
                                            if (var82_50 /* !! */  == null) {
                                                var83_51 = var8_8;
                                            }
                                            if (var83_51 == 0) throw new IllegalStateException("Check failed.".toString());
                                            ** GOTO lbl166
                                        }
                                        if (var82_50 /* !! */  != null) {
                                            c.e(var82_50 /* !! */ );
                                        }
                                        var84_52 = this.j;
                                        var85_53 = this.i;
                                        Objects.requireNonNull((Object)var84_52);
                                        k.x.c.i.e((Object)var85_53, "call");
                                        k.x.c.i.e((Object)var7_7, "connection");
                                    }
                                    this.c = 0;
                                    this.d = 0;
                                    this.e = 0;
                                    if (this.g.a(this.h, this.i, null, false)) break block37;
                                    var9_9 = this.f;
                                    if (var9_9 == null) break block38;
                                    k.x.c.i.c(var9_9);
                                    this.f = null;
                                    break block39;
                                }
                                var10_10 = this.a;
                                if (var10_10 == null) break block40;
                                k.x.c.i.c(var10_10);
                                if (!var10_10.a()) break block40;
                                var80_49 = this.a;
                                k.x.c.i.c(var80_49);
                                var9_9 = var80_49.b();
                            }
                            var14_14 = null;
                            break block41;
                        }
                        if ((var11_11 = this.b) == null) {
                            var78_47 = this.h;
                            var79_48 = this.i;
                            this.b = var11_11 = new m(var78_47, var79_48.z.L, (f)var79_48, this.j);
                        }
                        if (var11_11.a() == false) throw new NoSuchElementException();
                        var12_12 = new ArrayList();
                        while (var11_11.b()) {
                            if (!var11_11.b()) {
                                var33_61 = e.e.a.a.a.t((String)"No route to ");
                                var33_61.append(var11_11.e.a.g);
                                var33_61.append("; exhausted proxy configurations: ");
                                var33_61.append(var11_11.a);
                                throw new SocketException(var33_61.toString());
                            }
                            var37_25 = var11_11.a;
                            var38_26 = var11_11.b;
                            var11_11.b = var38_26 + 1;
                            var39_27 = (Proxy)var37_25.get(var38_26);
                            var11_11.c = var40_28 = new ArrayList();
                            if (var39_27.type() != Proxy.Type.DIRECT && var39_27.type() != Proxy.Type.SOCKS) {
                                var72_43 = var39_27.address();
                                if (!(var72_43 instanceof InetSocketAddress)) {
                                    var73_58 = e.e.a.a.a.t((String)"Proxy.address() is not an InetSocketAddress: ");
                                    var73_58.append((Object)var72_43.getClass());
                                    throw new IllegalArgumentException(var73_58.toString().toString());
                                }
                                var75_44 = (InetSocketAddress)var72_43;
                                k.x.c.i.e((Object)var75_44, "$this$socketHost");
                                var76_45 = var75_44.getAddress();
                                if (var76_45 != null) {
                                    var42_30 = var76_45.getHostAddress();
                                    var77_46 = "address.hostAddress";
                                } else {
                                    var42_30 = var75_44.getHostName();
                                    var77_46 = "hostName";
                                }
                                k.x.c.i.d(var42_30, var77_46);
                                var43_31 = var75_44.getPort();
                            } else {
                                var41_29 = var11_11.e.a;
                                var42_30 = var41_29.g;
                                var43_31 = var41_29.h;
                            }
                            if (var8_8 <= var43_31 && 65535 >= var43_31) {
                                if (var39_27.type() == Proxy.Type.SOCKS) {
                                    var40_28.add((Object)InetSocketAddress.createUnresolved((String)var42_30, (int)var43_31));
                                } else {
                                    var50_32 = var11_11.h;
                                    var51_33 = var11_11.g;
                                    Objects.requireNonNull((Object)var50_32);
                                    k.x.c.i.e(var51_33, "call");
                                    k.x.c.i.e(var42_30, "domainName");
                                    var53_34 = var11_11.e.d.a(var42_30);
                                    if (var53_34.isEmpty()) {
                                        var54_59 = new StringBuilder();
                                        var54_59.append((Object)var11_11.e.d);
                                        var54_59.append(" returned no addresses for ");
                                        var54_59.append(var42_30);
                                        throw new UnknownHostException(var54_59.toString());
                                    }
                                    var58_35 = var11_11.h;
                                    var59_36 = var11_11.g;
                                    Objects.requireNonNull((Object)var58_35);
                                    k.x.c.i.e(var59_36, "call");
                                    k.x.c.i.e(var42_30, "domainName");
                                    k.x.c.i.e((Object)var53_34, "inetAddressList");
                                    var61_37 = var53_34.iterator();
                                    while (var61_37.hasNext()) {
                                        var40_28.add((Object)new InetSocketAddress((InetAddress)var61_37.next(), var43_31));
                                    }
                                }
                                var62_38 = var11_11.c.iterator();
                            } else {
                                var44_60 = new StringBuilder();
                                var44_60.append("No route to ");
                                var44_60.append(var42_30);
                                var44_60.append(':');
                                var44_60.append(var43_31);
                                var44_60.append("; port is out of range");
                                throw new SocketException(var44_60.toString());
                            }
                            while (var62_38.hasNext()) {
                                var63_39 = (InetSocketAddress)var62_38.next();
                                var64_40 = new k0(var11_11.e, var39_27, var63_39);
                                var88_55 = var65_41 = var11_11.f;
                                // MONITORENTER : var88_55
                                k.x.c.i.e(var64_40, "route");
                                var67_42 = var65_41.a.contains((Object)var64_40);
                                // MONITOREXIT : var88_55
                                if (var67_42) {
                                    var11_11.d.add((Object)var64_40);
                                    continue;
                                }
                                var12_12.add((Object)var64_40);
                            }
                            if ((var8_8 ^ var12_12.isEmpty()) == 0) continue;
                        }
                        if (var12_12.isEmpty()) {
                            k.s.i.b((Collection)var12_12, var11_11.d);
                            var11_11.d.clear();
                        }
                        this.a = var13_13 = new m.a((List<k0>)var12_12);
                        var14_14 = var13_13.b;
                        if (this.i.w != false) throw new IOException("Canceled");
                        if (!this.g.a(this.h, this.i, var14_14, false)) break block42;
                    }
                    var30_23 = this.i.q;
                    k.x.c.i.c((Object)var30_23);
                    ** GOTO lbl164
                }
                var9_9 = var13_13.b();
            }
            this.i.y = var15_15 = new i(this.g, var9_9);
            var15_15.c(var1_1, var2_2, var3_3, var4_4, var5_5, (f)this.i, this.j);
            var17_16 = this.i.z.L;
            var18_17 = var15_15.q;
            var89_56 = var17_16;
            k.x.c.i.e(var18_17, "route");
            var17_16.a.remove((Object)var18_17);
            // MONITOREXIT : var89_56
            if (this.g.a(this.h, this.i, var14_14, (boolean)var8_8)) {
                var30_23 = this.i.q;
                k.x.c.i.c((Object)var30_23);
                this.f = var9_9;
                var31_24 = var15_15.c;
                k.x.c.i.c((Object)var31_24);
                c.e(var31_24);
lbl164: // 2 sources:
                var7_7 = var30_23;
                this.j.a((f)this.i, (l)var7_7);
lbl166: // 2 sources:
                var26_19 = var6_6;
            } else {
                var90_57 = var15_15;
                // MONITORENTER : var90_57
                var22_18 = this.g;
                Objects.requireNonNull((Object)var22_18);
                k.x.c.i.e((Object)var15_15, "connection");
                var22_18.d.add((Object)var15_15);
                var22_18.b.c((m.m0.f.a)var22_18.c, 0L);
                this.i.b(var15_15);
                // MONITOREXIT : var90_57
                this.j.a((f)this.i, (l)var15_15);
                var26_19 = var6_6;
                var7_7 = var15_15;
            }
            if (var7_7.i(var26_19)) {
                return var7_7;
            }
            var7_7.l();
            if (this.f != null || (var28_21 = (var27_20 = this.a) != null ? var27_20.a() : var8_8) != 0) continue;
            var29_22 = this.b;
            if (var29_22 != null) {
                var8_8 = var29_22.a();
            }
            if (var8_8 == 0) throw new IOException("exhausted all routes");
        }
        throw new IOException("Canceled");
        finally {
            this.i.y = null;
        }
    }

    public final boolean b(z z2) {
        k.x.c.i.e((Object)z2, "url");
        z z3 = this.h.a;
        return z2.h == z3.h && k.x.c.i.a(z2.g, z3.g);
    }

    public final void c(IOException iOException) {
        k.x.c.i.e((Object)iOException, "e");
        this.f = null;
        if (iOException instanceof m.m0.j.u && ((m.m0.j.u)iOException).k == b.o) {
            this.c = 1 + this.c;
            return;
        }
        if (iOException instanceof m.m0.j.a) {
            this.d = 1 + this.d;
            return;
        }
        this.e = 1 + this.e;
    }
}

