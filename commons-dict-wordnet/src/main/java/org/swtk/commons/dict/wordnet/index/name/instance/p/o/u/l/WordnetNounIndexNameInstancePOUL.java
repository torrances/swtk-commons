package org.swtk.commons.dict.wordnet.index.name.instance.p.o.u.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePOUL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"poulenc\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11264409\"]}");
	add("{\"term\":\"poulet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07660576\"]}");
	add("{\"term\":\"poulette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07856280\"]}");
	add("{\"term\":\"poulterer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10480626\"]}");
	add("{\"term\":\"poultice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03999761\"]}");
	add("{\"term\":\"poultry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07660315\", \"01792381\"]}");
	add("{\"term\":\"poultryman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10480626\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }