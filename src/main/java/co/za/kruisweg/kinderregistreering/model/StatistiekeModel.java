package co.za.kruisweg.kinderregistreering.model;

import java.util.List;

public class StatistiekeModel {
    private List<String> dataFolderList;
    private String folderDate;
    private String krimpvarkiesTotal;
    private String krimpvarkiesEerste;
    private String krimpvarkiesTweede;
    private String braveBereTotal;
    private String braveBereEerste;
    private String braveBereTweede;
    private String kleinJakkelseTotal;
    private String kleinJakkelseEerste;
    private String kleinJakkelseTweede;
    private String verkennersTotal;
    private String verkennersEerste;
    private String verkennersTweede;

    public StatistiekeModel(){

    }

    public String getVerkennersTotal() {
        return verkennersTotal;
    }

    public void setVerkennersTotal(String verkennersTotal) {
        this.verkennersTotal = verkennersTotal;
    }

    public String getVerkennersEerste() {
        return verkennersEerste;
    }

    public void setVerkennersEerste(String verkennersEerste) {
        this.verkennersEerste = verkennersEerste;
    }

    public String getVerkennersTweede() {
        return verkennersTweede;
    }

    public void setVerkennersTweede(String verkennersTweede) {
        this.verkennersTweede = verkennersTweede;
    }

    public String getKleinJakkelseTotal() {
        return kleinJakkelseTotal;
    }

    public void setKleinJakkelseTotal(String kleinJakkelseTotal) {
        this.kleinJakkelseTotal = kleinJakkelseTotal;
    }

    public String getKleinJakkelseEerste() {
        return kleinJakkelseEerste;
    }

    public void setKleinJakkelseEerste(String kleinJakkelseEerste) {
        this.kleinJakkelseEerste = kleinJakkelseEerste;
    }

    public String getKleinJakkelseTweede() {
        return kleinJakkelseTweede;
    }

    public void setKleinJakkelseTweede(String kleinJakkelseTweede) {
        this.kleinJakkelseTweede = kleinJakkelseTweede;
    }

    public String getBraveBereTotal() {
        return braveBereTotal;
    }

    public void setBraveBereTotal(String braveBereTotal) {
        this.braveBereTotal = braveBereTotal;
    }

    public String getBraveBereEerste() {
        return braveBereEerste;
    }

    public void setBraveBereEerste(String braveBereEerste) {
        this.braveBereEerste = braveBereEerste;
    }

    public String getBraveBereTweede() {
        return braveBereTweede;
    }

    public void setBraveBereTweede(String braveBereTweede) {
        this.braveBereTweede = braveBereTweede;
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
