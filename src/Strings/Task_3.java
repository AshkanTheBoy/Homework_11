//1: "System32/calc.exe"
package Strings;

public class Task_3 {
    public static void main(String[] args) {
        //решение - извлечь все после второго бекслеша с конца
        String path = "C:\\Windows\\System32\\AnotherCatalog\\calc.exe";
        System.out.println(path);
        //чтобы найти индекс второго, обрезаем первый
        String cut = path.substring(0,path.lastIndexOf('\\'));
        System.out.println(cut);
        //теперь таким же методом узнаем индекс второго и выводим от его индекса+1(инклюзивность) до конца
        String result = path.substring(cut.lastIndexOf('\\')+1);
        System.out.println(result);
    }


}
