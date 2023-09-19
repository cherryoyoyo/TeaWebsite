package com.example.teapractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.teapractice.model.Teaname;
import com.example.teapractice.sevices.TeaService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/api/teas")
public class TeaController {

	@Autowired
	private TeaService teaService;

	  // GET: 取得所有茶名
    @GetMapping("/all")
    public List<Teaname> getAllTeas() {
        return teaService.getAllTeas();
    }

    // GET: 取得單一茶名
    @GetMapping("/{id}")
    public Teaname getTeaById(@PathVariable Long id) {
        return teaService.getTeaById(id);
    }

 // POST: 新增茶名
    @PostMapping("/add")
    public Teaname addTea(@RequestBody Teaname teaname) {
        return teaService.createTea(teaname);
    }
 // PUT: 更新茶名
    @PutMapping("/update/{id}")
    public Teaname updateTea(@PathVariable Long id, @RequestBody Teaname updatedTea) {
        return teaService.updateTea(id, updatedTea);
    }

    // DELETE: 刪除茶名
    @DeleteMapping("/delete/{id}")
    public void deleteTea(@PathVariable Long id) {
        teaService.deleteTea(id);
    }

	@GetMapping("/test") // 使用 "/api/tea/b" 來顯示 photo
	public String  createTest() {
		Teaname teaname = new Teaname();
		
		teaname.setBorn("456");
		
		teaService.createTea(teaname);
		
		return "123";
	}
}

// 
