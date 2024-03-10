package co.za.kruisweg.kinderregistreering.controller;

import co.za.kruisweg.kinderregistreering.model.StatistiekeModel;
import co.za.kruisweg.kinderregistreering.model.VerkennersModel;
import co.za.kruisweg.kinderregistreering.util.ExcelUtil;
import co.za.kruisweg.kinderregistreering.util.FileUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StatistiekeController {

    @GetMapping("/statistics")
    public String showStatisticsPage(Model theModel){
        StatistiekeModel statistiekeModel = new StatistiekeModel();
        // Load Existing folders
        statistiekeModel.setDataFolderList(FileUtil.getFolderNames("DATA"));
//        System.out.println(dataFolderList);

        theModel.addAttribute("statisticObject", statistiekeModel);

        return "statistics";
    }

    @PostMapping("/processStatistics")
    public String processStatisticsForDay(@ModelAttribute("statisticObject") StatistiekeModel statistiekeModelForm, Model theModel){
        // Add Statistical Data Krimpvarkies
        String folderDate = statistiekeModelForm.getFolderDate();
        String krimpvarkiesTotal = String.valueOf(ExcelUtil.readNumberOfEntriesFromExcel(folderDate,"Krimpvarkies.xlsx"));
        statistiekeModelForm.setKrimpvarkiesTotal(krimpvarkiesTotal);
        theModel.addAttribute("krimpvarkiesTotal", krimpvarkiesTotal);
        String krimpvarkiesEerste = String.valueOf(ExcelUtil.readNumberOfEntriesFromExcelContaining(folderDate,"Krimpvarkies.xlsx","Diens", "Eerste"));
        statistiekeModelForm.setKrimpvarkiesEerste(krimpvarkiesEerste);
        theModel.addAttribute("krimpvarkiesEerste", krimpvarkiesEerste);
        String krimpvarkiesTweede = String.valueOf(ExcelUtil.readNumberOfEntriesFromExcelContaining(folderDate,"Krimpvarkies.xlsx","Diens", "Tweede"));
        statistiekeModelForm.setKrimpvarkiesTweede(krimpvarkiesTweede);
        theModel.addAttribute("krimpvarkiesTweede", krimpvarkiesTweede);

        // Add Statistical Data Brave Bere
        String braveBereTotal = String.valueOf(ExcelUtil.readNumberOfEntriesFromExcel(folderDate,"Brave Bere.xlsx"));
        statistiekeModelForm.setBraveBereTotal(braveBereTotal);
        theModel.addAttribute("braveBereTotal", braveBereTotal);
        String braveBereEerste = String.valueOf(ExcelUtil.readNumberOfEntriesFromExcelContaining(folderDate,"Brave Bere.xlsx","Diens", "Eerste"));
        statistiekeModelForm.setBraveBereEerste(braveBereEerste);
        theModel.addAttribute("braveBereEerste", braveBereEerste);
        String braveBereTweede = String.valueOf(ExcelUtil.readNumberOfEntriesFromExcelContaining(folderDate,"Brave Bere.xlsx","Diens", "Tweede"));
        statistiekeModelForm.setBraveBereTweede(braveBereTweede);
        theModel.addAttribute("braveBereTweede", braveBereTweede);

        // Add Statistical Data Klein Jakkelse
        String kleinJakkelseTotal = String.valueOf(ExcelUtil.readNumberOfEntriesFromExcel(folderDate,"Klein Jakkelse.xlsx"));
        statistiekeModelForm.setKleinJakkelseTotal(kleinJakkelseTotal);
        theModel.addAttribute("kleinJakkelseTotal", kleinJakkelseTotal);
        String kleinJakkelseEerste = String.valueOf(ExcelUtil.readNumberOfEntriesFromExcelContaining(folderDate,"Klein Jakkelse.xlsx","Diens", "Eerste"));
        statistiekeModelForm.setKleinJakkelseEerste(kleinJakkelseEerste);
        theModel.addAttribute("kleinJakkelseEerste", kleinJakkelseEerste);
        String kleinJakkelseTweede = String.valueOf(ExcelUtil.readNumberOfEntriesFromExcelContaining(folderDate,"Klein Jakkelse.xlsx","Diens", "Tweede"));
        statistiekeModelForm.setKleinJakkelseTweede(kleinJakkelseTweede);
        theModel.addAttribute("kleinJakkelseTweede", kleinJakkelseTweede);

        // Add Statistical Data Verkenners
        String verkennersTotal = String.valueOf(ExcelUtil.readNumberOfEntriesFromExcel(folderDate,"Verkenners.xlsx"));
        statistiekeModelForm.setVerkennersTotal(verkennersTotal);
        theModel.addAttribute("verkennersTotal", verkennersTotal);
        String verkennersEerste = String.valueOf(ExcelUtil.readNumberOfEntriesFromExcelContaining(folderDate,"Verkenners.xlsx","Diens", "Eerste"));
        statistiekeModelForm.setVerkennersEerste(verkennersEerste);
        theModel.addAttribute("verkennersEerste", verkennersEerste);
        String verkennersTweede = String.valueOf(ExcelUtil.readNumberOfEntriesFromExcelContaining(folderDate,"Verkenners.xlsx","Diens", "Tweede"));
        statistiekeModelForm.setVerkennersTweede(verkennersTweede);
        theModel.addAttribute("verkennersTweede", verkennersTweede);

        StatistiekeModel statistiekeModel = new StatistiekeModel();
        // Load Existing folders
        statistiekeModel.setDataFolderList(FileUtil.getFolderNames("DATA"));
//        System.out.println(dataFolderList);

        theModel.addAttribute("statisticObject", statistiekeModel);
        return "statistics";
    }

}
