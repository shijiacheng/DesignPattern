package com.shijc.dp.templatemethod;

/**
 * 学生甲抄的试卷
 */
public class TestPaperA extends TestPaper {
    @Override
    public String Answer1() {
        return "b";
    }

    @Override
    public String Answer2() {
        return "c";
    }

    @Override
    public String Answer3() {
        return "d";
    }
}
