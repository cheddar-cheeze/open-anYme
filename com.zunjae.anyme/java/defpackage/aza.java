package defpackage;

final /* synthetic */ class aza {
    static final /* synthetic */ int[] a = new int[azb.a().length];

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r0 = defpackage.azb.a();
        r0 = r0.length;
        r0 = new int[r0];
        a = r0;
        r0 = 1;
        r1 = a;	 Catch:{ NoSuchFieldError -> 0x0011 }
        r2 = defpackage.azb.a;	 Catch:{ NoSuchFieldError -> 0x0011 }
        r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
    L_0x0011:
        r1 = a;	 Catch:{ NoSuchFieldError -> 0x0019 }
        r2 = defpackage.azb.b;	 Catch:{ NoSuchFieldError -> 0x0019 }
        r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
        r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
        r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
    L_0x0019:
        r1 = a;	 Catch:{ NoSuchFieldError -> 0x0021 }
        r2 = defpackage.azb.c;	 Catch:{ NoSuchFieldError -> 0x0021 }
        r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
        r3 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
        r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0021 }
    L_0x0021:
        r1 = a;	 Catch:{ NoSuchFieldError -> 0x0029 }
        r2 = defpackage.azb.d;	 Catch:{ NoSuchFieldError -> 0x0029 }
        r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
        r0 = 4;	 Catch:{ NoSuchFieldError -> 0x0029 }
        r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
    L_0x0029:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: aza.<clinit>():void");
    }
}
