package com.shijc.dp.interpreter;

/**
 * 表达式类(AbstractExpression)
 */
public abstract class Expression {

    public void Interpret(PlayContext context) {
        if (context.getText().length() == 0) {
            return;
        } else {
            String playKey = context.getText().substring(0, 1);
            context.setText(context.getText().substring(2));
            double playValue = Double.valueOf(context.getText().substring(0, 1).trim());
            context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));
            Excute(playKey, playValue);
        }

    }

    public abstract void Excute(String key, double value);
}
