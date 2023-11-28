package com.gaby.todoappnuevo.addtasks.domain

import com.gaby.todoappnuevo.addtasks.data.TaskRepository
import com.gaby.todoappnuevo.addtasks.ui.model.TaskModel
import javax.inject.Inject

class UpdateTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {

    suspend operator fun invoke(taskModel: TaskModel) {
        taskRepository.update(taskModel)
    }

}