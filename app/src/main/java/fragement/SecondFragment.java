package fragement;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.fragement.R;


public class SecondFragment extends Fragment implements View.OnClickListener{

    private Button btnAreaCircle;
    private EditText etRadius;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        etRadius = view.findViewById(R.id.et_radius);
        btnAreaCircle = view.findViewById(R.id.btn_areaCal);

        btnAreaCircle.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {

        float radius = Float.parseFloat(etRadius.getText().toString());
        float area = 3.14f * radius * radius;

        Toast.makeText(getActivity(), "Area of Circle is : "+area, Toast.LENGTH_LONG).show();

    }
}
