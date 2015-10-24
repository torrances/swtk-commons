package org.swtk.commons.dict.wiktionary.generated.j.o.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryJOB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("jobb", "{\"term\":\"jobb\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{comparative of|jó|lang\u003dhu}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"job, work, employment\", \"priority\":1}]}, \"synonyms\":{}}");

	add("jobber", "{\"term\":\"jobber\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who works by the job and recruit other people(as in the 19th Century\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An intermediary who buys and sells merchandise\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A type of intermediary in the apparel industry, as well as others, who buys excess merchandise from brand owners and manufacturers, and sells to retailers at prices that are 20-70% below wholesale. Because of the negative connotations of the word \u0026quot;jobber,\u0026quot; they are now referred to by the more politically-correct term - \u0026quot;Off-price specialists.\u0026quot\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A market maker on the stock exchang\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A promoter or broker of stocks for investment\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"An act to restrain the number and ill practice of brokers and stock \u0027\u0027jobbers\u0027\u0027\u0027: 8 \u0026amp; 9 Wm. 3, ch. 32 (1697) [legislation of English parliament\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"a performer whose primary role is to lose to established talent\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"A thing (often used in a vague way to refer to something the name of which one cannot recall\", \"priority\":8}]}, \"synonyms\":{}}");

	add("jobbie", "{\"term\":\"jobbie\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|job|ie|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Faeces; a piece of excrement\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2008\u0027\u0027, \u0027Kieron Smith, Boy\u0027, Penguin 2009, p. 85\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Ye had to watch no to step in mud or a puddle or else in \u0027\u0027jobby\u0027\u0027, dogs were aye doing \u0027\u0027jobbies\u0027\u0027, or else ye watched for broken glass\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Generic object, thing\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"quot;Have a look at that \u0027\u0027jobbie\u0027\u0027!\u0026quot\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"a job, normally a task rather than a form of employment for which one is paid\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"I\u0027ll take care of the pasta \u0027\u0027jobbie\u0027\u0027, don\u0027t worry about that\", \"priority\":7}]}, \"synonyms\":{}}");

	add("joblessness", "{\"term\":\"joblessness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|jobless|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the state of being jobless or unemploye\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"the phenomenon or level of unemployment in an economy\", \"priority\":2}]}, \"synonyms\":{}}");

	add("jobseeking", "{\"term\":\"jobseeking\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|job|seeking|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A search for employment\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }