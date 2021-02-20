package com.example.dice_roller_app;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.view.animation.Animation;
        import android.view.animation.AnimationUtils;
        import android.widget.ImageView;

        import java.util.Random;

        import static com.example.dice_roller_app.R.anim.rotate;

public class MainActivity extends AppCompatActivity {
    ImageView diceImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceImage=findViewById(R.id.dice_image);

        diceImage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                rotateDice();

            }

        });

    }

    private void rotateDice() {
        Random r=new Random();
        int i =r.nextInt(6)+1;
        Animation anim = AnimationUtils.loadAnimation(this,R.anim.rotate);
        diceImage.startAnimation(anim);
        switch(i){
            case 1:
                diceImage.setImageResource(R.drawable.d1);
                break;
            case 2:
                diceImage.setImageResource(R.drawable.d2);
                break;
            case 3:
                diceImage.setImageResource(R.drawable.d3);
                break;
            case 4:
                diceImage.setImageResource(R.drawable.d4);
                break;
            case 5:
                diceImage.setImageResource(R.drawable.d5);
                break;
            case 6:
                diceImage.setImageResource(R.drawable.d6);
                break;

        }



    }
}
