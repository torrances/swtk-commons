package org.swtk.commons.dict.wordnet.index.name.instance.e.a.r.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEARL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"earl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10061181\"]}");
	add("{\"term\":\"earlap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03265722\"]}");
	add("{\"term\":\"earldom\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08574808\", \"14456341\"]}");
	add("{\"term\":\"earliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05053810\"]}");
	add("{\"term\":\"earlobe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05331136\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }