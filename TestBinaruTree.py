import map

tree = map.BinarySearchTree()

print("Это программа для работы с ассоциативным бинарным древом")
print("--------------------------------------------------------")
print(" 0. Выход \n 1. Добавление элемента по ключу \n 2. Поиск по ключу \n 3. Удаление по ключу \n ")


while True:

    answer = input()

    if answer == "0":
        break

    if answer == "1":
        print("Введите ключ: ")
        key = input()
        print("Введите значение: ")
        value = input()
        tree.__setitem__(key, value)

    if answer == "2":
        print("Введите ключ: ")
        key = input()
        tree.__getitem__(key)

    if answer == "3":
        print("Введите ключ: ")
        key = input()
        tree.__delitem__(key)
        print()