package com.example.youreye;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.LinkedList;

public class List_color extends AppCompatActivity {
    //declaration de la liste des couleur liste d'objet de class COLORNAME
    private ArrayList<Color_util.ColorName> colorList = new ArrayList<>();


    //declaration de recycleview et l'adapter
    private RecyclerView mRecyclerView;
    private ColorListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_color);

        //Mettre le contenu de la liste
        Color_util colorclass = new Color_util();
        colorList = colorclass.initColorList();


        // Créer une variable de type reycylerView
        mRecyclerView = this.findViewById(R.id.mylist);

        // Créer l'Adapter et lui passer la liste dont il va afficher les éléments
        mAdapter = new ColorListAdapter(this, colorList);

        // Connecter l'Adapter à notre RecyclerView
        mRecyclerView.setAdapter(mAdapter);

        // Passer au RecyclerView le LayoutManager désiré
        LinearLayoutManager l = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(l);


    }
}
