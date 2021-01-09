package com.junadhi.movapps.data;

import com.junadhi.movapps.R;
import com.junadhi.movapps.model.Cinema;

import java.util.ArrayList;
import java.util.List;

public class CinemaData {
    public static List<Cinema> getCinemsList() {
        Cinema cinema1 = new Cinema(R.drawable.ic_play, "CIPUTRA SERAYA PREMIERE", 0.5001589, 101.3772014, "Mall Ciputra Raya, Jl. Riau No.58, Riau 28111");
        Cinema cinema2 = new Cinema(R.drawable.ic_play, "CIPUTRA SERAYA XXI", 0.5001589, 101.3772014, "Mall Ciputra Raya, Jl. Riau No.58, Riau 28111");
        Cinema cinema3 = new Cinema(R.drawable.ic_play, "HOLIDAY PEKANBARU CGV", 0.512842, 101.447107, "Jl. Sultan Syarif Qasim No.120, Rintis, Kec. Lima Puluh, Kota Pekanbaru, Riau 28155");
        Cinema cinema4 = new Cinema(R.drawable.ic_play, "LIVING WORD PEKANBARU CINEPOLIS", 0.500723, 101.419841, "Jl. Soekarno - Hatta, Kota Pekanbaru, Riau 28292");
        Cinema cinema5 = new Cinema(R.drawable.ic_play, "MAL PEKANBARU CINEPOLIS", 0.531931,101.448038, "Mall Pekanbaru, Jl. Jenderal Sudirman, Pekanbaru Kota, Riau 28155");
        Cinema cinema6 = new Cinema(R.drawable.ic_play, "SKA PREMIERE", 0.427399, 101.436679, "Jl. Soekarno - Hatta, Kota Pekanbaru, Riau 28291");
        Cinema cinema7 = new Cinema(R.drawable.ic_play, "SKA XXI PEKANBARU", 0.427399, 101.436679, "Jl. Soekarno - Hatta, Kota Pekanbaru, Riau 28291");
        Cinema cinema8 = new Cinema(R.drawable.ic_play, "STUDIO PEKANBARU CGV", 0.510373, 101.446944, "Gedung Plaza Citra, Jl. Pepaya, Kota Pekanbaru, Riau 28156");
        Cinema cinema9 = new Cinema(R.drawable.ic_play, "SUZUYA BAGAN BATU XXI", 1.710514, 100.396398, "Bagan Batu, Kec. Bagan Sinembah, Kabupaten Rokan Hilir, Riau 28992");
        Cinema cinema10 = new Cinema(R.drawable.ic_play, "TRANSMART PEKANBARU CGV", 0.503580, 101.420100, "Jl. Musyawarah, Kota Pekanbaru, Riau 28292");


        List<Cinema> list = new ArrayList<>();
        list.add(cinema1);
        list.add(cinema2);
        list.add(cinema3);
        list.add(cinema4);
        list.add(cinema5);
        list.add(cinema6);
        list.add(cinema7);
        list.add(cinema8);
        list.add(cinema9);
        list.add(cinema10);
        return list;
    };
}
