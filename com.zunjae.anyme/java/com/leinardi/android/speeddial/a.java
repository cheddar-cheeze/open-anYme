package com.leinardi.android.speeddial;

import android.view.View;
import android.view.View.OnClickListener;

final class a implements OnClickListener {
    final /* synthetic */ FabWithLabelView a;

    a(FabWithLabelView fabWithLabelView) {
        this.a = fabWithLabelView;
    }

    public final void onClick(View view) {
        d speedDialActionItem = this.a.getSpeedDialActionItem();
        if (!(this.a.g == null || speedDialActionItem == null)) {
            if (speedDialActionItem.g()) {
                p.a(this.a.getLabelBackground());
                return;
            }
            p.a(this.a.getFab());
        }
    }
}
