#include <stdio.h>
#define MAX_ELEMENTS 100
int score[MAX_ELEMENTS];
int main()
{
	int i, tmp;
	tmp = score[0];
	for (i = 1; i < 10; i++) {
		if (score[i] > tmp) {
			tmp = score[i];
		}
	}
	printf("%d\n", tmp);
}