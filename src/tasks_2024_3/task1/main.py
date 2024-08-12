"""Мое решение данной задачи. Конечно понимаю,
что красивее и читабельнее будет преобразовать это все в функцию,
но тут вопрос во времени решения заданий."""

TARGET_STRING = sorted('TINKOFF')
list_ofset = []

print('Введите колличество строчек')
x = int(input())


if 1 <= x <= 100:
    for i in range(x):
        print(f'Введите строчку {i+1}')
        list_ofset.append(input().strip().upper())
    for i in range(len(list_ofset)):
        if sorted(list_ofset[i]) == TARGET_STRING:
            print('YES')
        else:
            print('NO')
