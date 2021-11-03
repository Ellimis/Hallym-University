c(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

v1 = c(1:10); v1

sample(v1, 5) # 임의의 작업 가능
sample(v1, 5, replace = T)

v2 = c('H', 'T'); v2

sample(v2, 10, replace = T)

v3 = c(1:6);
sample(v3, 10, replace = T)

sample(c(1:6), 10, replace = T)

sample(1:6, 10, replace = T)

v1 = c(1:10)
set.seed(3)
sample(v1, 5)
sample(v1, 5)
sample(v1, 5)

