package com.ideal.test.webClient.Utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.time.*;
import java.time.format.*;

/**
 * @author liyujie
 * @Description: 日期工具类
 * @date 2017/10/18 19点18分
 */
public class DateUtil {

    private static Logger log = LoggerFactory.getLogger(DateUtil.class);

    private static final String SERIAL_DATE= "yyyyMMdd";
    private static final String SERIAL_TIME= "HHmmss";
    private static final String SERIAL_DATE_TIME = "yyyyMMddHHmmssSSS";
    private static final String YYYY_MM_DD = "yyyy-MM-dd";
    private static final String HH_MM_SS = "HH:mm:ss";
    private static final String HH_MM = "HH:mm";
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(YYYY_MM_DD);
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern(HH_MM_SS);
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(YYYY_MM_DD+" "+HH_MM_SS);
    /**
     * Return 缺省的日期格式 (yyyy/MM/dd)
     *
     * @return 在页面中显示的日期格式
     */
    public static String getDatePattern() {
        return YYYY_MM_DD;
    }

    /**
     * 根据日期格式，返回日期按"yyyy-MM-dd"格式转换后的字符串
     *
     * @param localDate
     *            日期对象
     * @return 格式化后的日期的页面显示字符串
     */
    public static final String getDate(LocalDate localDate) {
        if(localDate != null) {
            return localDate.format(DATE_FORMATTER);
        } else {
            return "param is null";
        }
    }

    /**
     * 根据时间格式，返回时间按"HH:mm:ss"格式转换后的字符串
     *
     * @param localTime
     *            日期对象
     * @return 格式化后的时间的页面显示字符串
     */
    public static final String getTime(LocalTime localTime) {
        if(localTime != null) {
            return localTime.format(TIME_FORMATTER);
        } else {
            return "param is null";
        }
    }
    /**
     * 根据日期时间格式，返回时间按"yyyy-MM-dd HH:mm:ss"格式转换后的字符串
     *
     * @param localDateTime
     *            日期时间对象
     * @return 格式化后的日期时间的页面显示字符串
     */
    public static final String getDateTime(LocalDateTime localDateTime) {
        if(localDateTime != null) {
            return localDateTime.format(DATE_TIME_FORMATTER);
        } else {
            return "param is null";
        }
    }

    /**
     * 按照日期格式，将字符串解析为日期对象
     *
     * @param aMask
     *            输入字符串的格式
     * @param strDate
     *            一个按aMask格式排列的日期时间的字符串描述
     * @return Date 对象
     * @see DateTimeFormatter
     * @throws ParseException
     */
    public static final LocalDateTime convertStringToDate(String aMask, String strDate) {

        if (log.isDebugEnabled()) {
            log.debug("converting '" + strDate + "' to date with mask '"
                    + aMask + "'");
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(aMask);
        return LocalDateTime.parse(strDate, dtf);
    }

    /**
     * 该方法按如下格式返回传入日期时间: yyyy-MM-dd HH:MM
     * a
     *
     * @param theTime
     *            the current time
     * @return the current date/time
     */
    public static String getTimeNow(LocalDateTime theTime) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(YYYY_MM_DD+" "+HH_MM);
        return theTime.format(dtf);
    }

    /**
     * This method returns the current date in the format: yyyy-MM-dd
     * @deprecated 推荐使用 java.time.ZonedDateTime
     * @see ZonedDateTime
     * @return the current date
     * @throws ParseException
     */
    public static Calendar getToday() throws ParseException {
/*        Date today = new Date();
        SimpleDateFormat df = new SimpleDateFormat(datePattern);

        // This seems like quite a hack (date -> string -> date),
        // but it works ;-)
        String todayAsString = df.format(today);
        Calendar cal = new GregorianCalendar();
        cal.setTime(convertStringToDate(todayAsString));

        return cal;*/
        return null;
    }

    /**
     * This method generates a string representation of a date's date/time in
     * the format you specify on input
     *
     * @param aMask
     *            the date pattern the string is in
     * @param aDate
     *            a date object
     * @return a formatted string representation of the date
     *
     * @see java.text.SimpleDateFormat
     */
    public static final String getDateTime(String aMask, LocalDateTime aDate) {

        if (aDate == null) {
            log.error("aDate is null!");
            return "param is null";
        } else {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(aMask);
            return aDate.format(dtf);
        }

    }

    /**
     * 按照日期格式，将字符串解析为日期对象
     *
     * @param strDate
     *            (格式 yyyy-MM-dd)
     * @return
     *
     * @throws ParseException
     */
    public static LocalDateTime convertStringToDate(String strDate) {
        if (log.isDebugEnabled()) {
            log.debug("converting date with pattern: " + YYYY_MM_DD);
        }

        return convertStringToDate(YYYY_MM_DD, strDate);
    }

    /**
     * 时间相加
     * @deprecated 推荐使用 LocalDate.plusDays(天数)
     * @see LocalDate
     * @param date
     * @param day
     * @return
     */
    public static Date dateAdd(Date date, int day) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, day);
        return calendar.getTime();
    }

    /**
     * 获取两个日期之间的天数
     * @deprecated 推荐使用 Period.between(时间1 , 时间2).getDays()
     * @see Period
     * @param date1
     * @param date2
     * @return
     */
    public static long dateDiffer(Date date1, Date date2) {
        return (date1.getTime() - date2.getTime()) / (1000 * 3600 * 24);
    }

    /**
     * 取当前日期时间
     * @return yyyy-mm-dd hh:mm:ss  2009-12-12 12:12:12
     */
    public static String getNowDateTime(){
        return DateTimeFormatter.ofPattern(YYYY_MM_DD+" "+HH_MM_SS).format(LocalDateTime.now());
    }

    /**
     * 取当前日期时间
     * @return yyyy-MM-dd
     */
    public static final String getNowDate() {return DateTimeFormatter.ofPattern(YYYY_MM_DD).format(LocalDate.now());}

    /**
     * 用于生成流水号 Serial
     * @return yyyyMMddHHmmssSSS
     */
    public static final String getSerialDateTime(){return DateTimeFormatter.ofPattern(SERIAL_DATE_TIME).format(LocalDateTime.now());}

    /**
     * 用于生成流水号 Serial
     * @param dateTimeStr 流水日期时间字符串
     * @return yyyyMMddHHmmss LocalDateTime对象
     */
    public static final LocalDateTime convertSerialDateTime(String dateTimeStr){
        return DateUtil.convertStringToDate(SERIAL_DATE_TIME,dateTimeStr);
    }

    /**
     * 用于生成流水号 Serial
     * @return yyyyMMdd
     */
    public static final String getSerialDate(){return DateTimeFormatter.ofPattern(SERIAL_DATE).format(LocalDate.now());}

    /**
     * 用于生成流水号 Serial
     * @return HHmmss
     */
    public static final String getSerialTime(){return DateTimeFormatter.ofPattern(SERIAL_TIME).format(LocalTime.now());}

    /**
     * @deprecated 推荐使用 LocalDateTime.now().getYear()
     * @see LocalDateTime
     * 取当前日期
     * @return yyyy  2009
     */
    public static String getNowYear(){
        return DateTimeFormatter.ofPattern("yyyy").format(LocalDate.now());
    }

    /**
     * @deprecated 推荐使用 LocalDateTime.now().getMonthValue()
     * @see LocalDateTime
     * 取当前日期
     * @return mm  12
     */
    public static String getNowMonth(){
        return DateTimeFormatter.ofPattern("MM").format(LocalDate.now());
    }

    /**
     * 获取一段年的列表
     * @param startYear
     * @param endYear
     * @return List 2001 2002,2003,2004
     */
    public static List<String> getConditionYearList(int startYear,int endYear){
        List<String> list = new ArrayList<String>();
        if(startYear > endYear){
            return list;
        }
        list.add(Integer.toString(startYear));
        for(int i=1;i<=(endYear-startYear);i++){
            list.add(Integer.toString(startYear+i));
        }
        return list;
    }
    /**
     * @deprecated 推荐使用 LocalTime.now()
     * @see LocalTime
     * 获取当前时间
     * @return
     */
    public static Date getCurrentDateTime()
    {
        Calendar calNow = Calendar.getInstance();
        Date dtNow = calNow.getTime();
        return dtNow;
    }



}
