package com.danner.helloWorld;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Calendar;

/**
 * Custom tag to greet the world
 */
public class HelloWorldTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();
        Calendar calendar = Calendar.getInstance();
        int timeOfDay = calendar.get(Calendar.HOUR_OF_DAY);
        int month = calendar.get(calendar.MONTH);
        int dayOfMonth = calendar.get(calendar.DAY_OF_MONTH);

        if(timeOfDay >= 0 && timeOfDay < 12){
            out.println("Good Morning!");
        } else if(timeOfDay >= 12 && timeOfDay < 16){
            out.println("Good Afternoon!");
        } else if(timeOfDay >= 16 && timeOfDay < 21){
            out.println("Good Evening!");
        } else if(timeOfDay >= 21 && timeOfDay < 24){
            out.println("Good Night!");
        }

        if(month == 2 && dayOfMonth == 2) {
            out.println("Happy Groundhog Day!");
        } else {
            out.println("Sadly today is not Groundhog Day, check back on 2/2!");
        }
    }
}
