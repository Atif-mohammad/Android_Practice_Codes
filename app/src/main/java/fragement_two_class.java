import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fragmentation_demo.R;

public class fragement_two_class extends Fragment {
    @Override
    public View onCreateView( LayoutInflater inflater,ViewGroup container,  Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragement_2,container,false);
    }
}
