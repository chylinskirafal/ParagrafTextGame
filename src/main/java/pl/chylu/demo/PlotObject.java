package pl.chylu.demo;

public class PlotObject {
    private int id;
    private int idplot;
    private String plottxt;
    private int choisee;
    private String choiseetxt;

    public PlotObject(int id, int idplot, String plottxt, int choisee, String choiseetxt) {
        this.id = id;
        this.idplot = idplot;
        this.plottxt = plottxt;
        this.choisee = choisee;
        this.choiseetxt = choiseetxt;
    }

    public int getId() {
        return id;
    }

    public int getIdplot() {
        return idplot;
    }

    public String getPlottxt() {
        return plottxt;
    }

    public int getChoisee() {
        return choisee;
    }

    public String getChoiseetxt() {
        return choiseetxt;
    }
}
