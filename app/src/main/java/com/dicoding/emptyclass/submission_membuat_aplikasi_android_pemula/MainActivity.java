package com.dicoding.emptyclass.submission_membuat_aplikasi_android_pemula;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Toolbar toolbar;

    String mTitle[] = {"Orang Utan", "Komodo", "Badak Bercula Satu",  "Harimau Sumatra", "Anoa", "Elang Jawa","Tarsius", "Jalak Bali", "Trenggiling", "Babirusa"};
    String mDescription[] = {"Hewan edemik dari Indonesia ini termaksud primata dengan ukuran tubuh yang sedang. Orang utan memiliki lengan yang panjang dan bulu coklat kemerahan. Hewan ini hanya bisa ditemukan dihutan tropis Kalimantan dan Sumatra. Satwa ini sangat dilindungi karena kondisi populasinya amat memperihatinkan, meskipun belum termaksud hewan yang nyaris punah, orang utan wajid dilindungi karena hewan ini hanya bisa ditemukan di Indonesia dan Malaysia",
            "Komodo merupakan hewan endemik yang hanya ada di Indonesia. salah satu kadal terbesar di dunia ini dipercaya sudah hidup sejak zaman dinosaurus. Komodo memiliki panjang 2-3 meter dengan bobot 100kg. Kaki hewan ini ada 4 buah dan mulutnya terus menerus mengeluarkan lidah. Mengingat komodo hanya ada di Indonesia, International Union for Conservation of Nature and Natural Resources (IUCN) menetapkan komodo sebagai hewan langka.",
            "Badak bercula satu juga dikenal sebagai Badak Jawa. Satwa ini tidak terbatas hidup di Indonesia saja, melainkan populasinya juga tersebar di Asia Tenggara, India, dan Tiongkok. Hanya saja badak bercula satu sangat dilindungi di Indonesia karena populasinya di tanah air sangat memprihatinkan. Di Taman Nasional Ujung Kulon, Banten, jumlah badak bercula satu hanya tersisa beberapa ekor saja. Selain karena bencana alam dan penyakit, jumlah Badak Jawa yang semakin sedikit ini disebabkan karena perburuan. Pemburu hanya membunuh badak untuk mengambil culanya saja.",
            "Harimau Sumatra adalah hewan yang dilindungi di Indonesia karena jumlahnya di tanah air hanya tersisa 400-500 ekor saja. Adalah Harimau Sumatera yang sudah masuk dalam daftar merah IUCN sebagai hewan yang jumlah populasinya sangat kritis. Cara membedakan Harimau Sumatera dengan jenis harimau lainnya adalah bulunya cenderung berwarna lebih gelap. Pola hitam di kulitnya berukuran lebar dan jaraknya sangat rapat satu sama lain. Mirisnya, Harimau Sumatera sering menjadi target perburuan untuk diambil kulitnya. Bahkan, taring harimau pun bisa dijual dengan harga mulai 400 ribu – 1,5 juta rupiah.",
            "Hewan endemik Sulawesi ini sudah masuk dalam daftar hewan yang paling dilindungi di Indonesia sejak tahun 2000-an. Anoa yang sekilas nampak seperti kerbau kerdil ini jumlahnya hanya kurang dari 5.000 ekor saja di Indonesia. Sebagai hewan yang langka, satwa ini memang sangat menarik bagi para pemburu. Mereka memanfaatkan daging, tanduk, dan kulit anoa untuk dijual kembali. Hewan yang juga menjadi maskot Sulawesi Tenggara ini juga dilindungi dalam penangkaran Taman Nasional Lore Lindu di Sulawesi.",
            "Predator udara yang satu ini dianggap sebagai maskot hewan langka di Indonesia. Jika diperhatikan, penampilan Elang Jawa ini memang mirip dengan burung yang menjadi lambang negara kita, yaitu Garuda. Sesuai dengan namanya, habitat asli hewan ini memang tersebar di Pulau Jawa. Dahulu, hewan endemik ini bisa ditemukan dengan mudah di hutan pegunungan yang berada di Jawa. Akan tetapi, perburuan liar dan perusakan habitat asli membuat burung ini terancam punah. Saat ini, Elang Jawa hanya bisa ditemukan di Gunung Slamet, Gunung Kawi, Taman Nasional Ujung Kulon, Taman Nasional Gunung Gede, dan Taman Nasional Muara Betiri.",
            "Tarsius adalah hewan yang dilindungi di Indonesia yang juga merupakan primata dengan ukuran yang paling kecil dibanding spesies primata lainnya, yaitu Tarsius atau Singapuar. Tarsius hanya bisa ditemukan di Sulawesi Utara. Hewan ini biasa mengkonsumsi serangga, tetapi mereka juga bisa memangsa burung, ular, kadal, dan kelelawar. Makhluk mungil ini sangat dilindungi karena jumlah populasinya terus merosot dari tahun ke tahun. IUCN menetapkan bahwa Tarsius adalah hewan yang populasinya terancam punah dan harus dilindungi..",
            "Burung pengicau dengan penampilan yang sangat cantik ini memang membuat banyak pemburu tertarik untuk menangkapnya. Hal tersebut menjadi alasan Jalak Bali menjadi hewan yang paling dilindungi di Indonesia. Perburuan tersebut juga membuat angka populasi burung ini kian merosot. Menurut data terakhir yang dikumpulkan oleh PEH Bali Barat di tahun 2006, jumlah Jalak Bali yang tersebar di bagian barat Pulau Dewata ini hanya tinggal 6 ekor saja. Oleh karena itu, kebun binatang dan Taman Nasional Bali Barat berusaha menangkarkan satwa ini agar tidak mengalami kepunahan.",
            "Sekilas tampilan trenggiling ini memang mirip dengan musang. Hanya saja hewan ini memiliki kulit yang keras dan bersisik. Habitat asli trenggiling adalah Jawa dan Sumatera. Dulu, hewan ini sering berkeliaran dan bisa ditemukan dengan sangat mudah. Akan tetapi, akhir-akhir ini Trenggiling sangat sulit ditemukan bahkan ketika dicari ke sarangnya. Hal tersebut dikarenakan perburuan liar yang mengurangi populasi hewan ini di Indonesia. Konon, daging Trenggiling sangat laku di pasar impor, terutama di Cina. 1 kg daging Trenggiling bisa dibandrol dengan harga 600 ribu sampai 1 juta rupiah",
            "Berbeda dengan babi hutan atau babi ternak, Babirusa ini memiliki tampilan yang lebih “sangar” dibanding jenis babi lainnya. Hewan yang dilindungi ini memiliki ciri khas dari taring yang mencuat ke atas. Sayangnya, hewan ini banyak diburu oleh manusia karena dianggap sebagai hewan pengganggu. Selain itu, Babirusa juga sering diburu untuk dimangsa dagingnya oleh manusia. Jumlah populasi Babirusa di Indonesia tercatat hanya tinggal 4.000 ekor saja."};
    int images[] = {R.drawable.orang_utan, R.drawable.komodo,R.drawable.badak_bercula_satu, R.drawable.harimau_sumatera,  R.drawable.anoa, R.drawable.elang_jawa, R.drawable.tarsius, R.drawable.jalak_bali, R.drawable.trenggiling, R.drawable.babirusa};
@Override           
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.about:
                startActivity(new Intent(this, about.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[0]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[0]);
                    intent.putExtra("description", mDescription[0]);
                    // also put your position
                    intent.putExtra("position", ""+0);
                    startActivity(intent);


                }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[1]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[1]);
                    intent.putExtra("description", mDescription[1]);
                    // also put your position
                    intent.putExtra("position", ""+1);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[2]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[2]);
                    intent.putExtra("description", mDescription[2]);
                    // also put your position
                    intent.putExtra("position", ""+2);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[3]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[3]);
                    intent.putExtra("description", mDescription[3]);
                    // also put your position
                    intent.putExtra("position", ""+3);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[4]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[4]);
                    intent.putExtra("description", mDescription[4]);
                    // also put your position
                    intent.putExtra("position", ""+4);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[5]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[5]);
                    intent.putExtra("description", mDescription[5]);
                    // also put your position
                    intent.putExtra("position", ""+5);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[6]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[6]);
                    intent.putExtra("description", mDescription[6]);
                    // also put your position
                    intent.putExtra("position", ""+6);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[7]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[7]);
                    intent.putExtra("description", mDescription[7]);
                    // also put your position
                    intent.putExtra("position", ""+7);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[8]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[8]);
                    intent.putExtra("description", mDescription[8]);
                    // also put your position
                    intent.putExtra("position", ""+8);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[9]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[9]);
                    intent.putExtra("description", mDescription[9]);
                    // also put your position
                    intent.putExtra("position", ""+9);
                    startActivity(intent);
                }

            }
        });
    }



    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImages[];

        MyAdapter (Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.item_row_anim, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImages = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View row = layoutInflater.inflate(R.layout.item_row_anim, parent, false);

            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            images.setImageResource(rImages[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }
    }
}
