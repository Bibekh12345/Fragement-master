package fragement;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.fragement.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener {

    private Button btnaddCal;
    private EditText etFirstNum, etSecondNum;


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        etFirstNum = view.findViewById(R.id.et_firstNum);
        etSecondNum = view.findViewById(R.id.et_secondNum);
        btnaddCal = view.findViewById(R.id.btn_addCal);

        btnaddCal.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        int first = Integer.parseInt(etFirstNum.getText().toString());
        int second = Integer.parseInt(etSecondNum.getText().toString());
        int result = first + second;

        Toast.makeText(getActivity(), "Sum is : "+result, Toast.LENGTH_LONG).show();
    }
}
