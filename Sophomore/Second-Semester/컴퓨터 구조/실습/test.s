	.text
	.globl main
main:
	la, $s0, array
	addi $s1, $0, 0
	addi $t0, $0, 100
	
loop:
	slt $t1, $s1, $t0
	beq $t1, $0, done
	
	sll, $t1, $s1, 2
	add $t1, $t1, $s0
	
	lw $t2, 0($t1)
	add $t2, $t2, $s1
	sw $t2, 0($t1)
	addi $s1, $s1, 1
	j loop

done:
	li $v0, 10
	syscall	


	.data
array:	.word 0:100