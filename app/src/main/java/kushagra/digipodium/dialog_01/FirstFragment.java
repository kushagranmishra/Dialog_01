package kushagra.digipodium.dialog_01;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] fruits = new String[]{"Apple", "Banana", "Cherry", "Dragon Fruit","Go to next fragment"};
                ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, fruits);
                Context context;
                AlertDialog dialog = new AlertDialog.Builder(getActivity())
                        .setTitle("Select your Favourite Fruit")
                        .setAdapter(adapter, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                switch (which) {
                                    case 0:
                                        Toast.makeText(getActivity(), "you have selected " + fruits[which], Toast.LENGTH_SHORT).show();
                                        break;
                                    case 1:
                                        Toast.makeText(getActivity(), "you have selected " + fruits[which], Toast.LENGTH_SHORT).show();
                                        break;
                                    case 2:
                                        Toast.makeText(getActivity(), "you have selected " + fruits[which], Toast.LENGTH_SHORT).show();
                                        break;
                                    case 3:
                                        Toast.makeText(getActivity(), "you have selected " + fruits[which], Toast.LENGTH_SHORT).show();
                                        break;
                                    case 4:
                                        NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);

                                        break;
                                }
                            }
                        })
                        .setNegativeButton("Cancel",null)
                        .create();
                dialog.show();
            }

        });
    }
}