package eu.veldsoft.tuty.fruty.slot;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class SlotActivity extends Activity {
    private SoundPool sounds = null;

    private int rollSoundId = -1;

    private int winSoundId = -1;

    /**
     * Internal game model instance.
     */
    private GameScreen gameScreen = new GameScreen();

    private ImageView symbols[][] = new ImageView[Reels.COLS][Reels.ROWS];

    private Map<ReelSymbol, Integer> mapping = new HashMap<ReelSymbol, Integer>();

    private void update() {
        ((TextView) findViewById(R.id.single_bet_value)).setText(""
                + gameScreen.getBet().getValue());
        ((TextView) findViewById(R.id.active_lines_value)).setText(""
                + gameScreen.getSelector().numberOfSelectedLines());
        ((TextView) findViewById(R.id.total_bet_value)).setText(""
                + (gameScreen.getBet().getValue() * gameScreen.getSelector()
                .numberOfSelectedLines()));
        ((TextView) findViewById(R.id.winner_paied_value)).setText(""
                + gameScreen.getPaid().getValue());
        ((TextView) findViewById(R.id.credit_value)).setText(""
                + gameScreen.getCredit().getValue());

        ReelSymbol combination[][] = gameScreen.getReels()
                .getVisibleCombination();
        for (int i = 0; i < combination.length; i++) {
            for (int j = 0; j < combination[i].length; j++) {
                symbols[i][j].setAlpha(1.0F);
            }
        }
        for (int i = 0; i < combination.length; i++) {
            for (int j = 0; j < combination[i].length; j++) {
                if (combination[i][j] == null) {
                    continue;
                }
                symbols[i][j].setImageResource(mapping.get(combination[i][j]));
            }
        }
        char mask[][] = gameScreen.getPaid().getWinsMask();
        for (int i = 0; i < combination.length; i++) {
            for (int j = 0; j < combination[i].length; j++) {
                if (mask[i][j] == 1) {
                    symbols[i][j].setAlpha(0.5F);
                }
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slot);

        sounds = new SoundPool(4, AudioManager.STREAM_MUSIC, 0);
        rollSoundId = sounds.load(SlotActivity.this, R.raw.droplet, 1);
        winSoundId = sounds.load(SlotActivity.this, R.raw.pinc, 1);

        mapping.put(Reels.SYMBOL_01, R.drawable.symbol00);
        mapping.put(Reels.SYMBOL_02, R.drawable.symbol01);
        mapping.put(Reels.SYMBOL_03, R.drawable.symbol02);
        mapping.put(Reels.SYMBOL_04, R.drawable.symbol03);
        mapping.put(Reels.SYMBOL_05, R.drawable.symbol04);
        mapping.put(Reels.SYMBOL_06, R.drawable.symbol05);
        mapping.put(Reels.SYMBOL_07, R.drawable.symbol06);
        mapping.put(Reels.SYMBOL_08, R.drawable.symbol07);
        mapping.put(Reels.SYMBOL_09, R.drawable.symbol08);
        mapping.put(Reels.SPECIAL_SYMBOL_01, R.drawable.symbol09);

        symbols[0][0] = (ImageView) findViewById(R.id.symbol00);
        symbols[1][0] = (ImageView) findViewById(R.id.symbol10);
        symbols[2][0] = (ImageView) findViewById(R.id.symbol20);
        symbols[3][0] = (ImageView) findViewById(R.id.symbol30);
        symbols[4][0] = (ImageView) findViewById(R.id.symbol40);
        symbols[0][1] = (ImageView) findViewById(R.id.symbol01);
        symbols[1][1] = (ImageView) findViewById(R.id.symbol11);
        symbols[2][1] = (ImageView) findViewById(R.id.symbol21);
        symbols[3][1] = (ImageView) findViewById(R.id.symbol31);
        symbols[4][1] = (ImageView) findViewById(R.id.symbol41);
        symbols[0][2] = (ImageView) findViewById(R.id.symbol02);
        symbols[1][2] = (ImageView) findViewById(R.id.symbol12);
        symbols[2][2] = (ImageView) findViewById(R.id.symbol22);
        symbols[3][2] = (ImageView) findViewById(R.id.symbol32);
        symbols[4][2] = (ImageView) findViewById(R.id.symbol42);

        Typeface typeface = Typeface.createFromAsset(getAssets(),
                getResources().getString(R.string.digits_font_path));
        ((TextView) findViewById(R.id.single_bet_value)).setTypeface(typeface);
        ((TextView) findViewById(R.id.active_lines_value))
                .setTypeface(typeface);
        ((TextView) findViewById(R.id.total_bet_value)).setTypeface(typeface);
        ((TextView) findViewById(R.id.winner_paied_value))
                .setTypeface(typeface);
        ((TextView) findViewById(R.id.credit_value)).setTypeface(typeface);

        ((Button) findViewById(R.id.spin_button))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        gameScreen.spinReels();
                        update();

                        if (gameScreen.getPaid().getValue() > 0) {
                            sounds.play(winSoundId, 0.99f, 0.99f, 0, 0, 1);
                        } else {
                            sounds.play(rollSoundId, 0.99f, 0.99f, 0, 0, 1);
                        }
                    }
                });

        ((Button) findViewById(R.id.lines_button))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // TODO Implement line selection.
                        // gameScreen.numberOfLinesChange();
                        // update();
                    }
                });

        ((Button) findViewById(R.id.bet_button))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        gameScreen.betChange();
                        update();
                    }
                });

        ((Button) findViewById(R.id.max_bet_button))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        gameScreen.maxBetChange();
                        update();
                    }
                });

        ((Button) findViewById(R.id.autoplay_button))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // TODO gameScreen.autoplayChange();
                        update();
                    }
                });

        update();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        sounds.release();
        sounds = null;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_slot, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.credit1000) {
            gameScreen.addCredit(1000);
            update();
            startActivity(new Intent(this, InnerBannerActivity.class));
        }

        if (item.getItemId() == R.id.help) {
            startActivity(new Intent(this, HelpActivity.class));
        }

        if (item.getItemId() == R.id.about) {
            startActivity(new Intent(this, AboutActivity.class));
        }

        return true;
    }
}
