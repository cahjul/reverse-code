package com.repo;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.e;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.d;
import com.google.maps.android.ui.b;
import org.sqlite.database.R;

public class ShowMapActivity extends Activity implements e {

    /* renamed from: a  reason: collision with root package name */
    private MyDB f674a;

    public void a(c cVar) {
        LatLng latLng = new LatLng(this.f674a.N.doubleValue(), this.f674a.O.doubleValue());
        b bVar = new b(this);
        bVar.j(3);
        d b2 = new d().m(com.google.android.gms.maps.model.b.a(bVar.f(this.f674a.M))).q(latLng).b(bVar.a(), bVar.b());
        cVar.b(com.google.android.gms.maps.b.a(latLng, 17.0f));
        cVar.a(b2);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.showmap);
        this.f674a = (MyDB) getApplicationContext();
        ((MapFragment) getFragmentManager().findFragmentById(R.id.google_map)).a(this);
    }
}
