package com.asnproject.submission1;

import java.util.ArrayList;

public class DaftarMakanan {
    private static String[] daftarMakanan = {
            "Mie Kocok Bandung",
            "Ayam Betutu",
            "Papeda",
            "Rendang Padang",
            "Tinutuan",
            "Gudeg",
            "Pempek",
            "Gulai Belacan",
            "Kwe Kia Theng Aliung",
            "Gohu Ikan"
    };
    private static String[] deskripsi = {
            "Berisi mie gepeng, tauge, dan potongan kikil kecil-kecil, mie ini memberikan rasa unik yang susah dilupakan. Apalagi kuah kental Mie Kocok Bandung yang nggak mungkin ditemui di produk sejenis, membuat makanan satu ini tetap awet jadi favorit segala usia. Selain itu tambahan bakso daging, sawi hijau, dan bihun juga menambah kesempurnaan seporsi Mie Kocok Bandung.",
            "Menggunakan teknik olahan yang unik, Ayam betutu berbahan satu ayam utuh dibubuhi bumbu spesial lalu dibakar. Setelah masak, daging ayam benar-benar lembut dan kaya akan cita rasa. Makanan khas Pulau Dewata ini membuat wisatawan luar dan dalam negeri buru-buru ingin melahapnya.",
            "Berbeda dengan beberapa masakan tradisional yang mengandung kolesterol cukup tinggi, Papeda terbuat dari bubur sagu. Meski rasanya tawar, penyajian papeda dengan ikan tongkol berbumbu kunyit adalah hidangan sangat lezat. Selain itu guys, masakan ini juga masuk kategori rendah kolesterol dan mengandung serat dan nutrisi tinggi. Bisa nih jadi pilihan kamu penggila makanan sehat.",
            "Makanan berbahan dasar daging dan santan kelapa ini memang sangat lezat. Bumbu masakan ini pun hanya bisa lengkap jika dibuat di Indonesia. Meski ada beberapa restoran yang menyajikan masakan ini di luar negeri, tetap saja masih kalah dengan cita rasa asli khas tanah air.",
            "Lebih dikenal dengan nama bubur Manado, makanan ini asli kreasi masyarakat tanah air. Berbeda dari bubur biasanya yang berbahan dasar beras, Tinutuan dibuat dari bahan dasar singkong atau ubi jalar yang dihaluskan. Hidangan ini semakin kaya rasa karena dicampur dengan jagung muda, sayuran, ikan, dan bumbu khas Sulawesi Utara. Bisa dibilang, Tinutuan ini adalah bubur ternikmat yang pernah ada.",
            "Yang satu ini merupakan makanan legendaris khas Daerah Istimewa Yogyakarta. Terbuat dari bahan dasar nangka muda yang diuleni dengan gula merah dan santan, makanan ini cocok memanjakan pecinta rasa manis. Nah, paduan gudeg dengan ayam goreng, tempe bacem dan sambal krecek bakalan membuatmu ketagihan.",
            "Pempek, makanan khas yang sangat populer hingga ada di seluruh penjuru Nusantara. Berbahan dasar ikan dan tepung, makanan ini lezat dicomot bersama saus gula campur cuka. Selain itu, beberapa orang juga menikmati hidangan ini dengan kuah.",
            "Rahasia kelezatan makanan ini adalah pemanfaatan bumbu terasi, rempah khas tanah air dan beberapa sayuran sederhana yang dipadukan. Gulai Belacan berbahan dasar ikan laut termasuk udang atau lobster. Uniknya rasa yang dihadirkan, membuat makanan ini jadi buruan turis Internasional.",
            "Makanan ini sejenis kwe tiau namun dimasukkan dalam kaldu kecap kemudian dicampur semur telur dan daging. Daya tarik sajian ini adalah pada rasa daging sapi dan jeroan yang diolah menjadi gurih dan lezat saat dihidangkan dengan kaldu.",
            "Kalau Jepang memiliki menu andalan bernama Sashimi, maka Gohu bisa disebut Sashimi khas Ternate. Bahan dasar makanan ini adalah ikan tuna segar yang ditaburi garam dan dipadu perasan lemon dan kemangi. Selain itu, ikan segar tersebut dilumuri tumisan minyak kelapa, bawang merah, dan cabe rawit. Sebagai sentuhan terakhir, di atas hidangan ditaburi tumbukan kacang tanah goreng."
    };

    private static String[] detail = {
      "Mie Gepeng, Tauge, dan potongan kikil kecil",
            "Ayam utuh bakar dengan bumbu spesial",
            "Bubur sagu dengan ikan tongkol dan bumbu kunyir",
            "Daging sapi dengan bumbu rempah",
            "Singkong atau Ubi yang dicampur jagung, sayuran, ikan",
            "Nangka muda ditambah gula merah dan santan",
            "Berbahan ikan dan tepung dicocol saus gula campur cuka",
            "Makanan Seafood diolah dengan bumbu rempah khas",
            "Daging sapi dan jeroan yang dihidangkan dengan kaldu",
            "Ikan Tuna sedar yang ditaburi garam dipadu lemon dan kemangi",
    };
    private static String[] sumber = {
            "Sumber : https://www.boombastis.com/kelezatan-10-makanan-khas-daerah/113254",
            "Sumber : https://www.boombastis.com/kelezatan-10-makanan-khas-daerah/113254",
            "Sumber : https://www.boombastis.com/kelezatan-10-makanan-khas-daerah/113254",
            "Sumber : https://www.boombastis.com/kelezatan-10-makanan-khas-daerah/113254",
            "Sumber : https://www.boombastis.com/kelezatan-10-makanan-khas-daerah/113254",
            "Sumber : https://www.boombastis.com/kelezatan-10-makanan-khas-daerah/113254",
            "Sumber : https://www.boombastis.com/kelezatan-10-makanan-khas-daerah/113254",
            "Sumber : https://www.boombastis.com/kelezatan-10-makanan-khas-daerah/113254",
            "Sumber : https://www.boombastis.com/kelezatan-10-makanan-khas-daerah/113254",
            "Sumber : https://www.boombastis.com/kelezatan-10-makanan-khas-daerah/113254"
    };

    private static int[] gambarmakanan = {
    R.drawable.mikocok,
            R.drawable.betutu,
            R.drawable.papeda,
            R.drawable.rendang,
            R.drawable.tinutuan,
            R.drawable.gudeg,
            R.drawable.pempek,
            R.drawable.belacan,
            R.drawable.kwekia,
            R.drawable.gohu
    };

    static ArrayList<makanan> getListData(){
        ArrayList<makanan>list = new ArrayList<>();
        for (int position = 0; position < daftarMakanan.length; position++){
           makanan makanan = new makanan();
           makanan.setMakanan(daftarMakanan[position]);
           makanan.setDetail(detail[position]);
           makanan.setGambar(gambarmakanan[position]);
           makanan.setDeskripsi(deskripsi[position]);
           makanan.setSumber(sumber[position]);
           list.add(makanan);
        }
        return list;
    }

}
