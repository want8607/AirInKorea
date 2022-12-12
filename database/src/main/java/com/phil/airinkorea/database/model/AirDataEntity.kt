package com.phil.airinkorea.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.phil.airinkorea.model.AirData


@Entity(tableName = "airData")
data class AirDataEntity(
    @ColumnInfo(name = "pm10_value") val pm10Value: String?,
    @ColumnInfo(name = "pm25_value") val pm25Value: String?,
    @ColumnInfo(name = "so2_value") val so2Value: String?,
    @ColumnInfo(name = "co_value") val coValue: String?,
    @ColumnInfo(name = "o3_value") val o3Value: String?,
    @ColumnInfo(name = "khai_value") val khaiValue: String?,
    @ColumnInfo(name = "no2_value") val no2Value: String?,
    @ColumnInfo(name = "pm10_flag") val pm10Flag: String?,
    @ColumnInfo(name = "pm25_flag") val pm25Flag: String?,
    @ColumnInfo(name = "co_flag") val coFlag: String?,
    @ColumnInfo(name = "no2_flag") val no2Flag: String?,
    @ColumnInfo(name = "o3_flag") val o3Flag: String?,
    @ColumnInfo(name = "so2_flag") val so2Flag: String?,
    @ColumnInfo(name = "so2_grade") val so2Grade: String?,
    @ColumnInfo(name = "o3_grade") val o3Grade: String?,
    @ColumnInfo(name = "co_grade") val coGrade: String?,
    @ColumnInfo(name = "pm10_grade") val pm10Grade: String?,
    @ColumnInfo(name = "khai_grade") val khaiGrade: String?,
    @ColumnInfo(name = "no2_grade") val no2Grade: String?,
    @ColumnInfo(name = "dataTime") val dataTime: String?,
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "rowid")
    val rowId: Int = 0
}

fun AirDataEntity.asExternalModel() = AirData(
    pm10Value = pm10Value,
    pm25Value = pm25Value,
    so2Value = so2Value,
    coValue = coValue,
    o3Value = o3Value,
    no2Value = no2Value,
    pm10Flag = pm10Flag,
    pm25Flag = pm25Flag,
    so2Grade = so2Grade,
    coFlag = coFlag,
    o3Grade = o3Grade,
    khaiValue = khaiValue,
    khaiGrade = khaiGrade,
    no2Flag = no2Flag,
    no2Grade = no2Grade,
    o3Flag = o3Flag,
    so2Flag = so2Flag,
    dataTime = dataTime,
    coGrade = coGrade,
    pm10Grade = pm10Grade
)