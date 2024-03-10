package co.za.kruisweg.kinderregistreering.model;

import java.util.List;

public class StatistiekeModel {
    private List<String> dataFolderList;
    private String folderDate;
    private String krimpvarkiesTotal;
    private String krimpvarkiesEerste;
    private String krimpvarkiesTweede;

    public StatistiekeModel(){

    }

    public String getFolderDate() {
        return folderDate;
    }

    public void setFolderDate(String folderDate) {
        this.folderDate = folderDate;
    }

    public String getKrimpvarkiesTotal() {
        return krimpvarkiesTotal;
    }

    public void setKrimpvarkiesTotal(String krimpvarkiesTotal) {
        this.krimpvarkiesTotal = krimpvarkiesTotal;
    }

    public String getKrimpvarkiesEerste() {
        return krimpvarkiesEerste;
    }

    public void setKrimpvarkiesEerste(String krimpvarkiesEerste) {
        this.krimpvarkiesEerste = krimpvarkiesEerste;
    }

    public String getKrimpvarkiesTweede() {
        return krimpvarkiesTweede;
    }

    public void setKrimpvarkiesTweede(String krimpvarkiesTweede) {
        this.krimpvarkiesTweede = krimpvarkiesTweede;
    }

    public List<String> getDataFolderList() {
        return dataFolderList;
    }

    public void setDataFolderList(List<String> dataFolderList) {
        this.dataFolderList = dataFolderList;
    }
}
