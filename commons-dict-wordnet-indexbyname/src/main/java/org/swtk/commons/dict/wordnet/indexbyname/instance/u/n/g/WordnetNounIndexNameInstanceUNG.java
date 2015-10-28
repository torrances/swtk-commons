package org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceUNG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ungainliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05011865\"]}");
	add("{\"term\":\"ungodliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04835985\"]}");
	add("{\"term\":\"ungracefulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05011697\"]}");
	add("{\"term\":\"ungraciousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04922168\"]}");
	add("{\"term\":\"ungratefulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07519950\"]}");
	add("{\"term\":\"unguent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03851070\"]}");
	add("{\"term\":\"unguiculata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02373777\"]}");
	add("{\"term\":\"unguiculate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02373996\"]}");
	add("{\"term\":\"unguis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05589145\"]}");
	add("{\"term\":\"ungulata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02373177\"]}");
	add("{\"term\":\"ungulate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02373458\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }