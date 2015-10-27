package org.swtk.commons.dict.wordnet.index.name.instance.g.e.n.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGENU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"genu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05581233\"]}");
	add("{\"term\":\"genuflection\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07289783\"]}");
	add("{\"term\":\"genuflexion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07289783\"]}");
	add("{\"term\":\"genuineness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04790511\", \"13978627\"]}");
	add("{\"term\":\"genus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08125938\", \"05853540\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }