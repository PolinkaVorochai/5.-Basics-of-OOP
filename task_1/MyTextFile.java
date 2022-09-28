package part_5.task_1;

import java.io.*;

/*
Создать объект класса Текстовый файл, используя классы Файл,
 Директория.
 Методы: создать, переименовать,
 вывести на консоль содержимое, дополнить,
  удалить.
 */
class MyTextFile extends MyFile {
    /*
      чтение файла
             */
    void readFile(Directory directory) {
        try (FileReader fr = new FileReader(directory.getDirectory())) {
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка " + e);
        } catch (IOException e) {
            System.out.println("Ошибка " + e);
        }
    }

    /*
   создание файла
    */
    void createFile(Directory directory) {
        try {
            File file = new File(directory.getDirectory());
            file.createNewFile();
            System.out.println("Файл создан");
        } catch (IOException e) {
            System.out.println("Ошибка " + e);
        }
    }
  /*
   переименовать файл
    */

    void renameFile(Directory directory, String newName) {
        File file = new File(directory.getDirectory());
        file.renameTo(new File(newName));
        System.out.println("Файл переименован");
    }

    /*
удалить файл
 */
    void deleteFile(Directory directory) {
        File file = new File(directory.getDirectory());
        file.delete();
        System.out.println("Файл удален.");
    }

    /*
дополнить файл
*/
    void plusText(Directory directory, String plusText) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(directory.getDirectory(), true));
            out.write(plusText);
            out.close();
        } catch (IOException e) {
            System.out.println("Ошибка " + e);
        }
    }
/*
внутренний класс Директория
 */
    class Directory {
        String directory;

        public Directory(String directory) {
            this.directory = directory;
        }

        public String getDirectory() {
            return directory;
        }
    }
}

