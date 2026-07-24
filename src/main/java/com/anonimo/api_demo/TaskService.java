package com.anonimo.api_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> listarTareas() {
        return taskRepository.findAll();
    }

    public Task crearTarea(Task tarea) {
        return taskRepository.save(tarea);
    }

    public Task editarTarea(Long id, Task tareaActualizada) {
        Task tarea = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarea no encontrada con id: " + id));
        tarea.setTitulo(tareaActualizada.getTitulo());
        tarea.setCompletada(tareaActualizada.isCompletada());
        return taskRepository.save(tarea);
    }

    public void borrarTarea(Long id) {
        if (!taskRepository.existsById(id)) {
            throw new RuntimeException("Tarea no encontrada con id: " + id);
        }
        taskRepository.deleteById(id);
    }
}