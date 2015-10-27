package org.swtk.commons.dict.wordnet.index.name.instance.p.a.p.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePAPI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"papilionaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12522042\"]}");
	add("{\"term\":\"papilionoideae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12522250\"]}");
	add("{\"term\":\"papilla\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05481245\", \"05481387\", \"11840660\"]}");
	add("{\"term\":\"papilledema\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14339591\"]}");
	add("{\"term\":\"papilloma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14273563\"]}");
	add("{\"term\":\"papillon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02089562\"]}");
	add("{\"term\":\"papio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02489196\"]}");
	add("{\"term\":\"papism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01032520\", \"06237693\"]}");
	add("{\"term\":\"papist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09700053\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }