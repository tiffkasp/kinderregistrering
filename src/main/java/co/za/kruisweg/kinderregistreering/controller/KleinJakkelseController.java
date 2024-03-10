package co.za.kruisweg.kinderregistreering.controller;

import co.za.kruisweg.kinderregistreering.model.BraveBereModel;
import co.za.kruisweg.kinderregistreering.model.KleinJakkelseModel;
import co.za.kruisweg.kinderregistreering.model.KrimpvarkiesModel;
import co.za.kruisweg.kinderregistreering.model.VerkennersModel;
import co.za.kruisweg.kinderregistreering.util.ExcelUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class KleinJakkelseController {

    @PostMapping("/processKleinJakkelseForm")
    public String submitBraveBereForm(@ModelAttribute("kleinJakkelseForm") KleinJakkelseModel kleinJakkelseModelForm, Model theModel){
        //checking data being pulled from form
        String kidNameAndSurname = kleinJakkelseModelForm.getKidNameAndSurname();
        String parentNameAndSurname = kleinJakkelseModelForm.getParentNameAndSurname();
        String cellphoneNumber = kleinJakkelseModelForm.getCellphoneNumber();
        String service = kleinJakkelseModelForm.getService();
        System.out.println();
        System.out.println("---------Klein Jakkelse Form---------");
        System.out.println("Kid Name and Surname: " + kidNameAndSurname);
        System.out.println("Parent Name and Surname: " + parentNameAndSurname);
        System.out.println("Cellphone Number: " + cellphoneNumber);
        System.out.println("Service: " + service);

        // Write data to Excel
        ExcelUtil.writeToExcel("Klein Jakkelse",kidNameAndSurname,parentNameAndSurname,cellphoneNumber,service);

        // Show form submitted successfully
        theModel.addAttribute("showSuccess", true);
        theModel.addAttribute("kidNameAndSurname", kidNameAndSurname);
        theModel.addAttribute("className", "Klein Jakkelse");

        // Reinitialize form objects
        KrimpvarkiesModel krimpvarkiesModel = new KrimpvarkiesModel();
        BraveBereModel braveBereModelModel = new BraveBereModel();
        KleinJakkelseModel kleinJakkelseModel = new KleinJakkelseModel();
        VerkennersModel verkennersModel = new VerkennersModel();
        theModel.addAttribute("krimpvarkiesForm", krimpvarkiesModel);
        theModel.addAttribute("braveBereForm", braveBereModelModel);
        theModel.addAttribute("kleinJakkelseForm", kleinJakkelseModel);
        theModel.addAttribute("verkennersForm", verkennersModel);
        return "registration";
    }

}
