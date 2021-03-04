package com.example.animals;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer[] soundPool = new MediaPlayer[39];
    private int[] soundResource ={  R.raw.kedisesi,R.raw.arisesi,R.raw.aslansesi,R.raw.atsesi,R.raw.yunussesi,
                                    R.raw.ayisesi,R.raw.balinasesi, R.raw.civcivsesi,R.raw.domuzsesi,R.raw.faresesi,
                                    R.raw.filsesi,R.raw.gergedansesi,R.raw.gorilsesi,R.raw.horozsesi,R.raw.ineksesi,
                                    R.raw.kaplansesi,R.raw.kargasesi,R.raw.kartalsesi,R.raw.kecisesi,R.raw.kopeksesi,
                                    R.raw.kurbagasesi,R.raw.lamasesi, R.raw.lemursesi,R.raw.maymunsesi,R.raw.ordeksesi,
                                    R.raw.papagansesi,R.raw.penguensesi,R.raw.sahinsesi,R.raw.sincapsesi,R.raw.sineksesi,
                                    R.raw.sivrisineksesi,R.raw.baykussesi,R.raw.tavuksesi,R.raw.trexsesi,R.raw.yilansesi,
                                    R.raw.kurtsesi,R.raw.muhabbetkususesi,R.raw.koyunsesi,R.raw.yarasasesi};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=0;i<soundPool.length;i++){   //sesleri soundpool a aktarma islemi
            soundPool[i]=MediaPlayer.create(this, soundResource[i]);
        }
    }

    public void cleanUpMediaPlayer() throws IOException {
        for (MediaPlayer mediaPlayer : soundPool) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
                mediaPlayer.seekTo(0);
            }
        }
    }

    public void playSound(View view) throws IOException {
        switch (view.getId()){
            case R.id.aslanbuton:
                cleanUpMediaPlayer();
                soundPool[2].start();
                break;

            case R.id.kedibuton:
                cleanUpMediaPlayer();
                soundPool[0].start();
                break;

            case R.id.kopekbuton:
                cleanUpMediaPlayer();
                soundPool[19].start();
                break;

            case R.id.civcivbuton:
                cleanUpMediaPlayer();
                soundPool[7].start();
                break;

            case R.id.ayibuton:
                cleanUpMediaPlayer();
                soundPool[5].start();
                break;

            case R.id.atbuton:
                cleanUpMediaPlayer();
                soundPool[3].start();
                break;

            case R.id.inekbuton:
                cleanUpMediaPlayer();
                soundPool[14].start();
                break;

            case R.id.horozbuton:
                cleanUpMediaPlayer();
                soundPool[13].start();
                break;

            case R.id.farebuton:
                cleanUpMediaPlayer();
                soundPool[9].start();
                break;

            case R.id.maymunbuton:
                cleanUpMediaPlayer();
                soundPool[25].start();
                break;

            case R.id.sivrisinekbuton:
                cleanUpMediaPlayer();
                soundPool[30].start();
                break;

            case R.id.kurbagabuton:
                cleanUpMediaPlayer();
                soundPool[20].start();
                break;

            case R.id.kecibuton:
                cleanUpMediaPlayer();
                soundPool[18].start();
                break;

            case R.id.yilanbuton:
                cleanUpMediaPlayer();
                soundPool[34].start();
                break;

            case R.id.yunusbuton:
                cleanUpMediaPlayer();
                soundPool[4].start();
                break;

            case R.id.papaganbuton:
                cleanUpMediaPlayer();
                soundPool[25].start();
                break;

            case R.id.kaplanbuton:
                cleanUpMediaPlayer();
                soundPool[15].start();
                break;

            case R.id.kurtbuton:
                cleanUpMediaPlayer();
                soundPool[35].start();
                break;

            case R.id.domuzbuton:
                cleanUpMediaPlayer();
                soundPool[8].start();
                break;

            case R.id.trexbuton:
                cleanUpMediaPlayer();
                soundPool[33].start();
                break;

            case R.id.tavukbuton:
                cleanUpMediaPlayer();
                soundPool[32].start();
                break;

            case R.id.sinekbuton:
                cleanUpMediaPlayer();
                soundPool[29].start();
                break;

            case R.id.kargabuton:
                cleanUpMediaPlayer();
                soundPool[16].start();
                break;

            case R.id.aributon:
                cleanUpMediaPlayer();
                soundPool[1].start();
                break;

            case R.id.gergedanbuton:
                cleanUpMediaPlayer();
                soundPool[11].start();
                break;

            case R.id.filbuton:
                cleanUpMediaPlayer();
                soundPool[10].start();
                break;

            case R.id.lemurbuton:
                cleanUpMediaPlayer();
                soundPool[22].start();
                break;

            case R.id.muhabbetkusubuton:
                cleanUpMediaPlayer();
                soundPool[36].start();
                break;

            case R.id.gorilbuton:
                cleanUpMediaPlayer();
                soundPool[12].start();
                break;

            case R.id.sincapbuton:
                cleanUpMediaPlayer();
                soundPool[28].start();
                break;

            case R.id.koyunbuton:
                cleanUpMediaPlayer();
                soundPool[37].start();
                break;

            case R.id.baykusbuton:
                cleanUpMediaPlayer();
                soundPool[31].start();
                break;

            case R.id.kartalbuton:
                cleanUpMediaPlayer();
                soundPool[17].start();
                break;

            case R.id.lamabuton:
                cleanUpMediaPlayer();
                soundPool[21].start();
                break;

            case R.id.ordekbuton:
                cleanUpMediaPlayer();
                soundPool[24].start();
                break;

            case R.id.penguenbuton:
                cleanUpMediaPlayer();
                soundPool[26].start();
                break;

            case R.id.yarasabuton:
                cleanUpMediaPlayer();
                soundPool[38].start();
                break;

            case R.id.balinabuton:
                cleanUpMediaPlayer();
                soundPool[6].start();
                break;

            case R.id.sahinbuton:
                cleanUpMediaPlayer();
                soundPool[27].start();
                break;

            default:
                break;
        }

    }

}