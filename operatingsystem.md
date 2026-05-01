# Operating Systems Practical

---

## Round Robin CPU Scheduling (C Program)

```c
#include <stdio.h>

int main() {
    int n, tq, i, time = 0, remain, flag = 0;

    scanf("%d", &n);

    int bt[n], rt[n];

    for(i = 0; i < n; i++) {
        scanf("%d", &bt[i]);
        rt[i] = bt[i];
    }

    scanf("%d", &tq);

    remain = n;

    for(time = 0, i = 0; remain != 0;) {
        if(rt[i] <= tq && rt[i] > 0) {
            time += rt[i];
            rt[i] = 0;
            flag = 1;
        }
        else if(rt[i] > 0) {
            rt[i] -= tq;
            time += tq;
        }

        if(rt[i] == 0 && flag == 1) {
            remain--;
            printf("P%d %d %d\n", i+1, time, time - bt[i]);
            flag = 0;
        }

        if(i == n-1)
            i = 0;
        else
            i++;
    }

    return 0;
}
FCFS Scheduling Results
Process	AT	BT	CT	TAT	WT
P1	0	2	2	2	0
P2	1	2	4	3	1
P3	5	3	8	3	0
P4	6	4	12	6	2
Average Turnaround Time = 3.5
Average Waiting Time = 0.75
Page Replacement Results

Reference String:
1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5
Frames = 3

Algorithm	Page Faults
FIFO	9
LRU	10
MRU	9
Optimal	7
Minimum Page Faults = Optimal (7)