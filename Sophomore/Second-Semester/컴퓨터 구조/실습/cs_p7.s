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