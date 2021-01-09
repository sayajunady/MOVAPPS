package com.junadhi.movapps.data;

import com.junadhi.movapps.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieData {
    public static List<Movie> getMovieList() {

        Movie movie1 = new Movie("Spider-Man: Into the Spider-Verse (2018)", "Miles Morales is juggling his life between being a high school student and being a spider-man.", "https://image.tmdb.org/t/p/w300_and_h450_bestv2/iiZZdoQBEYBv6id8su7ImL0oCbD.jpg", "Action, Adventure, Animation, Science Fiction, Comedy", "80%");
        Movie movie2 = new Movie("Ralph Breaks the Internet (2018)", "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game", "https://image.tmdb.org/t/p/w185_and_h278_bestv2/qEnH5meR381iMpmCumAIMswcQw2.jpg", "Family, Animation, Comedy, Adventure", "85%");
        Movie movie3 = new Movie("Fantastic Beasts: The Crimes of Grindelwald (2018)", "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings.", "https://image.tmdb.org/t/p/w185_and_h278_bestv2/fMMrl8fD9gRCFJvsx0SuFwkEOop.jpg", "Adventure", "90%");
        Movie movie4 = new Movie("Robin Hood (2018)", "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.", "https://image.tmdb.org/t/p/w300_and_h450_bestv2/AiRfixFcfTkNbn2A73qVJPlpkUo.jpg", "Action, Adventure, Thriller", "95%");
        Movie movie5 = new Movie("Artemis Fowl (2020)", "Artemis Fowl adalah film petualangan fantasi sains Amerika tahun 2020 berdasarkan novel tahun 2001 dengan nama yang sama oleh penulis Irlandia Eoin Colfer.", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/mhDdx7o7hhrxrikq8aqPLLnS9w8.jpg", "Adventure, Fantasy, Science Fiction, Family", "60%");
        Movie movie6 = new Movie("Terminator: Dark Fate (2019)", "Lebih dari dua dekade setelah peristiwa Terminator 2: Judgment Day, Sarah Connor pergi untuk melindungi seorang wanita muda bernama Dani Ramos dan teman-temannya dari Terminator, dikirim dari masa depan, yang berusaha untuk menghentikan mereka.", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/i8QWXu6dGuTKKerJtnd0A4lUpbv.jpg", "Action, Adventure, Science Fiction", "65%");
        Movie movie7 = new Movie("The Hobbit: The Battle of the Five Armies (2014)", "Film ini merupakan film ketiga sekaligus terakhir dari adaptasi film tiga bagian yang didasarkan pada novel The Hobbit oleh J. R. R.", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/xT98tLqatZPQApyRmlPL12LtiWp.jpg", "Action, Adventure, Fantasy", "73%");
        Movie movie8 = new Movie("Avengers: Infinity War (2018)", "The Avengers dan sekutu mereka harus bersedia mengorbankan segalanya dalam upaya untuk mengalahkan Thanos yang kuat sebelum ia berhasil menghancurkan alam semesta.", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg", "Adventure, Action, Science Fiction", "83%");
        Movie movie9 = new Movie("Joker (2019)", "Joker adalah film cerita seru psikologis Amerika Serikat tahun 2019 yang disutradarai oleh Todd Phillips dan diproduseri oleh Todd Philips, Bradley Cooper, dan Emma Tillinger Koskoff.", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg", "Crime, Thriller, Drama", "82%");
        Movie movie10 = new Movie("Aladdin (2019)", "Aladdin, seorang anak jalanan yang jatuh cinta pada seorang putri. Dengan perbedaan kasta dan harta, Aladdin pun berusaha mencari jalan agar bisa mejadi seorang pangeran, tak disangka ia menemukan lampu dengan jin di dalamnya.", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/3iYQTLGoy7QnjcUYRJy4YrAgGvp.jpg", "Adventure, Fantasy, Romance, Comedy, Family", "71%");

        List<Movie> list = new ArrayList<>();
        list.add(movie1);
        list.add(movie2);
        list.add(movie3);
        list.add(movie4);
        list.add(movie5);
        list.add(movie6);
        list.add(movie7);
        list.add(movie8);
        list.add(movie9);
        list.add(movie10);
        return list;
    }
}


