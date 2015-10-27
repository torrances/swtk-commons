package org.swtk.commons.dict.wordnet.index.name.instance.m.u.s.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMUSE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"muse\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05843486\", \"09589128\"]}");
	add("{\"term\":\"muser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10359217\"]}");
	add("{\"term\":\"musette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03805893\"]}");
	add("{\"term\":\"museum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03806085\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }