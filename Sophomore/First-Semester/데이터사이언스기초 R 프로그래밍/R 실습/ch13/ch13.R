# 1번 구글 스프레드시트 의 자료를 csv 파일로 변환 후 불러오시오
# getwd() 저장 경로 가져오기
# read.csv() csv로 읽어서 가져오기

#getwd()
getwd()
setwd("C:/Users/plane/OneDrive/바탕 화면/RStudio/2020_Studio/ch13")
data <- read.csv("ch13_data.csv")
team <- read.csv("ch13_team.csv")
menu <- read.csv("ch13_menu.csv")

View(data); View(team); View(menu)

# 2번 메뉴별로 몇 개씩 주문해야 할까?
# table()
# as.data.frame()
# colnames()
# merge(x, y, key)
# order(x)

# t1 <- table(data["메뉴명"]); t1
# df <- as.data.frame(t1); df
#str(table(data["메뉴명"]))
data
table(data["메뉴명"])
dfMenu <- as.data.frame(table(data["메뉴명"])); dfMenu
colnames(dfMenu) = c("메뉴명", "수량"); dfMenu
menu
p2 <- merge(menu, dfMenu, "메뉴명"); p2

#v1 <- c(2, 1, 3, 4, 7, 5, 6, 9); v1
#order(v1)
#order(-v1)
#v1[order(-v1)]

order(-p2["수량"])
p2 <- p2[order(-p2["수량"]), ] #[4, :]
View(p2)
p2
# 3번 본부별로 얼마의 예산이 필요할까?
# as.character()
# gsub("a", "A", x) 치환 global substitute
# as.numeric()
# tapply(x, index, function)

data
data1 <- merge(data, menu, by="메뉴명"); data1

team
colnames(team) = c("본부", "소속팀"); team
data1 <- merge(team, data1, by="소속팀"); data1

# data1[, 7]
# price <- as.character(data1[, 7]); price
# #as.numeric(as.character(data1[, 7]))
# price <- gsub(",", "", price); price
# price <- as.numeric(price); price
price <- as.numeric(gsub(",", "", as.character(data1[, 7]))); price

data1

total <- tapply(price, data1["본부"], sum); total
df <- as.data.frame(total); df
total[1]
# names(total)
# as.character(total)

# df <- cbind(names(total), as.character(total)); df
# df <- as.data.frame(df); df
df <- as.data.frame(cbind(names(total), as.character(total))); df
colnames(df) = c("본부", "금액(원)"); df
View(df)



