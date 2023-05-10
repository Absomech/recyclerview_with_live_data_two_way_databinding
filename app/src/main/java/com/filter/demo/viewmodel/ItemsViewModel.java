package com.filter.demo.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.filter.demo.MyDisplay;

import java.util.ArrayList;
import java.util.List;

public class ItemsViewModel extends ViewModel {
    private MutableLiveData<List<MyDisplay>> mutableLiveData = new MutableLiveData<>();

    public LiveData<List<MyDisplay>> getAnimals(){
        loadAnimals();
        return mutableLiveData;
    }

    public LiveData<List<MyDisplay>> getFruits(){
        loadFruits();
        return mutableLiveData;
    }

    public LiveData<List<MyDisplay>> getBikes(){
        loadBikes();
        return mutableLiveData;
    }
    public LiveData<List<MyDisplay>> getColors(){
        loadColors();
        return mutableLiveData;
    }

    private void loadAnimals(){

        List<MyDisplay> myDisplayList = new ArrayList<>();

        myDisplayList.add(new MyDisplay("Lion"));
        myDisplayList.add(new MyDisplay("Tiger"));
        myDisplayList.add(new MyDisplay("Elephant"));
        myDisplayList.add(new MyDisplay("Giraffe"));
        myDisplayList.add(new MyDisplay("Zebra"));
        myDisplayList.add(new MyDisplay("Hippopotamus"));
        myDisplayList.add(new MyDisplay("Kangaroo"));
        myDisplayList.add(new MyDisplay("Penguin"));
        myDisplayList.add(new MyDisplay("Koala"));
        myDisplayList.add(new MyDisplay("Panda"));
        mutableLiveData.setValue(myDisplayList);
    }


    private void loadFruits(){
        List<MyDisplay> myDisplayList = new ArrayList<>();
        myDisplayList.add(new MyDisplay("Apple"));
        myDisplayList.add(new MyDisplay("Banana"));
        myDisplayList.add(new MyDisplay("Orange"));
        myDisplayList.add(new MyDisplay("Mango"));
        myDisplayList.add(new MyDisplay("Pineapple"));
        myDisplayList.add(new MyDisplay("Grapes"));
        myDisplayList.add(new MyDisplay("Watermelon"));
        myDisplayList.add(new MyDisplay("Strawberry"));
        myDisplayList.add(new MyDisplay("Kiwi"));
        myDisplayList.add(new MyDisplay("Papaya"));
        mutableLiveData.setValue(myDisplayList);
    }
    private void loadColors(){
        List<MyDisplay> myDisplayList = new ArrayList<>();

        myDisplayList.add(new MyDisplay("Red"));
        myDisplayList.add(new MyDisplay("Orange"));
        myDisplayList.add(new MyDisplay("Yellow"));
        myDisplayList.add(new MyDisplay("Green"));
        myDisplayList.add(new MyDisplay("Blue"));
        myDisplayList.add(new MyDisplay("Purple"));
        myDisplayList.add(new MyDisplay("Pink"));
        myDisplayList.add(new MyDisplay("Brown"));
        myDisplayList.add(new MyDisplay("Gray"));
        myDisplayList.add(new MyDisplay("Black"));
        mutableLiveData.setValue(myDisplayList);
    }
    private void loadBikes(){
        List<MyDisplay> myDisplayList = new ArrayList<>();

        myDisplayList.add(new MyDisplay("Harley-Davidson"));
        myDisplayList.add(new MyDisplay("Honda"));
        myDisplayList.add(new MyDisplay("Kawasaki"));
        myDisplayList.add(new MyDisplay("Yamaha"));
        myDisplayList.add(new MyDisplay("Suzuki"));
        myDisplayList.add(new MyDisplay("BMW"));
        myDisplayList.add(new MyDisplay("Ducati"));
        myDisplayList.add(new MyDisplay("Triumph"));
        myDisplayList.add(new MyDisplay("Indian"));
        myDisplayList.add(new MyDisplay("KTM"));
        mutableLiveData.setValue(myDisplayList);
    }


}
