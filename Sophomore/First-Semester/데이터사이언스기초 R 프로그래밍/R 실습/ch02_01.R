s1 = sample(c(1:6), 10, replace = T); s1

# 연산이 필요한 대표값
sum(s1)
mean(s1)
var(s1)
sd(s1)

# 정렬이 필요한 대표값
min(s1)
max(s1)
median(s1) # 중간값 

s1
sort(s1) # 정렬
median(s1)

# 
summary(s1) # 요약
boxplot(s1) # 시각화

#
table(s1) # 도수 확인
barplot(s1)
#barplot(table(s1), xlab='빈도 수', ylab='주사위')
barplot(table(s1), main='주사위 빈도 수', # 제목 설정 
        col=rainbow(length(table(s1))), # 색깔 : 무지개
        names.arg = c('1번', '2번', '4번', '5번'), # 변수 이름 변경
        horiz = T, # 횡으로
        xlim = c(0, 10), # x 축 표현 최소 최대치 조정
        xlab='빈도 수', ylab='주사위') # 막대 그래프 그림 그리기, 테이블 값이 와야함
grid() # 점선 추가

s1 = sample(c(1:6), 1000, replace = T);
pie(table(s1), main='주사위 빈도 수',
    col=rainbow(length(table(s1))))
