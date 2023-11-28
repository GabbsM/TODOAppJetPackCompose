package com.gaby.todoappnuevo.addtasks.domain

import com.gaby.todoappnuevo.addtasks.data.TaskRepository
import com.gaby.todoappnuevo.addtasks.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTasksUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    operator fun invoke(): Flow<List<TaskModel>> = taskRepository.tasks
}