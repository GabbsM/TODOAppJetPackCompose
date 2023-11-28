package com.gaby.todoappnuevo.addtasks.ui

import com.gaby.todoappnuevo.addtasks.ui.model.TaskModel

sealed interface TasksUiState {
    object Loading:TasksUiState
    data class Error(val throwable: Throwable):TasksUiState
    data class Success(val tasks:List<TaskModel>) :TasksUiState
}