SELECT w2.id
FROM Weather w1, Weather w2
WHERE DATEDIFF(day, w1.recordDate, w2.recordDate)=1 AND w2.temperature > w1.temperature
