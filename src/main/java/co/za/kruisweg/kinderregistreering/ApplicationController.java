package co.za.kruisweg.kinderregistreering;

import co.za.kruisweg.kinderregistreering.model.BraveBereModel;
import co.za.kruisweg.kinderregistreering.model.KleinJakkelseModel;
import co.za.kruisweg.kinderregistreering.model.KrimpvarkiesModel;
import co.za.kruisweg.kinderregistreering.model.VerkennersModel;
import co.za.kruisweg.kinderregistreering.util.FileUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ApplicationController {



    @GetMapping("/")
    public String showRegistrationPage(Model theModel){
        // Initialise form objects
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
