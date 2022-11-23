package com.gtappdevelopers.charts11;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)
        });
        graph.addSeries(series);
//        GraphView graph = (GraphView) findViewById(R.id.graph);
//
//        //Дані для графіку
//        int[] Data= {10,46,53,58,63,67,69,72,75,78,82,85,
//                90,95,99,105,110,115,121,126,132,137,143,
//                148,153,157,162,165,168,170,173,174,175,176,
//                177,177,177,176,176,175,173,172,171,169,168,
//                167,166,164,161,155,147,136,123,111,101,92,84,
//                78,74,70,67,65,64,62,61,61,60,60,59,59,58,58,
//                58,57,57,57,56,56,56,56,56,56,56,55,55,55,55,
//                55,54,54,};
//
//        //сформувати наші дані (криву) по X та Y
//        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>();
//        for (int i=0;i<90;i++) {
//            series.appendData(new DataPoint(i,Data[i]),true,90);
//        }
//        //Задаємо зовнішній вигляд кривої
//        series.setColor(Color.rgb(0,80,100)); //встановити колір кривої
//        series.setTitle("Curve 1"); // встановити назву кривої для легенди
//        series.setDrawDataPoints(true); // промальовувати точки
//        series.setDataPointsRadius(5); // радіус точки даних
//        series.setThickness(2); //товщина лінії
//
//        graph.addSeries(series);
//
//        //Назва графіка
//        graph.setTitle("Expenses");
//        graph.setTitleTextSize(50);
//        graph.setTitleColor(Color.RED);
//        //Легенда
//        graph.getLegendRenderer().setVisible(true);
//        graph.getLegendRenderer().setAlign(LegendRenderer.LegendAlign.TOP);
//
//        //Підписи осей
//        GridLabelRenderer gridLabel = graph.getGridLabelRenderer();
//        gridLabel.setHorizontalAxisTitle("X Axis Title");
//        gridLabel.setVerticalAxisTitle("Y Axis Title");
//        //Збільшення/зменшення та прокрутка
//        // activate horizontal zooming and scrolling
//        graph.getViewport().setScalable(true);
//        // activate horizontal scrolling
//        graph.getViewport().setScrollable(true);
//        // activate horizontal and vertical zooming and scrolling
//        graph.getViewport().setScalableY(true);
//        // activate vertical scrolling
//        graph.getViewport().setScrollableY(true);
//
//
//        //яку частину графіка виводити
//        // set manual X bounds
//        graph.getViewport().setXAxisBoundsManual(true);
//        graph.getViewport().setMinX(0);
//        graph.getViewport().setMaxX(90);
//        // set manual Y bounds
//        graph.getViewport().setYAxisBoundsManual(true);
//        graph.getViewport().setMinY(0);
//        graph.getViewport().setMaxY(200);
    }
}