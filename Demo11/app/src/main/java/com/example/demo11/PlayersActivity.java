package com.example.demo11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.demo11.adapter.BattingAdapter;
import com.example.demo11.adapter.BowlingAdapter;
import com.example.demo11.adapter.Squad2Adapter;
import com.example.demo11.adapter.SquadAdapter;
import com.example.demo11.databinding.ActivityPlayersBinding;
import com.example.demo11.model.Batting;
import com.example.demo11.model.Bowling;
import com.example.demo11.model.PlayerA;
import com.example.demo11.model.PlayerB;
import com.example.demo11.model.Players;
import com.example.demo11.model.Teams;

import java.util.ArrayList;
import java.util.List;

public class PlayersActivity extends AppCompatActivity {
    ActivityPlayersBinding binding;
    public static Teams teams;
    public static List<Players> dataA=new ArrayList<>();
    public static List<Batting> bat=new ArrayList<>();
    public static List<Bowling> bowlings=new ArrayList<>();
    public static List<PlayerA> newData=new ArrayList<>();
    public static List<PlayerB> newDataB=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityPlayersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.tvTeam1.setText(getIntent().getStringExtra("team1"));
        binding.tvTeam2.setText(getIntent().getStringExtra("team2"));


        dataA.add(teams.getJsonMember4().getPlayers());

        PlayerA a=new PlayerA();
        a.setJsonMember3632(teams.getJsonMember4().getPlayers().getJsonMember3632());
        a.setJsonMember3722(teams.getJsonMember4().getPlayers().getJsonMember3722());
        a.setJsonMember3852(teams.getJsonMember4().getPlayers().getJsonMember3852());
        a.setJsonMember4176(teams.getJsonMember4().getPlayers().getJsonMember4176());
        a.setJsonMember5132(teams.getJsonMember4().getPlayers().getJsonMember5132());
        a.setJsonMember4532(teams.getJsonMember4().getPlayers().getJsonMember4532());
        a.setJsonMember9844(teams.getJsonMember4().getPlayers().getJsonMember9844());
        a.setJsonMember63187(teams.getJsonMember4().getPlayers().getJsonMember63187());
        a.setJsonMember65867(teams.getJsonMember4().getPlayers().getJsonMember65867());
        a.setJsonMember63751(teams.getJsonMember4().getPlayers().getJsonMember63751());
        a.setJsonMember66818(teams.getJsonMember4().getPlayers().getJsonMember66818());
        newData.add(a);


        PlayerB b=new PlayerB();
        b.setJsonMember3752(teams.getJsonMember5().getPlayers().getJsonMember3752());
        b.setJsonMember4330(teams.getJsonMember5().getPlayers().getJsonMember4330());
        b.setJsonMember4338(teams.getJsonMember5().getPlayers().getJsonMember4338());
        b.setJsonMember4964(teams.getJsonMember5().getPlayers().getJsonMember4964());
        b.setJsonMember10167(teams.getJsonMember5().getPlayers().getJsonMember10167());
        b.setJsonMember10172(teams.getJsonMember5().getPlayers().getJsonMember10172());
        b.setJsonMember11703(teams.getJsonMember5().getPlayers().getJsonMember11703());
        b.setJsonMember11706(teams.getJsonMember5().getPlayers().getJsonMember11706());
        b.setJsonMember57594(teams.getJsonMember5().getPlayers().getJsonMember57594());
        b.setJsonMember57903(teams.getJsonMember5().getPlayers().getJsonMember57903());
        b.setJsonMember60544(teams.getJsonMember5().getPlayers().getJsonMember60544());
        newDataB.add(b);





        binding.recyclerTeam.setHasFixedSize(true);
        binding.recyclerTeam.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        binding.recyclerTeam.setAdapter(new SquadAdapter(getApplicationContext(), newData, new SquadAdapter.showDetail() {
            @Override
            public void show(Batting batting, Bowling bowling, String name) {
                bat.clear();
                bowlings.clear();
                bat.add(batting);
                bowlings.add(bowling);
                CancelAppointmentPopup(binding.getRoot(),name);
            }
        }));
    }

    public void onBack(View view) {
        bat.clear();
        bowlings.clear();
        newData.clear();
        newDataB.clear();
        dataA.clear();
        finish();
    }

    @Override
    public void onBackPressed() {
        bat.clear();
        bowlings.clear();
        newData.clear();
        newDataB.clear();
        dataA.clear();
        finish();
        super.onBackPressed();
    }

    public void Team1(View view) {
        binding.tvTeam1.setBackgroundResource(R.drawable.rect_solid);
        binding.tvTeam1.setTextColor(getResources().getColor(R.color.white));
        binding.tvTeam2.setBackgroundResource(R.drawable.rect_strok);
        binding.tvTeam2.setTextColor(getResources().getColor(R.color.colorprimary));
        binding.recyclerTeam.setAdapter(new SquadAdapter(getApplicationContext(), newData, new SquadAdapter.showDetail() {
            @Override
            public void show(Batting batting, Bowling bowling, String name) {
                bat.clear();
                bowlings.clear();
                bat.add(batting);
                bowlings.add(bowling);
                CancelAppointmentPopup(view,name);

            }
        }));

    }

    public void Team2(View view) {
        binding.tvTeam1.setBackgroundResource(R.drawable.rect_strok);
        binding.tvTeam1.setTextColor(getResources().getColor(R.color.colorprimary));
        binding.tvTeam2.setBackgroundResource(R.drawable.rect_solid);
        binding.tvTeam2.setTextColor(getResources().getColor(R.color.white));
        binding.recyclerTeam.setAdapter(new Squad2Adapter(getApplicationContext(), newDataB, new Squad2Adapter.showDetail() {
            @Override
            public void show(Batting batting, Bowling bowling, String name) {
                bat.clear();
                bowlings.clear();
                bat.add(batting);
                bowlings.add(bowling);
                CancelAppointmentPopup(view,name);
            }
        }));


    }




    private void CancelAppointmentPopup(View view, String Batname) {
        LayoutInflater inflater = (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        View popup = inflater.inflate(R.layout.player_details_popup, null);
        int width = LinearLayout.LayoutParams.MATCH_PARENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        RecyclerView recycler_batting=popup.findViewById(R.id.recycler_batting);
        TextView name=popup.findViewById(R.id.name);
        RecyclerView recycler_bowling=popup.findViewById(R.id.recycler_bowling);
        name.setText(Batname);

        recycler_bowling.setHasFixedSize(true);
        recycler_bowling.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recycler_bowling.setAdapter(new BowlingAdapter(getApplicationContext(),bowlings));

        recycler_batting.setHasFixedSize(true);
        recycler_batting.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recycler_batting.setAdapter(new BattingAdapter(getApplicationContext(),bat));

        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popup, width, height, focusable);

        // show the popup window
        // which view you pass in doesn't matter, it is only used for the window tolken
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

        View container = popupWindow.getContentView().getRootView();
        if (container != null) {
            WindowManager wm = (WindowManager)getSystemService(Context.WINDOW_SERVICE);
            WindowManager.LayoutParams p = (WindowManager.LayoutParams) container.getLayoutParams();
            p.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
            p.dimAmount = 0.7f;
            if (wm != null) {
                wm.updateViewLayout(container, p);
            }

        }

    }




}