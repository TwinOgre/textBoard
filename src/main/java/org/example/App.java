package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private Scanner sc;
    App (Scanner sc){
        this.sc = sc;
    }
    void run(){
        System.out.println("== 명언 앱 ==");
        int lastId = 1;
        List<WiseSaying> wiseSayingList = new ArrayList<>();
        while (true){
            System.out.print("명령) ");
            String command = sc.nextLine().trim();
            if(command.equals("종료")){
                break;
            } else if(command.equals("등록")){
                System.out.print("명언 : ");
                String content = sc.nextLine().trim();
                System.out.print("작가 : ");
                String author = sc.nextLine().trim();

                WiseSaying wiseSaying = new WiseSaying(lastId,content,author);

                wiseSayingList.add(wiseSaying);

                System.out.println( lastId + "번 명언이 등록되었습니다.");
                lastId++;
            } else if(command.equals("목록")){
                System.out.println("번호 / 작가 / 명언");
                System.out.println("---------------------");
                for(WiseSaying wiseSaying : wiseSayingList){
                    System.out.println(wiseSaying.getId() + " / "+wiseSaying.getAuthor() + " / " + wiseSaying.getContent());
                }
            }
        }

    }

}
