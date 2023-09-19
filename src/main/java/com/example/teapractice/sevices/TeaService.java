package com.example.teapractice.sevices;

import com.example.teapractice.model.Teaname;
import com.example.teapractice.repository.TeaRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeaService {

    private final TeaRepository teaRepository;

    @Autowired
    public TeaService(TeaRepository teaRepository) {
        this.teaRepository = teaRepository;
    }

    public List<Teaname> getAllTeas() {
        // 實現獲取所有茶名的邏輯
        return teaRepository.findAll();
    }

    public Teaname createTea(Teaname tea) {
        // 實現創建茶名的邏輯
        return teaRepository.save(tea);
    }
    public Teaname updateTea(Long id, Teaname updatedTea) {
        Teaname teaToUpdate = teaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("茶名不存在: " + id));

        teaToUpdate.setName(updatedTea.getName());
        teaToUpdate.setBorn(updatedTea.getBorn());
        // 可以繼續設定其他屬性
        return teaRepository.save(teaToUpdate);
    }

    public void deleteTea(Long id) {
        teaRepository.deleteById(id);
    }

    public Teaname getTeaById(Long id) {
    	Teaname tea = teaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("茶名不存在: " + id));

        return tea;
    }    
}
