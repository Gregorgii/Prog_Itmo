import math
kp = 1
ki = 0.2
kd = 0


p = 0
i = 0
d = 0
integral = 0
deferential = 0
last_err = 0
wants = 180
array_error = [21, 19, 16, 14, 10, 7, 6, 5, 4.5]
for t in range(9):
    error = array_error[t]
    p = kp * error
    integral = error + integral
    i = integral * ki
    deferential = error - last_err
    d = deferential * kd
    last_err = error
    pid = p + i + d
    print(t, round(pid, 3))