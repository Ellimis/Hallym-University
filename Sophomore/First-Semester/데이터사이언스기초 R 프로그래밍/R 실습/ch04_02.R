# 11부터 20까지 연속 숫자 만들고, 홀수만 뽑아보기
# 단 seq 함수 이용
# 단 T/F 인덱스 이용
# 단 rep 함수 이용
# 단 인덱스 제거 이용
# 단 not 연산자 이용
# 단 나머지 연산자 이용

v1 = 11:20; v1

# 뽑는 방법 두가지
# (1) 인덱스 이용 letters[3]
# (2) mask 이용

#seq 함수 이용
v1[c(1,3,5,7,9)]
v1[seq(1, 10, by=2)]

#T/F 인덱스를 이용(mask)
v1[c(T,F,T,F,T,F,T,F,T,F)]
v1
v1[c(T,F)] # Recycling 이용

#rep 함수 사용
v1[rep(c(T,F),length=10)]
v1[rep(c(T,F),times=5)]

# 인덱스 제거 이용
v1[-c(2, 4, 6, 8, 10)]

# not 연산자 이용
v1[!c(F,T)]

#5/3 나눈 값
#5%/%3 나눈 몫
#5%%3 나눈 나머지
# 나머지 연산자 이용
v1%%2
v1[v1%%2]
v1[v1%%2 == 1] #관계연산자 ==, >, < true false 나오게 함, 그것들은 마스크할 떄 쓰임

# 짝수 출력
v1[v1%%2 == 0] 
v1[v1%%2 != 1]
v1[!(v1%%2 == 1)]

#벡터 두개가 결합을 했을 때 길이가 서로 다를 수 있는데 짧은 쪽 벡터가
#긴쪽 벡터에 맞춰서 Recycling(다시한번 반복 rep 에 time 과 같이) 해주는 것
v1[c(T,F)] # v1 은 10, c 는 두개지만 c 가 v1의 갯수에 맞춰서 알아서 반복해주는 것



#
# 산술연산자 : + - * /
# 나눌 때 몫 : %/%, 나머지 : %%, 소수점 포함 나눈 값 : /

# 논리연산자 (T, F) : and(& : 교집합) or(| : 합집합) not(! :여집합)
#             같다 (==), 크다 (>, >=), 작다 (<, <=)

c(3, 1) >= 2 #c(3, 1) >= c(2, 2) 와 같다. 
# 관계연산자를 사이에 두고 두개의 피연산자를 비교할 때 한쪽에 맞춰주기 때문에 Recycling 이다.

#짝수번째 알파벳을 출력
v1 = 1:10
letters[v1%%2 == 0]

toupper(letters[(1:10)%%2 == 0])
letters[(1:length(letters))%%2 == 0]

# 3개의 입력값 c(1600, 2700, 3900)에 대해서 거스름돈 500원 100원 의 개수를 아래처럼 표현해보시오.

#         500원 100원
# 1600원    3     1
# 2700원    5     2
# 3900원    7     4

# 힌트 cbing()
# 힌트 rbind()

#v1 = c(1, 2, 3); v1
#v2 = c('A', 'B', 'C'); v2
#m1 = cbind(v1, v2); m1
#m2 = rbind(v1, v2); m2
#colnames(m1) = c('숫자', '문자'); m1
#rownames(m1) = price; m1

price = c(1600, 2700, 3900, 4900)
money = c(500, 100)
c500 = price%/%money[1]
c100 = (price%%money[1])%/%money[2]

matr = cbind(c500, c100)
colnames(matr) = c('500원', '100원')
rownames(matr) = c('1600원', '2700원', '3900원', '4900원')
rownames(matr) = paste0(price, '원')
matr

t = c('악', '억', '윽', '엑')
paste0(price, t)
paste(price, '원')

#Step 구구단 테이블을 만들어보자.(matrix 테이블 완성)
#Step for 문을 이용해서 해결

#      2단 3단 4단 5단 6단 7단 8단 9단
# x 1   2   3   4   5   6   7   8   9
# x 2   4   6   8  10  12  14  16  18
# x 3   6   9  12  15  18  21  24  27
# x 4   8  12  16  20  24  28  32  36
# x 5  10  15  20  25  30  35  40  45
# x 6  12  18  24  30  36  42  48  54
# x 7  14  21  28  35  42  49  56  63
# x 8  16  24  32  40  48  56  64  72
# x 9  18  27  36  45  54  63  72  81

range = 1:9; range
m1 = matrix(0, nrow=9, ncol=9); m1
for(cc in range) {
  for(rr in range) {
    cat(cc, ' ', rr, '\n')
    m1[rr, cc] = cc*rr
  }
}
m1

colnames(m1) = paste0(range, '단')
rownames(m1) = paste('x', range); m1
View(m1)
#d1 = as.data.frame(m1); d1
#View(d1)
save(m1, file='gugudan.rda')
load('gugudan.rda'); m1

#구구단의 결과가 짝수부분만 0으로 나오게 치환
#반복문, TF마스크, ifelse() 마스크, which() 함수 이용

#      2단 3단 4단 5단 6단 7단 8단 9단
# x 1   0   3   0   5   0   7   0   9
# x 2   0   0   0   0   0   0   0   0
# x 3   0   9   0  15   0  21   0  27
# x 4   0   0   0   0   0   0   0   0
# x 5   0  15   0  25   0  35   0  45
# x 6   0   0   0   0   0   0   0   0
# x 7   0  21   0  35   0  49   0  63
# x 8   0   0   0   0   0   0   0   0
# x 9   0  27   0  45   0  63   0  81

g = matrix(1, nrow=9, ncol=8); g
for(cc in seq(3, 10, 2))
  for(rr in seq(1, 10, 2)) {
    g[rr, cc-1] = rr*cc
  }
g

colnames(g) = paste0(2:9, '단')
rownames(g) = paste('x', 1:9)
View(g)
g

#방법 1
load('gugudan.rda'); m1
for(cc in 2:9)
  for(rr in 1:9) {
    if(m1[rr, cc-1]%%2 == 0)
      m1[rr, cc-1] = 0
  }
m1

#방법 2
load('gugudan.rda'); m1
m1[m1%%2 == 0] = 0; m1

#방법 3 (ifelse mask)
m1[ifelse(m1%%2 == 0, T, F)] = 0; m1

#방법 4 (which)
load('gugudan.rda'); m1
#매트릭스의 정보들은 1차원적으로 접근해야한다
m1[which(m1%%2 == 0)] = 0; m1
which(m1%%2 == 0)


#구구단의 결과가 3의 배수이거나 5의 배수인 경우 0으로 치환해보기

load('gugudan.rda'); m1
m1[which(m1%%3 == 0 | m1%%5 == 0)] = 0; m1













