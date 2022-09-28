package part_5.task_1;

/*
Создать объект класса Текстовый файл, используя классы Файл,
 Директория.
 Методы: создать, переименовать,
 вывести на консоль содержимое, дополнить,
  удалить.
 */
class FileDemo {
    public static void main(String[] args) {
        MyTextFile.Directory directory = new MyTextFile().new Directory("C:\\Users\\User\\IdeaProjects\\untitled\\src\\donot\\file.txt");
        MyTextFile myTextFile1 = new MyTextFile();
        myTextFile1.createFile(directory);
        myTextFile1.plusText(directory, "Ivan!");
        myTextFile1.readFile(directory);
        myTextFile1.renameFile(directory, "newFile.txt");
        myTextFile1.deleteFile(directory);
    }
}

