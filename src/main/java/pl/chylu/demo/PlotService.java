package pl.chylu.demo;

public class PlotService {
    static int valueInt =1;

    public static String nextTxt() {
        String txt = "change value" + valueInt;
        valueInt++;
        return  txt;
    }

    public void readData() {
        ObjectPool.getPlotRepository().readDatabaseData();
    }
}
