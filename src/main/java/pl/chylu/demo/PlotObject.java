package pl.chylu.demo;

import lombok.Getter;
import lombok.Setter;

public class PlotObject {

    @Getter
    @Setter
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
}
