package org.swtk.commons.dict.wiktionary.generated.d.r.y;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDRY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("dryas", "{\"term\":\"dryas\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of several plants of the genus \u0027Dryas\u0027; the mountain avens\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dryas", "{\"term\":\"dryas\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003dmul}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Either of two climatic stages of the late glacial period in Northern Europe in which plants of the genus \u0027Dryas\u0027 were abundant\", \"priority\":1}]}, \"synonyms\":{}}");

	add("drybrush", "{\"term\":\"drybrush\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|dry|brush|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A form of brushwork that involves stroking lightly with a minimally loaded brush to create a textured look\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dryness", "{\"term\":\"dryness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|dry|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A lack of moisture\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The degree to which something is dry\", \"priority\":2}]}, \"synonyms\":{}}");

	add("drysuit", "{\"term\":\"drysuit\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|dry|suit|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An inflatable suit to provide thermal insulation to the wearer and keep them dry while immersed in water\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dryth", "{\"term\":\"dryth\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From \u0027\u0027 + \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Dryness\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A drought\", \"priority\":2}]}, \"synonyms\":{}}");

	add("drywaller", "{\"term\":\"drywaller\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|drywall|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A construction worker who specializes in laying drywal\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }