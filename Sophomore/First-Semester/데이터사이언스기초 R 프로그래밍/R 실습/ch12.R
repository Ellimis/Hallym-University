#여러줄 주석 ctrl + shift + c

# 문제 (제출마감: 6월7일(일) 자정까지)
# R-Studio 에서 아래 함수들의 특성을 파악할 수 있는 간단한 예제를 작성하면서 간단한 설명을 하시오.
# 
# <함수리스트>
# abs()
abs(1)
abs(-1)

# log()
# log2()
# log10()
log(2.71828) # e = 2.71828
log2(4)
log10(10)

# factorial(x)
factorial(5) # 1 2 3 4 5 = 120

# choose(n, k) nCk
choose(5, 4) # 5C4 = 5C1 = 5
choose(5, 6)

# sqrt(x)
sqrt(16) # 4 -4

d = 6.46
e = 6.93
# round(x, digits=n)
round(d, digits=1)
round(e, digits=1)

# floor()
floor(d)
floor(e)

# ceiling()
ceiling(d)
ceiling(e)

# trunc()
trunc(d)
trunc(e)

# is.infinite(x)
# 1/0 Inf
is.infinite(c(4, 5)) # FALSE
is.infinite(1/0) #True

# is.nan(x) Not a Number 맞으면 false
is.nan(c(4, 5))
is.nan(0/0) 

# is.na(x) Not Available
v1 = c(4, 5, NA, 10); v1
is.na(v1) #NULL 
v2 = c(4, 5, NULL, 10); v2

#누적
v3 = c(1:7); v3
# cumsum() 누적 합
cumsum(v3)
# cumprod() 누적 곱
cumprod(v3)

v4 <- c(0, 3, 2, 1, 2, 5, 4, 7, 1, -1)
# cummax() 누적 최대 값
cummax(v4)
# cummin() 누적 최소 값
cummin(v4)

v5 <- c(1.2, 2.6, 4.7, 3.5)
# diff() 변동율 현재 값과 그 전 값을 차이값을 반환
# 올해 수익이 1억 2천
# 작년 수익이 1억 1천
# 1.1, 1.2
# 1.2 - 1.1 = 0.1 증감율
diff(v5) # 1.4 2.1 -1.2

a <- c(1, 2, 4, 5, 7, 9, 10)
b <- c(1, 2, 3, 4, 5, 8, 10)
# union(a, b) 합집합
union(a, b) # 1, 2, 4, 5, 7, 9, 10 // 3, 8

# intersect(a, b) 교집합
intersect(a, b) # 1, 2, 4, 5, 10

# setdiff(a, b) 차집합 a - b, a원소들에서 b의 공통된 원소들을 뺀 나머지 a의 원소들을 반환 
setdiff(a, b) # 7, 9
setdiff(b, a) # 3, 8

# setequal(a, b) 둘이 정확히 똑같은지, 똑같으면 TRUE
setequal(a, b) # FALSE

# is.element(a, b) 부분 집합, b가 a에 속하는지 확인, a의 원소들을 T, F 마스킹처리해서 반환
is.element(a, intersect(a, b)) # TRUE
is.element(b, intersect(a, b))
