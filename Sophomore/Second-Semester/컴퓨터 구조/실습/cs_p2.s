# 한림대 소프트웨어융합 대학
# 컴퓨터구조 2주차 과제
# 자신의 영문 이름을 프린트해보기
# 학번 : 20195124
# 이름 : 김민석

# code 작성
	.text
	.globl main
main:
	# print "Min-seok Kim\n"
	la $a0, name
	li $v0, 4
	syscall
	
	# exit
	li $v0, 10
	syscall

# data 정의
	.data
name:	.asciiz "Min-seok Kim\n"
