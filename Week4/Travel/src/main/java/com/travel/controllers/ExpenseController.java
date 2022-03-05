package com.travel.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.travel.models.Expense;
import com.travel.services.ExpenseService;

@Controller
public class ExpenseController {

    public final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
		this.expenseService = expenseService;
	}

	@GetMapping("/travel")
    public String index(Model model) {
        List<Expense> items = expenseService.allExpenses();
        model.addAttribute("items", items);
        
        if (model.getAttribute("expense") == null) {

        	model.addAttribute("expense", new Expense());
        }
        return "/travel/index.jsp";
    }
    @PostMapping("/process/create")
    public String create(@Valid @ModelAttribute("expense") Expense e, BindingResult result, Model model){
        if(result.hasErrors()){
        	List<Expense> items = expenseService.allExpenses();
        	model.addAttribute("items", items);
            return "/travel/index.jsp";
        } else {
            expenseService.createExpense(e);
            return "redirect:/travel";
        }
    }
    @GetMapping("/travel/edit/{id}") 
    public String edit(@PathVariable Long id, Model model) {

        Optional<Expense> e = expenseService.findById(id);
        
        if(e.isPresent()) {
        	model.addAttribute("expense", e.get());
        	return "/travel/edit.jsp";
        } else {
        	System.out.println("error!!!!");
        	// todo: where can i put the error msg?
        	return "redirect:/travel";
        }
    }
    @PutMapping("/process/update/{id}")
    public String update(@Valid @ModelAttribute("expense") Expense e, BindingResult result){
        if(result.hasErrors()){
            return "redirect:/travel";
        } else {
            expenseService.updateExpense(e);
            return "redirect:/travel";
        }
    }
    @DeleteMapping("/travel/delete/{id}")
    public String delete(@PathVariable Long id) {
        expenseService.deleteExpense(id);
        return "redirect:/travel";
    }

}
