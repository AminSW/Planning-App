package com.example.planningapp.data.repository

import com.example.planningapp.data.datasource.DailyPlanningDataSource
import com.example.planningapp.data.entity.Day
import com.example.planningapp.data.entity.TimeLineTask

class DailyPlanningRepository(private var dataSource: DailyPlanningDataSource)
{


    suspend fun uploadAllTimeLineTasks(): List<TimeLineTask> = dataSource.uploadAllTimeLineTasks()

    suspend fun uploadTimeLineTasksForDay(day: Int, month: Int, year: Int): Day = dataSource.uploadTimeLineTasksForDay(day, month, year)

    suspend fun insertDatabase(day: Int, month: Int, year: Int, taskName : String, startTime: Int, endTime: Int) =
        dataSource.insertDatabase(day, month, year, taskName, startTime, endTime)

    suspend fun testCodeInsertDatabase() =
        dataSource.testInsertCode()

    suspend fun uploadTimeLineTasksForMonth(month: Int, year: Int): HashMap<Int, Day> = dataSource.uploadTimeLineTasksForMonth(month, year)

    suspend fun testCodeRemoveDatabase() = dataSource.testDeleteCode()
}