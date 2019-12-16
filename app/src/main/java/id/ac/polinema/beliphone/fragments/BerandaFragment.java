package id.ac.polinema.beliphone.fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import id.ac.polinema.beliphone.R;
import id.ac.polinema.beliphone.activities.DetailActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class BerandaFragment extends Fragment {

    CardView atas1, tengah2, tengah3, tengah4, tengah5, tengah6, tengah7, tengah8,tengah9,tengah10;

    public BerandaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_beranda, container, false);
        atas1 = view.findViewById(R.id.atas1);
        tengah2 = view.findViewById(R.id.tengah2);
        tengah3 = view.findViewById(R.id.tengah3);
        tengah4 = view.findViewById(R.id.tengah4);
        tengah5 = view.findViewById(R.id.tengah5);
        tengah6 = view.findViewById(R.id.tengah6);
        tengah7 = view.findViewById(R.id.tengah7);
        tengah8 = view.findViewById(R.id.tengah8);
        tengah9 = view.findViewById(R.id.tengah9);
        tengah10 = view.findViewById(R.id.tengah10);


        atas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "1");
                i.putExtra("title", "HiPhone 11 Pro");
                i.putExtra("desc", " Tahun peluncuran: 2019\n" +
                        "Kapasitas: 64, 256, 512 GB\n" +
                        "Warna: Perak, abu-abu, emas, hijau gelap\n" +
                        "Nomor model: A2160 (Kanada, Amerika Serikat), A2217 (Tiongkok daratan, Hong Kong, Makau), A2215 (negara dan wilayah lain)6");
                startActivity(i);
            }
        });
        tengah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "2");
                i.putExtra("title", "iPhone 11 Pro Max");
                i.putExtra("desc", " Tahun peluncuran: 2019\n" +
                        "Kapasitas: 64, 256, 512 GB\n" +
                        "Warna: Perak, abu-abu, emas, hijau gelap\n" +
                        "Nomor model: A2161 (Kanada, Amerika Serikat), A2220 (Tiongkok daratan, Hong Kong, Makau), A2218 (negara dan wilayah lain)");
                startActivity(i);
            }
        });
        tengah3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "3");
                i.putExtra("title", "iPhone 11");
                i.putExtra("desc", "Tahun peluncuran: 2019\n" +
                        "Kapasitas: 64, 128, 256 GB\n" +
                        "Warna: Ungu, hijau, kuning, hitam, putih, (PRODUCT)RED\n" +
                        "Nomor model: A2111 (Kanada, Amerika Serikat), A2223 (Tiongkok daratan, Hong Kong, Makau), A2221 (negara dan wilayah lain)");
                startActivity(i);
            }
        });
        tengah4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "4");
                i.putExtra("title", "iPhone XS");
                i.putExtra("desc", "Tahun peluncuran: 2018\n" +
                        "Kapasitas: 64, 256, 512 GB\n" +
                        "Warna: Silver, space gray, gold\n" +
                        "Nomor model: A1920, A2097, A2098 (Jepang), A2099, A2100 (Tiongkok daratan)");
                startActivity(i);
            }
        });
        tengah5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "5");
                i.putExtra("title", "iPhone XS Max");
                i.putExtra("desc", "Tahun peluncuran: 2018\n" +
                        "Kapasitas: 64, 256, 512 GB\n" +
                        "Warna: Silver, space gray, gold\n" +
                        "Nomor model: A1921, A2101, A2102 (Jepang), A2103, A2104 (Tiongkok daratan)");
                startActivity(i);
            }
        });
        tengah6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "6");
                i.putExtra("title", "iPhone XR");
                i.putExtra("desc", "Tahun peluncuran: 2018\n" +
                        "Kapasitas: 64, 128, 256 GB\n" +
                        "Warna: Hitam, putih, biru, kuning, koral, (PRODUCT)RED\n" +
                        "Nomor model: A1984, A2105, A2106 (Jepang), A2107, A2108 (Tiongkok daratan)" +
                        "");
                startActivity(i);
            }
        });
        tengah7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "7");
                i.putExtra("title", "iPhone X");
                i.putExtra("desc", "Tahun peluncuran: 2017\n" +
                        "Kapasitas: 64, 256 GB\n" +
                        "Warna: Silver dan space gray\n" +
                        "Nomor model: A1865, A1901, A1902 (Jepang2)");
                startActivity(i);
            }
        });
        tengah8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "8");
                i.putExtra("title", "iPhone 8");
                i.putExtra("desc", "Tahun peluncuran: 2017\n" +
                        "Kapasitas: 64, 128, 256 GB\n" +
                        "Warna: Gold, silver, space gray, (PRODUCT)RED\n" +
                        "Nomor model: A1863, A1905, A1906 (Jepang2)");
                startActivity(i);
            }
        });
        tengah9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "8");
                i.putExtra("title", "iPhone 8 Plus");
                i.putExtra("desc", "Tahun peluncuran: 2017\n" +
                        "Kapasitas: 64, 128, 256 GB\n" +
                        "Warna: Gold, silver, space gray, (PRODUCT)RED\n" +
                        "Nomor model: A1864, A1897, A1898 (Jepang2)");
                startActivity(i);
            }
        });
        tengah10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "8");
                i.putExtra("title", "iPhone 7");
                i.putExtra("desc", "Tahun peluncuran: 2016\n" +
                        "Kapasitas: 32, 128, 256 GB\n" +
                        "Warna: Hitam, jet black, gold, rose gold, silver, (PRODUCT)RED\n" +
                        "Nomor model di penutup belakang: A1660, A1778, A1779 (Jepang4)");
                startActivity(i);
            }
        });
        return view;
    }


}
