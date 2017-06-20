package Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.yang.drivingschool.R;

/**
 * Created by yang on 17-6-19.
 */

public class KeYiFrament extends Fragment implements View.OnClickListener {
    private Button kaoti, moni;
    private FragmentManager fram;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_keyi, null);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fram = getFragmentManager();
        inis(view);
    }

    private void inis(View view) {
        kaoti = (Button) view.findViewById(R.id.keyi_kaotilianxi);
        moni = (Button) view.findViewById(R.id.keyi_monilianxi);
        kaoti.setOnClickListener(this);
        moni.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction ft = fram.beginTransaction();

        switch (v.getId()) {
            case R.id.keyi_kaotilianxi:
                ft.replace(R.id.main_fragment, new KaotiFrament());
                break;
            case R.id.keyi_monilianxi:
                ft.replace(R.id.main_fragment, new MONieFrament());
                break;
        }
        ft.commit();

    }
}
