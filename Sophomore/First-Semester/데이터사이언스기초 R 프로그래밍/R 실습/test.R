#ctrl + l //콘솔창 클리어
#ctrl + shift + n //새 스크립트
#ctrl + enter // 실행

9+10

temp1 = c(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
temp1

sum(temp1)
mean(temp1)
var(temp1)
sd(temp1)

intArray = c(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

sum = 0
for (i in intArray) {
  sum = sum + i
}

avg = sum/length(intArray)
cat('avg : ', avg, mean(intArray))

sum = 0
for (i in intArray) {
  sum = sum + (avg - i)**2
}
var1 = sum/(length(intArray)-1)
cat('var : ', var1, var(intArray))

std1 = sqrt(var1)
cat('std : ', std1, sd(intArray))