package com.example.animals;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class kayno extends AppCompatActivity {
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayno);
        setAnimalsData();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        AnimalAdapter adapter = new AnimalAdapter(this, animals);
        recyclerView.setAdapter(adapter);
    }

    private void setAnimalsData() {
        animals.add(new Animal("Смилодон (саблезубый тигр)", "Древний представитель семейства кошачьих.", "с 2,5 млн до 10 тыс. лет назад",
                R.drawable.leo));
        animals.add(new Animal("Пещерный медведь", "Более крупный предок современных медведей. Обладал массивным телом и большой силой.", " 15 тысяч лет назад" ,
                R.drawable.bear));
        animals.add(new Animal("Шерстистый мамонт", "Прямым предком мамонта сегодня является индийский слон, отличие составляет лишь наличие двух крупных бивней и некоторые особенности скелета. Проживали мамонты на территории Сибири, откуда распространились на весь континент, а также Северную Америку.", " с 5 млн лет назад до 4 тыс. лет назад" ,
                R.drawable.mamont));
        animals.add(new Animal("Шерстистый носорог", "вымерший вид носорогов, живший в эпоху ледникового периода. Был распространён на заснеженных равнинах между Западной Европой и Сибирью.", "  70 тысяч лет назад" ,
                R.drawable.scale_1200__1_));
        animals.add(new Animal("Мегалоникс", "Один из предков современных ленивцев. От сегодняшних сородичей его отличали большие размеры и немного отличающийся образ жизни. Мощная челюсть позволяла особям данного вида без труда пережевывать не только листья деревьев, но и небольшие кустарники и ветки. Основной ареал обитания – Северная Америка. ", "10,3 млн — 11,7 тыс. лет назад" ,
                R.drawable.lenivez));
    }
}
