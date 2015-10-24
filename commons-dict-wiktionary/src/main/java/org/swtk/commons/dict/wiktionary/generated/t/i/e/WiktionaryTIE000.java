package org.swtk.commons.dict.wiktionary.generated.t.i.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTIE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("tiebar", "{\"term\":\"tiebar\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|tie|bar|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A flat bar used as a tie in construction work\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tiebeam", "{\"term\":\"tiebeam\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|tie|beam|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A beam acting as a tie, as at the bottom of a pair of principal rafters, to prevent them from thrusting out the wall\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tiebreaker", "{\"term\":\"tiebreaker\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{compound|tie|breaker|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Something that is used to pick a winner from a tied situation\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }