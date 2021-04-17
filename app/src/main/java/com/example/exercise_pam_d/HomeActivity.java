package com.example.exercise_pam_d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    private ListView list;

    private ListViewAdapter adapter;

    SearchView searchView;

    String[] listNama;

    ArrayAdapter<String> arrayAdapter;

    public static ArrayList<ClassNama> classNamaArrayList = new ArrayList<ClassNama>();

    Bundle bundle = new Bundle();

    Intent Intent;

    String NamaKontak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        searchView = findViewById(R.id.Search_Bar);
        listNama = new String[] {"Luffy", "Zorro", "Sanji", "Nami", "Usopp", "Chopper", "Robin", "Franky", "Brook", "Jinbei"};
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.activity_list_item, android.R.id.text1, listNama);
        list = findViewById(R.id.listkontak);

        classNamaArrayList = new ArrayList<>();

        for (int i = 0; i <listNama.length; i++)
        {
            ClassNama classNama = new ClassNama(listNama[i]);

            classNamaArrayList.add(classNama);
        }

        adapter = new ListViewAdapter(this);

        list.setAdapter(arrayAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String NamaKontak = classNamaArrayList.get(position).getNama();

                bundle.putString("a" ,NamaKontak.trim());

                PopupMenu pm = new PopupMenu(getApplicationContext(), view);

                pm.setOnMenuItemClickListener(HomeActivity.this);

                pm.inflate(R.menu.popup_menu);

                pm.show();
            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                HomeActivity.this.arrayAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                HomeActivity.this.arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });
    }
    @Override
    public boolean onMenuItemClick(MenuItem MenuItem) {
        switch (MenuItem.getItemId())
        {
            case R.id.mnview:
                Intent = new Intent( getApplicationContext(), ActivityLihatData.class);
                Intent.putExtras(bundle);
                startActivity(Intent);
                break;

            case R.id.mnedit:
                String Angka = NamaKontak.trim();
                String IsiNomor = "";
                if (Angka == "Luffy"){
                    IsiNomor = "0812346XXX";
                }
                else if (Angka == "Zorro"){
                    IsiNomor = "0812346XXX";
                }
                else if (Angka == "Nami"){
                    IsiNomor = "0812346XXX";
                }
                else if (Angka == "Usopp"){
                    IsiNomor = "0812346XXX";
                }
                else if (Angka == "Sanji"){
                    IsiNomor = "0812346XXX";
                }
                else if (Angka == "Chopper"){
                    IsiNomor = "0812346XXX";
                }
                else if (Angka == "Robin"){
                    IsiNomor = "0812346XXX";
                }
                else if (Angka == "Franky"){
                    IsiNomor = "0812346XXX";
                }
                else if (Angka == "Brook"){
                    IsiNomor = "0812346XXX";
                }
                else if (Angka == "Jinbe"){
                    IsiNomor = "0812346XXX";
                }

                Toast.makeText(getApplicationContext(), IsiNomor, Toast.LENGTH_LONG).show();
                break;
        }
        return false;
    }
}

