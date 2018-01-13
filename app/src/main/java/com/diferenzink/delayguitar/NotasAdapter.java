package com.diferenzink.delayguitar;

import android.widget.BaseAdapter;

/**
 * Created by Luis on 13/1/18.
 */


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class NotasAdapter extends BaseAdapter {

    private final LayoutInflater mInflador;
    private final ArrayList<Nota> mNotas;


    public NotasAdapter(Context contexto, ArrayList<Nota> Notas) {
        mNotas = Notas;
        mInflador = LayoutInflater.from(contexto);
    }

    // Tamaño del adaptador
    @Override
    public int getCount() {
        return mNotas.size();
    }

    // Devuelve el objeto indicado por position
    @Override
    public Object getItem(int position) {
        return mNotas.get(position);
    }

    // Obtiene el identificador del objeto indicado por position.
    @Override
    public long getItemId(int position) {

        //return mNotas.get(position).ge;
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = mInflador.inflate(R.layout.notas_item,parent,false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }

        else {
            holder = (ViewHolder) convertView.getTag();
        }

        onBindViewHolder(holder, position);
        return convertView;
    }


    private void onBindViewHolder(ViewHolder holder, int position) {
        Nota Nota = mNotas.get(position);
        //holder.imgNota.setImageResource(Nota.getImagen());
        holder.lblNombre.setText(Nota.getNombre());
    }

    // Viewholder
    static class ViewHolder {

        private final ImageView imgNota;
        private final TextView lblNombre;

        // El constructor recibe la vista-fila.
        public ViewHolder(View itemView) {
            // Se obtienen las vistas de la vista-fila.
            imgNota = (ImageView) itemView
                    .findViewById(R.id.imgNota);
            lblNombre = (TextView) itemView
                    .findViewById(R.id.lblNombre);
        }

    }

    // Cuando se de va a pintar la lista de elementos expandida.
    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        // Si no se puede reciclar.
        if (convertView == null) {
            // Se obtiene la vista-fila inflando el layout.
            convertView = mInflador.inflate(R.layout.notas_item, parent, false);
            // Se crea el contenedor de vistas para la vista-fila.
            holder = new ViewHolder(convertView);
            // Se almacena el contenedor en la vista.
            convertView.setTag(holder);
        }
        // Si se puede reciclar.
        else {
            // Se obtiene el contenedor de vistas desde la vista reciclada.
            holder = (ViewHolder) convertView.getTag();
        }
        // Se escriben los datos en las vistas del contenedor de vistas.
        onBindViewHolder(holder, position);
        // Se retorna la vista que representa el elemento.
        return convertView;
    }

}