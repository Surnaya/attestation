import os
import random
from datetime import datetime


def list_notes(var):
    example_dir = '/Users/surnaya.m/PycharmProjects/pythonProject/Note'
    content = os.listdir(example_dir)
    list_note = []
    for file in content:
        if os.path.isfile(os.path.join(example_dir, file)) and file.endswith('.csv'):
            list_note.append(file)
    return list_note


def add_notes(var):
    print("== Введите название заметки: ")
    data_name = input() + '.csv'
    with open(data_name, 'x+', newline='') as note:
        print('== Введите текст заметки: ')
        note.write(f'id заметки: {random.randint(1, 100)} \n')
        note.write(f'Заметка создана: {datetime.now()} \n')
        note.write(f'Заголовок заметки: {data_name} \n')
        note.write(f'Текст заметки: \n {input()} \n')
        return data_name


def change_notes(var):
    print("== Введите название заметки: ")
    data_name = input() + '.csv'
    list_test = list_notes(2)
    if data_name in list_test:
        with open(data_name, 'a', newline='\n') as note:  # поменять -а на др чтобы если файла нет выпадала ошибка
            print('== Отредактируйте заметку ==')
            note.write(f'Заметка отредактирована: {datetime.now()} \n')
            note.write(input() + '\n')
        return print("== Информация добавлена ==")
    else:
        return print("== Заметка с таким именем не существует ==")


def del_notes(var):
    print("== Введите название заметки, которую нужно удалить: ")
    data_name = input() + '.csv'
    return os.remove("/Users/surnaya.m/PycharmProjects/pythonProject/Note/" + data_name)


def read_notes(var):
    print("== Введите название заметки: ")
    data_name = input() + '.csv'
    with open(data_name, 'r', newline='\n') as note:
        for row in note:
            print(row)
