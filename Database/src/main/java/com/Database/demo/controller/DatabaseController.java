package com.Database.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Database.demo.Repository.DatabaseRepository;
import com.Database.demo.model.DatabaseModel;


@RestController
public class DatabaseController {
	@Autowired
	DatabaseRepository one;
	@GetMapping("/DataBase")
	public List<DatabaseModel>getAllInfo()
	{
		return one.findAll();
	}
	
	@GetMapping("/DataBase/{Sno}")
	public DatabaseModel getdetailsbyString(@PathVariable int Sno)
	{
		return one.findById(Sno).orElse(null);
	}
	@PostMapping("/postData")
	public String saveid(@RequestBody DatabaseModel Sno)
	{
		one.save(Sno);
		return "saved";
	}
	@PutMapping("/putData")
	public DatabaseModel updateId(@RequestBody DatabaseModel Sno)
	{
		return one.save(Sno);
	
	}
	@DeleteMapping("/deleteData/{Sno}")
	public String deletebyId(@PathVariable int Sno)
	
	{
	   one.deleteById(Sno);
	   return "deleted";
	}

}
