package org.swtk.commons.dict.wiktionary.generated.s.t.f;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySTF000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("stfan", "{\"term\":\"stfan\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|stf|fan|lang\u003den|gloss1\u003dscientifiction}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"fan of science fictio\", \"priority\":1}]}, \"synonyms\":{}}");

	add("stfandom", "{\"term\":\"stfandom\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|stf|fandom|lang\u003den|gloss1\u003dscientifiction}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The subculture of science fiction fan\", \"priority\":1}]}, \"synonyms\":{}}");

	add("stfantasy", "{\"term\":\"stfantasy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Either {{abbreviation of|scientifantasy|lang\u003den|nocap\u003d1|dot\u003d,}} or {{blend|stf|fantasy|lang\u003den|nocap\u003d1|gloss1\u003dscientifiction}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The overall field of literature containing the genres of science fiction and fantasy fiction; imaginative fiction; speculative fiction\", \"priority\":1}]}, \"synonyms\":{}}");

	add("stfdom", "{\"term\":\"stfdom\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|stf|dom|lang\u003den|gloss1\u003dscientifiction}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The subculture of science fiction fans, the community of science fiction writers and fans\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }