package com.example.todolist.application.data.models

import androidx.compose.ui.graphics.Color
import com.example.todolist.application.ui.theme.HighPriorityColor
import com.example.todolist.application.ui.theme.LowPriorityColor
import com.example.todolist.application.ui.theme.MediumPriorityColor
import com.example.todolist.application.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}