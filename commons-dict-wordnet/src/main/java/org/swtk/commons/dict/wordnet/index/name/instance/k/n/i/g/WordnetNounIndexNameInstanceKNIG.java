package org.swtk.commons.dict.wordnet.index.name.instance.k.n.i.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKNIG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"knight\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03629976\", \"10258072\"]}");
	add("{\"term\":\"knighthood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08405602\"]}");
	add("{\"term\":\"knightia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12240012\"]}");
	add("{\"term\":\"knightliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05964715\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }