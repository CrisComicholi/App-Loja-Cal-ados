package com.example.myapplicationlojadecalcados;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplicationlojadecalcados.adapter.ShoesAdapter;
import com.example.myapplicationlojadecalcados.databinding.ActivityMainBinding;
import com.example.myapplicationlojadecalcados.model.Shoes;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ShoesAdapter shoesAdapter;
    private ArrayList<Shoes> shoesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerViewShoes = binding.RecyclerViewShoes;
        recyclerViewShoes.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewShoes.setHasFixedSize(true);
        shoesAdapter = new ShoesAdapter(shoesList, this);
        recyclerViewShoes.setAdapter(shoesAdapter);
        getShoes();

    }

    private void getShoes(){

        Shoes tenis1 = new Shoes(
                R.drawable.tenis1,
                "Tenis 1",
                "Tênis Botinha Converse All Star Adulto Chuck Taylor - Marrom",
                "R$ 323,00"
        );
        shoesList.add(tenis1);



        Shoes tenis2 = new Shoes(
                R.drawable.tenis2,
                "Tenis 1",
                "Tênis All Star Adulto Chuck Taylor - Amarelo",
                "R$ 223,00"
        );
        shoesList.add(tenis2);



        Shoes tenis3 = new Shoes(
                R.drawable.tenis3,
                "Tenis 1",
                "Tênis Converse All Star Adulto Chuck Taylor - Prata",
                "R$ 123,00"
        );
        shoesList.add(tenis3);


        Shoes tenis4 = new Shoes(
                R.drawable.tenis4,
                "Tenis 1",
                "Tênis Camurça Esqueitista - Marrom",
                "R$ 123,00"
        );
        shoesList.add(tenis4);

        Shoes tenis5 = new Shoes(
                R.drawable.tenis5,
                "Tenis 1",
                "Tênis All Star - Azul Bebê",
                "R$ 153,00"
        );
        shoesList.add(tenis5);
    }
}