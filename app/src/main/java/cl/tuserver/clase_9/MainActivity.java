package cl.tuserver.clase_9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvListaDeAlgo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Se obtiene o crea un ArrayList conteniendo CualquierCosa.
        ArrayList<CualquierCosa> cualquierCosas = new ArrayList<>();
        cualquierCosas.add(new CualquierCosa("Cosa_1", 1.0));
        cualquierCosas.add(new CualquierCosa("cosa_2", 2.0));
        cualquierCosas.add(new CualquierCosa("cosa_3", 3.0));

        // Instancia del AdaptadorCualquierCosa
        // Constructor recibe como parametro nuestro ArrayList<CualquierCosa>.
        AdaptadorCualquierCosa adaptadorCualquierCosa = new AdaptadorCualquierCosa(cualquierCosas);

        // Se obtiene el RecyclerView mediante su ID.
        rvListaDeAlgo = findViewById(R.id.rvListaDeAlgo);

        // Se le entrega un LayoutManager interno al RecyclerView
        rvListaDeAlgo.setLayoutManager(new LinearLayoutManager(this));

        // Se le entrega el AdaptadorCualquierCosa para que trabaje con el.
        rvListaDeAlgo.setAdapter(adaptadorCualquierCosa);

    }
}
