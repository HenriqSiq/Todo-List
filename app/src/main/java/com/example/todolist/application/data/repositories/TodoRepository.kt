package com.example.todolist.application.data.repositories

import com.example.todolist.application.data.TodoDao
import com.example.todolist.application.data.models.TodoTask
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class TodoRepository @Inject constructor(private val toDoDao: TodoDao) {
    val getAllTasks: Flow<List<TodoTask>> = toDoDao.getAllTasks()
    val sortByLowPriority: Flow<List<TodoTask>> = toDoDao.sortByLowPriority()
    val sortByHighPriority: Flow<List<TodoTask>> = toDoDao.sortByHighPriority()

   fun getSelectedTask(taskId: Int): Flow<TodoTask>{
       return toDoDao.getSelectedTask(taskId = taskId)
   }

    suspend fun addTask(todoTask: TodoTask){
        toDoDao.addTask(todoTask = todoTask)
    }

    suspend fun updateTask(todoTask: TodoTask){
        toDoDao.updateTask(todoTask = todoTask )
    }

    suspend fun deleteTask(todoTask: TodoTask){
        toDoDao.deleteTask(todoTask = todoTask)
    }

    suspend fun deleteAllTasks(){
        toDoDao.deleteAllTasks()
    }

    fun searchDatabase(searchQuery: String): Flow<List<TodoTask>>{
        return toDoDao.searchDatabase(searchQuery = searchQuery)
    }

}