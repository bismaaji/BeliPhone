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
                i.putExtra("title", "Hotel Singhasari");
                i.putExtra("desc", " menyediakan layanan dan fasilitas lain seperti VIP Karaoke"+
                        "Coffee Shop, Cake Shop, Parkway Health, Swimming Pool " +
                        "Jl. Ir. Soekarno No.120, Beji, Kec. Batu, Kota Batu, Jawa Timur 65236");
                startActivity(i);
            }
        });
        tengah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "2");
                i.putExtra("title", "Hotel Grand City");
                i.putExtra("desc", " menyediakan layanan dan fasilitas lain seperti VIP Karaoke,"+
                        " Bamboo Coffee ShopJl. Bukit Berbunga No.104-108, Sidomulyo, Kec. Batu, Kota Batu, Jawa Timur 65317");
                startActivity(i);
            }
        });
        tengah3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "3");
                i.putExtra("title", "Hotel Kartika");
                i.putExtra("desc", "Hotel Kartika juga menyediakan layanan dan fasilitas lain seperti VIP Karaoke," +
                        " Bamboo Coffee Shop, Cake Shop, Parkway Health, Swimming Pool, " +
                        " VIP Azelia Meeting Room, Laundry, Swarna Paksi Ballroom, " +
                        "Taxi Service, Rental Mobil " +
                        " Jl. Jaksa Agung Soeprapto 17, Malang");
                startActivity(i);
            }
        });
        tengah4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "4");
                i.putExtra("title", "Wisata Batu Flower Garden");
                i.putExtra("desc", "Objek wisata ini memiliki pemandangan sisi bukit dengan bunga, air terjun, dan berbagai aktivitas.\n" +
                        "Alamat: Oro-Oro Ombo, Kehutanan, Kec. Batu, Kota Batu, Jawa Timur 65151");
                startActivity(i);
            }
        });
        tengah5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "5");
                i.putExtra("title", "Wisata Paralayang Batu");
                i.putExtra("desc", "Salah satu wisata yang sedang nge-hits di sini adalah Paralayang Batu Malang, salah satu objek wisata yang menyediakan fasilitas kegiatan yang memicu dan memacu adrenalin." +
                        " Paralayang Batu Malang bisa membuat anda mengucurkan keringat dingin, bersemangat, berteriak sekaligus berdecak kagum");
                startActivity(i);
            }
        });
        tengah6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "6");
                i.putExtra("title", "Wisata Alun Alun Batu ");
                i.putExtra("desc", "Alun-alun kota Batu Malang Jawa Timur Terbaru adalah satu dari dua alun-alun yang dimiliki Malang. " +
                        "Alun-alun ini juga disebut dengan Alun-alun Jami’" +
                        " karena letaknya tepat di depan Masjid Jami’ yang merupakan masjid kebanggaan warga Malang." +
                        "");
                startActivity(i);
            }
        });
        tengah7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "7");
                i.putExtra("title", "Kuliner Warung Wareg Batu ");
                i.putExtra("desc", "ke kota Batu Malang adalah rumah makan warung wareg. Selain menyediakan masakan tradisional, " +
                        "rumah makan dengan nama warung wareg ini terkenal dengan berbagai macam masakan olahan" +
                        " gurami, mulai masakan dari gurami goreng," +
                        " gurami goreng garing yang dibalut tepung, " +
                        "hingga gurami bakar dengan berbagai pilihan rasa, " +
                        "beralamatkan di" +
                        "Jl. Raya Dieng No.9, Sidomulyo, Kec. Batu, Kota Batu, Jawa Timur 65317");
                startActivity(i);
            }
        });
        tengah8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "8");
                i.putExtra("title", "Kuliner Pos Ketan Batu ");
                i.putExtra("desc", "Saat berwisata ke Kota Malang, salah satu hal yang tak boleh terlewatkan adalah berbagai kuliner khasnya yang menggoda" +
                        " yakni Pos Ketan Legenda 1967.");
                startActivity(i);
            }
        });
        tengah9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "8");
                i.putExtra("title", "Kuliner Pos Ketan Batu ");
                i.putExtra("desc", "Saat berwisata ke Kota Malang, salah satu hal yang tak boleh terlewatkan adalah berbagai kuliner khasnya yang menggoda" +
                        " yakni Pos Ketan Legenda 1967.");
                startActivity(i);
            }
        });
        tengah10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailActivity.class);
                i.putExtra("code_image", "8");
                i.putExtra("title", "Kuliner Pos Ketan Batu ");
                i.putExtra("desc", "Saat berwisata ke Kota Malang, salah satu hal yang tak boleh terlewatkan adalah berbagai kuliner khasnya yang menggoda" +
                        " yakni Pos Ketan Legenda 1967.");
                startActivity(i);
            }
        });
        return view;
    }


}
