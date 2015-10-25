package org.swtk.commons.dict.wiktionary.generated.r.i.t;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryRIT000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("rita", "{\"term\":\"rita\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Spanish\", \"Italian\"], \"text\":\"A shortening of Italian Margherita, and Spanish Margarita, cognates of English Margaret. An Italian w:Rita of Cascia|Saint Rita was canonized in 1900. The English name came into regular use in early twentieth century.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"1993\u0027\u0027 Diane Telgen, Jim Kamp (editors), \u0027Notable Hispanic American Women\u0027, VNR AG, ISBN 0810375788, page 194\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Born Margarita Carmen Cansino to Eduardo and Volga Haworth\u0026lt;!-- sic--\u0026gt; Cansino on October 17, 1918, in New York City, \u0027\u0027Rita\u0027\u0027 Hayworth was no stranger to show business\", \"priority\":2}]}, \"synonyms\":{}}");

	add("ritz", "{\"term\":\"ritz\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{back-form|ritzy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"lang\u003den}} A display of ostentatious elegance\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ritodrine", "{\"term\":\"ritodrine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A tocolytic drug, used to stop premature labour\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ritualism", "{\"term\":\"ritualism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|ritual|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The belief that it is necessary for rites or repeated sets of actions to be carried out\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ritualist", "{\"term\":\"ritualist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|ritual|ist|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"one skilled in ritua\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"one excessively concerned with religious ritua\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"one rigidly adhering to institutional procedures\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }