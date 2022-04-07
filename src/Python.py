import time

def f(_i):
    if _i <= 0:
        return 0

    b, c = 3, 3
    s = 0

    for _ in range(10 ** 8):
        s += b * 2 + c - _i

    return f(_i - 1) + s


print("Введите n:")
n = int(input())
array = []

print("Выполняется...")
for i in range(n):
    array.append(f(i))

print("Последний элемент =", array[-1])

endTime = time.time()
print("Время = {} секунд".format(time.process_time()))
