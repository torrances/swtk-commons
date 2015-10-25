package org.swtk.commons.dict.wiktionary.generated.e.c.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryECA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ecard", "{\"term\":\"ecard\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|e|card|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A computerized greeting card, typically hosted on a Web site to which the recipient is directed by an e-mail message\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ecarte", "{\"term\":\"ecarte\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"From French \u0027écarté\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A card game for two persons, with 32 cards, ranking K, Q, J, A, 10, 9, 8, 7. Five cards are dealt each player, and the 11th turned as trump. Five points constitute a game\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Mortimer had stayed to dinner, and he and the baronet played ecarte afterwards. - A. Conan Doyle in \u0027The Hound of the Baskervilles\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }