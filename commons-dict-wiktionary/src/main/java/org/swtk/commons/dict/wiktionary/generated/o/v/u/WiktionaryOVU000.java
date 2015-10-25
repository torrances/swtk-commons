package org.swtk.commons.dict.wiktionary.generated.o.v.u;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOVU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ovum", "{\"term\":\"ovum\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|la|ōvum||egg|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The female gamete in animals; the egg cell\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ovulation", "{\"term\":\"ovulation\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|ovulum|ation|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The release of an ovum from an ovary\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ovulist", "{\"term\":\"ovulist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|ovule|ist|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A believer in the theory (called \u0026quot;encasement theory\u0026quot;) that the egg was the real animal germ, and that at the time of fecundation the spermatozoa simply gave the impetus which caused the unfolding of the egg, in which all generations were enclosed one within the other\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ovulum", "{\"term\":\"ovulum\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From \u0027ovulum\u0027 from Latin \u0027ovum\u0027 + \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An ovum\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An ovule\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }