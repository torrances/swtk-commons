package org.swtk.commons.dict.wiktionary.generated.y.o.n;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryYON000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("yoni", "{\"term\":\"yoni\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Sanskrit\"], \"text\":\"From Sanskrit \u0027योनि\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The female sexual organs, or a symbol of them, especially as an object of veneration within certain types of Hinduism, Buddhism, and other cultures\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2004\u0027\u0027, Johanna Wikoff, Deborah Romaine, \u0027The Complete Idiot\u0027s Guide to the Kama Sutra\u0027, Alpha Books 2004, p. 242\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Stroke your partner\u0027s thighs and caress her breasts as you make love to her \u0027\u0027yoni\u0027\u0027 with your mouth and tongue\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2001\u0027\u0027, David Adams Leeming, \u0027A Dictionary of Asian Mythology\u0027, Oxford 2001, p. 205\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"In Hinduism [...] and Tantrism [...], the \u0027\u0027\u0027yoni\u0027\u0027\u0027 is the generative organ of the Goddess\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"1997\u0027\u0027, David R Kinsley, \u0027Tantric Visions of the Divine Feminine\u0027, University of California 1997, p. 235\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"The goddess blesses him by placing his \u0027liṅgam\u0027 in her \u0027\u0027yoni\", \"priority\":7}]}, \"synonyms\":{}}");

	add("yonks", "{\"term\":\"yonks\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Unknown. First seen in print around 1960. One theory is that it comes from \u0027lang\u003den\u0027 another is that it is an acronym from \u0027lang\u003den\u0027 \u0027lang\u003den\u0027 \u0027lang\u003den\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A long time (especially a longer time than expected); age\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Haven’t seen him in \u0027\u0027yonks\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"I’ve been a teacher for \u0027\u0027yonks\u0027\u0027 - I should really try another career\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"This egg is taking \u0027\u0027yonks\u0027\u0027 to boil\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }