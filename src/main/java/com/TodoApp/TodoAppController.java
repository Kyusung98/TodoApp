package com.TodoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoAppController {

    @GetMapping("/")
    public String TodoApp(){
        return "To-do Application !";
        //Pull-Request 아닌 Merge 해서 Pull-Request 재시도 파일
    }
}
