#	.text
#	.globl main
#main:
#	li $s0, 0x10000000
#	
#	addi $t0, $0, 1
#	sw $t0, 0($s0)
#	lb $t1, 0($s0)
#
#	beq $t1, $t0, LITTLE
#	
#LITTLE:
#	addi $s1, $0, 5
#	j done
#
#BIG:
#	addi $s1, $0, 10
#
#done:
#	li $v0, 10
#	syscall

#--------------------------------------------------------------------------------
#	int pow = 1;
#	int x = 1;
#
#	while(x <= 10) {
#		pow = pow * 2;
#		x = x + 1;
#	}

	.text
	.globl main
main:
	# $s0 = pow, $s1 = x, $t0 = 10
	addi $s0, $0, 1	# $s0 = 1, pow = 1
	addi $s1, $0, 1	# $s1 = 1, x = 1
	addi $t0, $0, 10	# $t0 = 10

while:
	slt $t1, $t0, $s1	# if 10 < x then $t1 = 1, and if x <= 10 then $t1 = 0
	bne $t1, $0, end

	sll $s0, $s0, 1	# pow = pow * 2
	addi $s1, $s1, 1	# x = x + 1
	j while

end:
	li $v0, 10
	syscall
	












