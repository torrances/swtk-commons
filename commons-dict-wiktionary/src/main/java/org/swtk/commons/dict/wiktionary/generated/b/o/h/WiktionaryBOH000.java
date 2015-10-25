package org.swtk.commons.dict.wiktionary.generated.b.o.h;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBOH000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("boho", "{\"term\":\"boho\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From bohemian\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A bohemia\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"the last thing this country needs is a mannered bunch of Manhattan \u0027\u0027bohos\u0027\u0027 who use textured harmonics and jingly guitars to create a carpetbagger\u0027s vision of the heartland\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A style of female fashion drawing on various bohemian and hippie influences, popular in the mid-first decade of the 21st centur\", \"priority\":3}]}, \"synonyms\":{}}");

	add("bohdanowiczite", "{\"term\":\"bohdanowiczite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\u0027\u0027 (a surname from \u0027\u0027 + \u0027\u0027 + \u0027\u0027 (a patronymic)) {{suffix||ite|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A trigonal-hexagonal scalenohedral lead gray mineral containing bismuth, selenium, and silver\", \"priority\":1}]}, \"synonyms\":{}}");

	add("bohunk", "{\"term\":\"bohunk\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Probably \u0027bohemian\u0027 + \u0027hungarian\u0027 Compare \u0027hunk\u0027 \u0027hunky\u0027 \u0027honky\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An immigrant from Central Europe\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A brawny or coarse person\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }