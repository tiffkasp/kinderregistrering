package co.za.kruisweg.kinderregistreering.controller;

import co.za.kruisweg.kinderregistreering.model.StatistiekeModel;
import co.za.kruisweg.kinderregistreering.model.VerkennersModel;
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


        StatistiekeModel statistiekeModel = new StatistiekeModel();
        // Load Existing folders
        statistiekeModel.setDataFolderList(FileUtil.getFolderNames("DATA"));
//        System.out.println(dataFolderList);

        theModel.addAttribute("statisticObject", statistiekeModel);
        return "statistics";
    }

}
