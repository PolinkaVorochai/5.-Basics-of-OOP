package part_5.task_1;
/*
Создать объект класса Текстовый файл, используя классы Файл,
 Директория.
 Методы: создать, переименовать,
 вывести на консоль содержимое, дополнить,
  удалить.
 */
 abstract class MyFile {
  abstract void readFile(MyTextFile.Directory directory);
  abstract void createFile(MyTextFile.Directory directory);
  abstract  void renameFile(MyTextFile.Directory directory, String newName);
  abstract void deleteFile(MyTextFile.Directory directory);
  abstract  void plusText(MyTextFile.Directory directory,String plusText);
}
