package exemplo.praticahum.web.conversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.format.Formatter;

public class DateFormatter implements Formatter<Date> {

    @Autowired
    private MessageSource messageSource;
	
	
    public DateFormatter() {
		super();
	}
    
    @Override
	public String print(Date object, Locale locale) {
		final SimpleDateFormat dateFormat = createDateFormate(locale);
		return dateFormat.format(object);
	}

	@Override
	public Date parse(String text, Locale locale) throws ParseException {
		final SimpleDateFormat dateFormat = createDateFormate(locale);
		return dateFormat.parse(text);
	}

	private SimpleDateFormat createDateFormate(Locale locale) {
		final String format = this.messageSource.getMessage("date.format", null, locale);
		final SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		dateFormat.setLenient(false);
		return dateFormat;
	}

}
