package com.zunjae.anyme.rewrite.ui.bls;

import android.view.View;
import defpackage.cr;

final class f extends cr {
    final /* synthetic */ FragmentAnimeInfoBasicBL b;
    final /* synthetic */ FragmentAnimeInfoBasicBL_ViewBinding c;

    f(FragmentAnimeInfoBasicBL_ViewBinding fragmentAnimeInfoBasicBL_ViewBinding, FragmentAnimeInfoBasicBL fragmentAnimeInfoBasicBL) {
        this.c = fragmentAnimeInfoBasicBL_ViewBinding;
        this.b = fragmentAnimeInfoBasicBL;
    }

    public final void a(View view) {
        this.b.updateAnime();
    }
}
