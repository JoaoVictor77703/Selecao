package br.com.etecia.myapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adap  extends RecyclerView.Adapter<Adap.ViewHolder> {

    private Context mContexto;
    private List<Jogadoras> lstJogadoras;

    public Adap(Context mContexto, List<Jogadoras> lstJogadoras) {
        this.mContexto = mContexto;
        this.lstJogadoras = lstJogadoras;
    }

    @NonNull
    @Override
    public Adap.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view;

        LayoutInflater inflater = LayoutInflater.from(mContexto);
        view = inflater.inflate(R.layout.modelo_jogadoras,parent,false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder. idTituloJogadoras.setText(lstJogadoras.get(position).getNome());
        holder. idImgJogadoras.setImageResource(lstJogadoras.get(position).getImage);

        holder.idCardJogadoras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContexto, ApresentaActivity.class);
                intent. putExtra("Nome",lstJogadoras.get(position).getNome());
                intent. putExtra("Posição", lstJogadoras.get(position).getPosiçao());
                intent. putExtra("Time", lstJogadoras.get(position).getPosiçao());
            }
        });

    }

    @Override
    public int getItemCount() {
        return lstJogadoras.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView idTituloJogadoras;
        ImageView idImgJogadoras;
        CardView idCardJogadoras;

        public ViewHolder(View itemview){
        super(itemview);
        idCardJogadoras = itemview.findViewById(R.id.idCardJogadoras);
        idImgJogadoras = itemview.findViewById(R.id.idImgJogadoras);
        idTituloJogadoras = itemview.findViewById(R.id.idTituloJogadoras);

        }
    }
}
