package org.swtk.commons.dict.wordnet.index.name.instance.p.h.a.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePHAN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"phanerogam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11572837\"]}");
	add("{\"term\":\"phanerogamae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11572110\"]}");
	add("{\"term\":\"phaneromania\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09205681\"]}");
	add("{\"term\":\"phanerozoic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15149100\"]}");
	add("{\"term\":\"phantasm\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05906160\", \"09570240\"]}");
	add("{\"term\":\"phantasma\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05906160\", \"09570240\"]}");
	add("{\"term\":\"phantasmagoria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05937626\"]}");
	add("{\"term\":\"phantasy\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05640291\", \"06380048\", \"05904666\"]}");
	add("{\"term\":\"phantom\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05906160\", \"09570240\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }