package model

import java.time.DayOfWeek
import java.time.LocalTime

class Open(val beginningHourWeek:LocalTime = LocalTime.of(8,0), val closeHourWeek:LocalTime = LocalTime.of(21,0), val dayOff: List<DayOfWeek> = mutableListOf(DayOfWeek.SUNDAY,DayOfWeek.SATURDAY)) {
}