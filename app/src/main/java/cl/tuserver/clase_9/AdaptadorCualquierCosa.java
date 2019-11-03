package cl.tuserver.clase_9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorCualquierCosa extends RecyclerView.Adapter<ViewHolderCualquierCosa> {
    // Lista de objetos de CualquierCosa.
    private final ArrayList<CualquierCosa> cualquierCosas;

    // Constructor.
    public AdaptadorCualquierCosa(ArrayList<CualquierCosa> cualquierCosas){
        this.cualquierCosas = cualquierCosas;
    }
    @NonNull
    @Override
    public ViewHolderCualquierCosa onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Se infla el layout del adaptador_cualquier_cosa.xml en un objeto View.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adaptador_cualquier_cosa, null);
        // Se retorna un nuevo ViewHolder de CualquierCosa.
        return new ViewHolderCualquierCosa(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderCualquierCosa holder, int position) {
        // Recordar nunca sobre-cargar este metodo o se vera perjudicado el performance
        // Llegando incluso a poder afectar el funcionamiento de otras partes del programa.
        CualquierCosa cualquierCosa = cualquierCosas.get(position);
        holder.nombreCosa.setText(cualquierCosa.getNombreDeLaCosa());
        holder.valorCosa.setText(String.valueOf(cualquierCosa.getValorDeLaCosa()));

        // Esto se debe a que la rutina que se hace aqui se vuelve a ejecutar por cada
        // Objeto de la lista y/o por cada vista en el reciclador de vistas (RecyclerView)
        // Por lo que una tarea muy demandante de recursos puede colapsar el programa.
    }

    @Override
    public int getItemCount() {
        // El tamaño de la lista que recibe el adaptador.
        return cualquierCosas.size();
    }
}

// La clase que representa nuestro layout adaptador_cualquier_cosa.xms
// Llamada ViewHolder que extiende de una subclase de RecyclerView.
class ViewHolderCualquierCosa extends RecyclerView.ViewHolder{
    protected TextView nombreCosa, valorCosa;

    public ViewHolderCualquierCosa(@NonNull View itemView) {
        super(itemView);
        nombreCosa = itemView.findViewById(R.id.tvNombreCosa);
        valorCosa = itemView.findViewById(R.id.tvValorCosa);
    }
}
