package com.example.eazyschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
    Spring devtools helps in hot reload. It maintains two class loaders. In the first
    class loader there are default classes and in the second class loader there are classes that are
    defined by the user.
    In hot reload spring loads the second class.
    Devtools disables the caching of classes.
*/

@Controller
public class HomeController {
    @RequestMapping(value={"home","","/"})
    public String displayHomePage(Model model){
        model.addAttribute("username","Aditya Kumar Sharma");
        return "home.html";
    }
}


/*

Jakarta.validation.constraints.*


@Digits
@Email
@Max
@Min
@NotBlank
@NotEmpty
@NotNull
@Pattern
@Size


org.hibernate.validator.constraints.*

@CreditCardNumber
@Length
@Currency
@Range
@URL
@UniqueElements
@EAN
@ISBN

 */