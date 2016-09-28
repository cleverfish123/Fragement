package com.example.cathleen.fragement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.cathleen.fragement.Words.WordsContent;

public class MainActivity extends AppCompatActivity
        implements ItemFragment.OnListFragmentInteractionListener,DetailFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

  @Override
    public void onListFragmentInteraction(WordsContent.WordItem item) {
        Bundle arguments =new Bundle();
        arguments.putString("id",item.id);
        DetailFragment fragment=new DetailFragment();
        fragment.setArguments(arguments);
        getFragmentManager().beginTransaction().replace(R.id.worddetail,fragment).commit();
    }

    @Override
    public void onFragmentInteraction(String id) {

    }
}
