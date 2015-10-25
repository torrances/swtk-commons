package org.swtk.commons.dict.wiktionary.generated.t.i.c;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTIC000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("tical", "{\"term\":\"tical\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Malay\", \"Thai\"], \"text\":\"From Thai from Malay \u0027tikal\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An old Thai measurement of weight, the baht, of about 15 grams\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A Burmese measurement of weight, the \u0027kyattha\u0027, of about 16.3293 grams (0.576 ounces\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The baht, the currency of Siam (now Thailand\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A former currency of Cambodia\", \"priority\":4}]}, \"synonyms\":{}}");

	add("ticino", "{\"term\":\"ticino\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An Italian-speaking canton of Switzerland\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ticker", "{\"term\":\"ticker\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A measuring or reporting device, particularly one which makes a ticking sound as the measured events occur\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The ticker was showing an increased rate of flow\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A ticker tape\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"I checked the prices on the \u0027\u0027ticker\u0027\u0027 one last time before placing the trade\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"To my surprise, the \u0027\u0027ticker\u0027\u0027 showed that the deal had already gone through\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"The heart\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"My ticker gave out and I had to go to the hospital for surgery\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"A birdwatcher who aims to see (and tick off on a list) as many bird species as possible\", \"priority\":8}]}, \"synonyms\":{}}");

	add("tickle", "{\"term\":\"tickle\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\"], \"text\":\"From Middle english (1100-1500) \u0027tikelen\u0027 related to Old english (ca. 450-1100) \u0027tinclian\u0027 (lang\u003dang) Cognate with North Frisian \u0026quot;tigele\u0026quot; (Hallig dialect), and \u0026quot;tiikle\u0026quot; (Amrum dialect).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of tickling\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A feeling resembling the result of tickling\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"I have a persistent \u0027\u0027tickle\u0027\u0027 in my throat\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A narrow strait\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"2004\u0027\u0027, \u0027The Earth\u0027, Folio Society 2011, p. 169\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Cow Head itself is a prominent headland connected to the settlement by a natural causeway, or ‘\u0027\u0027tickle\u0027\u0027’ as the Newfoundlanders prefer it\", \"priority\":6}]}, \"synonyms\":{}}");

	add("ticklee", "{\"term\":\"ticklee\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|tickle|ee|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who is tickled\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tickler", "{\"term\":\"tickler\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|tickle|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who or thing which amuses, tickles, excites\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A reminder\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Put it in the \u0027\u0027tickler\u0027\u0027 file for next week\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A latex condom that has additional protrusions, for enhancing the sexual pleasure of the user\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Something puzzling or difficult; a conundrum\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A book containing a memorandum of notes and debts arranged in the order of their maturity\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"A prong used by coopers to extract bungs from casks\", \"priority\":7}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }