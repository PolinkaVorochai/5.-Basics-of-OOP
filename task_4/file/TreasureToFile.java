package part_5.task_4.file;

import part_5.task_4.Treasure.Treasure;
import part_5.task_4.Treasure.TreasureAggregator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.
Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о
100 сокровищах в пещере дракона.
Реализовать возможность просмотра сокровищ,
выбора самого дорогого по стоимости сокровища и
выбора сокровищ на заданную сумму.
 */
public class TreasureToFile {
    public static void main(String[] args) {
        FileTreasure fileTreasure=new FileTreasure("TreasureFile");//задаеися имя файла
        try (ObjectOutputStream objStrm = new ObjectOutputStream(new FileOutputStream(fileTreasure.getNameFile()))) {
            List<Treasure> object = new ArrayList<>();//формируется коллекция сокровищ 100 штук
            object.add(new Treasure(1, "ruby", 2500));
            object.add(new Treasure(2, "diamond", 15000));
            object.add(new Treasure(3, "iron", 500));
            object.add(new Treasure(4, "malachite", 900));
            object.add(new Treasure(5, "sapphire", 3999));
            object.add(new Treasure(6, "diamond", 9999));
            object.add(new Treasure(7, "opal", 2560));
            object.add(new Treasure(8, "topaz", 1500));
            object.add(new Treasure(9, "emerald", 35600));
            object.add(new Treasure(10, "alexandrite", 3450));
            object.add(new Treasure(11, "pearl", 300));
            object.add(new Treasure(12, "black Pearl", 9899));
            object.add(new Treasure(13, "moon rock", 7526));
            object.add(new Treasure(14, "amethyst", 1265));
            object.add(new Treasure(15, "amber", 12460));
            object.add(new Treasure(16, "onyx", 1063));
            object.add(new Treasure(17, "agate", 215));
            object.add(new Treasure(18, "cornelian", 325));
            object.add(new Treasure(19, "turquoise", 3547));
            object.add(new Treasure(20, "jade", 989));
            object.add(new Treasure(21, "Garnet", 5210));
            object.add(new Treasure(22, "topaz", 3650));
            object.add(new Treasure(23, "jasper", 250));
            object.add(new Treasure(24, "rauchtopaz", 254));
            object.add(new Treasure(25, "citrine", 55));
            object.add(new Treasure(26, "quartz", 15));
            object.add(new Treasure(27, "Labrador", 2658));
            object.add(new Treasure(28, "nephritis", 1256));
            object.add(new Treasure(29, "obsidian", 3652));
            object.add(new Treasure(30, "imperial jadeite", 25620));
            object.add(new Treasure(31, "corundum", 58));
            object.add(new Treasure(32, "talc", 63));
            object.add(new Treasure(33, "apatite", 47));
            object.add(new Treasure(34, "amber", 589));
            object.add(new Treasure(35, "euclase", 365));
            object.add(new Treasure(36, "crystal", 25));
            object.add(new Treasure(37, "spinel", 58));
            object.add(new Treasure(38, "citrine", 96));
            object.add(new Treasure(39, "zircon", 450));
            object.add(new Treasure(40, "tsavorite", 52));
            object.add(new Treasure(41, "chrysolite", 63));
            object.add(new Treasure(42, "chrysoberyl", 562));
            object.add(new Treasure(43, "tourmaline", 2510));
            object.add(new Treasure(44, "topaz", 3620));
            object.add(new Treasure(45, "tanzanite", 320));
            object.add(new Treasure(46, "taaffeite", 254));
            object.add(new Treasure(47, "sugilite", 256));
            object.add(new Treasure(48, "spodumene", 512));
            object.add(new Treasure(49, "spessartine", 659));
            object.add(new Treasure(50, "cornelian", 5689));
            object.add(new Treasure(51, "sardonyx", 963));
            object.add(new Treasure(52, "sardier", 254));
            object.add(new Treasure(53, "sapphire", 9990));
            object.add(new Treasure(54, "rutile", 28));
            object.add(new Treasure(55, "rhodochrosite", 30));
            object.add(new Treasure(56, "rhodolite", 120));
            object.add(new Treasure(57, "pyrope", 350));
            object.add(new Treasure(58, "rauchtopaz", 240));
            object.add(new Treasure(59, "nacre", 3300));
            object.add(new Treasure(60, "paraiba", 200));
            object.add(new Treasure(61, "lapis lazuli", 2200));
            object.add(new Treasure(62, "kunzite", 269));
            object.add(new Treasure(63, "corundum", 2));
            object.add(new Treasure(64, "coral", 1));
            object.add(new Treasure(65, "kyanite", 23));
            object.add(new Treasure(66, "dioptopaz", 30));
            object.add(new Treasure(67, "calcite", 70));
            object.add(new Treasure(68, "coil", 36));
            object.add(new Treasure(69, "sultanite", 85));
            object.add(new Treasure(70, "demantoite", 63));
            object.add(new Treasure(71, "datolite", 95));
            object.add(new Treasure(72, "rhinestone", 368));
            object.add(new Treasure(73, "howlite", 251));
            object.add(new Treasure(74, "hematite", 140));
            object.add(new Treasure(75, "hyacinth", 200));
            object.add(new Treasure(76, "jet", 150));
            object.add(new Treasure(77, "beryl", 23));
            object.add(new Treasure(78, "apatite", 54));
            object.add(new Treasure(79, "Afghanite", 87));
            object.add(new Treasure(80, "argonite", 88));
            object.add(new Treasure(81, "azurite", 26));
            object.add(new Treasure(82, "augite", 36));
            object.add(new Treasure(83, "adularia", 154));
            object.add(new Treasure(84, "alabaster", 256));
            object.add(new Treasure(85, "axinitis", 23));
            object.add(new Treasure(86, "aquamarine", 1450));
            object.add(new Treasure(87, "azurite", 980));
            object.add(new Treasure(88, "aventurine", 1650));
            object.add(new Treasure(89, "augite", 263));
            object.add(new Treasure(90, "Vladimir tiara", 78000));
            object.add(new Treasure(91, "hope diamond", 199999));
            object.add(new Treasure(92, "golden tiara", 87000));
            object.add(new Treasure(93, "silver diadem", 65000));
            object.add(new Treasure(94, "silver ring", 50000));
            object.add(new Treasure(95, "gold earrings", 67000));
            object.add(new Treasure(96, "gold necklace", 36500));
            object.add(new Treasure(97, "gold Crown", 190000));
            object.add(new Treasure(98, "imperial crown", 250000));
            object.add(new Treasure(99, "papal tiara", 230000));
            object.add(new Treasure(100, "gold ring", 21000));

            TreasureAggregator aggregator = new TreasureAggregator(object);//коллекция сокровищ агрегируется
            objStrm.writeObject(aggregator);//запись сокровищ в файл
        } catch (IOException e) {
            System.out.println("ошибка во время сериализации");
        }
    }
}
