package com.filter.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.filter.demo.databinding.ActivityMainBinding;
import com.filter.demo.viewmodel.ItemsViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ItemsViewModel itemsViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        setupRecyclerView();
        setupViewModel();
        loadData();
        events();
    }
    private void setupViewModel(){
        itemsViewModel = new ViewModelProvider(this).get(ItemsViewModel.class);
    }
    private void setupRecyclerView(){
        binding.recyclerview.setHasFixedSize(true);
        binding.recyclerview.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }
    private void events(){
        binding.animals.setOnClickListener(v->{
            itemsViewModel.getAnimals().observe(this, new Observer<List<MyDisplay>>() {
                @Override
                public void onChanged(List<MyDisplay> myDisplays) {
                    ItemsAdapter adapter = new ItemsAdapter(myDisplays);
                    binding.recyclerview.setAdapter(adapter);
                }
            });
        });
        binding.fruits.setOnClickListener(v->{
            itemsViewModel.getFruits().observe(this, new Observer<List<MyDisplay>>() {
                @Override
                public void onChanged(List<MyDisplay> myDisplays) {
                    ItemsAdapter adapter = new ItemsAdapter(myDisplays);
                    binding.recyclerview.setAdapter(adapter);
                }
            });
        });

        binding.colors.setOnClickListener(v->{
            itemsViewModel.getColors().observe(this, new Observer<List<MyDisplay>>() {
                @Override
                public void onChanged(List<MyDisplay> myDisplays) {
                    ItemsAdapter adapter = new ItemsAdapter(myDisplays);
                    binding.recyclerview.setAdapter(adapter);
                }
            });
        });
        binding.bikes.setOnClickListener(v->{
            itemsViewModel.getBikes().observe(this, new Observer<List<MyDisplay>>() {
                @Override
                public void onChanged(List<MyDisplay> myDisplays) {
                    ItemsAdapter adapter = new ItemsAdapter(myDisplays);
                    binding.recyclerview.setAdapter(adapter);
                }
            });
        });
    }


    private void loadData(){
        itemsViewModel.getAnimals().observe(this, new Observer<List<MyDisplay>>() {
            @Override
            public void onChanged(List<MyDisplay> myDisplays) {
                ItemsAdapter adapter = new ItemsAdapter(myDisplays);
                binding.recyclerview.setAdapter(adapter);
            }
        });
    }

}