# 데이터 분석(1) --> 데이터 분석(2) --> 데이터 분석(3)
# 벡터 생성 함수 c() seq() rep()
# 슬라이스 연산자

v1 = c(1, 2, 3) # v1 <- c(1, 2, 3) 이랑 같다
v1

v2 = 1:10 #-5:5; v2
v3 = seq(1, 10); v3 
seq(1, 10, 2) # seq(from = 1, to = 1 0, by = 2)
seq(1, 10, length=20)

letters
letters[13]
tolower(toupper(letters[1:26]))

rep(c(1,2,3), each=3, times=3, length=25)
rep(1:3, length = 10)
rep('Hello', times=3)

length('Hello')
nchar('Hello')

nchar(c(1,2,34))

#퀴즈 
#  짝수 번째 알파벳을 출력해보자.
#[1] "b" "d" "f" "h" "j" "l" "n" "p" "r" "t" "v" "x" "z"

# 짝수 번째 알파벳을 대문자로 출력해보자.
#[1] 

letters[seq(2, length(letters), 2)]
toupper(letters[seq(2, length(letters), 2)])

letters[c(F, T)]

















