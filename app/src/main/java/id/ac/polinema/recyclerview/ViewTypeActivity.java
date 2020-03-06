package id.ac.polinema.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.adapters.LogoAdapter;
import id.ac.polinema.recyclerview.adapters.ReversedLogoAdapter;
import id.ac.polinema.recyclerview.models.TeamLogo;

public class ViewTypeActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_type);


		RecyclerView teamsView = findViewById(R.id.rv_teams);

		List<TeamLogo> teams = new ArrayList<>();
		((ArrayList) teams).add(new TeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool"));
		teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png", "Man. City"));
		teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/7/7a/Manchester_United_FC_crest.svg/360px-Manchester_United_FC_crest.svg.png", "Man. United"));
		teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/c/cc/Chelsea_FC.svg/360px-Chelsea_FC.svg.png", "Chealsea"));
		teams.add(new TeamLogo("https://seeklogo.com/images/L/leicester-city-fc-logo-67A4641472-seeklogo.com.png", "Leicester"));
		teams.add(new TeamLogo("https://seeklogo.com/images/F/FC_Barcelona-logo-D941E13B46-seeklogo.com.png", "Barcelona"));
		teams.add(new TeamLogo("https://seeklogo.com/images/R/Real_Madrid_Club_de_Futbol-logo-60682932F8-seeklogo.com.png", "Real Madrid"));
		teams.add(new TeamLogo("https://seeklogo.com/images/B/bayern-munchen-logo-68D0CB94C3-seeklogo.com.png", "Bayern Munchen"));
		teams.add(new TeamLogo("https://seeklogo.com/images/J/Juventus-logo-6908756603-seeklogo.com.png", "Juventus"));
		teams.add(new TeamLogo("https://seeklogo.com/images/A/arsenal-logo-B27C071FE1-seeklogo.com.png", "Arsenal"));
		ReversedLogoAdapter adapter = new ReversedLogoAdapter(this, teams);
		teamsView.setAdapter(adapter);

		RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
		teamsView.setLayoutManager(layoutManager);
	}
}
