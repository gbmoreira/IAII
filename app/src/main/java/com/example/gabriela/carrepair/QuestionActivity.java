package com.example.gabriela.carrepair;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.*;
import com.example.gabriela.structure.*;
import java.io.IOException;
import java.util.ArrayList;

public class QuestionActivity extends ActionBarActivity {

    SolutionActivity solutionActivity = new SolutionActivity();
    ArrayList<Question> questions = new ArrayList<>();
    Seeds seed = new Seeds();
    TextView text ;
    int index =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            seed.seedQuestions();
        } catch (IOException e) {
            e.printStackTrace();
        }
        questions = seed.getQuestions();
        setContentView(R.layout.activity_question);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_question, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickYes(View view){
        if(new String("null").equals(questions.get(index-1).getSolutionYes())){
            index = questions.get(index-1).getIdQuestionChildYes();
            this.updateQuestion();
        }else{
            String solution = questions.get(index-1).getSolutionYes();
            solutionActivity.setSolution(solution);
            Intent intent = new Intent(this, SolutionActivity.class);
            // Inicia a nova tela.
            startActivity(intent);
        }
    }

    public void onClickNo(View view){

        if(new String("null").equals(questions.get(index-1).getSolutionNo())){
            index = questions.get(index-1).getIdQuestionChildNo();
            this.updateQuestion();
        }else{
            String solution = questions.get(index-1).getSolutionNo();
            solutionActivity.setSolution(solution);
            Intent intent = new Intent(this, SolutionActivity.class);
            // Inicia a nova tela.
            startActivity(intent);
        }
    }

    public void updateQuestion(){
        String question = questions.get(index-1).getQuestionText();
        text = (TextView) findViewById(R.id.text_question);
        text.setText(question);
    }

}
