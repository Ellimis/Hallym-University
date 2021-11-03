# 소프트웨어융합 대학 컴퓨터 구조 수업
# 4주차 - 논리 명령어 테스트
# 학번 20195124
# 이름 김민석

	.text
	.globl main
main:
	li 		$t0, 100
	li 		$t1, 30
	
	mult 	$t0, $t1 # $t0 * $t1 -> hi lo 레지스터에 들어감(상위 32, 하위 32씩)
	div 	$t0, $t1 # $t0 / $t1 -> hi lo 레지스터에 들어감(몫 lo, 나머지 hi)
	
	li $v0, 10
	syscall
	
	.data