package com.shijc.dp.templatemethod;
/**
 * 学生乙抄的试卷
 */
public class TestPaperB extends TestPaper {
    @Override
    public String Answer1() {
        return "c";
    }

    @Override
    public String Answer2() {
        return "b";
    }

    @Override
    public String Answer3() {
        return "a";
    }
}
