package tasks_2023_3.task3;

/*
Проверяем по первому примеру результат должен быть 5
 */
public class Test {
    public static void main(String[] args) {
        int indexToA = -1, indexToB = -1, indexToC = -1, indexToD =-1;
        int n;
        char charNow;
        boolean flag = false;
        n = 12; // размер строки
        int result = n;
        String str = ("aabbccddbadd"); //сама строка
        for (int i = 0; i < n; i++) {
            charNow = str.charAt(i);
            if(charNow == 'a'){
                indexToA = i;
            }
            if(charNow == 'b'){
                indexToB = i;
            }
            if(charNow == 'c'){
                indexToC = i;
            }
            if(charNow == 'd'){
                indexToD = i;
            }

            if(Math.min(indexToA, indexToB) >= 0 && Math.min(indexToC, indexToD) >= 0){
                flag = true;
                result = Math.min(result, Math.max(indexToA, Math.max(indexToB, Math.max(indexToC, indexToD))) + 1 - Math.min(indexToA, Math.min(indexToB, Math.min(indexToC, indexToD)))) ;
                if (result == 4){
                    break;
                }
            }
        }
        if (flag){
            System.out.println(result);
        }else {
            System.out.println(-1);
        }
    }
}
