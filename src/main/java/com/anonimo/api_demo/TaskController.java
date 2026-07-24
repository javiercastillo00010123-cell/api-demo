package com.anonimo.api_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareas")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> listarTareas() {
        return taskService.listarTareas();
    }

    @PostMapping
    public Task crearTarea(@RequestBody Task tarea) {
        return taskService.crearTarea(tarea);
    }

    @PutMapping("/{id}")
    public Task editarTarea(@PathVariable Long id, @RequestBody Task tareaActualizada) {
        return taskService.editarTarea(id, tareaActualizada);
    }

    @DeleteMapping("/{id}")
    public void borrarTarea(@PathVariable Long id) {
        taskService.borrarTarea(id);
    }
}