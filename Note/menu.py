import operations


def welcome_handler():
    while True:
        text = f'Привет. Это программа создания заметок: \n' \
               f'1 - создать заметку\n' \
               f'2 - список заметок\n' \
               f'3 - прочитать заметку\n' \
               f'4 - редактировать заметку\n' \
               f'5 - удалить заметку\n' \
               f'6 - выход'
        print(text)
        var = int(input())
        if var == 1:
            try:
                operations.add_notes(var)
            except FileExistsError:
                print("== Заметка с таким именем уже существует. Попробуйте другое имя == \n")
            else:
                print("== Спасибо. Заметка создана ==")
        elif var == 2:
            print(operations.list_notes(var))
        elif var == 3:
            try:
                operations.read_notes(var)
            except FileNotFoundError:
                print("== Заметка с таким именем не существует ==")
        elif var == 4:
            operations.change_notes(var)
        elif var == 5:
            try:
                operations.del_notes(var)
            except FileNotFoundError:
                print("== Заметка с таким именем не существует ==")
            else:
                print("== Спасибо. Заметка удалена ==")
        elif var == 6:
            break
