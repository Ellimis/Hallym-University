# 소프트웨어융합 대학 컴퓨터구조
# 6주차 과제
# 학번 : 20195124
# 이름 : 김민석

	.text
	.globl main
main:
	# 적합한 코드를 작성해주세요!
	addi $t0, $0, 42
	addi $t1, $0, 7
	jal sum

	# sum함수에서 반환한 결과 값을 저장하고 프린트
	sw 	 $v0, y		# 결과 값을 변수 y에 저장합니다.
	addi $s0, $v0, 0	# 이후 사용을 위해서 결과 값을 $s0로 이동합니다.

	# printf("자신의학번] 42 + 7 = %d", y);
	li $v0, 4		# String 프린트 서비스
	la $a0, msg
	syscall

	li $v0, 1		# 정수 프린트 서비스
	addi $a0, $s0, 0 	# $a0에 프린트할 정수 ($s0에 넣어둔 결과값)를 넣습니다.
	syscall

	## Exit Code 입니다.
	li $v0, 10
	syscall

sum:
	# sum 함수의 기능을 어셈블리코드로 작성해주세요!
	add $v0, $t0, $t1
	jr $ra

	.data
y:	.word 0
msg:	.asciiz "20195124] 42 + 7 = "