# 2 "[원소] 3 5 6 9 10 12 18 20 21 24 25 27 33 35 36 39 40 42 48 50 --> [합] 503" 처럼 나오게 하기
# 3 과 5의 배수일 때의 합
# 3과 5의 공배수는 제외

#v1 <- c(1:50); v1
#which()
#v2 <- v1[which(v1%%3 == 0 | v1%%5 == 0)]; v2
#ifesle
#v3 <- v2[ifelse(v2%%15 != 0, T, F)]; v3
#hap = sum(v3); hap
#cat('"[원소]', v3, '--> [합]', paste0(hap, '"'))


# 3
team <- read.csv("team.csv"); View(team)
gudoc <- read.csv("gudoc.csv"); View(gudoc)
member <- read.csv("member.csv"); View(member)

colnames(team) <- c("소속팀", "본부")
p1 <- merge(member, team, "소속팀"); p1

colnames(gudoc) <- c("이름", "구독일", "시청시간")
p2 <- merge(p1, gudoc, by="이름", all.x=T); p2

p2[is.na(p2)] <- ''; p2
p3 <- p2[order(p2["순번"]), ]; p3
# 2020-2-28
#as.charater() gsub 
#순번 소속팀 이름 직급 본부 구독여부 구독일 시청시간
#p2["시청시간"]
#iselse(is.na(p2), "구독안함", "구독")
#df <- data.frame(p3["순번"], p3["소속팀"])