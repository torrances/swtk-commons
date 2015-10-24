package org.swtk.commons.dict.wiktionary.generated.g.a.t;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGAT000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("gatefold", "{\"term\":\"gatefold\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|gate|fold|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An overlarge page that is folded into a book or magazine; a foldout\", \"priority\":1}]}, \"synonyms\":{}}");

	add("gatekeeper", "{\"term\":\"gatekeeper\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From \u0027\u0027 + \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who guards or monitors passage through a gat\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A person or group who controls access to something or somebod\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A common orange and brown butterfly with eyespots, \u0027Pyronia tithonus\u0027, of the Nymphalidae family\", \"priority\":3}]}, \"synonyms\":{}}");

	add("gatewoman", "{\"term\":\"gatewoman\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|gate|woman|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The female equivalent of a gateman\", \"priority\":1}]}, \"synonyms\":{}}");

	add("gatherer", "{\"term\":\"gatherer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|gather|alt1\u003dto gather|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who gathers things\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A person who collects rent or taxes\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"An attachment to a sewing machine for making gathers in the cloth\", \"priority\":3}]}, \"synonyms\":{}}");

	add("gator", "{\"term\":\"gator\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Clipped form of {{m|en|alligator}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Alligator\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }