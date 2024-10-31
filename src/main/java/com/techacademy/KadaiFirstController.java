package com.techacademy;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{date}")
    public String dispDayOfWeek(@PathVariable String date) {

        // 年、月、日をそれぞれsubstringで抽出
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(4, 6)) - 1;
        int day = Integer.parseInt(date.substring(6, 8));

        // Calendarオブジェクトを作成
        Calendar calendar = new GregorianCalendar(year, month, day);


        // 曜日を取得
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // 曜日を文字列に変換
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        return days[dayOfWeek - 1];

    }


    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int answer = 0;
        answer = val1 + val2;
        String res = Integer.toString(answer);
        return  res;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int answer = 0;
        answer = val1 - val2;
        String res = Integer.toString(answer);
        return  res;
    }

    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int answer = 0;
        answer = val1 * val2;
        String res = Integer.toString(answer);
        return  res;
    }



    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int answer = 0;
        answer = val1 / val2;
        String res = Integer.toString(answer);
        return  res;
    }


}
