# 구구단 프로그래밍

range = 1:9
matr = matrix(0, nrow=9, ncol=9); matr

for(column in range) {
  for(row in range) {
    matr[row, column] = row*column
  }
}
matr

#paste
colnames(matr) = paste0(range, '단')
rownames(matr) = paste('x', range); matr
View(matr)
