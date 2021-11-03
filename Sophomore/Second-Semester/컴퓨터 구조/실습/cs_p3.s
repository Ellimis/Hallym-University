# 한림대학교 소프트웨어융합대학
# 학번: 20195124, 성명: 김민석
# 3주차 실습

	.text
	.globl main

main:
	li $t0, 0x23456789 
	li $t1, 0x10000000

	sw $t0, 0($t1)
	lb $s0, 1($t1)

	# 프로그램 끝내기 (exit)
	li $v0, 10
	syscall
	.data

my:	.word 0