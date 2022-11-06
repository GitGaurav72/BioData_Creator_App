/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package k.b0.x.b.x0.m.p1;

public class q {
    public static /* synthetic */ void a(int n2) {
        String string = n2 != 7 && n2 != 10 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        int n3 = n2 != 7 && n2 != 10 ? 3 : 2;
        Object[] arrobject = new Object[n3];
        switch (n2) {
            default: {
                arrobject[0] = "subtype";
                break;
            }
            case 22: {
                arrobject[0] = "supertypeArgumentProjection";
                break;
            }
            case 21: {
                arrobject[0] = "subtypeArgumentProjection";
                break;
            }
            case 16: {
                arrobject[0] = "typeArgumentVariance";
                break;
            }
            case 15: {
                arrobject[0] = "typeParameterVariance";
                break;
            }
            case 14: {
                arrobject[0] = "typeArgument";
                break;
            }
            case 13: {
                arrobject[0] = "typeParameter";
                break;
            }
            case 12: {
                arrobject[0] = "type2";
                break;
            }
            case 11: {
                arrobject[0] = "type1";
                break;
            }
            case 7: 
            case 10: {
                arrobject[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            }
            case 6: 
            case 9: {
                arrobject[0] = "argument";
                break;
            }
            case 5: 
            case 8: 
            case 23: {
                arrobject[0] = "parameter";
                break;
            }
            case 4: {
                arrobject[0] = "typeCheckingProcedureCallbacks";
                break;
            }
            case 1: 
            case 3: 
            case 18: 
            case 20: {
                arrobject[0] = "supertype";
            }
        }
        arrobject[1] = n2 != 7 ? (n2 != 10 ? "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure" : "getInType") : "getOutType";
        switch (n2) {
            default: {
                arrobject[2] = "findCorrespondingSupertype";
                break;
            }
            case 21: 
            case 22: 
            case 23: {
                arrobject[2] = "capture";
                break;
            }
            case 19: 
            case 20: {
                arrobject[2] = "checkSubtypeForTheSameConstructor";
                break;
            }
            case 17: 
            case 18: {
                arrobject[2] = "isSubtypeOf";
                break;
            }
            case 13: 
            case 14: 
            case 15: 
            case 16: {
                arrobject[2] = "getEffectiveProjectionKind";
                break;
            }
            case 11: 
            case 12: {
                arrobject[2] = "equalTypes";
                break;
            }
            case 8: 
            case 9: {
                arrobject[2] = "getInType";
                break;
            }
            case 5: 
            case 6: {
                arrobject[2] = "getOutType";
            }
            case 7: 
            case 10: 
        }
        String string2 = String.format((String)string, (Object[])arrobject);
        Object object = n2 != 7 && n2 != 10 ? new IllegalArgumentException(string2) : new IllegalStateException(string2);
        throw object;
    }
}

