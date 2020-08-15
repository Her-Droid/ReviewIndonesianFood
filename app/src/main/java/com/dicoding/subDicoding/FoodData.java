package com.dicoding.subDicoding;

import android.os.Parcel;

import java.util.ArrayList;

public class FoodData {
        private static String[] foodNames = {
                "BAKSO SAPI",
                "MARTABAK CINTA",
                "MIE AYAM",
                "NASI PADANG",
                "RAWON",
                "SATE KAMBING",
                "RENDANG SAPI",
                "NASI UDUK",
                "SATE PADANG",
                "LONTONG"
        };

        private static String[] foodDetails = {
                "Bakso merupakan bola daging yang dibuat dari campuran daging sapi giling dan tepung tapioka, akan tetapi ada juga bakso yang terbuat dari daging ayam, ikan, atau udang.",
                "Martabak rasa greentea,black,kacang,coklat,keju,jagung,pulut hitam.",
                "Mie ayam jadi makanan favorit banyak orang, tak terkecuali para tokoh terkenal seperti artis dan politisi. Racikan semangkuk mie dengan topping ayam dan sayuran membuat mereka tak kuasa menolak kenikmatannya.",
                "Siapa sih gak suka sama nasi padang? Itu udah kaya makanan dari surga, enak banget. Udah dari sambel ijonya, daun singkong, rendang, tunjang, daging cincang, ah semuanya deh.",
                "Kuah pekatnya saja sudah bisa bikin para bule penasaran untuk mencicipi rasanya. Begitu mereka mencicipi dan merasakan rempah-rempahannya, jatuh cinta deh sama rawon. Enggak lupa menyantap rawon dengan kerupuk! Nyam nyam nyam.",
                "Rasa dari sate yang spesial dan daging yang empuk membuat sate banyak digandrungi masyarakat luas, termasuk turis mancanegara. Meskipun harganya hanya ribuan, berbagai variasi sate kini telah banyak muncul dengan cita rasa yang selangit.",
                "Makanan yang sempat menjadi makanan terenak dunia ini memang selalu menggaet lidah orang luar. Rendang sendiri merupakan masakan daging bercita rasa pedas dengan komposisi rempah-rempah yang banyak dan pas khas dari Minang..",
                "Nasi uduknya memang betul-betul pulen enak. Aroma harum seai dan daun salamnya sangt kuat dan gurih. Kemudian disiram dengan kuah sayur soun, yang sebenarnya tak menggunakan bahan sayuran, melainkan soun yang dimasak dengan kuah santan. Lembut dan nikmat. Disuap bareng sambal kacang yang digerus dengan rawit hijau, pedas menggigit!\n.",
                "Sate Padang memakai bahan daging sapi, lidah atau jerohan (jantung, usus, dan tetelan) dengan bumbu kuah kacang kental (mirip bubur) ditambah cabai yang banyak sehingga rasanya menjadi pedas..",
                "Lontong Medan memang punya gaya sendiri. Kuat rasanya. Bayangkan saja, sayur santan ketemu dengan Tauco pedas, ditambah lagi dengan sejumlah lauk lainnya. Bagi penggemar makanan spicy, nggak terbantahkan, pasti suka.."
        };

        private static String[] FoodImages = {
                "https://cdns.klimg.com/merdeka.com/i/w/news/2019/12/11/1132603/670x335/5-cara-membuat-bakso-sapi-ayam-dan-ikan-ala-rumahan.jpg",
                "https://i0.wp.com/beritarakyat.asia/wp-content/uploads/2019/02/download-1-2.jpg?resize=340%2C148",
                "https://www.masakapahariini.com/wp-content/uploads/2019/08/mie-ayam-kecap-620x440.jpg",
                "https://images-cdn.9gag.com/photo/aExZ4bO_460s.jpg",
                "https://www.dapurumami.com/uploads/recipe/GXAI1/1473405841.png",
                "https://selerasa.com/wp-content/uploads/2015/06/images_daging_sate-kambing-tegal.jpg",
                "https://mmc.tirto.id/image/otf/500x0/2018/04/04/tirto-rendang---1--getty-images-istockphoto_ratio-16x9.jpg",
                "https://www.masakapahariini.com/wp-content/uploads/2018/09/cara-membuat-nasi-uduk-MAHI-1.jpg",
                "https://cdn.idntimes.com/content-images/community/2019/08/pp-copy-e8433194dd838ce9da2550168336b471_600x400.jpg",
                "https://www.dimanaja.com/assets/images/cover/6e5e30b72897f6a4d2db34c5500f7d6de05c07c6.jpg"
        };

        public static ArrayList<Food> getListData() {
            Food food = null;
            ArrayList<Food> list = new ArrayList<>();
            for (int position = 0; position < foodNames.length; position++) {
                food = new Food();
                food.setName(foodNames[position]);
                food.setDetail(foodDetails[position]);
                food.setImage(FoodImages[position]);
                    list.add(food);
            }
            return list;
        }
    }

