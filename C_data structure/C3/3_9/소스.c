#include <stdio.h>

void foo(int a)
{
	printf("foo: %d\n", a);
}

void main()
{
	void(*f)(int);
	f = foo;
	f(10);
	(*f)(10);
}