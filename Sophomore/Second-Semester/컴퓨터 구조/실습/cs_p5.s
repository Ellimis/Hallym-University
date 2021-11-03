# 한림대학교 소프트웨어융합대학
# 컴퓨터구조 : 1분반 5주차 - 조건부 분기관련 과제
# 학번: 20195124, 성명: 김민석

# 100개의 array 값들에 4배씩 곱해서 저장해주세요!
# for(i = 0; i < 100; i++)
#    array[i] = array[i] * 4
	
	.text
	.globl main
main:
	la $s0, array	  # array의 시작주소 읽기
	addi $s1, $0, 0	  # $s1 = i
	addi $t0, $0, 100 # $t0 = 100
	
loop:
	slt $t1, $s1, $t0 # if $s1(i) < $t0(100) then $t1 <-- 1
					  # else $t1 <-- 0
	beq $t1, $0, done # if $t1 == 0(i >= 100) then jump to 'done'

	# 현재 $t1 은 1 이다.
	sll $t1, $s1, 2	  # then $t1 = i * 4
	add $t1, $t1, $s0 # then $t1 = (i * 4) + $s0(base address)
	lw	$t2, 0($t1)	  # $t2 = array[i] | $t2 = i th address(0 + $t1)
	sll $t2, $t2, 2   # $t2 = array[i] * 4
	sw	$t2, 0($t1)	  # array[i] = array[i] * 4

	addi $s1, $s1, 1  # i = i + 1
	j 	 loop		  # jump to loop, for loop
	
done:
	li $v0, 10
	syscall
	
	.data
array:	.word 2:10	# 100개의 정수형 element를 갖는 배열
			        # 모두 초기값이 1로 초기화됨