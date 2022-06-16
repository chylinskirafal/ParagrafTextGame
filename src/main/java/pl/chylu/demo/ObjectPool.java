package pl.chylu.demo;

public class ObjectPool {
    private static final PlotService plotService = new PlotService();
    private static final PlotRepository plotRepository = new PlotRepository();

    private ObjectPool() {
    }

    public static PlotService getPlotService() {
        return plotService;
    }

    public static PlotRepository getPlotRepository() {
        return plotRepository;
    }
}
