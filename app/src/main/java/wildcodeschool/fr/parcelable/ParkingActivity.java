package wildcodeschool.fr.parcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ParkingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);

        Intent intent = getIntent();
        Vehicle vehicle = intent.getParcelableExtra("VEHICLE_EXTRA");

        TextView brandTextView = findViewById(R.id.textViewBrand);
        TextView kilometersTextView = findViewById(R.id.textViewKilometers);

        brandTextView.setText(vehicle.getBrand());
        kilometersTextView.setText(Integer.toString(vehicle.getKilometers()));
    }
}
