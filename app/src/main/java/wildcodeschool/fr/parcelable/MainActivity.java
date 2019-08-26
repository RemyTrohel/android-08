package wildcodeschool.fr.parcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etBrand = findViewById(R.id.editTextBrand);
                String brandText = etBrand.getText().toString();
                int kilometersText = 0;

                EditText etKilometers = findViewById(R.id.editTextKilometers);
                try
                {
                    kilometersText = Integer.parseInt(etKilometers.getText().toString());
                }
                catch (NumberFormatException e)
                {
                    // handle the exception
                }
                Vehicle vehicle = new Vehicle(brandText,kilometersText);

                Intent parkingIntent = new Intent(MainActivity.this, ParkingActivity.class);
                parkingIntent.putExtra("VEHICLE_EXTRA", vehicle);
                startActivity(parkingIntent);
            }
        });
    }
}
