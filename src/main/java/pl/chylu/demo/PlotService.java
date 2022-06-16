package pl.chylu.demo;

public class PlotService {

    public void readData() {
        ObjectPool.getPlotRepository().readDatabaseData();
    }
}
