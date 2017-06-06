package com.example.hpasarin.sistemalogin2;


import android.os.Bundle;
import android.app.Fragment;
//import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ConexionCorrecta#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ConexionCorrecta extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String Usuario;
    private String Mensaje;


    public ConexionCorrecta() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ConexionCorrecta.
     */
    // TODO: Rename and change types and number of parameters
    public static ConexionCorrecta newInstance(String param1, String param2) {
        ConexionCorrecta fragment = new ConexionCorrecta();
        Log.d("PRUEBA","SE crea ConexionCorrecta (el fragment)");
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            Usuario = getArguments().getString(ARG_PARAM1);
            Mensaje = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.d("PRUEBA","SE INSTANCIA ConexionCorrecta (el fragment)");
        //ahora que tengo los textview en pantalla, ya puedo trabajar con ellos
        View vista = inflater.inflate(R.layout.fragment_conexion_correcta,container,false);
        TextView tvUsuariocorrecto = (TextView) this.getActivity().findViewById(R.id.tvUser);
        TextView mensaje = (TextView) this.getActivity().findViewById(R.id.tvPass);

            if (!Mensaje.equals("Identificado correctamente")) {
                tvUsuariocorrecto.setText("Contraseña o usuario erróneos");

            }else
        tvUsuariocorrecto.setText("bienvenido "+Usuario);
        mensaje.setText(Mensaje);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_conexion_correcta, container, false);
    }

}
